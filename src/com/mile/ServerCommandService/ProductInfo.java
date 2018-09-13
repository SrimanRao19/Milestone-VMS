
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductLine" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="VendorId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="SubProduct" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuildConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuildNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuildDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfo", propOrder = {
    "productName",
    "productLine",
    "vendorId",
    "subProduct",
    "majorVersion",
    "minorVersion",
    "serviceVersion",
    "buildConfiguration",
    "buildNumber",
    "buildDate"
})
public class ProductInfo {

    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductLine", required = true)
    protected String productLine;
    @XmlElement(name = "VendorId", required = true)
    protected String vendorId;
    @XmlElement(name = "SubProduct", required = true)
    protected String subProduct;
    @XmlElement(name = "MajorVersion")
    protected String majorVersion;
    @XmlElement(name = "MinorVersion")
    protected String minorVersion;
    @XmlElement(name = "ServiceVersion")
    protected String serviceVersion;
    @XmlElement(name = "BuildConfiguration")
    protected String buildConfiguration;
    @XmlElement(name = "BuildNumber")
    protected String buildNumber;
    @XmlElement(name = "BuildDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buildDate;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLine(String value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the subProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProduct() {
        return subProduct;
    }

    /**
     * Sets the value of the subProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProduct(String value) {
        this.subProduct = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorVersion(String value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorVersion(String value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of the serviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVersion(String value) {
        this.serviceVersion = value;
    }

    /**
     * Gets the value of the buildConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildConfiguration() {
        return buildConfiguration;
    }

    /**
     * Sets the value of the buildConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildConfiguration(String value) {
        this.buildConfiguration = value;
    }

    /**
     * Gets the value of the buildNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
     * Sets the value of the buildNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildNumber(String value) {
        this.buildNumber = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildDate(XMLGregorianCalendar value) {
        this.buildDate = value;
    }

}
