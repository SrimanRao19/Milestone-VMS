
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetVideoDeviceStatisticsResult" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfVideoDeviceStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getVideoDeviceStatisticsResult"
})
@XmlRootElement(name = "GetVideoDeviceStatisticsResponse")
public class GetVideoDeviceStatisticsResponse {

    @XmlElement(name = "GetVideoDeviceStatisticsResult")
    protected ArrayOfVideoDeviceStatistics getVideoDeviceStatisticsResult;

    /**
     * Gets the value of the getVideoDeviceStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoDeviceStatistics }
     *     
     */
    public ArrayOfVideoDeviceStatistics getGetVideoDeviceStatisticsResult() {
        return getVideoDeviceStatisticsResult;
    }

    /**
     * Sets the value of the getVideoDeviceStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoDeviceStatistics }
     *     
     */
    public void setGetVideoDeviceStatisticsResult(ArrayOfVideoDeviceStatistics value) {
        this.getVideoDeviceStatisticsResult = value;
    }

}
