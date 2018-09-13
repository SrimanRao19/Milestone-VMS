
package com.mile.RecorderCommandService;

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
 *         &lt;element name="TimeLineInformationGetResult" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfTimeLineInformationData" minOccurs="0"/>
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
    "timeLineInformationGetResult"
})
@XmlRootElement(name = "TimeLineInformationGetResponse")
public class TimeLineInformationGetResponse {

    @XmlElement(name = "TimeLineInformationGetResult")
    protected ArrayOfTimeLineInformationData timeLineInformationGetResult;

    /**
     * Gets the value of the timeLineInformationGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeLineInformationData }
     *     
     */
    public ArrayOfTimeLineInformationData getTimeLineInformationGetResult() {
        return timeLineInformationGetResult;
    }

    /**
     * Sets the value of the timeLineInformationGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeLineInformationData }
     *     
     */
    public void setTimeLineInformationGetResult(ArrayOfTimeLineInformationData value) {
        this.timeLineInformationGetResult = value;
    }

}
