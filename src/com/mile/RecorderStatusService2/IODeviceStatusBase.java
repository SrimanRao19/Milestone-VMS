
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IODeviceStatusBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IODeviceStatusBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSRecorderStatus2}DeviceStatusBase">
 *       &lt;sequence>
 *         &lt;element name="State" type="{http://videoos.net/2/XProtectCSRecorderStatus2}IOState"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IODeviceStatusBase", propOrder = {
    "state"
})
@XmlSeeAlso({
    OutputDeviceStatus.class,
    InputDeviceStatus.class
})
public class IODeviceStatusBase
    extends DeviceStatusBase
{

    @XmlElement(name = "State", required = true)
    protected IOState state;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link IOState }
     *     
     */
    public IOState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOState }
     *     
     */
    public void setState(IOState value) {
        this.state = value;
    }

}
