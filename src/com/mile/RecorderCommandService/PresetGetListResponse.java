
package com.mile.RecorderCommandService;

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
 *         &lt;element name="PresetGetListResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfString" minOccurs="0"/>
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
    "presetGetListResult"
})
@XmlRootElement(name = "PresetGetListResponse")
public class PresetGetListResponse {

    @XmlElement(name = "PresetGetListResult")
    protected ArrayOfString presetGetListResult;

    /**
     * Gets the value of the presetGetListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPresetGetListResult() {
        return presetGetListResult;
    }

    /**
     * Sets the value of the presetGetListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPresetGetListResult(ArrayOfString value) {
        this.presetGetListResult = value;
    }

}
