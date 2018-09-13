
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeDuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MicroSeconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDuration", propOrder = {
    "microSeconds"
})
public class TimeDuration {

    @XmlElement(name = "MicroSeconds")
    protected long microSeconds;

    /**
     * Gets the value of the microSeconds property.
     * 
     */
    public long getMicroSeconds() {
        return microSeconds;
    }

    /**
     * Sets the value of the microSeconds property.
     * 
     */
    public void setMicroSeconds(long value) {
        this.microSeconds = value;
    }

}
