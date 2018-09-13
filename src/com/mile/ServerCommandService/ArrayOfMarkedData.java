
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMarkedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMarkedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkedData" type="{http://videoos.net/2/XProtectCSServerCommand}MarkedData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarkedData", propOrder = {
    "markedData"
})
public class ArrayOfMarkedData {

    @XmlElement(name = "MarkedData", nillable = true)
    protected List<MarkedData> markedData;

    /**
     * Gets the value of the markedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkedData }
     * 
     * 
     */
    public List<MarkedData> getMarkedData() {
        if (markedData == null) {
            markedData = new ArrayList<MarkedData>();
        }
        return this.markedData;
    }

}
