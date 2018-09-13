
package com.mile.RecorderCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfManualRecordingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfManualRecordingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManualRecordingResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ManualRecordingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManualRecordingResult", propOrder = {
    "manualRecordingResult"
})
public class ArrayOfManualRecordingResult {

    @XmlElement(name = "ManualRecordingResult", nillable = true)
    protected List<ManualRecordingResult> manualRecordingResult;

    /**
     * Gets the value of the manualRecordingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualRecordingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualRecordingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualRecordingResult }
     * 
     * 
     */
    public List<ManualRecordingResult> getManualRecordingResult() {
        if (manualRecordingResult == null) {
            manualRecordingResult = new ArrayList<ManualRecordingResult>();
        }
        return this.manualRecordingResult;
    }

}
