
package com.mile.RecorderStatusService2;

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
 *         &lt;element name="statusSessionId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="subscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "statusSessionId",
    "subscribe"
})
@XmlRootElement(name = "SubscribeConfigurationStatus")
public class SubscribeConfigurationStatus {

    protected String token;
    @XmlElement(required = true)
    protected String statusSessionId;
    protected boolean subscribe;

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
     * Gets the value of the statusSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSessionId() {
        return statusSessionId;
    }

    /**
     * Sets the value of the statusSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSessionId(String value) {
        this.statusSessionId = value;
    }

    /**
     * Gets the value of the subscribe property.
     * 
     */
    public boolean isSubscribe() {
        return subscribe;
    }

    /**
     * Sets the value of the subscribe property.
     * 
     */
    public void setSubscribe(boolean value) {
        this.subscribe = value;
    }

}
