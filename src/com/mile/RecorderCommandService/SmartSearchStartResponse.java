
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
 *         &lt;element name="SmartSearchStartResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "smartSearchStartResult"
})
@XmlRootElement(name = "SmartSearchStartResponse")
public class SmartSearchStartResponse {

    @XmlElement(name = "SmartSearchStartResult", required = true)
    protected String smartSearchStartResult;

    /**
     * Gets the value of the smartSearchStartResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartSearchStartResult() {
        return smartSearchStartResult;
    }

    /**
     * Sets the value of the smartSearchStartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartSearchStartResult(String value) {
        this.smartSearchStartResult = value;
    }

}
