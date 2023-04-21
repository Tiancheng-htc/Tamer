package org.opencarto.kml.v20.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Icon" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}IconStyle" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}LineStyle" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}PolyStyle" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}LabelStyle" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}BalloonStyle" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}color" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}scale" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {  })
@XmlRootElement(name = "Style")
public class Style {

    @XmlElement(name = "Icon")
    protected Icon icon;

    @XmlElement(name = "IconStyle")
    protected IconStyle iconStyle;

    @XmlElement(name = "LineStyle")
    protected LineStyle lineStyle;

    @XmlElement(name = "PolyStyle")
    protected PolyStyle polyStyle;

    @XmlElement(name = "LabelStyle")
    protected LabelStyle labelStyle;

    @XmlElement(name = "BalloonStyle")
    protected BalloonStyle balloonStyle;

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] color;

    protected BigDecimal scale;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link Icon }
     *     
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icon }
     *     
     */
    public void setIcon(Icon value) {
        this.icon = value;
    }

    /**
     * Gets the value of the iconStyle property.
     * 
     * @return
     *     possible object is
     *     {@link IconStyle }
     *     
     */
    public IconStyle getIconStyle() {
        return iconStyle;
    }

    /**
     * Sets the value of the iconStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconStyle }
     *     
     */
    public void setIconStyle(IconStyle value) {
        this.iconStyle = value;
    }

    /**
     * Gets the value of the lineStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LineStyle }
     *     
     */
    public LineStyle getLineStyle() {
        return lineStyle;
    }

    /**
     * Sets the value of the lineStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyle }
     *     
     */
    public void setLineStyle(LineStyle value) {
        this.lineStyle = value;
    }

    /**
     * Gets the value of the polyStyle property.
     * 
     * @return
     *     possible object is
     *     {@link PolyStyle }
     *     
     */
    public PolyStyle getPolyStyle() {
        return polyStyle;
    }

    /**
     * Sets the value of the polyStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolyStyle }
     *     
     */
    public void setPolyStyle(PolyStyle value) {
        this.polyStyle = value;
    }

    /**
     * Gets the value of the labelStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LabelStyle }
     *     
     */
    public LabelStyle getLabelStyle() {
        return labelStyle;
    }

    /**
     * Sets the value of the labelStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelStyle }
     *     
     */
    public void setLabelStyle(LabelStyle value) {
        this.labelStyle = value;
    }

    /**
     * Gets the value of the balloonStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BalloonStyle }
     *     
     */
    public BalloonStyle getBalloonStyle() {
        return balloonStyle;
    }

    /**
     * Sets the value of the balloonStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalloonStyle }
     *     
     */
    public void setBalloonStyle(BalloonStyle value) {
        this.balloonStyle = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(byte[] value) {
        this.color = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScale(BigDecimal value) {
        this.scale = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }
}