package edu.unibi.agbi.dawismd.entities.biodwh.kegg.ligand.enzyme;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * KeggEnzymePathwayId generated by hbm2java
 */
@Embeddable
public class KeggEnzymePathwayId implements java.io.Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 8877528292727078437L;

    private String entry;

    private String org;

    private String number;

    public KeggEnzymePathwayId() {
    }

    public KeggEnzymePathwayId(String entry, String org, String number) {
        this.entry = entry;
        this.org = org;
        this.number = number;
    }

    @Column(name = "entry", nullable = false)
    public String getEntry() {
        return this.entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Column(name = "org", nullable = false)
    public String getOrg() {
        return this.org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Column(name = "number", nullable = false)
    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean equals(Object other) {
        if ((this == other)) return true;
        if ((other == null)) return false;
        if (!(other instanceof KeggEnzymePathwayId)) return false;
        KeggEnzymePathwayId castOther = (KeggEnzymePathwayId) other;
        return ((this.getEntry() == castOther.getEntry()) || (this.getEntry() != null && castOther.getEntry() != null && this.getEntry().equals(castOther.getEntry()))) && ((this.getOrg() == castOther.getOrg()) || (this.getOrg() != null && castOther.getOrg() != null && this.getOrg().equals(castOther.getOrg()))) && ((this.getNumber() == castOther.getNumber()) || (this.getNumber() != null && castOther.getNumber() != null && this.getNumber().equals(castOther.getNumber())));
    }

    public int hashCode() {
        int result = 17;
        result = 37 * result + (getEntry() == null ? 0 : this.getEntry().hashCode());
        result = 37 * result + (getOrg() == null ? 0 : this.getOrg().hashCode());
        result = 37 * result + (getNumber() == null ? 0 : this.getNumber().hashCode());
        return result;
    }
}