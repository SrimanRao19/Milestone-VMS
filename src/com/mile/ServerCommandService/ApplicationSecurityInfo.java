
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationSecurityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationSecurityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartClientSecurity" type="{http://videoos.net/2/XProtectCSServerCommand}SmartClientSecurityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationSecurityInfo", propOrder = {
    "smartClientSecurity"
})
public class ApplicationSecurityInfo {

    @XmlElement(name = "SmartClientSecurity")
    protected SmartClientSecurityInfo smartClientSecurity;

    /**
     * Gets the value of the smartClientSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link SmartClientSecurityInfo }
     *     
     */
    public SmartClientSecurityInfo getSmartClientSecurity() {
        return smartClientSecurity;
    }

    /**
     * Sets the value of the smartClientSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartClientSecurityInfo }
     *     
     */
    public void setSmartClientSecurity(SmartClientSecurityInfo value) {
        this.smartClientSecurity = value;
    }

}
