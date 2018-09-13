
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
 *         &lt;element name="MarkedDataSearchResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMarkedData" minOccurs="0"/>
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
    "markedDataSearchResult"
})
@XmlRootElement(name = "MarkedDataSearchResponse")
public class MarkedDataSearchResponse {

    @XmlElement(name = "MarkedDataSearchResult")
    protected ArrayOfMarkedData markedDataSearchResult;

    /**
     * Gets the value of the markedDataSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarkedData }
     *     
     */
    public ArrayOfMarkedData getMarkedDataSearchResult() {
        return markedDataSearchResult;
    }

    /**
     * Sets the value of the markedDataSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarkedData }
     *     
     */
    public void setMarkedDataSearchResult(ArrayOfMarkedData value) {
        this.markedDataSearchResult = value;
    }

}
