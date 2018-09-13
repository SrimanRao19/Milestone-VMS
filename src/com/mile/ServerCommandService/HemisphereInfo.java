
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HemisphereInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HemisphereInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RadiusX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RadiusY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CenterX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CenterY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HemisphereInfo", propOrder = {
    "radiusX",
    "radiusY",
    "centerX",
    "centerY"
})
public class HemisphereInfo {

    @XmlElement(name = "RadiusX")
    protected double radiusX;
    @XmlElement(name = "RadiusY")
    protected double radiusY;
    @XmlElement(name = "CenterX")
    protected double centerX;
    @XmlElement(name = "CenterY")
    protected double centerY;

    /**
     * Gets the value of the radiusX property.
     * 
     */
    public double getRadiusX() {
        return radiusX;
    }

    /**
     * Sets the value of the radiusX property.
     * 
     */
    public void setRadiusX(double value) {
        this.radiusX = value;
    }

    /**
     * Gets the value of the radiusY property.
     * 
     */
    public double getRadiusY() {
        return radiusY;
    }

    /**
     * Sets the value of the radiusY property.
     * 
     */
    public void setRadiusY(double value) {
        this.radiusY = value;
    }

    /**
     * Gets the value of the centerX property.
     * 
     */
    public double getCenterX() {
        return centerX;
    }

    /**
     * Sets the value of the centerX property.
     * 
     */
    public void setCenterX(double value) {
        this.centerX = value;
    }

    /**
     * Gets the value of the centerY property.
     * 
     */
    public double getCenterY() {
        return centerY;
    }

    /**
     * Sets the value of the centerY property.
     * 
     */
    public void setCenterY(double value) {
        this.centerY = value;
    }

}
