
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="CameraGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfCameraGroupInfo" minOccurs="0"/>
 *         &lt;element name="Cameras" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraGroupInfo", propOrder = {
    "cameraGroups",
    "cameras"
})
public class CameraGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "CameraGroups")
    protected ArrayOfCameraGroupInfo cameraGroups;
    @XmlElement(name = "Cameras")
    protected ArrayOfGuid cameras;

    /**
     * Gets the value of the cameraGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraGroupInfo }
     *     
     */
    public ArrayOfCameraGroupInfo getCameraGroups() {
        return cameraGroups;
    }

    /**
     * Sets the value of the cameraGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraGroupInfo }
     *     
     */
    public void setCameraGroups(ArrayOfCameraGroupInfo value) {
        this.cameraGroups = value;
    }

    /**
     * Gets the value of the cameras property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getCameras() {
        return cameras;
    }

    /**
     * Sets the value of the cameras property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setCameras(ArrayOfGuid value) {
        this.cameras = value;
    }

}
