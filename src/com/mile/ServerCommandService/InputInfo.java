
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}DeviceInfo">
 *       &lt;sequence>
 *         &lt;element name="InputSecurity" type="{http://videoos.net/2/XProtectCSServerCommand}InputSecurityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputInfo", propOrder = {
    "inputSecurity"
})
public class InputInfo
    extends DeviceInfo
{

    @XmlElement(name = "InputSecurity")
    protected InputSecurityInfo inputSecurity;

    /**
     * Gets the value of the inputSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link InputSecurityInfo }
     *     
     */
    public InputSecurityInfo getInputSecurity() {
        return inputSecurity;
    }

    /**
     * Sets the value of the inputSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputSecurityInfo }
     *     
     */
    public void setInputSecurity(InputSecurityInfo value) {
        this.inputSecurity = value;
    }

}
