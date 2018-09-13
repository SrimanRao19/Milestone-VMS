
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAlertOccurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAlertOccurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertOccurrence" type="{http://videoos.net/2/XProtectCSServerCommand}AlertOccurrence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlertOccurrence", propOrder = {
    "alertOccurrence"
})
public class ArrayOfAlertOccurrence {

    @XmlElement(name = "AlertOccurrence", nillable = true)
    protected List<AlertOccurrence> alertOccurrence;

    /**
     * Gets the value of the alertOccurrence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertOccurrence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertOccurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertOccurrence }
     * 
     * 
     */
    public List<AlertOccurrence> getAlertOccurrence() {
        if (alertOccurrence == null) {
            alertOccurrence = new ArrayList<AlertOccurrence>();
        }
        return this.alertOccurrence;
    }

}
