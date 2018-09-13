
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
 *         &lt;element name="GetSystemLicenseInfoResult" type="{http://videoos.net/2/XProtectCSServerCommand}SystemLicenseInfo" minOccurs="0"/>
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
    "getSystemLicenseInfoResult"
})
@XmlRootElement(name = "GetSystemLicenseInfoResponse")
public class GetSystemLicenseInfoResponse {

    @XmlElement(name = "GetSystemLicenseInfoResult")
    protected SystemLicenseInfo getSystemLicenseInfoResult;

    /**
     * Gets the value of the getSystemLicenseInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link SystemLicenseInfo }
     *     
     */
    public SystemLicenseInfo getGetSystemLicenseInfoResult() {
        return getSystemLicenseInfoResult;
    }

    /**
     * Sets the value of the getSystemLicenseInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLicenseInfo }
     *     
     */
    public void setGetSystemLicenseInfoResult(SystemLicenseInfo value) {
        this.getSystemLicenseInfoResult = value;
    }

}
