
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
 *         &lt;element name="AlertsGetAroundWithSpanResult" type="{http://videoos.net/2/XProtectCSServerCommand}ArrayOfAlertOccurrence" minOccurs="0"/>
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
    "alertsGetAroundWithSpanResult"
})
@XmlRootElement(name = "AlertsGetAroundWithSpanResponse")
public class AlertsGetAroundWithSpanResponse {

    @XmlElement(name = "AlertsGetAroundWithSpanResult")
    protected ArrayOfAlertOccurrence alertsGetAroundWithSpanResult;

    /**
     * Gets the value of the alertsGetAroundWithSpanResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlertOccurrence }
     *     
     */
    public ArrayOfAlertOccurrence getAlertsGetAroundWithSpanResult() {
        return alertsGetAroundWithSpanResult;
    }

    /**
     * Sets the value of the alertsGetAroundWithSpanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertOccurrence }
     *     
     */
    public void setAlertsGetAroundWithSpanResult(ArrayOfAlertOccurrence value) {
        this.alertsGetAroundWithSpanResult = value;
    }

}
