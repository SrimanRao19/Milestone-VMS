
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
 *         &lt;element name="JPEGGetAtOrBeforeResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}JPEGData" minOccurs="0"/>
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
    "jpegGetAtOrBeforeResult"
})
@XmlRootElement(name = "JPEGGetAtOrBeforeResponse")
public class JPEGGetAtOrBeforeResponse {

    @XmlElement(name = "JPEGGetAtOrBeforeResult")
    protected JPEGData jpegGetAtOrBeforeResult;

    /**
     * Gets the value of the jpegGetAtOrBeforeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JPEGData }
     *     
     */
    public JPEGData getJPEGGetAtOrBeforeResult() {
        return jpegGetAtOrBeforeResult;
    }

    /**
     * Sets the value of the jpegGetAtOrBeforeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPEGData }
     *     
     */
    public void setJPEGGetAtOrBeforeResult(JPEGData value) {
        this.jpegGetAtOrBeforeResult = value;
    }

}
