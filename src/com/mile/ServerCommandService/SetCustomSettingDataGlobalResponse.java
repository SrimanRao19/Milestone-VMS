
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
 *         &lt;element name="SetCustomSettingDataGlobalResult" type="{http://videoos.net/2/XProtectCSServerCommand}SetCustomSettingResultType"/>
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
    "setCustomSettingDataGlobalResult"
})
@XmlRootElement(name = "SetCustomSettingDataGlobalResponse")
public class SetCustomSettingDataGlobalResponse {

    @XmlElement(name = "SetCustomSettingDataGlobalResult", required = true)
    protected SetCustomSettingResultType setCustomSettingDataGlobalResult;

    /**
     * Gets the value of the setCustomSettingDataGlobalResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetCustomSettingResultType }
     *     
     */
    public SetCustomSettingResultType getSetCustomSettingDataGlobalResult() {
        return setCustomSettingDataGlobalResult;
    }

    /**
     * Sets the value of the setCustomSettingDataGlobalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCustomSettingResultType }
     *     
     */
    public void setSetCustomSettingDataGlobalResult(SetCustomSettingResultType value) {
        this.setCustomSettingDataGlobalResult = value;
    }

}
