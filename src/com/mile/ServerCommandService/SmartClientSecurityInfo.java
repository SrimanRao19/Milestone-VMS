
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartClientSecurityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartClientSecurityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartClientLive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SmartClientBrowse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SmartClientSetup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SmartClientReport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartClientSecurityInfo", propOrder = {
    "smartClientLive",
    "smartClientBrowse",
    "smartClientSetup",
    "smartClientReport"
})
public class SmartClientSecurityInfo {

    @XmlElement(name = "SmartClientLive")
    protected boolean smartClientLive;
    @XmlElement(name = "SmartClientBrowse")
    protected boolean smartClientBrowse;
    @XmlElement(name = "SmartClientSetup")
    protected boolean smartClientSetup;
    @XmlElement(name = "SmartClientReport")
    protected boolean smartClientReport;

    /**
     * Gets the value of the smartClientLive property.
     * 
     */
    public boolean isSmartClientLive() {
        return smartClientLive;
    }

    /**
     * Sets the value of the smartClientLive property.
     * 
     */
    public void setSmartClientLive(boolean value) {
        this.smartClientLive = value;
    }

    /**
     * Gets the value of the smartClientBrowse property.
     * 
     */
    public boolean isSmartClientBrowse() {
        return smartClientBrowse;
    }

    /**
     * Sets the value of the smartClientBrowse property.
     * 
     */
    public void setSmartClientBrowse(boolean value) {
        this.smartClientBrowse = value;
    }

    /**
     * Gets the value of the smartClientSetup property.
     * 
     */
    public boolean isSmartClientSetup() {
        return smartClientSetup;
    }

    /**
     * Sets the value of the smartClientSetup property.
     * 
     */
    public void setSmartClientSetup(boolean value) {
        this.smartClientSetup = value;
    }

    /**
     * Gets the value of the smartClientReport property.
     * 
     */
    public boolean isSmartClientReport() {
        return smartClientReport;
    }

    /**
     * Sets the value of the smartClientReport property.
     * 
     */
    public void setSmartClientReport(boolean value) {
        this.smartClientReport = value;
    }

}
