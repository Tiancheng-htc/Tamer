package com.ecomponentes.hibernate.fonte;

import java.io.Serializable;

/**
 * A class that represents a row in the tb_fonte table. 
 * You can customize the behavior of this class by editing the class, {@link TbFonte()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractTbFonte implements Serializable {

    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer idFonte;

    /** The value of the simple nomeFonte property. */
    private java.lang.String nomeFonte;

    /** The value of the simple descricaoFonte property. */
    private java.lang.String descricaoFonte;

    /**
     * Simple constructor of AbstractTbFonte instances.
     */
    public AbstractTbFonte() {
    }

    /**
     * Constructor of AbstractTbFonte instances given a simple primary key.
     * @param idFonte
     */
    public AbstractTbFonte(java.lang.Integer idFonte) {
        this.setIdFonte(idFonte);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdFonte() {
        return idFonte;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param idFonte
     */
    public void setIdFonte(java.lang.Integer idFonte) {
        this.hashValue = 0;
        this.idFonte = idFonte;
    }

    /**
     * Return the value of the nome_fonte column.
     * @return java.lang.String
     */
    public java.lang.String getNomeFonte() {
        return this.nomeFonte;
    }

    /**
     * Set the value of the nome_fonte column.
     * @param nomeFonte
     */
    public void setNomeFonte(java.lang.String nomeFonte) {
        this.nomeFonte = nomeFonte;
    }

    /**
     * Return the value of the descricao_fonte column.
     * @return java.lang.String
     */
    public java.lang.String getDescricaoFonte() {
        return this.descricaoFonte;
    }

    /**
     * Set the value of the descricao_fonte column.
     * @param descricaoFonte
     */
    public void setDescricaoFonte(java.lang.String descricaoFonte) {
        this.descricaoFonte = descricaoFonte;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs) {
        if (rhs == null) return false;
        if (!(rhs instanceof TbFonte)) return false;
        TbFonte that = (TbFonte) rhs;
        if (this.getIdFonte() != null && that.getIdFonte() != null) {
            if (!this.getIdFonte().equals(that.getIdFonte())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode() {
        if (this.hashValue == 0) {
            int result = 17;
            int idFonteValue = this.getIdFonte() == null ? 0 : this.getIdFonte().hashCode();
            result = result * 37 + idFonteValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}