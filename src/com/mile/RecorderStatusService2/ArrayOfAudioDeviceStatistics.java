
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAudioDeviceStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAudioDeviceStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AudioDeviceStatistics" type="{http://videoos.net/2/XProtectCSRecorderStatus2}AudioDeviceStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudioDeviceStatistics", propOrder = {
    "audioDeviceStatistics"
})
public class ArrayOfAudioDeviceStatistics {

    @XmlElement(name = "AudioDeviceStatistics", nillable = true)
    protected List<AudioDeviceStatistics> audioDeviceStatistics;

    /**
     * Gets the value of the audioDeviceStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioDeviceStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioDeviceStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioDeviceStatistics }
     * 
     * 
     */
    public List<AudioDeviceStatistics> getAudioDeviceStatistics() {
        if (audioDeviceStatistics == null) {
            audioDeviceStatistics = new ArrayList<AudioDeviceStatistics>();
        }
        return this.audioDeviceStatistics;
    }

}
