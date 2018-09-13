
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoDeviceStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoDeviceStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoDeviceStatistics" type="{http://videoos.net/2/XProtectCSRecorderStatus2}VideoDeviceStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoDeviceStatistics", propOrder = {
    "videoDeviceStatistics"
})
public class ArrayOfVideoDeviceStatistics {

    @XmlElement(name = "VideoDeviceStatistics", nillable = true)
    protected List<VideoDeviceStatistics> videoDeviceStatistics;

    /**
     * Gets the value of the videoDeviceStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoDeviceStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoDeviceStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoDeviceStatistics }
     * 
     * 
     */
    public List<VideoDeviceStatistics> getVideoDeviceStatistics() {
        if (videoDeviceStatistics == null) {
            videoDeviceStatistics = new ArrayList<VideoDeviceStatistics>();
        }
        return this.videoDeviceStatistics;
    }

}
