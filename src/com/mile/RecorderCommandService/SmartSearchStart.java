
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
 *         &lt;element name="searchBeginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="searchEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sensitivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchInterval" type="{http://videoos.net/2/XProtectCSRecorderCommand}TimeDuration" minOccurs="0"/>
 *         &lt;element name="searchMask" type="{http://videoos.net/2/XProtectCSRecorderCommand}ImageMask" minOccurs="0"/>
 *         &lt;element name="ignoreInitialMotion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resultMotionMaskSize" type="{http://videoos.net/2/XProtectCSRecorderCommand}Size"/>
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
    "searchBeginTime",
    "searchEndTime",
    "sensitivity",
    "searchInterval",
    "searchMask",
    "ignoreInitialMotion",
    "resultMotionMaskSize"
})
@XmlRootElement(name = "SmartSearchStart")
public class SmartSearchStart {

    protected String token;
    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchBeginTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchEndTime;
    protected int sensitivity;
    protected TimeDuration searchInterval;
    protected ImageMask searchMask;
    protected boolean ignoreInitialMotion;
    @XmlElement(required = true)
    protected Size resultMotionMaskSize;

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
     * Gets the value of the searchBeginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchBeginTime() {
        return searchBeginTime;
    }

    /**
     * Sets the value of the searchBeginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchBeginTime(XMLGregorianCalendar value) {
        this.searchBeginTime = value;
    }

    /**
     * Gets the value of the searchEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchEndTime() {
        return searchEndTime;
    }

    /**
     * Sets the value of the searchEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchEndTime(XMLGregorianCalendar value) {
        this.searchEndTime = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     */
    public int getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     */
    public void setSensitivity(int value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the searchInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDuration }
     *     
     */
    public TimeDuration getSearchInterval() {
        return searchInterval;
    }

    /**
     * Sets the value of the searchInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDuration }
     *     
     */
    public void setSearchInterval(TimeDuration value) {
        this.searchInterval = value;
    }

    /**
     * Gets the value of the searchMask property.
     * 
     * @return
     *     possible object is
     *     {@link ImageMask }
     *     
     */
    public ImageMask getSearchMask() {
        return searchMask;
    }

    /**
     * Sets the value of the searchMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageMask }
     *     
     */
    public void setSearchMask(ImageMask value) {
        this.searchMask = value;
    }

    /**
     * Gets the value of the ignoreInitialMotion property.
     * 
     */
    public boolean isIgnoreInitialMotion() {
        return ignoreInitialMotion;
    }

    /**
     * Sets the value of the ignoreInitialMotion property.
     * 
     */
    public void setIgnoreInitialMotion(boolean value) {
        this.ignoreInitialMotion = value;
    }

    /**
     * Gets the value of the resultMotionMaskSize property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getResultMotionMaskSize() {
        return resultMotionMaskSize;
    }

    /**
     * Sets the value of the resultMotionMaskSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setResultMotionMaskSize(Size value) {
        this.resultMotionMaskSize = value;
    }

}
