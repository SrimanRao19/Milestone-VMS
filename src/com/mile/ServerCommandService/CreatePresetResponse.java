
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
 *         &lt;element name="CreatePresetResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "createPresetResult"
})
@XmlRootElement(name = "CreatePresetResponse")
public class CreatePresetResponse {

    @XmlElement(name = "CreatePresetResult", required = true)
    protected String createPresetResult;

    /**
     * Gets the value of the createPresetResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatePresetResult() {
        return createPresetResult;
    }

    /**
     * Sets the value of the createPresetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatePresetResult(String value) {
        this.createPresetResult = value;
    }

}
