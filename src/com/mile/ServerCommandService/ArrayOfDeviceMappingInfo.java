
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeviceMappingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeviceMappingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceMappingInfo" type="{http://videoos.net/2/XProtectCSServerCommand}DeviceMappingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeviceMappingInfo", propOrder = {
    "deviceMappingInfo"
})
public class ArrayOfDeviceMappingInfo {

    @XmlElement(name = "DeviceMappingInfo", nillable = true)
    protected List<DeviceMappingInfo> deviceMappingInfo;

    /**
     * Gets the value of the deviceMappingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceMappingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceMappingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMappingInfo }
     * 
     * 
     */
    public List<DeviceMappingInfo> getDeviceMappingInfo() {
        if (deviceMappingInfo == null) {
            deviceMappingInfo = new ArrayList<DeviceMappingInfo>();
        }
        return this.deviceMappingInfo;
    }

}
