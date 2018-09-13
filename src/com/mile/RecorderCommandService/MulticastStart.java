
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="deviceIds" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="clientCapabilities" type="{http://videoos.net/2/XProtectCSRecorderCommand}ClientCapabilities" minOccurs="0"/>
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
    "deviceIds",
    "clientCapabilities"
})
@XmlRootElement(name = "MulticastStart")
public class MulticastStart {

    protected String token;
    protected ArrayOfGuid deviceIds;
    protected ClientCapabilities clientCapabilities;

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
     * Gets the value of the deviceIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getDeviceIds() {
        return deviceIds;
    }

    /**
     * Sets the value of the deviceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setDeviceIds(ArrayOfGuid value) {
        this.deviceIds = value;
    }

    /**
     * Gets the value of the clientCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCapabilities }
     *     
     */
    public ClientCapabilities getClientCapabilities() {
        return clientCapabilities;
    }

    /**
     * Sets the value of the clientCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCapabilities }
     *     
     */
    public void setClientCapabilities(ClientCapabilities value) {
        this.clientCapabilities = value;
    }

}
