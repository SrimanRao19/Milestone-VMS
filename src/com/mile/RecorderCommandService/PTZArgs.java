
package com.mile.RecorderCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTZArgs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTZArgs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movement" type="{http://videoos.net/2/XProtectCSRecorderCommand}PTZPairDouble" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="speed" type="{http://videoos.net/2/XProtectCSRecorderCommand}PTZPairDouble" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="automatic" type="{http://videoos.net/2/XProtectCSRecorderCommand}PTZPairBoolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Normalized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZArgs", propOrder = {
    "movement",
    "speed",
    "automatic",
    "normalized"
})
public class PTZArgs {

    protected List<PTZPairDouble> movement;
    protected List<PTZPairDouble> speed;
    protected List<PTZPairBoolean> automatic;
    @XmlElement(name = "Normalized")
    protected boolean normalized;

    /**
     * Gets the value of the movement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPairDouble }
     * 
     * 
     */
    public List<PTZPairDouble> getMovement() {
        if (movement == null) {
            movement = new ArrayList<PTZPairDouble>();
        }
        return this.movement;
    }

    /**
     * Gets the value of the speed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPairDouble }
     * 
     * 
     */
    public List<PTZPairDouble> getSpeed() {
        if (speed == null) {
            speed = new ArrayList<PTZPairDouble>();
        }
        return this.speed;
    }

    /**
     * Gets the value of the automatic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the automatic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomatic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPairBoolean }
     * 
     * 
     */
    public List<PTZPairBoolean> getAutomatic() {
        if (automatic == null) {
            automatic = new ArrayList<PTZPairBoolean>();
        }
        return this.automatic;
    }

    /**
     * Gets the value of the normalized property.
     * 
     */
    public boolean isNormalized() {
        return normalized;
    }

    /**
     * Sets the value of the normalized property.
     * 
     */
    public void setNormalized(boolean value) {
        this.normalized = value;
    }

}
