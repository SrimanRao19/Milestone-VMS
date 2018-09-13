
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}DeviceInfo">
 *       &lt;sequence>
 *         &lt;element name="MaxFPS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BrowsableStream" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Streams" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfStreamInfo" minOccurs="0"/>
 *         &lt;element name="Tracks" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfTrackInfo" minOccurs="0"/>
 *         &lt;element name="CameraSecurity" type="{http://videoos.net/2/XProtectCSServerCommand}CameraSecurityInfo" minOccurs="0"/>
 *         &lt;element name="PtzSettings" type="{http://videoos.net/2/XProtectCSServerCommand}PtzInfo" minOccurs="0"/>
 *         &lt;element name="IpixSettings" type="{http://videoos.net/2/XProtectCSServerCommand}IpixInfo" minOccurs="0"/>
 *         &lt;element name="PanoramicLensSettings" type="{http://videoos.net/2/XProtectCSServerCommand}PanoramicLensInfo" minOccurs="0"/>
 *         &lt;element name="MulticastEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EdgeStorageSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EdgeStoragePlayback" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "CameraInfo", propOrder = {
    "maxFPS",
    "browsableStream",
    "streams",
    "tracks",
    "cameraSecurity",
    "ptzSettings",
    "ipixSettings",
    "panoramicLensSettings",
    "multicastEnabled",
    "edgeStorageSupported",
    "edgeStoragePlayback",
    "stopManualRecordingSeconds"
})
public class CameraInfo
    extends DeviceInfo
{

    @XmlElement(name = "MaxFPS")
    protected double maxFPS;
    @XmlElement(name = "BrowsableStream")
    protected boolean browsableStream;
    @XmlElement(name = "Streams")
    protected ArrayOfStreamInfo streams;
    @XmlElement(name = "Tracks")
    protected ArrayOfTrackInfo tracks;
    @XmlElement(name = "CameraSecurity")
    protected CameraSecurityInfo cameraSecurity;
    @XmlElement(name = "PtzSettings")
    protected PtzInfo ptzSettings;
    @XmlElement(name = "IpixSettings")
    protected IpixInfo ipixSettings;
    @XmlElement(name = "PanoramicLensSettings")
    protected PanoramicLensInfo panoramicLensSettings;
    @XmlElement(name = "MulticastEnabled")
    protected boolean multicastEnabled;
    @XmlElement(name = "EdgeStorageSupported")
    protected boolean edgeStorageSupported;
    @XmlElement(name = "EdgeStoragePlayback")
    protected boolean edgeStoragePlayback;
    @XmlElement(name = "StopManualRecordingSeconds")
    protected int stopManualRecordingSeconds;

    /**
     * Gets the value of the maxFPS property.
     * 
     */
    public double getMaxFPS() {
        return maxFPS;
    }

    /**
     * Sets the value of the maxFPS property.
     * 
     */
    public void setMaxFPS(double value) {
        this.maxFPS = value;
    }

    /**
     * Gets the value of the browsableStream property.
     * 
     */
    public boolean isBrowsableStream() {
        return browsableStream;
    }

    /**
     * Sets the value of the browsableStream property.
     * 
     */
    public void setBrowsableStream(boolean value) {
        this.browsableStream = value;
    }

    /**
     * Gets the value of the streams property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStreamInfo }
     *     
     */
    public ArrayOfStreamInfo getStreams() {
        return streams;
    }

    /**
     * Sets the value of the streams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStreamInfo }
     *     
     */
    public void setStreams(ArrayOfStreamInfo value) {
        this.streams = value;
    }

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
     * Gets the value of the cameraSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link CameraSecurityInfo }
     *     
     */
    public CameraSecurityInfo getCameraSecurity() {
        return cameraSecurity;
    }

    /**
     * Sets the value of the cameraSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraSecurityInfo }
     *     
     */
    public void setCameraSecurity(CameraSecurityInfo value) {
        this.cameraSecurity = value;
    }

    /**
     * Gets the value of the ptzSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PtzInfo }
     *     
     */
    public PtzInfo getPtzSettings() {
        return ptzSettings;
    }

    /**
     * Sets the value of the ptzSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtzInfo }
     *     
     */
    public void setPtzSettings(PtzInfo value) {
        this.ptzSettings = value;
    }

    /**
     * Gets the value of the ipixSettings property.
     * 
     * @return
     *     possible object is
     *     {@link IpixInfo }
     *     
     */
    public IpixInfo getIpixSettings() {
        return ipixSettings;
    }

    /**
     * Sets the value of the ipixSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpixInfo }
     *     
     */
    public void setIpixSettings(IpixInfo value) {
        this.ipixSettings = value;
    }

    /**
     * Gets the value of the panoramicLensSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PanoramicLensInfo }
     *     
     */
    public PanoramicLensInfo getPanoramicLensSettings() {
        return panoramicLensSettings;
    }

    /**
     * Sets the value of the panoramicLensSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanoramicLensInfo }
     *     
     */
    public void setPanoramicLensSettings(PanoramicLensInfo value) {
        this.panoramicLensSettings = value;
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
