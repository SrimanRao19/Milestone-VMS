
package com.mile.ServerCommandService;

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
 *         &lt;element name="IsOnlineResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isOnlineResult"
})
@XmlRootElement(name = "IsOnlineResponse")
public class IsOnlineResponse {

    @XmlElement(name = "IsOnlineResult")
    protected boolean isOnlineResult;

    /**
     * Gets the value of the isOnlineResult property.
     * 
     */
    public boolean isIsOnlineResult() {
        return isOnlineResult;
    }

    /**
     * Sets the value of the isOnlineResult property.
     * 
     */
    public void setIsOnlineResult(boolean value) {
        this.isOnlineResult = value;
    }

}
