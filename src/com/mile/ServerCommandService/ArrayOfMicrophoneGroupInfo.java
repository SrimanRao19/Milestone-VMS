
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMicrophoneGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMicrophoneGroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MicrophoneGroupInfo" type="{http://videoos.net/2/XProtectCSServerCommand}MicrophoneGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMicrophoneGroupInfo", propOrder = {
    "microphoneGroupInfo"
})
public class ArrayOfMicrophoneGroupInfo {

    @XmlElement(name = "MicrophoneGroupInfo", nillable = true)
    protected List<MicrophoneGroupInfo> microphoneGroupInfo;

    /**
     * Gets the value of the microphoneGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microphoneGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrophoneGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicrophoneGroupInfo }
     * 
     * 
     */
    public List<MicrophoneGroupInfo> getMicrophoneGroupInfo() {
        if (microphoneGroupInfo == null) {
            microphoneGroupInfo = new ArrayList<MicrophoneGroupInfo>();
        }
        return this.microphoneGroupInfo;
    }

}
