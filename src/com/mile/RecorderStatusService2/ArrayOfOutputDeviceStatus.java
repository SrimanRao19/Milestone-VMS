
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutputDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutputDeviceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputDeviceStatus" type="{http://videoos.net/2/XProtectCSRecorderStatus2}OutputDeviceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutputDeviceStatus", propOrder = {
    "outputDeviceStatus"
})
public class ArrayOfOutputDeviceStatus {

    @XmlElement(name = "OutputDeviceStatus", nillable = true)
    protected List<OutputDeviceStatus> outputDeviceStatus;

    /**
     * Gets the value of the outputDeviceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputDeviceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputDeviceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputDeviceStatus }
     * 
     * 
     */
    public List<OutputDeviceStatus> getOutputDeviceStatus() {
        if (outputDeviceStatus == null) {
            outputDeviceStatus = new ArrayList<OutputDeviceStatus>();
        }
        return this.outputDeviceStatus;
    }

}
