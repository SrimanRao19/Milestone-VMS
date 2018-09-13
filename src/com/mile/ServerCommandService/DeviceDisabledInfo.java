
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceDisabledInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceDisabledInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecorderId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="HardwareId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DeviceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceDisabledInfo", propOrder = {
    "recorderId",
    "hardwareId",
    "deviceId",
    "deviceType",
    "deviceName"
})
public class DeviceDisabledInfo {

    @XmlElement(name = "RecorderId", required = true)
    protected String recorderId;
    @XmlElement(name = "HardwareId", required = true)
    protected String hardwareId;
    @XmlElement(name = "DeviceId", required = true)
    protected String deviceId;
    @XmlElement(name = "DeviceType")
    protected String deviceType;
    @XmlElement(name = "DeviceName")
    protected String deviceName;

    /**
     * Gets the value of the recorderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecorderId() {
        return recorderId;
    }

    /**
     * Sets the value of the recorderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecorderId(String value) {
        this.recorderId = value;
    }

    /**
     * Gets the value of the hardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareId() {
        return hardwareId;
    }

    /**
     * Sets the value of the hardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareId(String value) {
        this.hardwareId = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

}
