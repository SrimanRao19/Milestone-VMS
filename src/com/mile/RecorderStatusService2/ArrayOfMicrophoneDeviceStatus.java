
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMicrophoneDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMicrophoneDeviceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MicrophoneDeviceStatus" type="{http://videoos.net/2/XProtectCSRecorderStatus2}MicrophoneDeviceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMicrophoneDeviceStatus", propOrder = {
    "microphoneDeviceStatus"
})
public class ArrayOfMicrophoneDeviceStatus {

    @XmlElement(name = "MicrophoneDeviceStatus", nillable = true)
    protected List<MicrophoneDeviceStatus> microphoneDeviceStatus;

    /**
     * Gets the value of the microphoneDeviceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microphoneDeviceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrophoneDeviceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicrophoneDeviceStatus }
     * 
     * 
     */
    public List<MicrophoneDeviceStatus> getMicrophoneDeviceStatus() {
        if (microphoneDeviceStatus == null) {
            microphoneDeviceStatus = new ArrayList<MicrophoneDeviceStatus>();
        }
        return this.microphoneDeviceStatus;
    }

}
