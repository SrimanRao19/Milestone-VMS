
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAlertTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAlertTypeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertTypeInfo" type="{http://videoos.net/2/XProtectCSServerCommand}AlertTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlertTypeInfo", propOrder = {
    "alertTypeInfo"
})
public class ArrayOfAlertTypeInfo {

    @XmlElement(name = "AlertTypeInfo", nillable = true)
    protected List<AlertTypeInfo> alertTypeInfo;

    /**
     * Gets the value of the alertTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertTypeInfo }
     * 
     * 
     */
    public List<AlertTypeInfo> getAlertTypeInfo() {
        if (alertTypeInfo == null) {
            alertTypeInfo = new ArrayList<AlertTypeInfo>();
        }
        return this.alertTypeInfo;
    }

}
