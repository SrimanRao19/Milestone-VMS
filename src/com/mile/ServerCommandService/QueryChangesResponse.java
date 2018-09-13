
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
 *         &lt;element name="QueryChangesResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfChange" minOccurs="0"/>
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
    "queryChangesResult"
})
@XmlRootElement(name = "QueryChangesResponse")
public class QueryChangesResponse {

    @XmlElement(name = "QueryChangesResult")
    protected ArrayOfChange queryChangesResult;

    /**
     * Gets the value of the queryChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChange }
     *     
     */
    public ArrayOfChange getQueryChangesResult() {
        return queryChangesResult;
    }

    /**
     * Sets the value of the queryChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChange }
     *     
     */
    public void setQueryChangesResult(ArrayOfChange value) {
        this.queryChangesResult = value;
    }

}
