
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeviceDisabledInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeviceDisabledInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceDisabledInfo" type="{http://videoos.net/2/XProtectCSServerCommand}DeviceDisabledInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeviceDisabledInfo", propOrder = {
    "deviceDisabledInfo"
})
public class ArrayOfDeviceDisabledInfo {

    @XmlElement(name = "DeviceDisabledInfo", nillable = true)
    protected List<DeviceDisabledInfo> deviceDisabledInfo;

    /**
     * Gets the value of the deviceDisabledInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceDisabledInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceDisabledInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceDisabledInfo }
     * 
     * 
     */
    public List<DeviceDisabledInfo> getDeviceDisabledInfo() {
        if (deviceDisabledInfo == null) {
            deviceDisabledInfo = new ArrayList<DeviceDisabledInfo>();
        }
        return this.deviceDisabledInfo;
    }

}
