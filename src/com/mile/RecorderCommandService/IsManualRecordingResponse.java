
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
 *         &lt;element name="IsManualRecordingResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfManualRecordingInfo" minOccurs="0"/>
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
    "isManualRecordingResult"
})
@XmlRootElement(name = "IsManualRecordingResponse")
public class IsManualRecordingResponse {

    @XmlElement(name = "IsManualRecordingResult")
    protected ArrayOfManualRecordingInfo isManualRecordingResult;

    /**
     * Gets the value of the isManualRecordingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfManualRecordingInfo }
     *     
     */
    public ArrayOfManualRecordingInfo getIsManualRecordingResult() {
        return isManualRecordingResult;
    }

    /**
     * Sets the value of the isManualRecordingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfManualRecordingInfo }
     *     
     */
    public void setIsManualRecordingResult(ArrayOfManualRecordingInfo value) {
        this.isManualRecordingResult = value;
    }

}
