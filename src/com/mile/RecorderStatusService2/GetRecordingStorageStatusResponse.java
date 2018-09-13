
package com.mile.RecorderStatusService2;

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
 *         &lt;element name="GetRecordingStorageStatusResult" type="{http://videoos.net/2/XProtectCSRecorderStatus2}ArrayOfStorageStatus" minOccurs="0"/>
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
    "getRecordingStorageStatusResult"
})
@XmlRootElement(name = "GetRecordingStorageStatusResponse")
public class GetRecordingStorageStatusResponse {

    @XmlElement(name = "GetRecordingStorageStatusResult")
    protected ArrayOfStorageStatus getRecordingStorageStatusResult;

    /**
     * Gets the value of the getRecordingStorageStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStorageStatus }
     *     
     */
    public ArrayOfStorageStatus getGetRecordingStorageStatusResult() {
        return getRecordingStorageStatusResult;
    }

    /**
     * Sets the value of the getRecordingStorageStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStorageStatus }
     *     
     */
    public void setGetRecordingStorageStatusResult(ArrayOfStorageStatus value) {
        this.getRecordingStorageStatusResult = value;
    }

}
