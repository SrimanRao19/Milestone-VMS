
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStorageStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStorageStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StorageStatus" type="{http://videoos.net/2/XProtectCSRecorderStatus2}StorageStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageStatus", propOrder = {
    "storageStatus"
})
public class ArrayOfStorageStatus {

    @XmlElement(name = "StorageStatus", nillable = true)
    protected List<StorageStatus> storageStatus;

    /**
     * Gets the value of the storageStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StorageStatus }
     * 
     * 
     */
    public List<StorageStatus> getStorageStatus() {
        if (storageStatus == null) {
            storageStatus = new ArrayList<StorageStatus>();
        }
        return this.storageStatus;
    }

}
