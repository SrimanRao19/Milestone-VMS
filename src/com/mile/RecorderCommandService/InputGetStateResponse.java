
package com.mile.RecorderCommandService;

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
 *         &lt;element name="InputGetStateResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}IOState"/>
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
    "inputGetStateResult"
})
@XmlRootElement(name = "InputGetStateResponse")
public class InputGetStateResponse {

    @XmlElement(name = "InputGetStateResult", required = true)
    protected IOState inputGetStateResult;

    /**
     * Gets the value of the inputGetStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link IOState }
     *     
     */
    public IOState getInputGetStateResult() {
        return inputGetStateResult;
    }

    /**
     * Sets the value of the inputGetStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOState }
     *     
     */
    public void setInputGetStateResult(IOState value) {
        this.inputGetStateResult = value;
    }

}
