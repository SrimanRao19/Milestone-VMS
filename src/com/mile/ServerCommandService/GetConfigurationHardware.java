
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="hardwareIds" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
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
    "hardwareIds"
})
@XmlRootElement(name = "GetConfigurationHardware")
public class GetConfigurationHardware {

    protected String token;
    protected ArrayOfGuid hardwareIds;

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
     * Gets the value of the hardwareIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getHardwareIds() {
        return hardwareIds;
    }

    /**
     * Sets the value of the hardwareIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setHardwareIds(ArrayOfGuid value) {
        this.hardwareIds = value;
    }

}
