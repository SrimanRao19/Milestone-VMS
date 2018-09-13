
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapabilityId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Absolute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Relative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Stop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Automatic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityInfo", propOrder = {
    "capabilityId",
    "name",
    "absolute",
    "relative",
    "start",
    "stop",
    "speed",
    "automatic"
})
public class CapabilityInfo {

    @XmlElement(name = "CapabilityId", required = true)
    protected String capabilityId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Absolute")
    protected boolean absolute;
    @XmlElement(name = "Relative")
    protected boolean relative;
    @XmlElement(name = "Start")
    protected boolean start;
    @XmlElement(name = "Stop")
    protected boolean stop;
    @XmlElement(name = "Speed")
    protected boolean speed;
    @XmlElement(name = "Automatic")
    protected boolean automatic;

    /**
     * Gets the value of the capabilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityId() {
        return capabilityId;
    }

    /**
     * Sets the value of the capabilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityId(String value) {
        this.capabilityId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the absolute property.
     * 
     */
    public boolean isAbsolute() {
        return absolute;
    }

    /**
     * Sets the value of the absolute property.
     * 
     */
    public void setAbsolute(boolean value) {
        this.absolute = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     */
    public boolean isRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     */
    public void setRelative(boolean value) {
        this.relative = value;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public boolean isStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(boolean value) {
        this.start = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     */
    public boolean isStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     */
    public void setStop(boolean value) {
        this.stop = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public boolean isSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(boolean value) {
        this.speed = value;
    }

    /**
     * Gets the value of the automatic property.
     * 
     */
    public boolean isAutomatic() {
        return automatic;
    }

    /**
     * Sets the value of the automatic property.
     * 
     */
    public void setAutomatic(boolean value) {
        this.automatic = value;
    }

}
