
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertTypeGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertTypeGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSServerCommand}GroupInfo">
 *       &lt;sequence>
 *         &lt;element name="AlertTypeGroups" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfAlertTypeGroupInfo" minOccurs="0"/>
 *         &lt;element name="AlertTypes" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertTypeGroupInfo", propOrder = {
    "alertTypeGroups",
    "alertTypes"
})
public class AlertTypeGroupInfo
    extends GroupInfo
{

    @XmlElement(name = "AlertTypeGroups")
    protected ArrayOfAlertTypeGroupInfo alertTypeGroups;
    @XmlElement(name = "AlertTypes")
    protected ArrayOfGuid alertTypes;

    /**
     * Gets the value of the alertTypeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlertTypeGroupInfo }
     *     
     */
    public ArrayOfAlertTypeGroupInfo getAlertTypeGroups() {
        return alertTypeGroups;
    }

    /**
     * Sets the value of the alertTypeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertTypeGroupInfo }
     *     
     */
    public void setAlertTypeGroups(ArrayOfAlertTypeGroupInfo value) {
        this.alertTypeGroups = value;
    }

    /**
     * Gets the value of the alertTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getAlertTypes() {
        return alertTypes;
    }

    /**
     * Sets the value of the alertTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setAlertTypes(ArrayOfGuid value) {
        this.alertTypes = value;
    }

}
