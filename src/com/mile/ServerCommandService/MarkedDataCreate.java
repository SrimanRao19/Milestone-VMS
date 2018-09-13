
package com.mile.ServerCommandService;

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
 *         &lt;element name="markedDataId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="deviceIds" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="timeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="timeTag" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="timeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markedDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="useRetention" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retentionExpire" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="retentionOption" type="{http://videoos.net/2/XProtectCSServerCommand}RetentionOption" minOccurs="0"/>
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
    "markedDataId",
    "deviceIds",
    "timeStart",
    "timeTag",
    "timeEnd",
    "reference",
    "header",
    "description",
    "markedDataType",
    "useRetention",
    "retentionExpire",
    "retentionOption"
})
@XmlRootElement(name = "MarkedDataCreate")
public class MarkedDataCreate {

    protected String token;
    @XmlElement(required = true)
    protected String markedDataId;
    protected ArrayOfGuid deviceIds;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeTag;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEnd;
    protected String reference;
    protected String header;
    protected String description;
    protected int markedDataType;
    protected boolean useRetention;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retentionExpire;
    protected RetentionOption retentionOption;

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
     * Gets the value of the markedDataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkedDataId() {
        return markedDataId;
    }

    /**
     * Sets the value of the markedDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkedDataId(String value) {
        this.markedDataId = value;
    }

    /**
     * Gets the value of the deviceIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getDeviceIds() {
        return deviceIds;
    }

    /**
     * Sets the value of the deviceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setDeviceIds(ArrayOfGuid value) {
        this.deviceIds = value;
    }

    /**
     * Gets the value of the timeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStart() {
        return timeStart;
    }

    /**
     * Sets the value of the timeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStart(XMLGregorianCalendar value) {
        this.timeStart = value;
    }

    /**
     * Gets the value of the timeTag property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeTag() {
        return timeTag;
    }

    /**
     * Sets the value of the timeTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeTag(XMLGregorianCalendar value) {
        this.timeTag = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEnd(XMLGregorianCalendar value) {
        this.timeEnd = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the markedDataType property.
     * 
     */
    public int getMarkedDataType() {
        return markedDataType;
    }

    /**
     * Sets the value of the markedDataType property.
     * 
     */
    public void setMarkedDataType(int value) {
        this.markedDataType = value;
    }

    /**
     * Gets the value of the useRetention property.
     * 
     */
    public boolean isUseRetention() {
        return useRetention;
    }

    /**
     * Sets the value of the useRetention property.
     * 
     */
    public void setUseRetention(boolean value) {
        this.useRetention = value;
    }

    /**
     * Gets the value of the retentionExpire property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetentionExpire() {
        return retentionExpire;
    }

    /**
     * Sets the value of the retentionExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetentionExpire(XMLGregorianCalendar value) {
        this.retentionExpire = value;
    }

    /**
     * Gets the value of the retentionOption property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionOption }
     *     
     */
    public RetentionOption getRetentionOption() {
        return retentionOption;
    }

    /**
     * Sets the value of the retentionOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionOption }
     *     
     */
    public void setRetentionOption(RetentionOption value) {
        this.retentionOption = value;
    }

}
