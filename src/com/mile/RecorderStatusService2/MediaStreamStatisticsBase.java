
package com.mile.RecorderStatusService2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaStreamStatisticsBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaStreamStatisticsBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreamId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordingStream" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LiveStream" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LiveStreamDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LiveStreamRunAlways" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BPS" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="FPS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaStreamStatisticsBase", propOrder = {
    "streamId",
    "name",
    "recordingStream",
    "liveStream",
    "liveStreamDefault",
    "liveStreamRunAlways",
    "bps",
    "fps"
})
@XmlSeeAlso({
    VideoStreamStatistics.class,
    AudioStreamStatistics.class
})
public class MediaStreamStatisticsBase {

    @XmlElement(name = "StreamId", required = true)
    protected String streamId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RecordingStream")
    protected boolean recordingStream;
    @XmlElement(name = "LiveStream")
    protected boolean liveStream;
    @XmlElement(name = "LiveStreamDefault")
    protected boolean liveStreamDefault;
    @XmlElement(name = "LiveStreamRunAlways")
    protected boolean liveStreamRunAlways;
    @XmlElement(name = "BPS", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bps;
    @XmlElement(name = "FPS")
    protected double fps;

    /**
     * Gets the value of the streamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * Sets the value of the streamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamId(String value) {
        this.streamId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the recordingStream property.
     * 
     */
    public boolean isRecordingStream() {
        return recordingStream;
    }

    /**
     * Sets the value of the recordingStream property.
     * 
     */
    public void setRecordingStream(boolean value) {
        this.recordingStream = value;
    }

    /**
     * Gets the value of the liveStream property.
     * 
     */
    public boolean isLiveStream() {
        return liveStream;
    }

    /**
     * Sets the value of the liveStream property.
     * 
     */
    public void setLiveStream(boolean value) {
        this.liveStream = value;
    }

    /**
     * Gets the value of the liveStreamDefault property.
     * 
     */
    public boolean isLiveStreamDefault() {
        return liveStreamDefault;
    }

    /**
     * Sets the value of the liveStreamDefault property.
     * 
     */
    public void setLiveStreamDefault(boolean value) {
        this.liveStreamDefault = value;
    }

    /**
     * Gets the value of the liveStreamRunAlways property.
     * 
     */
    public boolean isLiveStreamRunAlways() {
        return liveStreamRunAlways;
    }

    /**
     * Sets the value of the liveStreamRunAlways property.
     * 
     */
    public void setLiveStreamRunAlways(boolean value) {
        this.liveStreamRunAlways = value;
    }

    /**
     * Gets the value of the bps property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBPS() {
        return bps;
    }

    /**
     * Sets the value of the bps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBPS(BigInteger value) {
        this.bps = value;
    }

    /**
     * Gets the value of the fps property.
     * 
     */
    public double getFPS() {
        return fps;
    }

    /**
     * Sets the value of the fps property.
     * 
     */
    public void setFPS(double value) {
        this.fps = value;
    }

}
