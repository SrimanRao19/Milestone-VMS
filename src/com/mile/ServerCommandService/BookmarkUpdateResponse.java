
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
 *         &lt;element name="BookmarkUpdateResult" type="{http://videoos.net/2/XProtectCSServerCommand}Bookmark" minOccurs="0"/>
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
    "bookmarkUpdateResult"
})
@XmlRootElement(name = "BookmarkUpdateResponse")
public class BookmarkUpdateResponse {

    @XmlElement(name = "BookmarkUpdateResult")
    protected Bookmark bookmarkUpdateResult;

    /**
     * Gets the value of the bookmarkUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Bookmark }
     *     
     */
    public Bookmark getBookmarkUpdateResult() {
        return bookmarkUpdateResult;
    }

    /**
     * Sets the value of the bookmarkUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bookmark }
     *     
     */
    public void setBookmarkUpdateResult(Bookmark value) {
        this.bookmarkUpdateResult = value;
    }

}
