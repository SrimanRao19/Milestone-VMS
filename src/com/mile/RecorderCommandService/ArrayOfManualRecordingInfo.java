
package com.mile.RecorderCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfManualRecordingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfManualRecordingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManualRecordingInfo" type="{http://videoos.net/2/XProtectCSRecorderCommand}ManualRecordingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManualRecordingInfo", propOrder = {
    "manualRecordingInfo"
})
public class ArrayOfManualRecordingInfo {

    @XmlElement(name = "ManualRecordingInfo", nillable = true)
    protected List<ManualRecordingInfo> manualRecordingInfo;

    /**
     * Gets the value of the manualRecordingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualRecordingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualRecordingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualRecordingInfo }
     * 
     * 
     */
    public List<ManualRecordingInfo> getManualRecordingInfo() {
        if (manualRecordingInfo == null) {
            manualRecordingInfo = new ArrayList<ManualRecordingInfo>();
        }
        return this.manualRecordingInfo;
    }

}
