
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerOptions" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfServerOption" minOccurs="0"/>
 *         &lt;element name="Recorders" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfRecorderInfo" minOccurs="0"/>
 *         &lt;element name="ApplicationAccess" type="{http://videoos.net/2/XProtectCSServerCommand}ApplicationSecurityInfo" minOccurs="0"/>
 *         &lt;element name="FailoverCheckInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Licenses" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfLicenseInfo" minOccurs="0"/>
 *         &lt;element name="DeviceMappings" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfDeviceMappingInfo" minOccurs="0"/>
 *         &lt;element name="CameraGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfCameraGroupInfo" minOccurs="0"/>
 *         &lt;element name="InputGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfInputGroupInfo" minOccurs="0"/>
 *         &lt;element name="OutputGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfOutputGroupInfo" minOccurs="0"/>
 *         &lt;element name="MicrophoneGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMicrophoneGroupInfo" minOccurs="0"/>
 *         &lt;element name="SpeakerGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfSpeakerGroupInfo" minOccurs="0"/>
 *         &lt;element name="MetadataDeviceGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMetadataDeviceGroupInfo" minOccurs="0"/>
 *         &lt;element name="EventTypeGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfEventTypeGroupInfo" minOccurs="0"/>
 *         &lt;element name="EventTypes" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfEventTypeInfo" minOccurs="0"/>
 *         &lt;element name="SystemEventTypes" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfSystemEventTypeInfo" minOccurs="0"/>
 *         &lt;element name="AlertTypeGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfAlertTypeGroupInfo" minOccurs="0"/>
 *         &lt;element name="AlertTypes" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfAlertTypeInfo" minOccurs="0"/>
 *         &lt;element name="MatrixMonitors" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMatrixMonitorInfo" minOccurs="0"/>
 *         &lt;element name="BookmarkSettings" type="{http://videoos.net/2/XProtectCSServerCommand}BookmarkSettingInfo" minOccurs="0"/>
 *         &lt;element name="RetentionSettings" type="{http://videoos.net/2/XProtectCSServerCommand}RetentionSettingInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationInfo", propOrder = {
    "serverId",
    "serverName",
    "serverDescription",
    "serverOptions",
    "recorders",
    "applicationAccess",
    "failoverCheckInterval",
    "licenses",
    "deviceMappings",
    "cameraGroups",
    "inputGroups",
    "outputGroups",
    "microphoneGroups",
    "speakerGroups",
    "metadataDeviceGroups",
    "eventTypeGroups",
    "eventTypes",
    "systemEventTypes",
    "alertTypeGroups",
    "alertTypes",
    "matrixMonitors",
    "bookmarkSettings",
    "retentionSettings"
})
public class ConfigurationInfo {

    @XmlElement(name = "ServerId", required = true)
    protected String serverId;
    @XmlElement(name = "ServerName")
    protected String serverName;
    @XmlElement(name = "ServerDescription")
    protected String serverDescription;
    @XmlElement(name = "ServerOptions")
    protected ArrayOfServerOption serverOptions;
    @XmlElement(name = "Recorders")
    protected ArrayOfRecorderInfo recorders;
    @XmlElement(name = "ApplicationAccess")
    protected ApplicationSecurityInfo applicationAccess;
    @XmlElement(name = "FailoverCheckInterval")
    protected int failoverCheckInterval;
    @XmlElement(name = "Licenses")
    protected ArrayOfLicenseInfo licenses;
    @XmlElement(name = "DeviceMappings")
    protected ArrayOfDeviceMappingInfo deviceMappings;
    @XmlElement(name = "CameraGroups")
    protected ArrayOfCameraGroupInfo cameraGroups;
    @XmlElement(name = "InputGroups")
    protected ArrayOfInputGroupInfo inputGroups;
    @XmlElement(name = "OutputGroups")
    protected ArrayOfOutputGroupInfo outputGroups;
    @XmlElement(name = "MicrophoneGroups")
    protected ArrayOfMicrophoneGroupInfo microphoneGroups;
    @XmlElement(name = "SpeakerGroups")
    protected ArrayOfSpeakerGroupInfo speakerGroups;
    @XmlElement(name = "MetadataDeviceGroups")
    protected ArrayOfMetadataDeviceGroupInfo metadataDeviceGroups;
    @XmlElement(name = "EventTypeGroups")
    protected ArrayOfEventTypeGroupInfo eventTypeGroups;
    @XmlElement(name = "EventTypes")
    protected ArrayOfEventTypeInfo eventTypes;
    @XmlElement(name = "SystemEventTypes")
    protected ArrayOfSystemEventTypeInfo systemEventTypes;
    @XmlElement(name = "AlertTypeGroups")
    protected ArrayOfAlertTypeGroupInfo alertTypeGroups;
    @XmlElement(name = "AlertTypes")
    protected ArrayOfAlertTypeInfo alertTypes;
    @XmlElement(name = "MatrixMonitors")
    protected ArrayOfMatrixMonitorInfo matrixMonitors;
    @XmlElement(name = "BookmarkSettings")
    protected BookmarkSettingInfo bookmarkSettings;
    @XmlElement(name = "RetentionSettings")
    protected RetentionSettingInfo retentionSettings;

    /**
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the serverDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerDescription() {
        return serverDescription;
    }

    /**
     * Sets the value of the serverDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerDescription(String value) {
        this.serverDescription = value;
    }

    /**
     * Gets the value of the serverOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServerOption }
     *     
     */
    public ArrayOfServerOption getServerOptions() {
        return serverOptions;
    }

    /**
     * Sets the value of the serverOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServerOption }
     *     
     */
    public void setServerOptions(ArrayOfServerOption value) {
        this.serverOptions = value;
    }

    /**
     * Gets the value of the recorders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecorderInfo }
     *     
     */
    public ArrayOfRecorderInfo getRecorders() {
        return recorders;
    }

    /**
     * Sets the value of the recorders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecorderInfo }
     *     
     */
    public void setRecorders(ArrayOfRecorderInfo value) {
        this.recorders = value;
    }

    /**
     * Gets the value of the applicationAccess property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSecurityInfo }
     *     
     */
    public ApplicationSecurityInfo getApplicationAccess() {
        return applicationAccess;
    }

    /**
     * Sets the value of the applicationAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSecurityInfo }
     *     
     */
    public void setApplicationAccess(ApplicationSecurityInfo value) {
        this.applicationAccess = value;
    }

    /**
     * Gets the value of the failoverCheckInterval property.
     * 
     */
    public int getFailoverCheckInterval() {
        return failoverCheckInterval;
    }

    /**
     * Sets the value of the failoverCheckInterval property.
     * 
     */
    public void setFailoverCheckInterval(int value) {
        this.failoverCheckInterval = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLicenseInfo }
     *     
     */
    public ArrayOfLicenseInfo getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLicenseInfo }
     *     
     */
    public void setLicenses(ArrayOfLicenseInfo value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the deviceMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceMappingInfo }
     *     
     */
    public ArrayOfDeviceMappingInfo getDeviceMappings() {
        return deviceMappings;
    }

    /**
     * Sets the value of the deviceMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceMappingInfo }
     *     
     */
    public void setDeviceMappings(ArrayOfDeviceMappingInfo value) {
        this.deviceMappings = value;
    }

    /**
     * Gets the value of the cameraGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraGroupInfo }
     *     
     */
    public ArrayOfCameraGroupInfo getCameraGroups() {
        return cameraGroups;
    }

    /**
     * Sets the value of the cameraGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraGroupInfo }
     *     
     */
    public void setCameraGroups(ArrayOfCameraGroupInfo value) {
        this.cameraGroups = value;
    }

    /**
     * Gets the value of the inputGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInputGroupInfo }
     *     
     */
    public ArrayOfInputGroupInfo getInputGroups() {
        return inputGroups;
    }

    /**
     * Sets the value of the inputGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInputGroupInfo }
     *     
     */
    public void setInputGroups(ArrayOfInputGroupInfo value) {
        this.inputGroups = value;
    }

    /**
     * Gets the value of the outputGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutputGroupInfo }
     *     
     */
    public ArrayOfOutputGroupInfo getOutputGroups() {
        return outputGroups;
    }

    /**
     * Sets the value of the outputGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutputGroupInfo }
     *     
     */
    public void setOutputGroups(ArrayOfOutputGroupInfo value) {
        this.outputGroups = value;
    }

    /**
     * Gets the value of the microphoneGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMicrophoneGroupInfo }
     *     
     */
    public ArrayOfMicrophoneGroupInfo getMicrophoneGroups() {
        return microphoneGroups;
    }

    /**
     * Sets the value of the microphoneGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMicrophoneGroupInfo }
     *     
     */
    public void setMicrophoneGroups(ArrayOfMicrophoneGroupInfo value) {
        this.microphoneGroups = value;
    }

    /**
     * Gets the value of the speakerGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpeakerGroupInfo }
     *     
     */
    public ArrayOfSpeakerGroupInfo getSpeakerGroups() {
        return speakerGroups;
    }

    /**
     * Sets the value of the speakerGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpeakerGroupInfo }
     *     
     */
    public void setSpeakerGroups(ArrayOfSpeakerGroupInfo value) {
        this.speakerGroups = value;
    }

    /**
     * Gets the value of the metadataDeviceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetadataDeviceGroupInfo }
     *     
     */
    public ArrayOfMetadataDeviceGroupInfo getMetadataDeviceGroups() {
        return metadataDeviceGroups;
    }

    /**
     * Sets the value of the metadataDeviceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetadataDeviceGroupInfo }
     *     
     */
    public void setMetadataDeviceGroups(ArrayOfMetadataDeviceGroupInfo value) {
        this.metadataDeviceGroups = value;
    }

    /**
     * Gets the value of the eventTypeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventTypeGroupInfo }
     *     
     */
    public ArrayOfEventTypeGroupInfo getEventTypeGroups() {
        return eventTypeGroups;
    }

    /**
     * Sets the value of the eventTypeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventTypeGroupInfo }
     *     
     */
    public void setEventTypeGroups(ArrayOfEventTypeGroupInfo value) {
        this.eventTypeGroups = value;
    }

    /**
     * Gets the value of the eventTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventTypeInfo }
     *     
     */
    public ArrayOfEventTypeInfo getEventTypes() {
        return eventTypes;
    }

    /**
     * Sets the value of the eventTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventTypeInfo }
     *     
     */
    public void setEventTypes(ArrayOfEventTypeInfo value) {
        this.eventTypes = value;
    }

    /**
     * Gets the value of the systemEventTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSystemEventTypeInfo }
     *     
     */
    public ArrayOfSystemEventTypeInfo getSystemEventTypes() {
        return systemEventTypes;
    }

    /**
     * Sets the value of the systemEventTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSystemEventTypeInfo }
     *     
     */
    public void setSystemEventTypes(ArrayOfSystemEventTypeInfo value) {
        this.systemEventTypes = value;
    }

    /**
     * Gets the value of the alertTypeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlertTypeGroupInfo }
     *     
     */
    public ArrayOfAlertTypeGroupInfo getAlertTypeGroups() {
        return alertTypeGroups;
    }

    /**
     * Sets the value of the alertTypeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertTypeGroupInfo }
     *     
     */
    public void setAlertTypeGroups(ArrayOfAlertTypeGroupInfo value) {
        this.alertTypeGroups = value;
    }

    /**
     * Gets the value of the alertTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlertTypeInfo }
     *     
     */
    public ArrayOfAlertTypeInfo getAlertTypes() {
        return alertTypes;
    }

    /**
     * Sets the value of the alertTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertTypeInfo }
     *     
     */
    public void setAlertTypes(ArrayOfAlertTypeInfo value) {
        this.alertTypes = value;
    }

    /**
     * Gets the value of the matrixMonitors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatrixMonitorInfo }
     *     
     */
    public ArrayOfMatrixMonitorInfo getMatrixMonitors() {
        return matrixMonitors;
    }

    /**
     * Sets the value of the matrixMonitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatrixMonitorInfo }
     *     
     */
    public void setMatrixMonitors(ArrayOfMatrixMonitorInfo value) {
        this.matrixMonitors = value;
    }

    /**
     * Gets the value of the bookmarkSettings property.
     * 
     * @return
     *     possible object is
     *     {@link BookmarkSettingInfo }
     *     
     */
    public BookmarkSettingInfo getBookmarkSettings() {
        return bookmarkSettings;
    }

    /**
     * Sets the value of the bookmarkSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookmarkSettingInfo }
     *     
     */
    public void setBookmarkSettings(BookmarkSettingInfo value) {
        this.bookmarkSettings = value;
    }

    /**
     * Gets the value of the retentionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionSettingInfo }
     *     
     */
    public RetentionSettingInfo getRetentionSettings() {
        return retentionSettings;
    }

    /**
     * Sets the value of the retentionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionSettingInfo }
     *     
     */
    public void setRetentionSettings(RetentionSettingInfo value) {
        this.retentionSettings = value;
    }

}
