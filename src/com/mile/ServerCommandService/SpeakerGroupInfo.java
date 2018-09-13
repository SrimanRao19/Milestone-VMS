
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeakerGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeakerGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="SpeakerGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfSpeakerGroupInfo" minOccurs="0"/>
 *         &lt;element name="Speakers" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeakerGroupInfo", propOrder = {
    "speakerGroups",
    "speakers"
})
public class SpeakerGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "SpeakerGroups")
    protected ArrayOfSpeakerGroupInfo speakerGroups;
    @XmlElement(name = "Speakers")
    protected ArrayOfGuid speakers;

    /**
     * Gets the value of the speakerGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpeakerGroupInfo }
     *     
     */
    public ArrayOfSpeakerGroupInfo getSpeakerGroups() {
        return speakerGroups;
    }

    /**
     * Sets the value of the speakerGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpeakerGroupInfo }
     *     
     */
    public void setSpeakerGroups(ArrayOfSpeakerGroupInfo value) {
        this.speakerGroups = value;
    }

    /**
     * Gets the value of the speakers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getSpeakers() {
        return speakers;
    }

    /**
     * Sets the value of the speakers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setSpeakers(ArrayOfGuid value) {
        this.speakers = value;
    }

}
