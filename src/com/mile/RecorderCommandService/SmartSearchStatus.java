
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SmartSearchStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartSearchStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentSearchTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Status" type="{http://videoos.net/2/XProtectCSRecorderCommand}SmartSearchStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartSearchStatus", propOrder = {
    "currentSearchTime",
    "status"
})
public class SmartSearchStatus {

    @XmlElement(name = "CurrentSearchTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentSearchTime;
    @XmlElement(name = "Status", required = true)
    protected SmartSearchStatusType status;

    /**
     * Gets the value of the currentSearchTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentSearchTime() {
        return currentSearchTime;
    }

    /**
     * Sets the value of the currentSearchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentSearchTime(XMLGregorianCalendar value) {
        this.currentSearchTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SmartSearchStatusType }
     *     
     */
    public SmartSearchStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartSearchStatusType }
     *     
     */
    public void setStatus(SmartSearchStatusType value) {
        this.status = value;
    }

}
