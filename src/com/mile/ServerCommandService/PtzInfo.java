
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtzInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtzInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PtzEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Presets" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfPresetInfo" minOccurs="0"/>
 *         &lt;element name="Capabilities" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfCapabilityInfo" minOccurs="0"/>
 *         &lt;element name="IsCenterOnPositionInViewSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPtzCenterAndZoomToRectangleSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPtzHomeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPtzDiagonalSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EditPreset" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtzInfo", propOrder = {
    "ptzEnabled",
    "presets",
    "capabilities",
    "isCenterOnPositionInViewSupported",
    "isPtzCenterAndZoomToRectangleSupported",
    "isPtzHomeSupported",
    "isPtzDiagonalSupported",
    "editPreset"
})
public class PtzInfo {

    @XmlElement(name = "PtzEnabled")
    protected boolean ptzEnabled;
    @XmlElement(name = "Presets")
    protected ArrayOfPresetInfo presets;
    @XmlElement(name = "Capabilities")
    protected ArrayOfCapabilityInfo capabilities;
    @XmlElement(name = "IsCenterOnPositionInViewSupported")
    protected boolean isCenterOnPositionInViewSupported;
    @XmlElement(name = "IsPtzCenterAndZoomToRectangleSupported")
    protected boolean isPtzCenterAndZoomToRectangleSupported;
    @XmlElement(name = "IsPtzHomeSupported")
    protected boolean isPtzHomeSupported;
    @XmlElement(name = "IsPtzDiagonalSupported")
    protected boolean isPtzDiagonalSupported;
    @XmlElement(name = "EditPreset")
    protected boolean editPreset;

    /**
     * Gets the value of the ptzEnabled property.
     * 
     */
    public boolean isPtzEnabled() {
        return ptzEnabled;
    }

    /**
     * Sets the value of the ptzEnabled property.
     * 
     */
    public void setPtzEnabled(boolean value) {
        this.ptzEnabled = value;
    }

    /**
     * Gets the value of the presets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPresetInfo }
     *     
     */
    public ArrayOfPresetInfo getPresets() {
        return presets;
    }

    /**
     * Sets the value of the presets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPresetInfo }
     *     
     */
    public void setPresets(ArrayOfPresetInfo value) {
        this.presets = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCapabilityInfo }
     *     
     */
    public ArrayOfCapabilityInfo getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCapabilityInfo }
     *     
     */
    public void setCapabilities(ArrayOfCapabilityInfo value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the isCenterOnPositionInViewSupported property.
     * 
     */
    public boolean isIsCenterOnPositionInViewSupported() {
        return isCenterOnPositionInViewSupported;
    }

    /**
     * Sets the value of the isCenterOnPositionInViewSupported property.
     * 
     */
    public void setIsCenterOnPositionInViewSupported(boolean value) {
        this.isCenterOnPositionInViewSupported = value;
    }

    /**
     * Gets the value of the isPtzCenterAndZoomToRectangleSupported property.
     * 
     */
    public boolean isIsPtzCenterAndZoomToRectangleSupported() {
        return isPtzCenterAndZoomToRectangleSupported;
    }

    /**
     * Sets the value of the isPtzCenterAndZoomToRectangleSupported property.
     * 
     */
    public void setIsPtzCenterAndZoomToRectangleSupported(boolean value) {
        this.isPtzCenterAndZoomToRectangleSupported = value;
    }

    /**
     * Gets the value of the isPtzHomeSupported property.
     * 
     */
    public boolean isIsPtzHomeSupported() {
        return isPtzHomeSupported;
    }

    /**
     * Sets the value of the isPtzHomeSupported property.
     * 
     */
    public void setIsPtzHomeSupported(boolean value) {
        this.isPtzHomeSupported = value;
    }

    /**
     * Gets the value of the isPtzDiagonalSupported property.
     * 
     */
    public boolean isIsPtzDiagonalSupported() {
        return isPtzDiagonalSupported;
    }

    /**
     * Sets the value of the isPtzDiagonalSupported property.
     * 
     */
    public void setIsPtzDiagonalSupported(boolean value) {
        this.isPtzDiagonalSupported = value;
    }

    /**
     * Gets the value of the editPreset property.
     * 
     */
    public boolean isEditPreset() {
        return editPreset;
    }

    /**
     * Sets the value of the editPreset property.
     * 
     */
    public void setEditPreset(boolean value) {
        this.editPreset = value;
    }

}
