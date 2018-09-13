
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
 *         &lt;element name="GetViewGroupsResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfViewGroupInfo" minOccurs="0"/>
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
    "getViewGroupsResult"
})
@XmlRootElement(name = "GetViewGroupsResponse")
public class GetViewGroupsResponse {

    @XmlElement(name = "GetViewGroupsResult")
    protected ArrayOfViewGroupInfo getViewGroupsResult;

    /**
     * Gets the value of the getViewGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfViewGroupInfo }
     *     
     */
    public ArrayOfViewGroupInfo getGetViewGroupsResult() {
        return getViewGroupsResult;
    }

    /**
     * Sets the value of the getViewGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfViewGroupInfo }
     *     
     */
    public void setGetViewGroupsResult(ArrayOfViewGroupInfo value) {
        this.getViewGroupsResult = value;
    }

}
