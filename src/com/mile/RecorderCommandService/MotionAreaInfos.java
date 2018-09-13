
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotionAreaInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotionAreaInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resolution" type="{http://videoos.net/2/XProtectCSRecorderCommand}Size"/>
 *         &lt;element name="Areas" type="{http://videoos.net/2/XProtectCSRecorderCommand}ArrayOfMotionAreaInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotionAreaInfos", propOrder = {
    "resolution",
    "areas"
})
public class MotionAreaInfos {

    @XmlElement(name = "Resolution", required = true)
    protected Size resolution;
    @XmlElement(name = "Areas")
    protected ArrayOfMotionAreaInfo areas;

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setResolution(Size value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMotionAreaInfo }
     *     
     */
    public ArrayOfMotionAreaInfo getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMotionAreaInfo }
     *     
     */
    public void setAreas(ArrayOfMotionAreaInfo value) {
        this.areas = value;
    }

}
