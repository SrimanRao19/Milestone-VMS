
package com.mile.ServerCommandService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBookmark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookmark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bookmark" type="{http://videoos.net/2/XProtectCSServerCommand}Bookmark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBookmark", propOrder = {
    "bookmark"
})
public class ArrayOfBookmark {

    @XmlElement(name = "Bookmark", nillable = true)
    protected List<Bookmark> bookmark;

    /**
     * Gets the value of the bookmark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookmark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookmark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bookmark }
     * 
     * 
     */
    public List<Bookmark> getBookmark() {
        if (bookmark == null) {
            bookmark = new ArrayList<Bookmark>();
        }
        return this.bookmark;
    }

}
