
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtzSecurityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtzSecurityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManualControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PresetControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReserveControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtzSecurityInfo", propOrder = {
    "manualControl",
    "presetControl",
    "reserveControl"
})
public class PtzSecurityInfo {

    @XmlElement(name = "ManualControl")
    protected boolean manualControl;
    @XmlElement(name = "PresetControl")
    protected boolean presetControl;
    @XmlElement(name = "ReserveControl")
    protected boolean reserveControl;

    /**
     * Gets the value of the manualControl property.
     * 
     */
    public boolean isManualControl() {
        return manualControl;
    }

    /**
     * Sets the value of the manualControl property.
     * 
     */
    public void setManualControl(boolean value) {
        this.manualControl = value;
    }

    /**
     * Gets the value of the presetControl property.
     * 
     */
    public boolean isPresetControl() {
        return presetControl;
    }

    /**
     * Sets the value of the presetControl property.
     * 
     */
    public void setPresetControl(boolean value) {
        this.presetControl = value;
    }

    /**
     * Gets the value of the reserveControl property.
     * 
     */
    public boolean isReserveControl() {
        return reserveControl;
    }

    /**
     * Sets the value of the reserveControl property.
     * 
     */
    public void setReserveControl(boolean value) {
        this.reserveControl = value;
    }

}
