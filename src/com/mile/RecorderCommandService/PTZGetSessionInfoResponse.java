
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
 *         &lt;element name="PTZGetSessionInfoResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}PtzSessionInfo" minOccurs="0"/>
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
    "ptzGetSessionInfoResult"
})
@XmlRootElement(name = "PTZGetSessionInfoResponse")
public class PTZGetSessionInfoResponse {

    @XmlElement(name = "PTZGetSessionInfoResult")
    protected PtzSessionInfo ptzGetSessionInfoResult;

    /**
     * Gets the value of the ptzGetSessionInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link PtzSessionInfo }
     *     
     */
    public PtzSessionInfo getPTZGetSessionInfoResult() {
        return ptzGetSessionInfoResult;
    }

    /**
     * Sets the value of the ptzGetSessionInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtzSessionInfo }
     *     
     */
    public void setPTZGetSessionInfoResult(PtzSessionInfo value) {
        this.ptzGetSessionInfoResult = value;
    }

}
