
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
 *         &lt;element name="GetClientProfileResult" type="{http://videoos.net/2/XProtectCSServerCommand}ClientProfile" minOccurs="0"/>
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
    "getClientProfileResult"
})
@XmlRootElement(name = "GetClientProfileResponse")
public class GetClientProfileResponse {

    @XmlElement(name = "GetClientProfileResult")
    protected ClientProfile getClientProfileResult;

    /**
     * Gets the value of the getClientProfileResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClientProfile }
     *     
     */
    public ClientProfile getGetClientProfileResult() {
        return getClientProfileResult;
    }

    /**
     * Sets the value of the getClientProfileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientProfile }
     *     
     */
    public void setGetClientProfileResult(ClientProfile value) {
        this.getClientProfileResult = value;
    }

}
