
package com.mile.RecorderStatusService2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceStatusBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceStatusBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://videoos.net/2/XProtectCSRecorderStatus2}StatusBase">
 *       &lt;sequence>
 *         &lt;element name="DeviceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="IsChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Started" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorNotLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorNoConnection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceStatusBase", propOrder = {
    "deviceId",
    "isChange",
    "enabled",
    "started",
    "error",
    "errorNotLicensed",
    "errorNoConnection"
})
@XmlSeeAlso({
    IODeviceStatusBase.class,
    MediaStreamDeviceStatusBase.class
})
public class DeviceStatusBase
    extends StatusBase
{

    @XmlElement(name = "DeviceId", required = true)
    protected String deviceId;
    @XmlElement(name = "IsChange")
    protected boolean isChange;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "Started")
    protected boolean started;
    @XmlElement(name = "Error")
    protected boolean error;
    @XmlElement(name = "ErrorNotLicensed")
    protected boolean errorNotLicensed;
    @XmlElement(name = "ErrorNoConnection")
    protected boolean errorNoConnection;

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the isChange property.
     * 
     */
    public boolean isIsChange() {
        return isChange;
    }

    /**
     * Sets the value of the isChange property.
     * 
     */
    public void setIsChange(boolean value) {
        this.isChange = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the started property.
     * 
     */
    public boolean isStarted() {
        return started;
    }

    /**
     * Sets the value of the started property.
     * 
     */
    public void setStarted(boolean value) {
        this.started = value;
    }

    /**
     * Gets the value of the error property.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

    /**
     * Gets the value of the errorNotLicensed property.
     * 
     */
    public boolean isErrorNotLicensed() {
        return errorNotLicensed;
    }

    /**
     * Sets the value of the errorNotLicensed property.
     * 
     */
    public void setErrorNotLicensed(boolean value) {
        this.errorNotLicensed = value;
    }

    /**
     * Gets the value of the errorNoConnection property.
     * 
     */
    public boolean isErrorNoConnection() {
        return errorNoConnection;
    }

    /**
     * Sets the value of the errorNoConnection property.
     * 
     */
    public void setErrorNoConnection(boolean value) {
        this.errorNoConnection = value;
    }

}
