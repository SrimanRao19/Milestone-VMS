
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SmartSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MotionMask" type="{http://videoos.net/2/XProtectCSRecorderCommand}ImageMask" minOccurs="0"/>
 *         &lt;element name="MotionAreas" type="{http://videoos.net/2/XProtectCSRecorderCommand}MotionAreaInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartSearchResult", propOrder = {
    "imageTime",
    "motionMask",
    "motionAreas"
})
public class SmartSearchResult {

    @XmlElement(name = "ImageTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar imageTime;
    @XmlElement(name = "MotionMask")
    protected ImageMask motionMask;
    @XmlElement(name = "MotionAreas")
    protected MotionAreaInfos motionAreas;

    /**
     * Gets the value of the imageTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImageTime() {
        return imageTime;
    }

    /**
     * Sets the value of the imageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImageTime(XMLGregorianCalendar value) {
        this.imageTime = value;
    }

    /**
     * Gets the value of the motionMask property.
     * 
     * @return
     *     possible object is
     *     {@link ImageMask }
     *     
     */
    public ImageMask getMotionMask() {
        return motionMask;
    }

    /**
     * Sets the value of the motionMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageMask }
     *     
     */
    public void setMotionMask(ImageMask value) {
        this.motionMask = value;
    }

    /**
     * Gets the value of the motionAreas property.
     * 
     * @return
     *     possible object is
     *     {@link MotionAreaInfos }
     *     
     */
    public MotionAreaInfos getMotionAreas() {
        return motionAreas;
    }

    /**
     * Sets the value of the motionAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotionAreaInfos }
     *     
     */
    public void setMotionAreas(MotionAreaInfos value) {
        this.motionAreas = value;
    }

}
