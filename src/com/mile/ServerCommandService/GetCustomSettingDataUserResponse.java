
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
 *         &lt;element name="GetCustomSettingDataUserResult" type="{http://videoos.net/2/XProtectCSServerCommand}CustomSetting" minOccurs="0"/>
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
    "getCustomSettingDataUserResult"
})
@XmlRootElement(name = "GetCustomSettingDataUserResponse")
public class GetCustomSettingDataUserResponse {

    @XmlElement(name = "GetCustomSettingDataUserResult")
    protected CustomSetting getCustomSettingDataUserResult;

    /**
     * Gets the value of the getCustomSettingDataUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSetting }
     *     
     */
    public CustomSetting getGetCustomSettingDataUserResult() {
        return getCustomSettingDataUserResult;
    }

    /**
     * Sets the value of the getCustomSettingDataUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSetting }
     *     
     */
    public void setGetCustomSettingDataUserResult(CustomSetting value) {
        this.getCustomSettingDataUserResult = value;
    }

}
