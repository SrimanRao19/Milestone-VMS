
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartClientVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartClientVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Beta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForceUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpgradeInfo" type="{http://videoos.net/2/XProtectCSServerCommand}UpgradeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartClientVersion", propOrder = {
    "major",
    "minor",
    "revision",
    "beta",
    "forceUpgrade",
    "displayName",
    "upgradeInfo"
})
public class SmartClientVersion {

    @XmlElement(name = "Major")
    protected int major;
    @XmlElement(name = "Minor")
    protected int minor;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "Beta")
    protected int beta;
    @XmlElement(name = "ForceUpgrade")
    protected boolean forceUpgrade;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "UpgradeInfo")
    protected UpgradeInfo upgradeInfo;

    /**
     * Gets the value of the major property.
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the beta property.
     * 
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Sets the value of the beta property.
     * 
     */
    public void setBeta(int value) {
        this.beta = value;
    }

    /**
     * Gets the value of the forceUpgrade property.
     * 
     */
    public boolean isForceUpgrade() {
        return forceUpgrade;
    }

    /**
     * Sets the value of the forceUpgrade property.
     * 
     */
    public void setForceUpgrade(boolean value) {
        this.forceUpgrade = value;
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

    /**
     * Gets the value of the upgradeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeInfo }
     *     
     */
    public UpgradeInfo getUpgradeInfo() {
        return upgradeInfo;
    }

    /**
     * Sets the value of the upgradeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeInfo }
     *     
     */
    public void setUpgradeInfo(UpgradeInfo value) {
        this.upgradeInfo = value;
    }

}
