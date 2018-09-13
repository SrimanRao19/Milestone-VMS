
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
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="timeLimit" type="{http://videoos.net/2/XProtectCSServerCommand}TimeDuration" minOccurs="0"/>
 *         &lt;element name="countLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deviceTypes" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMediaDeviceType" minOccurs="0"/>
 *         &lt;element name="optDeviceIds" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *         &lt;element name="optUsers" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="optSearchStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "time",
    "timeLimit",
    "countLimit",
    "deviceTypes",
    "optDeviceIds",
    "optUsers",
    "optSearchStr"
})
@XmlRootElement(name = "BookmarkSearchTime")
public class BookmarkSearchTime {

    protected String token;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    protected TimeDuration timeLimit;
    protected int countLimit;
    protected ArrayOfMediaDeviceType deviceTypes;
    protected ArrayOfGuid optDeviceIds;
    protected ArrayOfString optUsers;
    protected String optSearchStr;

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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDuration }
     *     
     */
    public TimeDuration getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the value of the timeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDuration }
     *     
     */
    public void setTimeLimit(TimeDuration value) {
        this.timeLimit = value;
    }

    /**
     * Gets the value of the countLimit property.
     * 
     */
    public int getCountLimit() {
        return countLimit;
    }

    /**
     * Sets the value of the countLimit property.
     * 
     */
    public void setCountLimit(int value) {
        this.countLimit = value;
    }

    /**
     * Gets the value of the deviceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediaDeviceType }
     *     
     */
    public ArrayOfMediaDeviceType getDeviceTypes() {
        return deviceTypes;
    }

    /**
     * Sets the value of the deviceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediaDeviceType }
     *     
     */
    public void setDeviceTypes(ArrayOfMediaDeviceType value) {
        this.deviceTypes = value;
    }

    /**
     * Gets the value of the optDeviceIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getOptDeviceIds() {
        return optDeviceIds;
    }

    /**
     * Sets the value of the optDeviceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setOptDeviceIds(ArrayOfGuid value) {
        this.optDeviceIds = value;
    }

    /**
     * Gets the value of the optUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getOptUsers() {
        return optUsers;
    }

    /**
     * Sets the value of the optUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setOptUsers(ArrayOfString value) {
        this.optUsers = value;
    }

    /**
     * Gets the value of the optSearchStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptSearchStr() {
        return optSearchStr;
    }

    /**
     * Sets the value of the optSearchStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptSearchStr(String value) {
        this.optSearchStr = value;
    }

}
