
package com.mile.ServerCommandService;

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
 *         &lt;element name="GetSmartClientVersionResult" type="{http://videoos.net/2/XProtectCSServerCommand}SmartClientVersion" minOccurs="0"/>
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
    "getSmartClientVersionResult"
})
@XmlRootElement(name = "GetSmartClientVersionResponse")
public class GetSmartClientVersionResponse {

    @XmlElement(name = "GetSmartClientVersionResult")
    protected SmartClientVersion getSmartClientVersionResult;

    /**
     * Gets the value of the getSmartClientVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SmartClientVersion }
     *     
     */
    public SmartClientVersion getGetSmartClientVersionResult() {
        return getSmartClientVersionResult;
    }

    /**
     * Sets the value of the getSmartClientVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartClientVersion }
     *     
     */
    public void setGetSmartClientVersionResult(SmartClientVersion value) {
        this.getSmartClientVersionResult = value;
    }

}
