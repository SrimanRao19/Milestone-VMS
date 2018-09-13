
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
 *         &lt;element name="GetProductInfoResult" type="{http://videoos.net/2/XProtectCSServerCommand}ProductInfo" minOccurs="0"/>
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
    "getProductInfoResult"
})
@XmlRootElement(name = "GetProductInfoResponse")
public class GetProductInfoResponse {

    @XmlElement(name = "GetProductInfoResult")
    protected ProductInfo getProductInfoResult;

    /**
     * Gets the value of the getProductInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfo }
     *     
     */
    public ProductInfo getGetProductInfoResult() {
        return getProductInfoResult;
    }

    /**
     * Sets the value of the getProductInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfo }
     *     
     */
    public void setGetProductInfoResult(ProductInfo value) {
        this.getProductInfoResult = value;
    }

}
