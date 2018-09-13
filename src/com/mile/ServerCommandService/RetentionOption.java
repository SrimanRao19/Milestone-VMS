
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetentionOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetentionOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetentionUnits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RetentionOptionType" type="{http://videoos.net/2/XProtectCSServerCommand}RetentionOptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetentionOption", propOrder = {
    "retentionUnits",
    "retentionOptionType"
})
public class RetentionOption {

    @XmlElement(name = "RetentionUnits")
    protected int retentionUnits;
    @XmlElement(name = "RetentionOptionType", required = true)
    protected RetentionOptionType retentionOptionType;

    /**
     * Gets the value of the retentionUnits property.
     * 
     */
    public int getRetentionUnits() {
        return retentionUnits;
    }

    /**
     * Sets the value of the retentionUnits property.
     * 
     */
    public void setRetentionUnits(int value) {
        this.retentionUnits = value;
    }

    /**
     * Gets the value of the retentionOptionType property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionOptionType }
     *     
     */
    public RetentionOptionType getRetentionOptionType() {
        return retentionOptionType;
    }

    /**
     * Sets the value of the retentionOptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionOptionType }
     *     
     */
    public void setRetentionOptionType(RetentionOptionType value) {
        this.retentionOptionType = value;
    }

}
