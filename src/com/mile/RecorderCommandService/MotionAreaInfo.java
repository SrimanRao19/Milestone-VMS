
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotionAreaInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotionAreaInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotionAreaInfo", propOrder = {
    "x",
    "y",
    "width",
    "height"
})
public class MotionAreaInfo {

    @XmlElement(name = "X")
    protected int x;
    @XmlElement(name = "Y")
    protected int y;
    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Height")
    protected int height;

    /**
     * Gets the value of the x property.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

}
