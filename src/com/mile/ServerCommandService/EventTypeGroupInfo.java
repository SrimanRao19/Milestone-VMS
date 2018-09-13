
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTypeGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTypeGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="EventTypeGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfEventTypeGroupInfo" minOccurs="0"/>
 *         &lt;element name="EventTypes" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTypeGroupInfo", propOrder = {
    "eventTypeGroups",
    "eventTypes"
})
public class EventTypeGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "EventTypeGroups")
    protected ArrayOfEventTypeGroupInfo eventTypeGroups;
    @XmlElement(name = "EventTypes")
    protected ArrayOfGuid eventTypes;

    /**
     * Gets the value of the eventTypeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventTypeGroupInfo }
     *     
     */
    public ArrayOfEventTypeGroupInfo getEventTypeGroups() {
        return eventTypeGroups;
    }

    /**
     * Sets the value of the eventTypeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventTypeGroupInfo }
     *     
     */
    public void setEventTypeGroups(ArrayOfEventTypeGroupInfo value) {
        this.eventTypeGroups = value;
    }

    /**
     * Gets the value of the eventTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getEventTypes() {
        return eventTypes;
    }

    /**
     * Sets the value of the eventTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setEventTypes(ArrayOfGuid value) {
        this.eventTypes = value;
    }

}
