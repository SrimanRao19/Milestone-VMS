
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManualRecordingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualRecordingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="IsManualRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualRecordingInfo", propOrder = {
    "deviceId",
    "isManualRecording"
})
public class ManualRecordingInfo {

    @XmlElement(name = "DeviceId", required = true)
    protected String deviceId;
    @XmlElement(name = "IsManualRecording")
    protected boolean isManualRecording;

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
     * Gets the value of the isManualRecording property.
     * 
     */
    public boolean isIsManualRecording() {
        return isManualRecording;
    }

    /**
     * Sets the value of the isManualRecording property.
     * 
     */
    public void setIsManualRecording(boolean value) {
        this.isManualRecording = value;
    }

}
