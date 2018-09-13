
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ViewGroupInfo" type="{http://videoos.net/2/XProtectCSServerCommand}ViewGroupInfo" minOccurs="0"/>
 *         &lt;element name="ViewGroupData" type="{http://videoos.net/2/XProtectCSServerCommand}ViewGroupData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewGroup", propOrder = {
    "viewGroupInfo",
    "viewGroupData"
})
public class ViewGroup {

    @XmlElement(name = "ViewGroupInfo")
    protected ViewGroupInfo viewGroupInfo;
    @XmlElement(name = "ViewGroupData")
    protected ViewGroupData viewGroupData;

    /**
     * Gets the value of the viewGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ViewGroupInfo }
     *     
     */
    public ViewGroupInfo getViewGroupInfo() {
        return viewGroupInfo;
    }

    /**
     * Sets the value of the viewGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewGroupInfo }
     *     
     */
    public void setViewGroupInfo(ViewGroupInfo value) {
        this.viewGroupInfo = value;
    }

    /**
     * Gets the value of the viewGroupData property.
     * 
     * @return
     *     possible object is
     *     {@link ViewGroupData }
     *     
     */
    public ViewGroupData getViewGroupData() {
        return viewGroupData;
    }

    /**
     * Sets the value of the viewGroupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewGroupData }
     *     
     */
    public void setViewGroupData(ViewGroupData value) {
        this.viewGroupData = value;
    }

}
