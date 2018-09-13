
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="GetRetentionTimeLimitResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "getRetentionTimeLimitResult"
})
@XmlRootElement(name = "GetRetentionTimeLimitResponse")
public class GetRetentionTimeLimitResponse {

    @XmlElement(name = "GetRetentionTimeLimitResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getRetentionTimeLimitResult;

    /**
     * Gets the value of the getRetentionTimeLimitResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetRetentionTimeLimitResult() {
        return getRetentionTimeLimitResult;
    }

    /**
     * Sets the value of the getRetentionTimeLimitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetRetentionTimeLimitResult(XMLGregorianCalendar value) {
        this.getRetentionTimeLimitResult = value;
    }

}
