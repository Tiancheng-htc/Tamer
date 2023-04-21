package org.proteored.miapeapi.xml.gelml.autogenerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *  A measured value, property or annotation about a GelLocation, such as
 *     predicted MW or pI. 
 * 
 * <p>Java class for GelML.Excision.LocationMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GelML.Excision.LocationMeasureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evidence" type="{http://www.psidev.info/gelml/1_1candidate}ParamType" minOccurs="0"/>
 *         &lt;group ref="{http://www.psidev.info/gelml/1_1candidate}MeasurementGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GelML.Excision.LocationMeasureType", propOrder = { "evidence", "atomicValue", "booleanValue", "complexValue", "range" })
public class GelMLExcisionLocationMeasureType {

    protected ParamType evidence;

    @XmlElement(name = "AtomicValue")
    protected FuGECommonMeasurementAtomicValueType atomicValue;

    @XmlElement(name = "BooleanValue")
    protected FuGECommonMeasurementBooleanValueType booleanValue;

    @XmlElement(name = "ComplexValue")
    protected FuGECommonMeasurementComplexValueType complexValue;

    @XmlElement(name = "Range")
    protected FuGECommonMeasurementRangeType range;

    /**
     * Gets the value of the evidence property.
     * 
     * @return
     *     possible object is
     *     {@link ParamType }
     *     
     */
    public ParamType getEvidence() {
        return evidence;
    }

    /**
     * Sets the value of the evidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamType }
     *     
     */
    public void setEvidence(ParamType value) {
        this.evidence = value;
    }

    /**
     * Gets the value of the atomicValue property.
     * 
     * @return
     *     possible object is
     *     {@link FuGECommonMeasurementAtomicValueType }
     *     
     */
    public FuGECommonMeasurementAtomicValueType getAtomicValue() {
        return atomicValue;
    }

    /**
     * Sets the value of the atomicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuGECommonMeasurementAtomicValueType }
     *     
     */
    public void setAtomicValue(FuGECommonMeasurementAtomicValueType value) {
        this.atomicValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link FuGECommonMeasurementBooleanValueType }
     *     
     */
    public FuGECommonMeasurementBooleanValueType getBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuGECommonMeasurementBooleanValueType }
     *     
     */
    public void setBooleanValue(FuGECommonMeasurementBooleanValueType value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the complexValue property.
     * 
     * @return
     *     possible object is
     *     {@link FuGECommonMeasurementComplexValueType }
     *     
     */
    public FuGECommonMeasurementComplexValueType getComplexValue() {
        return complexValue;
    }

    /**
     * Sets the value of the complexValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuGECommonMeasurementComplexValueType }
     *     
     */
    public void setComplexValue(FuGECommonMeasurementComplexValueType value) {
        this.complexValue = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link FuGECommonMeasurementRangeType }
     *     
     */
    public FuGECommonMeasurementRangeType getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuGECommonMeasurementRangeType }
     *     
     */
    public void setRange(FuGECommonMeasurementRangeType value) {
        this.range = value;
    }
}