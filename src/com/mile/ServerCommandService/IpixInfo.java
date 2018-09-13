
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpixInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IpixInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IpixEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Hemisphere" type="{http://videoos.net/2/XProtectCSServerCommand}HemisphereInfo" minOccurs="0"/>
 *         &lt;element name="Homeposition" type="{http://videoos.net/2/XProtectCSServerCommand}PositionInfo" minOccurs="0"/>
 *         &lt;element name="CeilingMounted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpixInfo", propOrder = {
    "ipixEnabled",
    "hemisphere",
    "homeposition",
    "ceilingMounted"
})
public class IpixInfo {

    @XmlElement(name = "IpixEnabled")
    protected boolean ipixEnabled;
    @XmlElement(name = "Hemisphere")
    protected HemisphereInfo hemisphere;
    @XmlElement(name = "Homeposition")
    protected PositionInfo homeposition;
    @XmlElement(name = "CeilingMounted")
    protected boolean ceilingMounted;

    /**
     * Gets the value of the ipixEnabled property.
     * 
     */
    public boolean isIpixEnabled() {
        return ipixEnabled;
    }

    /**
     * Sets the value of the ipixEnabled property.
     * 
     */
    public void setIpixEnabled(boolean value) {
        this.ipixEnabled = value;
    }

    /**
     * Gets the value of the hemisphere property.
     * 
     * @return
     *     possible object is
     *     {@link HemisphereInfo }
     *     
     */
    public HemisphereInfo getHemisphere() {
        return hemisphere;
    }

    /**
     * Sets the value of the hemisphere property.
     * 
     * @param value
     *     allowed object is
     *     {@link HemisphereInfo }
     *     
     */
    public void setHemisphere(HemisphereInfo value) {
        this.hemisphere = value;
    }

    /**
     * Gets the value of the homeposition property.
     * 
     * @return
     *     possible object is
     *     {@link PositionInfo }
     *     
     */
    public PositionInfo getHomeposition() {
        return homeposition;
    }

    /**
     * Sets the value of the homeposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInfo }
     *     
     */
    public void setHomeposition(PositionInfo value) {
        this.homeposition = value;
    }

    /**
     * Gets the value of the ceilingMounted property.
     * 
     */
    public boolean isCeilingMounted() {
        return ceilingMounted;
    }

    /**
     * Sets the value of the ceilingMounted property.
     * 
     */
    public void setCeilingMounted(boolean value) {
        this.ceilingMounted = value;
    }

}
