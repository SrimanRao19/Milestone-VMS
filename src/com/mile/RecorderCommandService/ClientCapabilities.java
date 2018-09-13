
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrivacyMask" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientCapabilities", propOrder = {
    "privacyMask"
})
public class ClientCapabilities {

    @XmlElement(name = "PrivacyMask")
    protected boolean privacyMask;

    /**
     * Gets the value of the privacyMask property.
     * 
     */
    public boolean isPrivacyMask() {
        return privacyMask;
    }

    /**
     * Sets the value of the privacyMask property.
     * 
     */
    public void setPrivacyMask(boolean value) {
        this.privacyMask = value;
    }

}
