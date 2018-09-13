
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
 *         &lt;element name="SmartSearchGetResultResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}SmartSearchResult" minOccurs="0"/>
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
    "smartSearchGetResultResult"
})
@XmlRootElement(name = "SmartSearchGetResultResponse")
public class SmartSearchGetResultResponse {

    @XmlElement(name = "SmartSearchGetResultResult")
    protected SmartSearchResult smartSearchGetResultResult;

    /**
     * Gets the value of the smartSearchGetResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link SmartSearchResult }
     *     
     */
    public SmartSearchResult getSmartSearchGetResultResult() {
        return smartSearchGetResultResult;
    }

    /**
     * Sets the value of the smartSearchGetResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartSearchResult }
     *     
     */
    public void setSmartSearchGetResultResult(SmartSearchResult value) {
        this.smartSearchGetResultResult = value;
    }

}
