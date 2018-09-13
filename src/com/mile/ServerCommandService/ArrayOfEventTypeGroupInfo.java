
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEventTypeGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventTypeGroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTypeGroupInfo" type="{http://videoos.net/2/XProtectCSServerCommand}EventTypeGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventTypeGroupInfo", propOrder = {
    "eventTypeGroupInfo"
})
public class ArrayOfEventTypeGroupInfo {

    @XmlElement(name = "EventTypeGroupInfo", nillable = true)
    protected List<EventTypeGroupInfo> eventTypeGroupInfo;

    /**
     * Gets the value of the eventTypeGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTypeGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeGroupInfo }
     * 
     * 
     */
    public List<EventTypeGroupInfo> getEventTypeGroupInfo() {
        if (eventTypeGroupInfo == null) {
            eventTypeGroupInfo = new ArrayList<EventTypeGroupInfo>();
        }
        return this.eventTypeGroupInfo;
    }

}
