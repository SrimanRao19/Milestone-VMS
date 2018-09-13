
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
 *         &lt;element name="smartSearchId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="continueSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "smartSearchId",
    "continueSearch"
})
@XmlRootElement(name = "SmartSearchGetResult")
public class SmartSearchGetResult {

    protected String token;
    @XmlElement(required = true)
    protected String smartSearchId;
    protected boolean continueSearch;

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
     * Gets the value of the smartSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartSearchId() {
        return smartSearchId;
    }

    /**
     * Sets the value of the smartSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartSearchId(String value) {
        this.smartSearchId = value;
    }

    /**
     * Gets the value of the continueSearch property.
     * 
     */
    public boolean isContinueSearch() {
        return continueSearch;
    }

    /**
     * Sets the value of the continueSearch property.
     * 
     */
    public void setContinueSearch(boolean value) {
        this.continueSearch = value;
    }

}
