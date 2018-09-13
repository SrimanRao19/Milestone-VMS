
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MicrophoneGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MicrophoneGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="MicrophoneGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMicrophoneGroupInfo" minOccurs="0"/>
 *         &lt;element name="Microphones" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicrophoneGroupInfo", propOrder = {
    "microphoneGroups",
    "microphones"
})
public class MicrophoneGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "MicrophoneGroups")
    protected ArrayOfMicrophoneGroupInfo microphoneGroups;
    @XmlElement(name = "Microphones")
    protected ArrayOfGuid microphones;

    /**
     * Gets the value of the microphoneGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMicrophoneGroupInfo }
     *     
     */
    public ArrayOfMicrophoneGroupInfo getMicrophoneGroups() {
        return microphoneGroups;
    }

    /**
     * Sets the value of the microphoneGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMicrophoneGroupInfo }
     *     
     */
    public void setMicrophoneGroups(ArrayOfMicrophoneGroupInfo value) {
        this.microphoneGroups = value;
    }

    /**
     * Gets the value of the microphones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getMicrophones() {
        return microphones;
    }

    /**
     * Sets the value of the microphones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setMicrophones(ArrayOfGuid value) {
        this.microphones = value;
    }

}
