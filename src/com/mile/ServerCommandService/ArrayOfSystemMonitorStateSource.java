
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSystemMonitorStateSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSystemMonitorStateSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemMonitorStateSource" type="{http://videoos.net/2/XProtectCSServerCommand}SystemMonitorStateSource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSystemMonitorStateSource", propOrder = {
    "systemMonitorStateSource"
})
public class ArrayOfSystemMonitorStateSource {

    @XmlElement(name = "SystemMonitorStateSource", nillable = true)
    protected List<SystemMonitorStateSource> systemMonitorStateSource;

    /**
     * Gets the value of the systemMonitorStateSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemMonitorStateSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemMonitorStateSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemMonitorStateSource }
     * 
     * 
     */
    public List<SystemMonitorStateSource> getSystemMonitorStateSource() {
        if (systemMonitorStateSource == null) {
            systemMonitorStateSource = new ArrayList<SystemMonitorStateSource>();
        }
        return this.systemMonitorStateSource;
    }

}
