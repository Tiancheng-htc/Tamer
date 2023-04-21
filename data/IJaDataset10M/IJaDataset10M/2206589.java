package com.icteam.fiji.model;

import java.sql.Blob;

/**
 * SistCfgn generated by hbm2java
 */
public class SistCfgn extends Auditable implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CfgnKey cfgnKey;

    private Blob XVal;

    private String DVal;

    private Boolean FVal;

    private Long VVal;

    /**
    * default constructor
    */
    public SistCfgn() {
    }

    public CfgnKey getCfgnKey() {
        return cfgnKey;
    }

    public void setCfgnKey(CfgnKey cfgnKey) {
        this.cfgnKey = cfgnKey;
    }

    public Blob getXVal() {
        return XVal;
    }

    public void setXVal(Blob XVal) {
        this.XVal = XVal;
    }

    public String getDVal() {
        return DVal;
    }

    public void setDVal(String DVal) {
        this.DVal = DVal;
    }

    public Boolean getFVal() {
        return FVal;
    }

    public void setFVal(Boolean FVal) {
        this.FVal = FVal;
    }

    public Long getVVal() {
        return VVal;
    }

    public void setVVal(Long VVal) {
        this.VVal = VVal;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UtenCfgn)) return false;
        UtenCfgn utenCfgn = (UtenCfgn) o;
        String that_cfngKey = null;
        if (utenCfgn.getCfgnKey() != null) that_cfngKey = utenCfgn.getCfgnKey().getNCfgnKey();
        String this_cfngKey = null;
        if (getCfgnKey() != null) this_cfngKey = getCfgnKey().getNCfgnKey();
        if (that_cfngKey != null ? !that_cfngKey.equals(this_cfngKey) : this_cfngKey != null) return false;
        return true;
    }

    public int hashCode() {
        String this_cfngKey = null;
        if (getCfgnKey() != null) this_cfngKey = getCfgnKey().getNCfgnKey();
        int result;
        result = (this_cfngKey != null ? this_cfngKey.hashCode() : 0);
        return result;
    }
}