
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
 *         &lt;element name="SendDriverCommandWithResponseResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sendDriverCommandWithResponseResult"
})
@XmlRootElement(name = "SendDriverCommandWithResponseResponse")
public class SendDriverCommandWithResponseResponse {

    @XmlElement(name = "SendDriverCommandWithResponseResult")
    protected String sendDriverCommandWithResponseResult;

    /**
     * Gets the value of the sendDriverCommandWithResponseResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDriverCommandWithResponseResult() {
        return sendDriverCommandWithResponseResult;
    }

    /**
     * Sets the value of the sendDriverCommandWithResponseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDriverCommandWithResponseResult(String value) {
        this.sendDriverCommandWithResponseResult = value;
    }

}
