
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSpeakerDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSpeakerDeviceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpeakerDeviceStatus" type="{http://videoos.net/2/XProtectCSRecorderStatus2}SpeakerDeviceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSpeakerDeviceStatus", propOrder = {
    "speakerDeviceStatus"
})
public class ArrayOfSpeakerDeviceStatus {

    @XmlElement(name = "SpeakerDeviceStatus", nillable = true)
    protected List<SpeakerDeviceStatus> speakerDeviceStatus;

    /**
     * Gets the value of the speakerDeviceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speakerDeviceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeakerDeviceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeakerDeviceStatus }
     * 
     * 
     */
    public List<SpeakerDeviceStatus> getSpeakerDeviceStatus() {
        if (speakerDeviceStatus == null) {
            speakerDeviceStatus = new ArrayList<SpeakerDeviceStatus>();
        }
        return this.speakerDeviceStatus;
    }

}
