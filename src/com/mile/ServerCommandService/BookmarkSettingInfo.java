
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookmarkSettingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookmarkSettingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultPreTimeSec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DefaultPostTimeSec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookmarkSettingInfo", propOrder = {
    "defaultPreTimeSec",
    "defaultPostTimeSec"
})
public class BookmarkSettingInfo {

    @XmlElement(name = "DefaultPreTimeSec")
    protected int defaultPreTimeSec;
    @XmlElement(name = "DefaultPostTimeSec")
    protected int defaultPostTimeSec;

    /**
     * Gets the value of the defaultPreTimeSec property.
     * 
     */
    public int getDefaultPreTimeSec() {
        return defaultPreTimeSec;
    }

    /**
     * Sets the value of the defaultPreTimeSec property.
     * 
     */
    public void setDefaultPreTimeSec(int value) {
        this.defaultPreTimeSec = value;
    }

    /**
     * Gets the value of the defaultPostTimeSec property.
     * 
     */
    public int getDefaultPostTimeSec() {
        return defaultPostTimeSec;
    }

    /**
     * Sets the value of the defaultPostTimeSec property.
     * 
     */
    public void setDefaultPostTimeSec(int value) {
        this.defaultPostTimeSec = value;
    }

}
