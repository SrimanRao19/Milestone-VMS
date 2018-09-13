
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
 *         &lt;element name="MarkedDataGetResult" type="{http://videoos.net/2/XProtectCSServerCommand}MarkedData" minOccurs="0"/>
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
    "markedDataGetResult"
})
@XmlRootElement(name = "MarkedDataGetResponse")
public class MarkedDataGetResponse {

    @XmlElement(name = "MarkedDataGetResult")
    protected MarkedData markedDataGetResult;

    /**
     * Gets the value of the markedDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link MarkedData }
     *     
     */
    public MarkedData getMarkedDataGetResult() {
        return markedDataGetResult;
    }

    /**
     * Sets the value of the markedDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkedData }
     *     
     */
    public void setMarkedDataGetResult(MarkedData value) {
        this.markedDataGetResult = value;
    }

}
