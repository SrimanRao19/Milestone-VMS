
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
 *         &lt;element name="GetRecorderStatusResult" type="{http://videoos.net/2/XProtectCSRecorderStatus2}AttachAndConnectionState" minOccurs="0"/>
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
    "getRecorderStatusResult"
})
@XmlRootElement(name = "GetRecorderStatusResponse")
public class GetRecorderStatusResponse {

    @XmlElement(name = "GetRecorderStatusResult")
    protected AttachAndConnectionState getRecorderStatusResult;

    /**
     * Gets the value of the getRecorderStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AttachAndConnectionState }
     *     
     */
    public AttachAndConnectionState getGetRecorderStatusResult() {
        return getRecorderStatusResult;
    }

    /**
     * Sets the value of the getRecorderStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachAndConnectionState }
     *     
     */
    public void setGetRecorderStatusResult(AttachAndConnectionState value) {
        this.getRecorderStatusResult = value;
    }

}
