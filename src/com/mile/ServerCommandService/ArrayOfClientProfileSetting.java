
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClientProfileSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientProfileSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientProfileSetting" type="{http://videoos.net/2/XProtectCSServerCommand}ClientProfileSetting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientProfileSetting", propOrder = {
    "clientProfileSetting"
})
public class ArrayOfClientProfileSetting {

    @XmlElement(name = "ClientProfileSetting", nillable = true)
    protected List<ClientProfileSetting> clientProfileSetting;

    /**
     * Gets the value of the clientProfileSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientProfileSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientProfileSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientProfileSetting }
     * 
     * 
     */
    public List<ClientProfileSetting> getClientProfileSetting() {
        if (clientProfileSetting == null) {
            clientProfileSetting = new ArrayList<ClientProfileSetting>();
        }
        return this.clientProfileSetting;
    }

}
