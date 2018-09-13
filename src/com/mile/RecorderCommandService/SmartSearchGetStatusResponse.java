
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
 *         &lt;element name="SmartSearchGetStatusResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}SmartSearchStatus" minOccurs="0"/>
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
    "smartSearchGetStatusResult"
})
@XmlRootElement(name = "SmartSearchGetStatusResponse")
public class SmartSearchGetStatusResponse {

    @XmlElement(name = "SmartSearchGetStatusResult")
    protected SmartSearchStatus smartSearchGetStatusResult;

    /**
     * Gets the value of the smartSearchGetStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link SmartSearchStatus }
     *     
     */
    public SmartSearchStatus getSmartSearchGetStatusResult() {
        return smartSearchGetStatusResult;
    }

    /**
     * Sets the value of the smartSearchGetStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartSearchStatus }
     *     
     */
    public void setSmartSearchGetStatusResult(SmartSearchStatus value) {
        this.smartSearchGetStatusResult = value;
    }

}
