
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
 *         &lt;element name="BookmarkSearchTimeResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfBookmark" minOccurs="0"/>
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
    "bookmarkSearchTimeResult"
})
@XmlRootElement(name = "BookmarkSearchTimeResponse")
public class BookmarkSearchTimeResponse {

    @XmlElement(name = "BookmarkSearchTimeResult")
    protected ArrayOfBookmark bookmarkSearchTimeResult;

    /**
     * Gets the value of the bookmarkSearchTimeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookmark }
     *     
     */
    public ArrayOfBookmark getBookmarkSearchTimeResult() {
        return bookmarkSearchTimeResult;
    }

    /**
     * Sets the value of the bookmarkSearchTimeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookmark }
     *     
     */
    public void setBookmarkSearchTimeResult(ArrayOfBookmark value) {
        this.bookmarkSearchTimeResult = value;
    }

}
