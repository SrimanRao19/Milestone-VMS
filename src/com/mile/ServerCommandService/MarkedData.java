
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MarkedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DeviceIds" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TagTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UseRetention" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetentionExpire" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RetentionSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RetentionOption" type="{http://videoos.net/2/XProtectCSServerCommand}RetentionOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkedData", propOrder = {
    "id",
    "deviceIds",
    "created",
    "lastModified",
    "reference",
    "header",
    "description",
    "user",
    "startTime",
    "tagTime",
    "endTime",
    "useRetention",
    "retentionExpire",
    "retentionSize",
    "retentionOption"
})
public class MarkedData {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "DeviceIds")
    protected ArrayOfGuid deviceIds;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "Header")
    protected String header;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "TagTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tagTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "UseRetention")
    protected boolean useRetention;
    @XmlElement(name = "RetentionExpire", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retentionExpire;
    @XmlElement(name = "RetentionSize")
    protected long retentionSize;
    @XmlElement(name = "RetentionOption")
    protected RetentionOption retentionOption;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the tagTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTagTime() {
        return tagTime;
    }

    /**
     * Sets the value of the tagTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTagTime(XMLGregorianCalendar value) {
        this.tagTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
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
     * Gets the value of the retentionSize property.
     * 
     */
    public long getRetentionSize() {
        return retentionSize;
    }

    /**
     * Sets the value of the retentionSize property.
     * 
     */
    public void setRetentionSize(long value) {
        this.retentionSize = value;
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
