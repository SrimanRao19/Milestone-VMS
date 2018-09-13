
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
 *         &lt;element name="GetConfigurationHardwareResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfHardwareInfo" minOccurs="0"/>
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
    "getConfigurationHardwareResult"
})
@XmlRootElement(name = "GetConfigurationHardwareResponse")
public class GetConfigurationHardwareResponse {

    @XmlElement(name = "GetConfigurationHardwareResult")
    protected ArrayOfHardwareInfo getConfigurationHardwareResult;

    /**
     * Gets the value of the getConfigurationHardwareResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHardwareInfo }
     *     
     */
    public ArrayOfHardwareInfo getGetConfigurationHardwareResult() {
        return getConfigurationHardwareResult;
    }

    /**
     * Sets the value of the getConfigurationHardwareResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHardwareInfo }
     *     
     */
    public void setGetConfigurationHardwareResult(ArrayOfHardwareInfo value) {
        this.getConfigurationHardwareResult = value;
    }

}
