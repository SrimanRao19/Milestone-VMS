
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
 *         &lt;element name="GetViewGroupDataResult" type="{http://videoos.net/2/XProtectCSServerCommand}ViewGroup" minOccurs="0"/>
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
    "getViewGroupDataResult"
})
@XmlRootElement(name = "GetViewGroupDataResponse")
public class GetViewGroupDataResponse {

    @XmlElement(name = "GetViewGroupDataResult")
    protected ViewGroup getViewGroupDataResult;

    /**
     * Gets the value of the getViewGroupDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ViewGroup }
     *     
     */
    public ViewGroup getGetViewGroupDataResult() {
        return getViewGroupDataResult;
    }

    /**
     * Sets the value of the getViewGroupDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewGroup }
     *     
     */
    public void setGetViewGroupDataResult(ViewGroup value) {
        this.getViewGroupDataResult = value;
    }

}
