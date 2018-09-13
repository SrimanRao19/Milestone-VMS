
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetViewGroupDataResult" type="{http://videoos.net/2/XProtectCSServerCommand}SetViewGroupDataResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setViewGroupDataResult"
})
@XmlRootElement(name = "SetViewGroupDataResponse")
public class SetViewGroupDataResponse {

    @XmlElement(name = "SetViewGroupDataResult", required = true)
    protected SetViewGroupDataResultType setViewGroupDataResult;

    /**
     * Gets the value of the setViewGroupDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetViewGroupDataResultType }
     *     
     */
    public SetViewGroupDataResultType getSetViewGroupDataResult() {
        return setViewGroupDataResult;
    }

    /**
     * Sets the value of the setViewGroupDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetViewGroupDataResultType }
     *     
     */
    public void setSetViewGroupDataResult(SetViewGroupDataResultType value) {
        this.setViewGroupDataResult = value;
    }

}
