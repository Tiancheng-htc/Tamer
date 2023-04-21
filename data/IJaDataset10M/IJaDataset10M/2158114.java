package edu.unibi.agbi.biodwh.entity.reactome;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Affiliation2Name generated by hbm2java
 */
@Entity(name = "reactome_affiliation2name")
@Table(name = "reactome_affiliation2name")
public class Affiliation2Name implements java.io.Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -6368169117789740155L;

    private Affiliation2NameId id;

    private String name;

    public Affiliation2Name() {
    }

    public Affiliation2Name(Affiliation2NameId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "dbId", column = @Column(name = "DB_ID")), @AttributeOverride(name = "nameRank", column = @Column(name = "name_rank")), @AttributeOverride(name = "name", column = @Column(name = "name", length = 365000)) })
    public Affiliation2NameId getId() {
        return this.id;
    }

    public void setId(Affiliation2NameId id) {
        this.id = id;
    }

    @Column(name = "name", length = 365000)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}