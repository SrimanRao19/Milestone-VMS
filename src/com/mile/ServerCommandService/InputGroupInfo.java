
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="InputGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfInputGroupInfo" minOccurs="0"/>
 *         &lt;element name="Inputs" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputGroupInfo", propOrder = {
    "inputGroups",
    "inputs"
})
public class InputGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "InputGroups")
    protected ArrayOfInputGroupInfo inputGroups;
    @XmlElement(name = "Inputs")
    protected ArrayOfGuid inputs;

    /**
     * Gets the value of the inputGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInputGroupInfo }
     *     
     */
    public ArrayOfInputGroupInfo getInputGroups() {
        return inputGroups;
    }

    /**
     * Sets the value of the inputGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInputGroupInfo }
     *     
     */
    public void setInputGroups(ArrayOfInputGroupInfo value) {
        this.inputGroups = value;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getInputs() {
        return inputs;
    }

    /**
     * Sets the value of the inputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setInputs(ArrayOfGuid value) {
        this.inputs = value;
    }

}
