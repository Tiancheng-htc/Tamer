package dbaccess.cosm;

import java.sql.*;
import java.util.*;
import dbaccess.util.*;

/**
public class InventoryList extends Vector {

    DBConnect connection;

    Statement stmt;

    String stn;

    int yr;

    int mo;

    String source;

    LatLon SWLatLon;

    LatLon NELatLon;

    DateTime fromDate;

    DateTime toDate;

    LatLon ll;

    boolean multipleYears;

    int found;

    /**
    public InventoryList() {
        found = 0;
        multipleYears = false;
        stn = null;
    }

    /**
    public InventoryList(DBConnect c) {
        connection = c;
        stmt = c.getStatement();
        found = 0;
        multipleYears = false;
        stn = null;
    }

    /**
    public void reset() {
        stn = null;
        yr = 0;
        mo = 0;
        found = 0;
    }

    /**
    public void setConnection(DBConnect c) {
        connection = c;
        stmt = c.getStatement();
    }

    /**
    public void setStn(String station) {
        stn = station;
    }

    /**
    public void setYr(int y) {
        yr = y;
    }

    /**
    public void setMo(int m) {
        mo = m;
    }

    /**
    public void setSource(String src) {
        source = src;
    }

    /**
    public void setSWLatLon(LatLon swLL) {
        SWLatLon = swLL;
    }

    /**
    public void setNELatLon(LatLon neLL) {
        NELatLon = neLL;
    }

    /**
    public void setSWLatLon(float lat, float lon) {
        SWLatLon = new LatLon(lat, lon);
    }

    /**
    public void setNELatLon(float lat, float lon) {
        NELatLon = new LatLon(lat, lon);
    }

    /**
    public void setFromDate(DateTime fromDT) {
        fromDate = fromDT;
    }

    /**
    public void setToDate(DateTime toDT) {
        toDate = toDT;
    }

    /**
    public void setFromDate(int yr, int mo, int day) {
        fromDate = new DateTime(yr, mo, day, 0, 0, 0);
    }

    /**
    public void setToDate(int yr, int mo, int day) {
        toDate = new DateTime(yr, mo, day, 23, 59, 59);
    }

    /**
    public void setDateRange(int yr, int mo) {
        setFromDate(yr, mo, 1);
        int d = fromDate.daysInMonth();
        setToDate(yr, mo, d);
    }

    /**
    public void setMultipleYears(boolean multiYrs) {
        multipleYears = multiYrs;
    }

    /**
    public int get() {
        removeAllElements();
        if (multipleYears) return findMultipleYears(); else return find(fromDate, toDate);
    }

    /**
    private int find(DateTime fromDT, DateTime toDT) {
        float Wlon, Elon;
        Format f7 = new Format("%7.3f");
        Format f8 = new Format("%8.3f");
        String query = "SELECT datagf.*,stations.lat,stations.lon";
        query += " FROM datagf,stations";
        if (stn != null && stn != "") {
            query += " WHERE datagf.stn='" + stn + "'";
        } else {
            query += " WHERE lat>=" + f7.form(SWLatLon.getLat());
            query += " AND lat<=" + f7.form(NELatLon.getLat());
            Wlon = SWLatLon.getLon();
            Elon = NELatLon.getLon();
            boolean crossMeridian = false;
            if (Elon < Wlon) crossMeridian = true;
            if (crossMeridian) {
                query += " AND (lon>=" + f8.form(SWLatLon.getLon());
                query += " OR lon<=" + f8.form(NELatLon.getLon()) + ")";
            } else {
                query += " AND lon>=" + f8.form(SWLatLon.getLon());
                query += " AND lon<=" + f8.form(NELatLon.getLon());
            }
        }
        query += " AND obsdate>=" + fromDT.toCustomString("yyyyMMdd");
        query += " AND obsdate<=" + toDT.toCustomString("yyyyMMdd");
        query += " AND datagf.stn=stations.stn";
        query += " ORDER BY datagf.stn,obsdate";
        try {
            ResultSet rs = stmt.executeQuery(query);
            boolean First = true;
            while (rs.next()) {
                CosmData gd = new CosmData(connection);
                gd.extractData(rs);
                addElement(gd);
                found++;
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println(" *** " + e.getSQLState());
            e.printStackTrace();
        }
        if (!multipleYears) trimToSize();
        return found;
    }

    /**
    public int getStnYrMo() {
        removeAllElements();
        String query = "SELECT * FROM ";
        if (source.equals("4")) query += "data4096"; else query += "datagf";
        query += " WHERE obsdate>=" + fromDate.toCustomString("yyyyMMdd");
        query += " AND obsdate<=" + toDate.toCustomString("yyyyMMdd");
        if (stn != null && stn != "") query += " AND stn='" + stn + "'";
        query += " ORDER BY obsdate";
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (source.equals("G")) {
                    CosmData cd = new CosmData(connection);
                    cd.extractData(rs);
                    addElement(cd);
                } else if (source.equals("4")) {
                    CosmData4 cd4 = new CosmData4(connection);
                    cd4.extractData(rs);
                    addElement(cd4);
                }
                found++;
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println(" *** " + e.getSQLState());
            e.printStackTrace();
        }
        trimToSize();
        return found;
    }

    /**
    public int getByStnYr() {
        found = 0;
        String query = "SELECT * FROM inventory";
        query += " WHERE stn='" + stn + "'";
        query += " and yr=" + yr;
        if (source != null) query += " and source='" + source + "'";
        query += " ORDER BY stn,yr";
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Inventory inv = new Inventory(connection);
                inv.extractData(rs);
                addElement(inv);
                found++;
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return found;
    }

    /**
    public int getByStn() {
        found = 0;
        String query = "SELECT stn,yr,source,";
        query += "sum(numCorrected) as numCorrected,";
        query += "sum(numUncorrected) as numUncorrected,";
        query += "sum(numPressure) as numPressure,";
        query += "sum(avgCorrected) as avgCorrected,";
        query += "sum(avgUncorrected) as avgUncorrected,";
        query += "sum(avgPressure) as avgPressure,";
        query += "sum(minCorrected) as minCorrected,";
        query += "sum(minUncorrected) as minUncorrected,";
        query += "sum(minPressure) as minPressure,";
        query += "sum(maxCorrected) as maxCorrected,";
        query += "sum(maxUncorrected) as maxUncorrected,";
        query += "sum(maxPressure) as maxPressure";
        query += " FROM inventory";
        query += " WHERE stn='" + stn + "'";
        query += " GROUP BY yr,source";
        query += " ORDER BY yr,source";
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Inventory inv = new Inventory(connection);
                inv.extractData(rs);
                addElement(inv);
                found++;
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return found;
    }

    /**
    public int getByYr() {
        found = 0;
        String query = "SELECT stn,yr,source,";
        query += "sum(numCorrected) as numCorrected,";
        query += "sum(numUncorrected) as numUncorrected,";
        query += "sum(numPressure) as numPressure,";
        query += "sum(avgCorrected) as avgCorrected,";
        query += "sum(avgUncorrected) as avgUncorrected,";
        query += "sum(avgPressure) as avgPressure,";
        query += "sum(minCorrected) as minCorrected,";
        query += "sum(minUncorrected) as minUncorrected,";
        query += "sum(minPressure) as minPressure,";
        query += "sum(maxCorrected) as maxCorrected,";
        query += "sum(maxUncorrected) as maxUncorrected,";
        query += "sum(maxPressure) as maxPressure";
        query += " FROM inventory";
        query += " WHERE yr=" + yr;
        query += " GROUP BY stn,source";
        query += " ORDER BY stn,source";
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Inventory inv = new Inventory(connection);
                inv.extractData(rs);
                addElement(inv);
                found++;
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return found;
    }

    /**
    private int findMultipleYears() {
        int fyr, tyr;
        DateTime ftm, ttm, tmptm;
        multipleYears = true;
        fyr = fromDate.get(Calendar.YEAR);
        tyr = toDate.get(Calendar.YEAR);
        ftm = (DateTime) fromDate.clone();
        ttm = (DateTime) toDate.clone();
        for (int y = fyr; y <= tyr; y++) {
            ftm.set(Calendar.YEAR, y);
            ttm.set(Calendar.YEAR, y);
            if (y < tyr && ttm.before(ftm)) ttm.add(Calendar.YEAR, 1);
            if (y == tyr && y > fyr && ttm.before(ftm)) ftm.add(Calendar.YEAR, -1);
            found += find(ftm, ttm);
        }
        return found;
    }

    /**
    public int get(String station, int year, int month) {
        stn = station;
        fromDate = new DateTime(year, month, 1);
        int d = fromDate.getMaximum(Calendar.DAY_OF_MONTH);
        toDate = new DateTime(year, month, d, 23, 59, 59);
        return getStnYrMo();
    }

    /**
    public int get(LatLon swLL, LatLon neLL, DateTime fromDT, DateTime toDT) {
        SWLatLon = swLL;
        NELatLon = neLL;
        fromDate = fromDT;
        toDate = toDT;
        return get();
    }

    /**
    public int get(LatLon ll, DateTime fromDT, DateTime toDT) {
        SWLatLon = ll;
        NELatLon = ll;
        fromDate = fromDT;
        toDate = toDT;
        return get();
    }

    /**
    public int get(LatLon swLL, LatLon neLL, DateTime dttm) {
        SWLatLon = swLL;
        NELatLon = neLL;
        fromDate = dttm;
        toDate = dttm;
        return get();
    }

    /**
    public void print() {
        int l = size();
        if (l < 1) {
            System.out.println("*** No data found\n");
            System.out.flush();
            return;
        }
        for (int i = 0; i < l; i++) {
            Inventory inv = (Inventory) elementAt(i);
            inv.printline();
            System.out.println("\n");
        }
        System.out.flush();
    }

    /**
    public void printSize() {
        int l = size();
        System.out.println(l + " data records");
        System.out.flush();
    }
}