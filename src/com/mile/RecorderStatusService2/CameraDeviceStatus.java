
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraDeviceStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSRecorderStatus2}MediaStreamDeviceStatusBase">
 *       &lt;sequence>
 *         &lt;element name="Motion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraDeviceStatus", propOrder = {
    "motion"
})
public class CameraDeviceStatus
    extends MediaStreamDeviceStatusBase
{

    @XmlElement(name = "Motion")
    protected boolean motion;

    /**
     * Gets the value of the motion property.
     * 
     */
    public boolean isMotion() {
        return motion;
    }

    /**
     * Sets the value of the motion property.
     * 
     */
    public void setMotion(boolean value) {
        this.motion = value;
    }

}
