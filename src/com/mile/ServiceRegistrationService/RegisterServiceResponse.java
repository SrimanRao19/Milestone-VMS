
package com.mile.ServiceRegistrationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RegisterServiceResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "registerServiceResult"
})
@XmlRootElement(name = "RegisterServiceResponse")
public class RegisterServiceResponse {

    @XmlElement(name = "RegisterServiceResult")
    protected boolean registerServiceResult;

    /**
     * Gets the value of the registerServiceResult property.
     * 
     */
    public boolean isRegisterServiceResult() {
        return registerServiceResult;
    }

    /**
     * Sets the value of the registerServiceResult property.
     * 
     */
    public void setRegisterServiceResult(boolean value) {
        this.registerServiceResult = value;
    }

}
