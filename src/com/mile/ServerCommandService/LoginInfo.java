
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoginInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeToLive" type="{http://videoos.net/2/XProtectCSServerCommand}TimeDuration" minOccurs="0"/>
 *         &lt;element name="TimeToLiveLimited" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInfo", propOrder = {
    "token",
    "registrationTime",
    "timeToLive",
    "timeToLiveLimited"
})
public class LoginInfo {

    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "RegistrationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationTime;
    @XmlElement(name = "TimeToLive")
    protected TimeDuration timeToLive;
    @XmlElement(name = "TimeToLiveLimited")
    protected boolean timeToLiveLimited;

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
     * Gets the value of the registrationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationTime() {
        return registrationTime;
    }

    /**
     * Sets the value of the registrationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationTime(XMLGregorianCalendar value) {
        this.registrationTime = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDuration }
     *     
     */
    public TimeDuration getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDuration }
     *     
     */
    public void setTimeToLive(TimeDuration value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the timeToLiveLimited property.
     * 
     */
    public boolean isTimeToLiveLimited() {
        return timeToLiveLimited;
    }

    /**
     * Sets the value of the timeToLiveLimited property.
     * 
     */
    public void setTimeToLiveLimited(boolean value) {
        this.timeToLiveLimited = value;
    }

}
