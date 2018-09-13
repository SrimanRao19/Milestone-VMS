
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
 *         &lt;element name="GetCurrentDeviceStatusResult" type="{http://videoos.net/2/XProtectCSRecorderStatus2}Status" minOccurs="0"/>
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
    "getCurrentDeviceStatusResult"
})
@XmlRootElement(name = "GetCurrentDeviceStatusResponse")
public class GetCurrentDeviceStatusResponse {

    @XmlElement(name = "GetCurrentDeviceStatusResult")
    protected Status getCurrentDeviceStatusResult;

    /**
     * Gets the value of the getCurrentDeviceStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getGetCurrentDeviceStatusResult() {
        return getCurrentDeviceStatusResult;
    }

    /**
     * Sets the value of the getCurrentDeviceStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setGetCurrentDeviceStatusResult(Status value) {
        this.getCurrentDeviceStatusResult = value;
    }

}
