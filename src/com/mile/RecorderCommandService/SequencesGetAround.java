
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
 *         &lt;element name="centerTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="maxCountBefore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxCountAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "centerTime",
    "maxCountBefore",
    "maxCountAfter"
})
@XmlRootElement(name = "SequencesGetAround")
public class SequencesGetAround {

    protected String token;
    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String sequenceType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar centerTime;
    protected int maxCountBefore;
    protected int maxCountAfter;

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
     * Gets the value of the centerTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCenterTime() {
        return centerTime;
    }

    /**
     * Sets the value of the centerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCenterTime(XMLGregorianCalendar value) {
        this.centerTime = value;
    }

    /**
     * Gets the value of the maxCountBefore property.
     * 
     */
    public int getMaxCountBefore() {
        return maxCountBefore;
    }

    /**
     * Sets the value of the maxCountBefore property.
     * 
     */
    public void setMaxCountBefore(int value) {
        this.maxCountBefore = value;
    }

    /**
     * Gets the value of the maxCountAfter property.
     * 
     */
    public int getMaxCountAfter() {
        return maxCountAfter;
    }

    /**
     * Sets the value of the maxCountAfter property.
     * 
     */
    public void setMaxCountAfter(int value) {
        this.maxCountAfter = value;
    }

}
