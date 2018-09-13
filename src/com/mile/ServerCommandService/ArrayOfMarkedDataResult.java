
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMarkedDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMarkedDataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkedDataResult" type="{http://videoos.net/2/XProtectCSServerCommand}MarkedDataResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarkedDataResult", propOrder = {
    "markedDataResult"
})
public class ArrayOfMarkedDataResult {

    @XmlElement(name = "MarkedDataResult", nillable = true)
    protected List<MarkedDataResult> markedDataResult;

    /**
     * Gets the value of the markedDataResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markedDataResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkedDataResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkedDataResult }
     * 
     * 
     */
    public List<MarkedDataResult> getMarkedDataResult() {
        if (markedDataResult == null) {
            markedDataResult = new ArrayList<MarkedDataResult>();
        }
        return this.markedDataResult;
    }

}
