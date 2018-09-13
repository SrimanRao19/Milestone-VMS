
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveStreamDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="LiveStreamSettings" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfLiveStreamSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveStreamDevice", propOrder = {
    "deviceID",
    "liveStreamSettings"
})
public class LiveStreamDevice {

    @XmlElement(name = "DeviceID", required = true)
    protected String deviceID;
    @XmlElement(name = "LiveStreamSettings")
    protected ArrayOfLiveStreamSetting liveStreamSettings;

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the liveStreamSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLiveStreamSetting }
     *     
     */
    public ArrayOfLiveStreamSetting getLiveStreamSettings() {
        return liveStreamSettings;
    }

    /**
     * Sets the value of the liveStreamSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLiveStreamSetting }
     *     
     */
    public void setLiveStreamSettings(ArrayOfLiveStreamSetting value) {
        this.liveStreamSettings = value;
    }

}
