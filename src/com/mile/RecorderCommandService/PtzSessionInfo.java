
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtzSessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtzSessionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PatrollingProfileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ManualPatrollingProfileId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="User" type="{http://videoos.net/2/XProtectCSRecorderCommand}UserInfo" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Reserved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPatrolling" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAnonymous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPaused" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TimeoutSec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeoutLeftSec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtzSessionInfo", propOrder = {
    "deviceId",
    "patrollingProfileId",
    "manualPatrollingProfileId",
    "user",
    "priority",
    "reserved",
    "isPatrolling",
    "isAnonymous",
    "isPaused",
    "timeoutSec",
    "timeoutLeftSec",
    "isLicensed"
})
public class PtzSessionInfo {

    @XmlElement(name = "DeviceId", required = true)
    protected String deviceId;
    @XmlElement(name = "PatrollingProfileId", required = true)
    protected String patrollingProfileId;
    @XmlElement(name = "ManualPatrollingProfileId", required = true)
    protected String manualPatrollingProfileId;
    @XmlElement(name = "User")
    protected UserInfo user;
    @XmlElement(name = "Priority")
    protected int priority;
    @XmlElement(name = "Reserved")
    protected boolean reserved;
    @XmlElement(name = "IsPatrolling")
    protected boolean isPatrolling;
    @XmlElement(name = "IsAnonymous")
    protected boolean isAnonymous;
    @XmlElement(name = "IsPaused")
    protected boolean isPaused;
    @XmlElement(name = "TimeoutSec")
    protected int timeoutSec;
    @XmlElement(name = "TimeoutLeftSec")
    protected int timeoutLeftSec;
    @XmlElement(name = "IsLicensed")
    protected boolean isLicensed;

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
     * Gets the value of the patrollingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatrollingProfileId() {
        return patrollingProfileId;
    }

    /**
     * Sets the value of the patrollingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatrollingProfileId(String value) {
        this.patrollingProfileId = value;
    }

    /**
     * Gets the value of the manualPatrollingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualPatrollingProfileId() {
        return manualPatrollingProfileId;
    }

    /**
     * Sets the value of the manualPatrollingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualPatrollingProfileId(String value) {
        this.manualPatrollingProfileId = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setUser(UserInfo value) {
        this.user = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     */
    public boolean isReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     */
    public void setReserved(boolean value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the isPatrolling property.
     * 
     */
    public boolean isIsPatrolling() {
        return isPatrolling;
    }

    /**
     * Sets the value of the isPatrolling property.
     * 
     */
    public void setIsPatrolling(boolean value) {
        this.isPatrolling = value;
    }

    /**
     * Gets the value of the isAnonymous property.
     * 
     */
    public boolean isIsAnonymous() {
        return isAnonymous;
    }

    /**
     * Sets the value of the isAnonymous property.
     * 
     */
    public void setIsAnonymous(boolean value) {
        this.isAnonymous = value;
    }

    /**
     * Gets the value of the isPaused property.
     * 
     */
    public boolean isIsPaused() {
        return isPaused;
    }

    /**
     * Sets the value of the isPaused property.
     * 
     */
    public void setIsPaused(boolean value) {
        this.isPaused = value;
    }

    /**
     * Gets the value of the timeoutSec property.
     * 
     */
    public int getTimeoutSec() {
        return timeoutSec;
    }

    /**
     * Sets the value of the timeoutSec property.
     * 
     */
    public void setTimeoutSec(int value) {
        this.timeoutSec = value;
    }

    /**
     * Gets the value of the timeoutLeftSec property.
     * 
     */
    public int getTimeoutLeftSec() {
        return timeoutLeftSec;
    }

    /**
     * Sets the value of the timeoutLeftSec property.
     * 
     */
    public void setTimeoutLeftSec(int value) {
        this.timeoutLeftSec = value;
    }

    /**
     * Gets the value of the isLicensed property.
     * 
     */
    public boolean isIsLicensed() {
        return isLicensed;
    }

    /**
     * Sets the value of the isLicensed property.
     * 
     */
    public void setIsLicensed(boolean value) {
        this.isLicensed = value;
    }

}
