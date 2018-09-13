
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAlertTypeGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAlertTypeGroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertTypeGroupInfo" type="{http://videoos.net/2/XProtectCSServerCommand}AlertTypeGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlertTypeGroupInfo", propOrder = {
    "alertTypeGroupInfo"
})
public class ArrayOfAlertTypeGroupInfo {

    @XmlElement(name = "AlertTypeGroupInfo", nillable = true)
    protected List<AlertTypeGroupInfo> alertTypeGroupInfo;

    /**
     * Gets the value of the alertTypeGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertTypeGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertTypeGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertTypeGroupInfo }
     * 
     * 
     */
    public List<AlertTypeGroupInfo> getAlertTypeGroupInfo() {
        if (alertTypeGroupInfo == null) {
            alertTypeGroupInfo = new ArrayList<AlertTypeGroupInfo>();
        }
        return this.alertTypeGroupInfo;
    }

}
