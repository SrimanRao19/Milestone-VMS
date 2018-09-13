
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
 *         &lt;element name="StartManualRecordingResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfManualRecordingResult" minOccurs="0"/>
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
    "startManualRecordingResult"
})
@XmlRootElement(name = "StartManualRecordingResponse")
public class StartManualRecordingResponse {

    @XmlElement(name = "StartManualRecordingResult")
    protected ArrayOfManualRecordingResult startManualRecordingResult;

    /**
     * Gets the value of the startManualRecordingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfManualRecordingResult }
     *     
     */
    public ArrayOfManualRecordingResult getStartManualRecordingResult() {
        return startManualRecordingResult;
    }

    /**
     * Sets the value of the startManualRecordingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfManualRecordingResult }
     *     
     */
    public void setStartManualRecordingResult(ArrayOfManualRecordingResult value) {
        this.startManualRecordingResult = value;
    }

}
