
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachAndConnectionState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachAndConnectionState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachAndConnectionState", propOrder = {
    "attachState",
    "connectionState"
})
public class AttachAndConnectionState {

    @XmlElement(name = "AttachState")
    protected String attachState;
    @XmlElement(name = "ConnectionState")
    protected String connectionState;

    /**
     * Gets the value of the attachState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachState() {
        return attachState;
    }

    /**
     * Sets the value of the attachState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachState(String value) {
        this.attachState = value;
    }

    /**
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionState(String value) {
        this.connectionState = value;
    }

}
