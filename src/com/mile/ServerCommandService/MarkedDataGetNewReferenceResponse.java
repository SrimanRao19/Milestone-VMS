
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
 *         &lt;element name="MarkedDataGetNewReferenceResult" type="{http://videoos.net/2/XProtectCSServerCommand}MarkedDataReference" minOccurs="0"/>
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
    "markedDataGetNewReferenceResult"
})
@XmlRootElement(name = "MarkedDataGetNewReferenceResponse")
public class MarkedDataGetNewReferenceResponse {

    @XmlElement(name = "MarkedDataGetNewReferenceResult")
    protected MarkedDataReference markedDataGetNewReferenceResult;

    /**
     * Gets the value of the markedDataGetNewReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link MarkedDataReference }
     *     
     */
    public MarkedDataReference getMarkedDataGetNewReferenceResult() {
        return markedDataGetNewReferenceResult;
    }

    /**
     * Sets the value of the markedDataGetNewReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkedDataReference }
     *     
     */
    public void setMarkedDataGetNewReferenceResult(MarkedDataReference value) {
        this.markedDataGetNewReferenceResult = value;
    }

}
