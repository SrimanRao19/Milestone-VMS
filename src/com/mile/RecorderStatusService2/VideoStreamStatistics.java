
package com.mile.RecorderStatusService2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoStreamStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoStreamStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSRecorderStatus2}MediaStreamStatisticsBase">
 *       &lt;sequence>
 *         &lt;element name="ImageResolution" type="{http://videoos.net/2/XProtectCSRecorderStatus2}Size"/>
 *         &lt;element name="VideoFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageSizeInBytes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="FPSRequested" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoStreamStatistics", propOrder = {
    "imageResolution",
    "videoFormat",
    "imageSizeInBytes",
    "fpsRequested"
})
public class VideoStreamStatistics
    extends MediaStreamStatisticsBase
{

    @XmlElement(name = "ImageResolution", required = true)
    protected Size imageResolution;
    @XmlElement(name = "VideoFormat")
    protected String videoFormat;
    @XmlElement(name = "ImageSizeInBytes", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger imageSizeInBytes;
    @XmlElement(name = "FPSRequested")
    protected double fpsRequested;

    /**
     * Gets the value of the imageResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getImageResolution() {
        return imageResolution;
    }

    /**
     * Sets the value of the imageResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setImageResolution(Size value) {
        this.imageResolution = value;
    }

    /**
     * Gets the value of the videoFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoFormat() {
        return videoFormat;
    }

    /**
     * Sets the value of the videoFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoFormat(String value) {
        this.videoFormat = value;
    }

    /**
     * Gets the value of the imageSizeInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImageSizeInBytes() {
        return imageSizeInBytes;
    }

    /**
     * Sets the value of the imageSizeInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImageSizeInBytes(BigInteger value) {
        this.imageSizeInBytes = value;
    }

    /**
     * Gets the value of the fpsRequested property.
     * 
     */
    public double getFPSRequested() {
        return fpsRequested;
    }

    /**
     * Sets the value of the fpsRequested property.
     * 
     */
    public void setFPSRequested(double value) {
        this.fpsRequested = value;
    }

}
