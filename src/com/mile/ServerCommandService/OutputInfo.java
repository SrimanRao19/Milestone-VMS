
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}DeviceInfo">
 *       &lt;sequence>
 *         &lt;element name="OutputSecurity" type="{http://videoos.net/2/XProtectCSServerCommand}OutputSecurityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputInfo", propOrder = {
    "outputSecurity"
})
public class OutputInfo
    extends DeviceInfo
{

    @XmlElement(name = "OutputSecurity")
    protected OutputSecurityInfo outputSecurity;

    /**
     * Gets the value of the outputSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link OutputSecurityInfo }
     *     
     */
    public OutputSecurityInfo getOutputSecurity() {
        return outputSecurity;
    }

    /**
     * Sets the value of the outputSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputSecurityInfo }
     *     
     */
    public void setOutputSecurity(OutputSecurityInfo value) {
        this.outputSecurity = value;
    }

}
