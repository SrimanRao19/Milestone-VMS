
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
 *         &lt;element name="SequencesGetAroundResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfSequenceEntry" minOccurs="0"/>
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
    "sequencesGetAroundResult"
})
@XmlRootElement(name = "SequencesGetAroundResponse")
public class SequencesGetAroundResponse {

    @XmlElement(name = "SequencesGetAroundResult")
    protected ArrayOfSequenceEntry sequencesGetAroundResult;

    /**
     * Gets the value of the sequencesGetAroundResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSequenceEntry }
     *     
     */
    public ArrayOfSequenceEntry getSequencesGetAroundResult() {
        return sequencesGetAroundResult;
    }

    /**
     * Sets the value of the sequencesGetAroundResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSequenceEntry }
     *     
     */
    public void setSequencesGetAroundResult(ArrayOfSequenceEntry value) {
        this.sequencesGetAroundResult = value;
    }

}
