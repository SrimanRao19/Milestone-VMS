
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HardwareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HardwareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HardwareId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DeviceIds" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="RecorderId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interconnected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HardwareInfo", propOrder = {
    "hardwareId",
    "deviceIds",
    "recorderId",
    "name",
    "description",
    "uri",
    "interconnected",
    "lastModified"
})
public class HardwareInfo {

    @XmlElement(name = "HardwareId", required = true)
    protected String hardwareId;
    @XmlElement(name = "DeviceIds")
    protected ArrayOfGuid deviceIds;
    @XmlElement(name = "RecorderId", required = true)
    protected String recorderId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Uri")
    protected String uri;
    @XmlElement(name = "Interconnected")
    protected boolean interconnected;
    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;

    /**
     * Gets the value of the hardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareId() {
        return hardwareId;
    }

    /**
     * Sets the value of the hardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareId(String value) {
        this.hardwareId = value;
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
     * Gets the value of the recorderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecorderId() {
        return recorderId;
    }

    /**
     * Sets the value of the recorderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecorderId(String value) {
        this.recorderId = value;
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
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the interconnected property.
     * 
     */
    public boolean isInterconnected() {
        return interconnected;
    }

    /**
     * Sets the value of the interconnected property.
     * 
     */
    public void setInterconnected(boolean value) {
        this.interconnected = value;
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

}
