
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viewGroupId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="viewGroupdata" type="{http://videoos.net/2/XProtectCSServerCommand}ViewGroupData" minOccurs="0"/>
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
    "token",
    "viewGroupId",
    "viewGroupdata"
})
@XmlRootElement(name = "SetViewGroupData")
public class SetViewGroupData {

    protected String token;
    @XmlElement(required = true)
    protected String viewGroupId;
    protected ViewGroupData viewGroupdata;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the viewGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewGroupId() {
        return viewGroupId;
    }

    /**
     * Sets the value of the viewGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewGroupId(String value) {
        this.viewGroupId = value;
    }

    /**
     * Gets the value of the viewGroupdata property.
     * 
     * @return
     *     possible object is
     *     {@link ViewGroupData }
     *     
     */
    public ViewGroupData getViewGroupdata() {
        return viewGroupdata;
    }

    /**
     * Sets the value of the viewGroupdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewGroupData }
     *     
     */
    public void setViewGroupdata(ViewGroupData value) {
        this.viewGroupdata = value;
    }

}
