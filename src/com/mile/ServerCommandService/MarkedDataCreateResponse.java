
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
 *         &lt;element name="MarkedDataCreateResult" type="{http://videoos.net/2/XProtectCSServerCommand}MarkedDataResult" minOccurs="0"/>
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
    "markedDataCreateResult"
})
@XmlRootElement(name = "MarkedDataCreateResponse")
public class MarkedDataCreateResponse {

    @XmlElement(name = "MarkedDataCreateResult")
    protected MarkedDataResult markedDataCreateResult;

    /**
     * Gets the value of the markedDataCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link MarkedDataResult }
     *     
     */
    public MarkedDataResult getMarkedDataCreateResult() {
        return markedDataCreateResult;
    }

    /**
     * Sets the value of the markedDataCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkedDataResult }
     *     
     */
    public void setMarkedDataCreateResult(MarkedDataResult value) {
        this.markedDataCreateResult = value;
    }

}
