
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
 *         &lt;element name="PTZGetAbsolutePositionResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}PTZArgs" minOccurs="0"/>
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
    "ptzGetAbsolutePositionResult"
})
@XmlRootElement(name = "PTZGetAbsolutePositionResponse")
public class PTZGetAbsolutePositionResponse {

    @XmlElement(name = "PTZGetAbsolutePositionResult")
    protected PTZArgs ptzGetAbsolutePositionResult;

    /**
     * Gets the value of the ptzGetAbsolutePositionResult property.
     * 
     * @return
     *     possible object is
     *     {@link PTZArgs }
     *     
     */
    public PTZArgs getPTZGetAbsolutePositionResult() {
        return ptzGetAbsolutePositionResult;
    }

    /**
     * Sets the value of the ptzGetAbsolutePositionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZArgs }
     *     
     */
    public void setPTZGetAbsolutePositionResult(PTZArgs value) {
        this.ptzGetAbsolutePositionResult = value;
    }

}
