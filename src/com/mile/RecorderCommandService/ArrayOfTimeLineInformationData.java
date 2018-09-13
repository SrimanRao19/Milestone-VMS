
package com.mile.RecorderCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimeLineInformationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimeLineInformationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeLineInformationData" type="{http://videoos.net/2/XProtectCSRecorderCommand}TimeLineInformationData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimeLineInformationData", propOrder = {
    "timeLineInformationData"
})
public class ArrayOfTimeLineInformationData {

    @XmlElement(name = "TimeLineInformationData", nillable = true)
    protected List<TimeLineInformationData> timeLineInformationData;

    /**
     * Gets the value of the timeLineInformationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLineInformationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLineInformationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeLineInformationData }
     * 
     * 
     */
    public List<TimeLineInformationData> getTimeLineInformationData() {
        if (timeLineInformationData == null) {
            timeLineInformationData = new ArrayList<TimeLineInformationData>();
        }
        return this.timeLineInformationData;
    }

}
