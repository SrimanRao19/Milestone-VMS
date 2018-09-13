
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
 *         &lt;element name="GetCustomSettingDataGlobalResult" type="{http://videoos.net/2/XProtectCSServerCommand}CustomSetting" minOccurs="0"/>
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
    "getCustomSettingDataGlobalResult"
})
@XmlRootElement(name = "GetCustomSettingDataGlobalResponse")
public class GetCustomSettingDataGlobalResponse {

    @XmlElement(name = "GetCustomSettingDataGlobalResult")
    protected CustomSetting getCustomSettingDataGlobalResult;

    /**
     * Gets the value of the getCustomSettingDataGlobalResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSetting }
     *     
     */
    public CustomSetting getGetCustomSettingDataGlobalResult() {
        return getCustomSettingDataGlobalResult;
    }

    /**
     * Sets the value of the getCustomSettingDataGlobalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSetting }
     *     
     */
    public void setGetCustomSettingDataGlobalResult(CustomSetting value) {
        this.getCustomSettingDataGlobalResult = value;
    }

}
