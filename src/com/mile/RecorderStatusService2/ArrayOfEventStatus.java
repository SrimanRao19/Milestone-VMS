
package com.mile.RecorderStatusService2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventStatus" type="{http://videoos.net/2/XProtectCSRecorderStatus2}EventStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventStatus", propOrder = {
    "eventStatus"
})
public class ArrayOfEventStatus {

    @XmlElement(name = "EventStatus", nillable = true)
    protected List<EventStatus> eventStatus;

    /**
     * Gets the value of the eventStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventStatus }
     * 
     * 
     */
    public List<EventStatus> getEventStatus() {
        if (eventStatus == null) {
            eventStatus = new ArrayList<EventStatus>();
        }
        return this.eventStatus;
    }

}
