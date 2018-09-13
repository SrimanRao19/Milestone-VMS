
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanoramicLensInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanoramicLensInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PanoramicLensEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PanoramicLensType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CameraMount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImmerVision" type="{http://videoos.net/2/XProtectCSServerCommand}ImmerVisionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanoramicLensInfo", propOrder = {
    "panoramicLensEnabled",
    "panoramicLensType",
    "cameraMount",
    "immerVision"
})
public class PanoramicLensInfo {

    @XmlElement(name = "PanoramicLensEnabled")
    protected boolean panoramicLensEnabled;
    @XmlElement(name = "PanoramicLensType")
    protected String panoramicLensType;
    @XmlElement(name = "CameraMount")
    protected String cameraMount;
    @XmlElement(name = "ImmerVision")
    protected ImmerVisionInfo immerVision;

    /**
     * Gets the value of the panoramicLensEnabled property.
     * 
     */
    public boolean isPanoramicLensEnabled() {
        return panoramicLensEnabled;
    }

    /**
     * Sets the value of the panoramicLensEnabled property.
     * 
     */
    public void setPanoramicLensEnabled(boolean value) {
        this.panoramicLensEnabled = value;
    }

    /**
     * Gets the value of the panoramicLensType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanoramicLensType() {
        return panoramicLensType;
    }

    /**
     * Sets the value of the panoramicLensType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanoramicLensType(String value) {
        this.panoramicLensType = value;
    }

    /**
     * Gets the value of the cameraMount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraMount() {
        return cameraMount;
    }

    /**
     * Sets the value of the cameraMount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraMount(String value) {
        this.cameraMount = value;
    }

    /**
     * Gets the value of the immerVision property.
     * 
     * @return
     *     possible object is
     *     {@link ImmerVisionInfo }
     *     
     */
    public ImmerVisionInfo getImmerVision() {
        return immerVision;
    }

    /**
     * Sets the value of the immerVision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmerVisionInfo }
     *     
     */
    public void setImmerVision(ImmerVisionInfo value) {
        this.immerVision = value;
    }

}
