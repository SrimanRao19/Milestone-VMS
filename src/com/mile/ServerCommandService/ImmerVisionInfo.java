
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImmerVisionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmerVisionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LensProfileRpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LensProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LensProfileData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmerVisionInfo", propOrder = {
    "lensProfileRpl",
    "lensProfileName",
    "lensProfileData"
})
public class ImmerVisionInfo {

    @XmlElement(name = "LensProfileRpl")
    protected String lensProfileRpl;
    @XmlElement(name = "LensProfileName")
    protected String lensProfileName;
    @XmlElement(name = "LensProfileData")
    protected String lensProfileData;

    /**
     * Gets the value of the lensProfileRpl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLensProfileRpl() {
        return lensProfileRpl;
    }

    /**
     * Sets the value of the lensProfileRpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLensProfileRpl(String value) {
        this.lensProfileRpl = value;
    }

    /**
     * Gets the value of the lensProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLensProfileName() {
        return lensProfileName;
    }

    /**
     * Sets the value of the lensProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLensProfileName(String value) {
        this.lensProfileName = value;
    }

    /**
     * Gets the value of the lensProfileData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLensProfileData() {
        return lensProfileData;
    }

    /**
     * Sets the value of the lensProfileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLensProfileData(String value) {
        this.lensProfileData = value;
    }

}
