
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="OutputGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfOutputGroupInfo" minOccurs="0"/>
 *         &lt;element name="Outputs" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputGroupInfo", propOrder = {
    "outputGroups",
    "outputs"
})
public class OutputGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "OutputGroups")
    protected ArrayOfOutputGroupInfo outputGroups;
    @XmlElement(name = "Outputs")
    protected ArrayOfGuid outputs;

    /**
     * Gets the value of the outputGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutputGroupInfo }
     *     
     */
    public ArrayOfOutputGroupInfo getOutputGroups() {
        return outputGroups;
    }

    /**
     * Sets the value of the outputGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutputGroupInfo }
     *     
     */
    public void setOutputGroups(ArrayOfOutputGroupInfo value) {
        this.outputGroups = value;
    }

    /**
     * Gets the value of the outputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getOutputs() {
        return outputs;
    }

    /**
     * Sets the value of the outputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setOutputs(ArrayOfGuid value) {
        this.outputs = value;
    }

}
