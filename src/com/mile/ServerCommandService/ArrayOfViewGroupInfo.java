
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfViewGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfViewGroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ViewGroupInfo" type="{http://videoos.net/2/XProtectCSServerCommand}ViewGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfViewGroupInfo", propOrder = {
    "viewGroupInfo"
})
public class ArrayOfViewGroupInfo {

    @XmlElement(name = "ViewGroupInfo", nillable = true)
    protected List<ViewGroupInfo> viewGroupInfo;

    /**
     * Gets the value of the viewGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewGroupInfo }
     * 
     * 
     */
    public List<ViewGroupInfo> getViewGroupInfo() {
        if (viewGroupInfo == null) {
            viewGroupInfo = new ArrayList<ViewGroupInfo>();
        }
        return this.viewGroupInfo;
    }

}
