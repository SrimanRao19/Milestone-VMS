
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
 *         &lt;element name="StartStatusSessionResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "startStatusSessionResult"
})
@XmlRootElement(name = "StartStatusSessionResponse")
public class StartStatusSessionResponse {

    @XmlElement(name = "StartStatusSessionResult", required = true)
    protected String startStatusSessionResult;

    /**
     * Gets the value of the startStatusSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStatusSessionResult() {
        return startStatusSessionResult;
    }

    /**
     * Sets the value of the startStatusSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStatusSessionResult(String value) {
        this.startStatusSessionResult = value;
    }

}
