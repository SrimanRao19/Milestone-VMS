
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoStreamStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoStreamStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoStreamStatistics" type="{http://videoos.net/2/XProtectCSRecorderStatus2}VideoStreamStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoStreamStatistics", propOrder = {
    "videoStreamStatistics"
})
public class ArrayOfVideoStreamStatistics {

    @XmlElement(name = "VideoStreamStatistics", nillable = true)
    protected List<VideoStreamStatistics> videoStreamStatistics;

    /**
     * Gets the value of the videoStreamStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoStreamStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoStreamStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoStreamStatistics }
     * 
     * 
     */
    public List<VideoStreamStatistics> getVideoStreamStatistics() {
        if (videoStreamStatistics == null) {
            videoStreamStatistics = new ArrayList<VideoStreamStatistics>();
        }
        return this.videoStreamStatistics;
    }

}
