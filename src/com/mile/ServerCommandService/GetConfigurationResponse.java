
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
 *         &lt;element name="GetConfigurationResult" type="{http://videoos.net/2/XProtectCSServerCommand}ConfigurationInfo" minOccurs="0"/>
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
    "getConfigurationResult"
})
@XmlRootElement(name = "GetConfigurationResponse")
public class GetConfigurationResponse {

    @XmlElement(name = "GetConfigurationResult")
    protected ConfigurationInfo getConfigurationResult;

    /**
     * Gets the value of the getConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationInfo }
     *     
     */
    public ConfigurationInfo getGetConfigurationResult() {
        return getConfigurationResult;
    }

    /**
     * Sets the value of the getConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationInfo }
     *     
     */
    public void setGetConfigurationResult(ConfigurationInfo value) {
        this.getConfigurationResult = value;
    }

}
