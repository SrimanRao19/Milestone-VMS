
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraDeviceStatusArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfCameraDeviceStatus" minOccurs="0"/>
 *         &lt;element name="InputDeviceStatusArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfInputDeviceStatus" minOccurs="0"/>
 *         &lt;element name="OutputDeviceStatusArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfOutputDeviceStatus" minOccurs="0"/>
 *         &lt;element name="MicrophoneDeviceStatusArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfMicrophoneDeviceStatus" minOccurs="0"/>
 *         &lt;element name="SpeakerDeviceStatusArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfSpeakerDeviceStatus" minOccurs="0"/>
 *         &lt;element name="EventStatusArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfEventStatus" minOccurs="0"/>
 *         &lt;element name="ConfigurationChangedStatus" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ConfigurationChangedStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", propOrder = {
    "cameraDeviceStatusArray",
    "inputDeviceStatusArray",
    "outputDeviceStatusArray",
    "microphoneDeviceStatusArray",
    "speakerDeviceStatusArray",
    "eventStatusArray",
    "configurationChangedStatus"
})
public class Status {

    @XmlElement(name = "CameraDeviceStatusArray")
    protected ArrayOfCameraDeviceStatus cameraDeviceStatusArray;
    @XmlElement(name = "InputDeviceStatusArray")
    protected ArrayOfInputDeviceStatus inputDeviceStatusArray;
    @XmlElement(name = "OutputDeviceStatusArray")
    protected ArrayOfOutputDeviceStatus outputDeviceStatusArray;
    @XmlElement(name = "MicrophoneDeviceStatusArray")
    protected ArrayOfMicrophoneDeviceStatus microphoneDeviceStatusArray;
    @XmlElement(name = "SpeakerDeviceStatusArray")
    protected ArrayOfSpeakerDeviceStatus speakerDeviceStatusArray;
    @XmlElement(name = "EventStatusArray")
    protected ArrayOfEventStatus eventStatusArray;
    @XmlElement(name = "ConfigurationChangedStatus")
    protected ConfigurationChangedStatus configurationChangedStatus;

    /**
     * Gets the value of the cameraDeviceStatusArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraDeviceStatus }
     *     
     */
    public ArrayOfCameraDeviceStatus getCameraDeviceStatusArray() {
        return cameraDeviceStatusArray;
    }

    /**
     * Sets the value of the cameraDeviceStatusArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraDeviceStatus }
     *     
     */
    public void setCameraDeviceStatusArray(ArrayOfCameraDeviceStatus value) {
        this.cameraDeviceStatusArray = value;
    }

    /**
     * Gets the value of the inputDeviceStatusArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInputDeviceStatus }
     *     
     */
    public ArrayOfInputDeviceStatus getInputDeviceStatusArray() {
        return inputDeviceStatusArray;
    }

    /**
     * Sets the value of the inputDeviceStatusArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInputDeviceStatus }
     *     
     */
    public void setInputDeviceStatusArray(ArrayOfInputDeviceStatus value) {
        this.inputDeviceStatusArray = value;
    }

    /**
     * Gets the value of the outputDeviceStatusArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutputDeviceStatus }
     *     
     */
    public ArrayOfOutputDeviceStatus getOutputDeviceStatusArray() {
        return outputDeviceStatusArray;
    }

    /**
     * Sets the value of the outputDeviceStatusArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutputDeviceStatus }
     *     
     */
    public void setOutputDeviceStatusArray(ArrayOfOutputDeviceStatus value) {
        this.outputDeviceStatusArray = value;
    }

    /**
     * Gets the value of the microphoneDeviceStatusArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMicrophoneDeviceStatus }
     *     
     */
    public ArrayOfMicrophoneDeviceStatus getMicrophoneDeviceStatusArray() {
        return microphoneDeviceStatusArray;
    }

    /**
     * Sets the value of the microphoneDeviceStatusArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMicrophoneDeviceStatus }
     *     
     */
    public void setMicrophoneDeviceStatusArray(ArrayOfMicrophoneDeviceStatus value) {
        this.microphoneDeviceStatusArray = value;
    }

    /**
     * Gets the value of the speakerDeviceStatusArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpeakerDeviceStatus }
     *     
     */
    public ArrayOfSpeakerDeviceStatus getSpeakerDeviceStatusArray() {
        return speakerDeviceStatusArray;
    }

    /**
     * Sets the value of the speakerDeviceStatusArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpeakerDeviceStatus }
     *     
     */
    public void setSpeakerDeviceStatusArray(ArrayOfSpeakerDeviceStatus value) {
        this.speakerDeviceStatusArray = value;
    }

    /**
     * Gets the value of the eventStatusArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventStatus }
     *     
     */
    public ArrayOfEventStatus getEventStatusArray() {
        return eventStatusArray;
    }

    /**
     * Sets the value of the eventStatusArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventStatus }
     *     
     */
    public void setEventStatusArray(ArrayOfEventStatus value) {
        this.eventStatusArray = value;
    }

    /**
     * Gets the value of the configurationChangedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationChangedStatus }
     *     
     */
    public ConfigurationChangedStatus getConfigurationChangedStatus() {
        return configurationChangedStatus;
    }

    /**
     * Sets the value of the configurationChangedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationChangedStatus }
     *     
     */
    public void setConfigurationChangedStatus(ConfigurationChangedStatus value) {
        this.configurationChangedStatus = value;
    }

}
