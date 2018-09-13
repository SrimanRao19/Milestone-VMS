
package com.mile.ServerCommandService;

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
 *         &lt;element name="GetServerVersionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getServerVersionResult"
})
@XmlRootElement(name = "GetServerVersionResponse")
public class GetServerVersionResponse {

    @XmlElement(name = "GetServerVersionResult")
    protected String getServerVersionResult;

    /**
     * Gets the value of the getServerVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetServerVersionResult() {
        return getServerVersionResult;
    }

    /**
     * Sets the value of the getServerVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetServerVersionResult(String value) {
        this.getServerVersionResult = value;
    }

}
