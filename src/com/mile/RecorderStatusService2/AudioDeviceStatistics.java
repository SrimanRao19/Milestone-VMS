
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioDeviceStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioDeviceStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSRecorderStatus2}DeviceStatisticsBase">
 *       &lt;sequence>
 *         &lt;element name="AudioStreamStatisticsArray" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfAudioStreamStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioDeviceStatistics", propOrder = {
    "audioStreamStatisticsArray"
})
public class AudioDeviceStatistics
    extends DeviceStatisticsBase
{

    @XmlElement(name = "AudioStreamStatisticsArray")
    protected ArrayOfAudioStreamStatistics audioStreamStatisticsArray;

    /**
     * Gets the value of the audioStreamStatisticsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudioStreamStatistics }
     *     
     */
    public ArrayOfAudioStreamStatistics getAudioStreamStatisticsArray() {
        return audioStreamStatisticsArray;
    }

    /**
     * Sets the value of the audioStreamStatisticsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudioStreamStatistics }
     *     
     */
    public void setAudioStreamStatisticsArray(ArrayOfAudioStreamStatistics value) {
        this.audioStreamStatisticsArray = value;
    }

}
