
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetentionSettingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetentionSettingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetentionOptions" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfRetentionOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetentionSettingInfo", propOrder = {
    "retentionOptions"
})
public class RetentionSettingInfo {

    @XmlElement(name = "RetentionOptions")
    protected ArrayOfRetentionOption retentionOptions;

    /**
     * Gets the value of the retentionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetentionOption }
     *     
     */
    public ArrayOfRetentionOption getRetentionOptions() {
        return retentionOptions;
    }

    /**
     * Sets the value of the retentionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetentionOption }
     *     
     */
    public void setRetentionOptions(ArrayOfRetentionOption value) {
        this.retentionOptions = value;
    }

}
