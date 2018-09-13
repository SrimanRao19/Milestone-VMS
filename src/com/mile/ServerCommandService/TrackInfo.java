
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Edge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackInfo", propOrder = {
    "trackId",
    "edge"
})
public class TrackInfo {

    @XmlElement(name = "TrackId", required = true)
    protected String trackId;
    @XmlElement(name = "Edge")
    protected boolean edge;

    /**
     * Gets the value of the trackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackId(String value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the edge property.
     * 
     */
    public boolean isEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     */
    public void setEdge(boolean value) {
        this.edge = value;
    }

}
