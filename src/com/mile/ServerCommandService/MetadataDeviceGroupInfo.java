
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataDeviceGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataDeviceGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="MetadataDeviceGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMetadataDeviceGroupInfo" minOccurs="0"/>
 *         &lt;element name="MetadataDevices" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataDeviceGroupInfo", propOrder = {
    "metadataDeviceGroups",
    "metadataDevices"
})
public class MetadataDeviceGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "MetadataDeviceGroups")
    protected ArrayOfMetadataDeviceGroupInfo metadataDeviceGroups;
    @XmlElement(name = "MetadataDevices")
    protected ArrayOfGuid metadataDevices;

    /**
     * Gets the value of the metadataDeviceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetadataDeviceGroupInfo }
     *     
     */
    public ArrayOfMetadataDeviceGroupInfo getMetadataDeviceGroups() {
        return metadataDeviceGroups;
    }

    /**
     * Sets the value of the metadataDeviceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetadataDeviceGroupInfo }
     *     
     */
    public void setMetadataDeviceGroups(ArrayOfMetadataDeviceGroupInfo value) {
        this.metadataDeviceGroups = value;
    }

    /**
     * Gets the value of the metadataDevices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getMetadataDevices() {
        return metadataDevices;
    }

    /**
     * Sets the value of the metadataDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setMetadataDevices(ArrayOfGuid value) {
        this.metadataDevices = value;
    }

}
