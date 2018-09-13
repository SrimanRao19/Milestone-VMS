
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
 *         &lt;element name="deviceIds" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="searchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="users" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="createdFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="createdToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="markedDataFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="markedDataToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tagTimeFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tagTimeToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="retentionExpireFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="retentionExpireTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortOrder" type="{http://videoos.net/2/XProtectCSServerCommand}SortOrderOption"/>
 *         &lt;element name="sortAscending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deviceIds",
    "searchText",
    "users",
    "createdFromTime",
    "createdToTime",
    "markedDataFromTime",
    "markedDataToTime",
    "tagTimeFromTime",
    "tagTimeToTime",
    "retentionExpireFrom",
    "retentionExpireTo",
    "pageIndex",
    "pageSize",
    "sortOrder",
    "sortAscending"
})
@XmlRootElement(name = "MarkedDataSearch")
public class MarkedDataSearch {

    protected String token;
    protected ArrayOfGuid deviceIds;
    protected String searchText;
    protected ArrayOfString users;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdFromTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdToTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar markedDataFromTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar markedDataToTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tagTimeFromTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tagTimeToTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retentionExpireFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retentionExpireTo;
    protected int pageIndex;
    protected int pageSize;
    @XmlElement(required = true)
    protected SortOrderOption sortOrder;
    protected boolean sortAscending;

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
     * Gets the value of the searchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Sets the value of the searchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setUsers(ArrayOfString value) {
        this.users = value;
    }

    /**
     * Gets the value of the createdFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedFromTime() {
        return createdFromTime;
    }

    /**
     * Sets the value of the createdFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedFromTime(XMLGregorianCalendar value) {
        this.createdFromTime = value;
    }

    /**
     * Gets the value of the createdToTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedToTime() {
        return createdToTime;
    }

    /**
     * Sets the value of the createdToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedToTime(XMLGregorianCalendar value) {
        this.createdToTime = value;
    }

    /**
     * Gets the value of the markedDataFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarkedDataFromTime() {
        return markedDataFromTime;
    }

    /**
     * Sets the value of the markedDataFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarkedDataFromTime(XMLGregorianCalendar value) {
        this.markedDataFromTime = value;
    }

    /**
     * Gets the value of the markedDataToTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarkedDataToTime() {
        return markedDataToTime;
    }

    /**
     * Sets the value of the markedDataToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarkedDataToTime(XMLGregorianCalendar value) {
        this.markedDataToTime = value;
    }

    /**
     * Gets the value of the tagTimeFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTagTimeFromTime() {
        return tagTimeFromTime;
    }

    /**
     * Sets the value of the tagTimeFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTagTimeFromTime(XMLGregorianCalendar value) {
        this.tagTimeFromTime = value;
    }

    /**
     * Gets the value of the tagTimeToTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTagTimeToTime() {
        return tagTimeToTime;
    }

    /**
     * Sets the value of the tagTimeToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTagTimeToTime(XMLGregorianCalendar value) {
        this.tagTimeToTime = value;
    }

    /**
     * Gets the value of the retentionExpireFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetentionExpireFrom() {
        return retentionExpireFrom;
    }

    /**
     * Sets the value of the retentionExpireFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetentionExpireFrom(XMLGregorianCalendar value) {
        this.retentionExpireFrom = value;
    }

    /**
     * Gets the value of the retentionExpireTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetentionExpireTo() {
        return retentionExpireTo;
    }

    /**
     * Sets the value of the retentionExpireTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetentionExpireTo(XMLGregorianCalendar value) {
        this.retentionExpireTo = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderOption }
     *     
     */
    public SortOrderOption getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderOption }
     *     
     */
    public void setSortOrder(SortOrderOption value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the sortAscending property.
     * 
     */
    public boolean isSortAscending() {
        return sortAscending;
    }

    /**
     * Sets the value of the sortAscending property.
     * 
     */
    public void setSortAscending(boolean value) {
        this.sortAscending = value;
    }

}
