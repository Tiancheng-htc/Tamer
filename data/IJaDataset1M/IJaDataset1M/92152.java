package net.sf.vgap4.projecteditor.model;

import java.io.Serializable;
import java.util.Vector;
import java.util.logging.Logger;
import org.eclipse.draw2d.geometry.Point;

/**
 * This class contains all relevant data that comes form the CSV output files that are generated by the client
 * interface from the VGA Planets 4 game. The input CSV files contain all information that is used during the
 * planning of the game turns. This information is extracted for a single player and is loadable for every
 * game turn. The turn information is identified inside another generated file that is not stored in the
 * model.<br>
 * This class stores the planet information data for a single user on a single turn. Multiuser information or
 * multi-turn information should be stored as collections of instances of this class in other structures.<br>
 * Key information to store in this model container structure are the <code>Resources</code>,
 * <code>Minerals</code>, <code>Climate</code> and <code>Natives</code> information.
 */
public class PlanetInformation implements Serializable {

    private static final long serialVersionUID = 5152392625879298221L;

    private static Logger logger = Logger.getLogger("net.sf.vgap4.projecteditor.model");

    /**
	 * Stores the reference to this planet unique ID. This is mapped from the input data and used for turn
	 * insertion validation (this data cannot be inserted inside another planet). This field is a copy of the
	 * values of all the instances of planet turn information that can be imported and used to validate this
	 * data before adding new <code>PlanetInformation</code> to the model.
	 */
    private int idNumber = -1;

    /** Stores the name for this planet, this name is set to this game map and cannot be changed. */
    private String name;

    /**
	 * Stores the coordinates to the planet location inside the diagram coordinates. Those coordinates do not
	 * change and can be cached.
	 */
    private Point location;

    /**
	 * Stores the reference to this planet unique ID. This is mapped from the input data and used for turn
	 * insertion validation (this data cannot be inserted inside another planet).
	 */
    private String ID;

    /** Structure with all the mining information available on this planet's turn data. */
    private MiningInformation miningInfo;

    private Climate climateInformation = null;

    private Natives nativeInformation = null;

    private int soil;

    private int food;

    private int medicalUnits;

    private int repairUnits;

    private int supplies;

    private int ordnance;

    private int cash;

    public int getIdNumber() {
        return this.idNumber;
    }

    public String getName() {
        return name;
    }

    public Point getLocation() {
        if (null == this.location) return new Point(0, 0); else return location;
    }

    /**
	 * Get the mining information for all the minerals at once. This simplifies the interface because all this
	 * information is transferred with a single command. Destination will then understand the structure and
	 * extract the right information from the structure.
	 */
    public Vector<Mineral> getMiningInformation() {
        return this.miningInfo.getMiningInformation();
    }

    /**
	 * Loads the contents on the source fileds into the corresponding attributes of this instance, processing
	 * them as required to convert string to number is necessary.
	 */
    public void loadData(String[] planetFields) {
        try {
            this.idNumber = convert2Integer(planetFields[1].trim());
            name = planetFields[2].trim();
            int x = convert2Integer(planetFields[5].trim());
            int y = convert2Integer(planetFields[6].trim());
            this.location = new Point(x, y);
            climateInformation = new Climate(planetFields);
            nativeInformation = new Natives(planetFields);
            soil = convert2Integer(planetFields[22].trim());
            miningInfo = new MiningInformation(planetFields);
            food = convert2Integer(planetFields[39].trim());
            medicalUnits = convert2Integer(planetFields[40].trim());
            repairUnits = convert2Integer(planetFields[53].trim());
            supplies = convert2Integer(planetFields[54].trim());
            ordnance = convert2Integer(planetFields[55].trim());
            cash = convert2Integer(planetFields[56].trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected int convert2Integer(String fieldValue) {
        return Integer.parseInt(fieldValue.trim());
    }
}