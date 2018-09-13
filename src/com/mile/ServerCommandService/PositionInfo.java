
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pan" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tilt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Zoom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionInfo", propOrder = {
    "pan",
    "tilt",
    "zoom"
})
public class PositionInfo {

    @XmlElement(name = "Pan")
    protected double pan;
    @XmlElement(name = "Tilt")
    protected double tilt;
    @XmlElement(name = "Zoom")
    protected double zoom;

    /**
     * Gets the value of the pan property.
     * 
     */
    public double getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     */
    public void setPan(double value) {
        this.pan = value;
    }

    /**
     * Gets the value of the tilt property.
     * 
     */
    public double getTilt() {
        return tilt;
    }

    /**
     * Sets the value of the tilt property.
     * 
     */
    public void setTilt(double value) {
        this.tilt = value;
    }

    /**
     * Gets the value of the zoom property.
     * 
     */
    public double getZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     */
    public void setZoom(double value) {
        this.zoom = value;
    }

}
