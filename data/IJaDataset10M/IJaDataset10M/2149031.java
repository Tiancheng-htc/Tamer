package model.domain.relationship;

import java.io.Serializable;
import model.domain.DmClass;

public class Relationship implements Serializable, Comparable<Relationship> {

    private static final long serialVersionUID = 1L;

    private boolean autoGenerated = Boolean.TRUE;

    private DmClass destination;

    private String id = "";

    private String multiplicity = RelationshipConstants.ONE;

    private String multiplicityDest = RelationshipConstants.ONE;

    private String name;

    private String role;

    private String roleDest;

    private DmClass source;

    private String type;

    public Relationship() {
    }

    public Relationship(DmClass source, DmClass target) {
        this.source = source;
        this.destination = target;
    }

    public Relationship(String type) {
        this.type = type;
    }

    public Relationship(String type, DmClass source, DmClass destination) {
        this.source = source;
        this.destination = destination;
        this.type = type;
    }

    public Relationship(String type, DmClass source, DmClass destination, String multiplicitySource, String multiplicityTarget) {
        this.source = source;
        this.destination = destination;
        this.type = type;
        this.multiplicity = multiplicitySource;
        this.multiplicityDest = multiplicityTarget;
    }

    @Override
    public boolean equals(Object obj) {
        Relationship r = (Relationship) obj;
        return r.getDestination().getId() == this.getDestination().getId();
    }

    public DmClass getDestination() {
        return destination;
    }

    public String getId() {
        return id;
    }

    public String getMultiplicity() {
        return multiplicity;
    }

    public String getMultiplicityDest() {
        return multiplicityDest;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getRoleDest() {
        return roleDest;
    }

    public DmClass getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public boolean isAutoGenerated() {
        return autoGenerated;
    }

    public void setAutoGenerated(boolean autoGenerated) {
        this.autoGenerated = autoGenerated;
    }

    public void setDestination(DmClass destination) {
        this.destination = destination;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMultiplicity(String multiplicity) {
        this.multiplicity = multiplicity;
    }

    public void setMultiplicityDest(String multiplicityDest) {
        this.multiplicityDest = multiplicityDest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRoleDest(String roleDest) {
        this.roleDest = roleDest;
    }

    public void setSource(DmClass source) {
        this.source = source;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Relationship o) {
        return o.getDestination().getId() - this.getDestination().getId();
    }
}