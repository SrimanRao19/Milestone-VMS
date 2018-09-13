
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
 *         &lt;element name="QueryRecorderInfoResult" type="{http://videoos.net/2/XProtectCSServerCommand}RecorderInfo" minOccurs="0"/>
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
    "queryRecorderInfoResult"
})
@XmlRootElement(name = "QueryRecorderInfoResponse")
public class QueryRecorderInfoResponse {

    @XmlElement(name = "QueryRecorderInfoResult")
    protected RecorderInfo queryRecorderInfoResult;

    /**
     * Gets the value of the queryRecorderInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecorderInfo }
     *     
     */
    public RecorderInfo getQueryRecorderInfoResult() {
        return queryRecorderInfoResult;
    }

    /**
     * Sets the value of the queryRecorderInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecorderInfo }
     *     
     */
    public void setQueryRecorderInfoResult(RecorderInfo value) {
        this.queryRecorderInfoResult = value;
    }

}
