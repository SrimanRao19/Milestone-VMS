
package com.mile.RecorderCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLiveStreamSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLiveStreamSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LiveStreamSetting" type="{http://videoos.net/2/XProtectCSRecorderCommand}LiveStreamSetting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLiveStreamSetting", propOrder = {
    "liveStreamSetting"
})
public class ArrayOfLiveStreamSetting {

    @XmlElement(name = "LiveStreamSetting", nillable = true)
    protected List<LiveStreamSetting> liveStreamSetting;

    /**
     * Gets the value of the liveStreamSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liveStreamSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiveStreamSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiveStreamSetting }
     * 
     * 
     */
    public List<LiveStreamSetting> getLiveStreamSetting() {
        if (liveStreamSetting == null) {
            liveStreamSetting = new ArrayList<LiveStreamSetting>();
        }
        return this.liveStreamSetting;
    }

}
