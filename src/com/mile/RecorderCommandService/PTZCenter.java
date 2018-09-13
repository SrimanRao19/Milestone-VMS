
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="refWidth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="refHeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="centerX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="centerY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="zoom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "deviceId",
    "refWidth",
    "refHeight",
    "centerX",
    "centerY",
    "zoom"
})
@XmlRootElement(name = "PTZCenter")
public class PTZCenter {

    protected String token;
    @XmlElement(required = true)
    protected String deviceId;
    protected double refWidth;
    protected double refHeight;
    protected double centerX;
    protected double centerY;
    protected double zoom;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the refWidth property.
     * 
     */
    public double getRefWidth() {
        return refWidth;
    }

    /**
     * Sets the value of the refWidth property.
     * 
     */
    public void setRefWidth(double value) {
        this.refWidth = value;
    }

    /**
     * Gets the value of the refHeight property.
     * 
     */
    public double getRefHeight() {
        return refHeight;
    }

    /**
     * Sets the value of the refHeight property.
     * 
     */
    public void setRefHeight(double value) {
        this.refHeight = value;
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
