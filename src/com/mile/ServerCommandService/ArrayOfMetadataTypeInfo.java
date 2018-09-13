
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMetadataTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMetadataTypeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetadataTypeInfo" type="{http://videoos.net/2/XProtectCSServerCommand}MetadataTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMetadataTypeInfo", propOrder = {
    "metadataTypeInfo"
})
public class ArrayOfMetadataTypeInfo {

    @XmlElement(name = "MetadataTypeInfo", nillable = true)
    protected List<MetadataTypeInfo> metadataTypeInfo;

    /**
     * Gets the value of the metadataTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataTypeInfo }
     * 
     * 
     */
    public List<MetadataTypeInfo> getMetadataTypeInfo() {
        if (metadataTypeInfo == null) {
            metadataTypeInfo = new ArrayList<MetadataTypeInfo>();
        }
        return this.metadataTypeInfo;
    }

}
