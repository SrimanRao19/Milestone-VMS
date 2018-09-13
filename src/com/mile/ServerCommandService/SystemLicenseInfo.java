
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SystemLicenseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemLicenseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasLicense" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsTrialLicense" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SLC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expires" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Features" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemLicenseInfo", propOrder = {
    "hasLicense",
    "isTrialLicense",
    "slc",
    "productSku",
    "expires",
    "expiryDate",
    "features"
})
public class SystemLicenseInfo {

    @XmlElement(name = "HasLicense")
    protected boolean hasLicense;
    @XmlElement(name = "IsTrialLicense")
    protected boolean isTrialLicense;
    @XmlElement(name = "SLC")
    protected String slc;
    @XmlElement(name = "ProductSku")
    protected String productSku;
    @XmlElement(name = "Expires")
    protected boolean expires;
    @XmlElement(name = "ExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Features")
    protected ArrayOfString features;

    /**
     * Gets the value of the hasLicense property.
     * 
     */
    public boolean isHasLicense() {
        return hasLicense;
    }

    /**
     * Sets the value of the hasLicense property.
     * 
     */
    public void setHasLicense(boolean value) {
        this.hasLicense = value;
    }

    /**
     * Gets the value of the isTrialLicense property.
     * 
     */
    public boolean isIsTrialLicense() {
        return isTrialLicense;
    }

    /**
     * Sets the value of the isTrialLicense property.
     * 
     */
    public void setIsTrialLicense(boolean value) {
        this.isTrialLicense = value;
    }

    /**
     * Gets the value of the slc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLC() {
        return slc;
    }

    /**
     * Sets the value of the slc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLC(String value) {
        this.slc = value;
    }

    /**
     * Gets the value of the productSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSku() {
        return productSku;
    }

    /**
     * Sets the value of the productSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSku(String value) {
        this.productSku = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     */
    public boolean isExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     */
    public void setExpires(boolean value) {
        this.expires = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFeatures(ArrayOfString value) {
        this.features = value;
    }

}
