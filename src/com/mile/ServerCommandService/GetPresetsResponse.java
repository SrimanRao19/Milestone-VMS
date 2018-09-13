
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
 *         &lt;element name="GetPresetsResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfPresetInfo" minOccurs="0"/>
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
    "getPresetsResult"
})
@XmlRootElement(name = "GetPresetsResponse")
public class GetPresetsResponse {

    @XmlElement(name = "GetPresetsResult")
    protected ArrayOfPresetInfo getPresetsResult;

    /**
     * Gets the value of the getPresetsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPresetInfo }
     *     
     */
    public ArrayOfPresetInfo getGetPresetsResult() {
        return getPresetsResult;
    }

    /**
     * Sets the value of the getPresetsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPresetInfo }
     *     
     */
    public void setGetPresetsResult(ArrayOfPresetInfo value) {
        this.getPresetsResult = value;
    }

}
