
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookmarkGetResult" type="{http://videoos.net/2/XProtectCSServerCommand}Bookmark" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookmarkGetResult"
})
@XmlRootElement(name = "BookmarkGetResponse")
public class BookmarkGetResponse {

    @XmlElement(name = "BookmarkGetResult")
    protected Bookmark bookmarkGetResult;

    /**
     * Gets the value of the bookmarkGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Bookmark }
     *     
     */
    public Bookmark getBookmarkGetResult() {
        return bookmarkGetResult;
    }

    /**
     * Sets the value of the bookmarkGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bookmark }
     *     
     */
    public void setBookmarkGetResult(Bookmark value) {
        this.bookmarkGetResult = value;
    }

}
