
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
 *         &lt;element name="QuerySystemMonitorStateSourcesByIdsResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfSystemMonitorStateSource" minOccurs="0"/>
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
    "querySystemMonitorStateSourcesByIdsResult"
})
@XmlRootElement(name = "QuerySystemMonitorStateSourcesByIdsResponse")
public class QuerySystemMonitorStateSourcesByIdsResponse {

    @XmlElement(name = "QuerySystemMonitorStateSourcesByIdsResult")
    protected ArrayOfSystemMonitorStateSource querySystemMonitorStateSourcesByIdsResult;

    /**
     * Gets the value of the querySystemMonitorStateSourcesByIdsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSystemMonitorStateSource }
     *     
     */
    public ArrayOfSystemMonitorStateSource getQuerySystemMonitorStateSourcesByIdsResult() {
        return querySystemMonitorStateSourcesByIdsResult;
    }

    /**
     * Sets the value of the querySystemMonitorStateSourcesByIdsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSystemMonitorStateSource }
     *     
     */
    public void setQuerySystemMonitorStateSourcesByIdsResult(ArrayOfSystemMonitorStateSource value) {
        this.querySystemMonitorStateSourcesByIdsResult = value;
    }

}
