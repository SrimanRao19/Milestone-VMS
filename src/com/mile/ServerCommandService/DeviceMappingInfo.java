
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceMappingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceMappingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceA" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DeviceB" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceMappingInfo", propOrder = {
    "deviceA",
    "deviceB"
})
public class DeviceMappingInfo {

    @XmlElement(name = "DeviceA", required = true)
    protected String deviceA;
    @XmlElement(name = "DeviceB", required = true)
    protected String deviceB;

    /**
     * Gets the value of the deviceA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceA() {
        return deviceA;
    }

    /**
     * Sets the value of the deviceA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceA(String value) {
        this.deviceA = value;
    }

    /**
     * Gets the value of the deviceB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceB() {
        return deviceB;
    }

    /**
     * Sets the value of the deviceB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceB(String value) {
        this.deviceB = value;
    }

}
