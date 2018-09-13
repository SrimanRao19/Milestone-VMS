
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
 *         &lt;element name="MarkedDataDeleteResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfMarkedDataResult" minOccurs="0"/>
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
    "markedDataDeleteResult"
})
@XmlRootElement(name = "MarkedDataDeleteResponse")
public class MarkedDataDeleteResponse {

    @XmlElement(name = "MarkedDataDeleteResult")
    protected ArrayOfMarkedDataResult markedDataDeleteResult;

    /**
     * Gets the value of the markedDataDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarkedDataResult }
     *     
     */
    public ArrayOfMarkedDataResult getMarkedDataDeleteResult() {
        return markedDataDeleteResult;
    }

    /**
     * Sets the value of the markedDataDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarkedDataResult }
     *     
     */
    public void setMarkedDataDeleteResult(ArrayOfMarkedDataResult value) {
        this.markedDataDeleteResult = value;
    }

}
