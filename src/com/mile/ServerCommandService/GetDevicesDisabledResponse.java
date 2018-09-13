
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
 *         &lt;element name="GetDevicesDisabledResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfDeviceDisabledInfo" minOccurs="0"/>
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
    "getDevicesDisabledResult"
})
@XmlRootElement(name = "GetDevicesDisabledResponse")
public class GetDevicesDisabledResponse {

    @XmlElement(name = "GetDevicesDisabledResult")
    protected ArrayOfDeviceDisabledInfo getDevicesDisabledResult;

    /**
     * Gets the value of the getDevicesDisabledResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceDisabledInfo }
     *     
     */
    public ArrayOfDeviceDisabledInfo getGetDevicesDisabledResult() {
        return getDevicesDisabledResult;
    }

    /**
     * Sets the value of the getDevicesDisabledResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceDisabledInfo }
     *     
     */
    public void setGetDevicesDisabledResult(ArrayOfDeviceDisabledInfo value) {
        this.getDevicesDisabledResult = value;
    }

}
