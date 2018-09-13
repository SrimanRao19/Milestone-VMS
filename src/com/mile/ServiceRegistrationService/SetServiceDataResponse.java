
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
 *         &lt;element name="SetServiceDataResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setServiceDataResult"
})
@XmlRootElement(name = "SetServiceDataResponse")
public class SetServiceDataResponse {

    @XmlElement(name = "SetServiceDataResult")
    protected boolean setServiceDataResult;

    /**
     * Gets the value of the setServiceDataResult property.
     * 
     */
    public boolean isSetServiceDataResult() {
        return setServiceDataResult;
    }

    /**
     * Sets the value of the setServiceDataResult property.
     * 
     */
    public void setSetServiceDataResult(boolean value) {
        this.setServiceDataResult = value;
    }

}
