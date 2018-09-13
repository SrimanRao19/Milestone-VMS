
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomSettingInfo" type="{http://videoos.net/2/XProtectCSServerCommand}CustomSettingInfo" minOccurs="0"/>
 *         &lt;element name="CustomSettingData" type="{http://videoos.net/2/XProtectCSServerCommand}CustomSettingData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSetting", propOrder = {
    "customSettingInfo",
    "customSettingData"
})
public class CustomSetting {

    @XmlElement(name = "CustomSettingInfo")
    protected CustomSettingInfo customSettingInfo;
    @XmlElement(name = "CustomSettingData")
    protected CustomSettingData customSettingData;

    /**
     * Gets the value of the customSettingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSettingInfo }
     *     
     */
    public CustomSettingInfo getCustomSettingInfo() {
        return customSettingInfo;
    }

    /**
     * Sets the value of the customSettingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSettingInfo }
     *     
     */
    public void setCustomSettingInfo(CustomSettingInfo value) {
        this.customSettingInfo = value;
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

}
