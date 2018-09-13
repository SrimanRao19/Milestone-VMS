
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
 *         &lt;element name="clientID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="controlID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="devices" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfLiveStreamDevice" minOccurs="0"/>
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
    "clientID",
    "controlID",
    "devices"
})
@XmlRootElement(name = "ControlLiveStream")
public class ControlLiveStream {

    protected String token;
    @XmlElement(required = true)
    protected String clientID;
    @XmlElement(required = true)
    protected String controlID;
    protected ArrayOfLiveStreamDevice devices;

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
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the controlID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlID() {
        return controlID;
    }

    /**
     * Sets the value of the controlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlID(String value) {
        this.controlID = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLiveStreamDevice }
     *     
     */
    public ArrayOfLiveStreamDevice getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLiveStreamDevice }
     *     
     */
    public void setDevices(ArrayOfLiveStreamDevice value) {
        this.devices = value;
    }

}
