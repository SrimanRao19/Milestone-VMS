
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customSettingId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="customSettingData" type="{http://videoos.net/2/XProtectCSServerCommand}CustomSettingData" minOccurs="0"/>
 *         &lt;element name="forceOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "customSettingId",
    "customSettingData",
    "forceOverride"
})
@XmlRootElement(name = "SetCustomSettingDataUser")
public class SetCustomSettingDataUser {

    protected String token;
    @XmlElement(required = true)
    protected String customSettingId;
    protected CustomSettingData customSettingData;
    protected boolean forceOverride;

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
     * Gets the value of the customSettingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomSettingId() {
        return customSettingId;
    }

    /**
     * Sets the value of the customSettingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomSettingId(String value) {
        this.customSettingId = value;
    }

    /**
     * Gets the value of the customSettingData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSettingData }
     *     
     */
    public CustomSettingData getCustomSettingData() {
        return customSettingData;
    }

    /**
     * Sets the value of the customSettingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSettingData }
     *     
     */
    public void setCustomSettingData(CustomSettingData value) {
        this.customSettingData = value;
    }

    /**
     * Gets the value of the forceOverride property.
     * 
     */
    public boolean isForceOverride() {
        return forceOverride;
    }

    /**
     * Sets the value of the forceOverride property.
     * 
     */
    public void setForceOverride(boolean value) {
        this.forceOverride = value;
    }

}
