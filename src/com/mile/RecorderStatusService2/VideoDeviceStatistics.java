
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoDeviceStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoDeviceStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSRecorderStatus2}DeviceStatisticsBase">
 *       &lt;sequence>
 *         &lt;element name="VideoStreamStatisticsArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfVideoStreamStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoDeviceStatistics", propOrder = {
    "videoStreamStatisticsArray"
})
public class VideoDeviceStatistics
    extends DeviceStatisticsBase
{

    @XmlElement(name = "VideoStreamStatisticsArray")
    protected ArrayOfVideoStreamStatistics videoStreamStatisticsArray;

    /**
     * Gets the value of the videoStreamStatisticsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoStreamStatistics }
     *     
     */
    public ArrayOfVideoStreamStatistics getVideoStreamStatisticsArray() {
        return videoStreamStatisticsArray;
    }

    /**
     * Sets the value of the videoStreamStatisticsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoStreamStatistics }
     *     
     */
    public void setVideoStreamStatisticsArray(ArrayOfVideoStreamStatistics value) {
        this.videoStreamStatisticsArray = value;
    }

}
