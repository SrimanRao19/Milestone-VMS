
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
 *         &lt;element name="SequencesGetTypesResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfSequenceType" minOccurs="0"/>
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
    "sequencesGetTypesResult"
})
@XmlRootElement(name = "SequencesGetTypesResponse")
public class SequencesGetTypesResponse {

    @XmlElement(name = "SequencesGetTypesResult")
    protected ArrayOfSequenceType sequencesGetTypesResult;

    /**
     * Gets the value of the sequencesGetTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSequenceType }
     *     
     */
    public ArrayOfSequenceType getSequencesGetTypesResult() {
        return sequencesGetTypesResult;
    }

    /**
     * Sets the value of the sequencesGetTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSequenceType }
     *     
     */
    public void setSequencesGetTypesResult(ArrayOfSequenceType value) {
        this.sequencesGetTypesResult = value;
    }

}
