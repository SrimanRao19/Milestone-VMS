
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ViewGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewGroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViewGroupType" type="{http://videoos.net/2/XProtectCSServerCommand}ViewGroupType"/>
 *         &lt;element name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastModifiedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewGroupInfo", propOrder = {
    "id",
    "name",
    "viewGroupType",
    "readOnly",
    "lastModifiedTime",
    "lastModifiedUser"
})
public class ViewGroupInfo {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ViewGroupType", required = true)
    protected ViewGroupType viewGroupType;
    @XmlElement(name = "ReadOnly")
    protected boolean readOnly;
    @XmlElement(name = "LastModifiedTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    @XmlElement(name = "LastModifiedUser")
    protected String lastModifiedUser;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the viewGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link ViewGroupType }
     *     
     */
    public ViewGroupType getViewGroupType() {
        return viewGroupType;
    }

    /**
     * Sets the value of the viewGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewGroupType }
     *     
     */
    public void setViewGroupType(ViewGroupType value) {
        this.viewGroupType = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedTime(XMLGregorianCalendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the lastModifiedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * Sets the value of the lastModifiedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedUser(String value) {
        this.lastModifiedUser = value;
    }

}
