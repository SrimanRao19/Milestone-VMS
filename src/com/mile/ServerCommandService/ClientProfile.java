
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SettingsLastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ClientProfileSettings" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfClientProfileSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientProfile", propOrder = {
    "id",
    "name",
    "description",
    "lastModified",
    "settingsLastModified",
    "clientProfileSettings"
})
public class ClientProfile {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "SettingsLastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settingsLastModified;
    @XmlElement(name = "ClientProfileSettings")
    protected ArrayOfClientProfileSetting clientProfileSettings;

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
     * Gets the value of the settingsLastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettingsLastModified() {
        return settingsLastModified;
    }

    /**
     * Sets the value of the settingsLastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettingsLastModified(XMLGregorianCalendar value) {
        this.settingsLastModified = value;
    }

    /**
     * Gets the value of the clientProfileSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientProfileSetting }
     *     
     */
    public ArrayOfClientProfileSetting getClientProfileSettings() {
        return clientProfileSettings;
    }

    /**
     * Sets the value of the clientProfileSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientProfileSetting }
     *     
     */
    public void setClientProfileSettings(ArrayOfClientProfileSetting value) {
        this.clientProfileSettings = value;
    }

}
