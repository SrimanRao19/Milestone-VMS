
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataDeviceInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}DeviceInfo">
 *       &lt;sequence>
 *         &lt;element name="Tracks" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfTrackInfo" minOccurs="0"/>
 *         &lt;element name="MetadataDeviceSecurity" type="{http://videoos.net/2/XProtectCSServerCommand}MetadataDeviceSecurityInfo" minOccurs="0"/>
 *         &lt;element name="MulticastEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EdgeStorageSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EdgeStoragePlayback" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MetadataTypes" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMetadataTypeInfo" minOccurs="0"/>
 *         &lt;element name="StopManualRecordingSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataDeviceInfo", propOrder = {
    "tracks",
    "metadataDeviceSecurity",
    "multicastEnabled",
    "edgeStorageSupported",
    "edgeStoragePlayback",
    "metadataTypes",
    "stopManualRecordingSeconds"
})
public class MetadataDeviceInfo
    extends DeviceInfo
{

    @XmlElement(name = "Tracks")
    protected ArrayOfTrackInfo tracks;
    @XmlElement(name = "MetadataDeviceSecurity")
    protected MetadataDeviceSecurityInfo metadataDeviceSecurity;
    @XmlElement(name = "MulticastEnabled")
    protected boolean multicastEnabled;
    @XmlElement(name = "EdgeStorageSupported")
    protected boolean edgeStorageSupported;
    @XmlElement(name = "EdgeStoragePlayback")
    protected boolean edgeStoragePlayback;
    @XmlElement(name = "MetadataTypes")
    protected ArrayOfMetadataTypeInfo metadataTypes;
    @XmlElement(name = "StopManualRecordingSeconds")
    protected int stopManualRecordingSeconds;

    /**
     * Gets the value of the tracks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackInfo }
     *     
     */
    public ArrayOfTrackInfo getTracks() {
        return tracks;
    }

    /**
     * Sets the value of the tracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackInfo }
     *     
     */
    public void setTracks(ArrayOfTrackInfo value) {
        this.tracks = value;
    }

    /**
     * Gets the value of the metadataDeviceSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataDeviceSecurityInfo }
     *     
     */
    public MetadataDeviceSecurityInfo getMetadataDeviceSecurity() {
        return metadataDeviceSecurity;
    }

    /**
     * Sets the value of the metadataDeviceSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataDeviceSecurityInfo }
     *     
     */
    public void setMetadataDeviceSecurity(MetadataDeviceSecurityInfo value) {
        this.metadataDeviceSecurity = value;
    }

    /**
     * Gets the value of the multicastEnabled property.
     * 
     */
    public boolean isMulticastEnabled() {
        return multicastEnabled;
    }

    /**
     * Sets the value of the multicastEnabled property.
     * 
     */
    public void setMulticastEnabled(boolean value) {
        this.multicastEnabled = value;
    }

    /**
     * Gets the value of the edgeStorageSupported property.
     * 
     */
    public boolean isEdgeStorageSupported() {
        return edgeStorageSupported;
    }

    /**
     * Sets the value of the edgeStorageSupported property.
     * 
     */
    public void setEdgeStorageSupported(boolean value) {
        this.edgeStorageSupported = value;
    }

    /**
     * Gets the value of the edgeStoragePlayback property.
     * 
     */
    public boolean isEdgeStoragePlayback() {
        return edgeStoragePlayback;
    }

    /**
     * Sets the value of the edgeStoragePlayback property.
     * 
     */
    public void setEdgeStoragePlayback(boolean value) {
        this.edgeStoragePlayback = value;
    }

    /**
     * Gets the value of the metadataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetadataTypeInfo }
     *     
     */
    public ArrayOfMetadataTypeInfo getMetadataTypes() {
        return metadataTypes;
    }

    /**
     * Sets the value of the metadataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetadataTypeInfo }
     *     
     */
    public void setMetadataTypes(ArrayOfMetadataTypeInfo value) {
        this.metadataTypes = value;
    }

    /**
     * Gets the value of the stopManualRecordingSeconds property.
     * 
     */
    public int getStopManualRecordingSeconds() {
        return stopManualRecordingSeconds;
    }

    /**
     * Sets the value of the stopManualRecordingSeconds property.
     * 
     */
    public void setStopManualRecordingSeconds(int value) {
        this.stopManualRecordingSeconds = value;
    }

}
