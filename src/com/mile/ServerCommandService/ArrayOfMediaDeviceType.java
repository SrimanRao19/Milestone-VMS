
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMediaDeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMediaDeviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaDeviceType" type="{http://videoos.net/2/XProtectCSServerCommand}MediaDeviceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMediaDeviceType", propOrder = {
    "mediaDeviceType"
})
public class ArrayOfMediaDeviceType {

    @XmlElement(name = "MediaDeviceType")
    protected List<MediaDeviceType> mediaDeviceType;

    /**
     * Gets the value of the mediaDeviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaDeviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaDeviceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaDeviceType }
     * 
     * 
     */
    public List<MediaDeviceType> getMediaDeviceType() {
        if (mediaDeviceType == null) {
            mediaDeviceType = new ArrayList<MediaDeviceType>();
        }
        return this.mediaDeviceType;
    }

}
