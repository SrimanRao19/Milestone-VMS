
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatrixMonitorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixMonitorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatrixMonitorId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixMonitorInfo", propOrder = {
    "matrixMonitorId",
    "displayName"
})
public class MatrixMonitorInfo {

    @XmlElement(name = "MatrixMonitorId", required = true)
    protected String matrixMonitorId;
    @XmlElement(name = "DisplayName")
    protected String displayName;

    /**
     * Gets the value of the matrixMonitorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixMonitorId() {
        return matrixMonitorId;
    }

    /**
     * Sets the value of the matrixMonitorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixMonitorId(String value) {
        this.matrixMonitorId = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

}
