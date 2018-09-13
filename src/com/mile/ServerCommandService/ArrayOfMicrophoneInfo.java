
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMicrophoneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMicrophoneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MicrophoneInfo" type="{http://videoos.net/2/XProtectCSServerCommand}MicrophoneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMicrophoneInfo", propOrder = {
    "microphoneInfo"
})
public class ArrayOfMicrophoneInfo {

    @XmlElement(name = "MicrophoneInfo", nillable = true)
    protected List<MicrophoneInfo> microphoneInfo;

    /**
     * Gets the value of the microphoneInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microphoneInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrophoneInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicrophoneInfo }
     * 
     * 
     */
    public List<MicrophoneInfo> getMicrophoneInfo() {
        if (microphoneInfo == null) {
            microphoneInfo = new ArrayList<MicrophoneInfo>();
        }
        return this.microphoneInfo;
    }

}
