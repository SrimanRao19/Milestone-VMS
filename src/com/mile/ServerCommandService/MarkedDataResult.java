
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkedDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkedDataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkedData" type="{http://videoos.net/2/XProtectCSServerCommand}MarkedData" minOccurs="0"/>
 *         &lt;element name="FaultDevices" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfFaultDevice" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://videoos.net/2/XProtectCSServerCommand}ResultStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkedDataResult", propOrder = {
    "markedData",
    "faultDevices",
    "status"
})
public class MarkedDataResult {

    @XmlElement(name = "MarkedData")
    protected MarkedData markedData;
    @XmlElement(name = "FaultDevices")
    protected ArrayOfFaultDevice faultDevices;
    @XmlElement(name = "Status", required = true)
    protected ResultStatus status;

    /**
     * Gets the value of the markedData property.
     * 
     * @return
     *     possible object is
     *     {@link MarkedData }
     *     
     */
    public MarkedData getMarkedData() {
        return markedData;
    }

    /**
     * Sets the value of the markedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkedData }
     *     
     */
    public void setMarkedData(MarkedData value) {
        this.markedData = value;
    }

    /**
     * Gets the value of the faultDevices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFaultDevice }
     *     
     */
    public ArrayOfFaultDevice getFaultDevices() {
        return faultDevices;
    }

    /**
     * Sets the value of the faultDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFaultDevice }
     *     
     */
    public void setFaultDevices(ArrayOfFaultDevice value) {
        this.faultDevices = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     */
    public void setStatus(ResultStatus value) {
        this.status = value;
    }

}
