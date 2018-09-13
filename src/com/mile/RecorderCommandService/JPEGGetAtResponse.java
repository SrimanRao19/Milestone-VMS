
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
 *         &lt;element name="JPEGGetAtResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}JPEGData" minOccurs="0"/>
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
    "jpegGetAtResult"
})
@XmlRootElement(name = "JPEGGetAtResponse")
public class JPEGGetAtResponse {

    @XmlElement(name = "JPEGGetAtResult")
    protected JPEGData jpegGetAtResult;

    /**
     * Gets the value of the jpegGetAtResult property.
     * 
     * @return
     *     possible object is
     *     {@link JPEGData }
     *     
     */
    public JPEGData getJPEGGetAtResult() {
        return jpegGetAtResult;
    }

    /**
     * Sets the value of the jpegGetAtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPEGData }
     *     
     */
    public void setJPEGGetAtResult(JPEGData value) {
        this.jpegGetAtResult = value;
    }

}
