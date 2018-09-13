
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="sequenceType" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="minTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="maxTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="maxCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "token",
    "deviceId",
    "sequenceType",
    "minTime",
    "maxTime",
    "maxCount"
})
@XmlRootElement(name = "SequencesGet")
public class SequencesGet {

    protected String token;
    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String sequenceType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxTime;
    protected int maxCount;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the sequenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceType() {
        return sequenceType;
    }

    /**
     * Sets the value of the sequenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceType(String value) {
        this.sequenceType = value;
    }

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinTime(XMLGregorianCalendar value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the maxTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxTime(XMLGregorianCalendar value) {
        this.maxTime = value;
    }

    /**
     * Gets the value of the maxCount property.
     * 
     */
    public int getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     * 
     */
    public void setMaxCount(int value) {
        this.maxCount = value;
    }

}
