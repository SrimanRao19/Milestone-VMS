
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
 *         &lt;element name="SequencesGetAroundWithSpanResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfSequenceEntry" minOccurs="0"/>
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
    "sequencesGetAroundWithSpanResult"
})
@XmlRootElement(name = "SequencesGetAroundWithSpanResponse")
public class SequencesGetAroundWithSpanResponse {

    @XmlElement(name = "SequencesGetAroundWithSpanResult")
    protected ArrayOfSequenceEntry sequencesGetAroundWithSpanResult;

    /**
     * Gets the value of the sequencesGetAroundWithSpanResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSequenceEntry }
     *     
     */
    public ArrayOfSequenceEntry getSequencesGetAroundWithSpanResult() {
        return sequencesGetAroundWithSpanResult;
    }

    /**
     * Sets the value of the sequencesGetAroundWithSpanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSequenceEntry }
     *     
     */
    public void setSequencesGetAroundWithSpanResult(ArrayOfSequenceEntry value) {
        this.sequencesGetAroundWithSpanResult = value;
    }

}
