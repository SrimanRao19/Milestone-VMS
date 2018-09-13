
package com.mile.RecorderCommandService;

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
 *         &lt;element name="StopManualRecordingResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfManualRecordingResult" minOccurs="0"/>
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
    "stopManualRecordingResult"
})
@XmlRootElement(name = "StopManualRecordingResponse")
public class StopManualRecordingResponse {

    @XmlElement(name = "StopManualRecordingResult")
    protected ArrayOfManualRecordingResult stopManualRecordingResult;

    /**
     * Gets the value of the stopManualRecordingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfManualRecordingResult }
     *     
     */
    public ArrayOfManualRecordingResult getStopManualRecordingResult() {
        return stopManualRecordingResult;
    }

    /**
     * Sets the value of the stopManualRecordingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfManualRecordingResult }
     *     
     */
    public void setStopManualRecordingResult(ArrayOfManualRecordingResult value) {
        this.stopManualRecordingResult = value;
    }

}
