
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraSecurityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraSecurityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Live" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Browse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExportAvi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExportJpeg" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SmartSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GetSequences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExportDatabase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StopRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PtzSecurity" type="{http://videoos.net/2/XProtectCSServerCommand}PtzSecurityInfo" minOccurs="0"/>
 *         &lt;element name="BookmarkView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookmarkAdd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookmarkEdit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookmarkDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetentionView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetentionCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetentionRemove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ManagePresets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ManagePatrollingProfiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ManagePresetLocks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetrieveEdgeRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraSecurityInfo", propOrder = {
    "live",
    "browse",
    "exportAvi",
    "exportJpeg",
    "smartSearch",
    "getSequences",
    "exportDatabase",
    "startRecording",
    "stopRecording",
    "ptzSecurity",
    "bookmarkView",
    "bookmarkAdd",
    "bookmarkEdit",
    "bookmarkDelete",
    "retentionView",
    "retentionCreate",
    "retentionRemove",
    "managePresets",
    "managePatrollingProfiles",
    "managePresetLocks",
    "retrieveEdgeRecordings"
})
public class CameraSecurityInfo {

    @XmlElement(name = "Live")
    protected boolean live;
    @XmlElement(name = "Browse")
    protected boolean browse;
    @XmlElement(name = "ExportAvi")
    protected boolean exportAvi;
    @XmlElement(name = "ExportJpeg")
    protected boolean exportJpeg;
    @XmlElement(name = "SmartSearch")
    protected boolean smartSearch;
    @XmlElement(name = "GetSequences")
    protected boolean getSequences;
    @XmlElement(name = "ExportDatabase")
    protected boolean exportDatabase;
    @XmlElement(name = "StartRecording")
    protected boolean startRecording;
    @XmlElement(name = "StopRecording")
    protected boolean stopRecording;
    @XmlElement(name = "PtzSecurity")
    protected PtzSecurityInfo ptzSecurity;
    @XmlElement(name = "BookmarkView")
    protected boolean bookmarkView;
    @XmlElement(name = "BookmarkAdd")
    protected boolean bookmarkAdd;
    @XmlElement(name = "BookmarkEdit")
    protected boolean bookmarkEdit;
    @XmlElement(name = "BookmarkDelete")
    protected boolean bookmarkDelete;
    @XmlElement(name = "RetentionView")
    protected boolean retentionView;
    @XmlElement(name = "RetentionCreate")
    protected boolean retentionCreate;
    @XmlElement(name = "RetentionRemove")
    protected boolean retentionRemove;
    @XmlElement(name = "ManagePresets")
    protected boolean managePresets;
    @XmlElement(name = "ManagePatrollingProfiles")
    protected boolean managePatrollingProfiles;
    @XmlElement(name = "ManagePresetLocks")
    protected boolean managePresetLocks;
    @XmlElement(name = "RetrieveEdgeRecordings")
    protected boolean retrieveEdgeRecordings;

    /**
     * Gets the value of the live property.
     * 
     */
    public boolean isLive() {
        return live;
    }

    /**
     * Sets the value of the live property.
     * 
     */
    public void setLive(boolean value) {
        this.live = value;
    }

    /**
     * Gets the value of the browse property.
     * 
     */
    public boolean isBrowse() {
        return browse;
    }

    /**
     * Sets the value of the browse property.
     * 
     */
    public void setBrowse(boolean value) {
        this.browse = value;
    }

    /**
     * Gets the value of the exportAvi property.
     * 
     */
    public boolean isExportAvi() {
        return exportAvi;
    }

    /**
     * Sets the value of the exportAvi property.
     * 
     */
    public void setExportAvi(boolean value) {
        this.exportAvi = value;
    }

    /**
     * Gets the value of the exportJpeg property.
     * 
     */
    public boolean isExportJpeg() {
        return exportJpeg;
    }

    /**
     * Sets the value of the exportJpeg property.
     * 
     */
    public void setExportJpeg(boolean value) {
        this.exportJpeg = value;
    }

    /**
     * Gets the value of the smartSearch property.
     * 
     */
    public boolean isSmartSearch() {
        return smartSearch;
    }

    /**
     * Sets the value of the smartSearch property.
     * 
     */
    public void setSmartSearch(boolean value) {
        this.smartSearch = value;
    }

    /**
     * Gets the value of the getSequences property.
     * 
     */
    public boolean isGetSequences() {
        return getSequences;
    }

    /**
     * Sets the value of the getSequences property.
     * 
     */
    public void setGetSequences(boolean value) {
        this.getSequences = value;
    }

    /**
     * Gets the value of the exportDatabase property.
     * 
     */
    public boolean isExportDatabase() {
        return exportDatabase;
    }

    /**
     * Sets the value of the exportDatabase property.
     * 
     */
    public void setExportDatabase(boolean value) {
        this.exportDatabase = value;
    }

    /**
     * Gets the value of the startRecording property.
     * 
     */
    public boolean isStartRecording() {
        return startRecording;
    }

    /**
     * Sets the value of the startRecording property.
     * 
     */
    public void setStartRecording(boolean value) {
        this.startRecording = value;
    }

    /**
     * Gets the value of the stopRecording property.
     * 
     */
    public boolean isStopRecording() {
        return stopRecording;
    }

    /**
     * Sets the value of the stopRecording property.
     * 
     */
    public void setStopRecording(boolean value) {
        this.stopRecording = value;
    }

    /**
     * Gets the value of the ptzSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link PtzSecurityInfo }
     *     
     */
    public PtzSecurityInfo getPtzSecurity() {
        return ptzSecurity;
    }

    /**
     * Sets the value of the ptzSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtzSecurityInfo }
     *     
     */
    public void setPtzSecurity(PtzSecurityInfo value) {
        this.ptzSecurity = value;
    }

    /**
     * Gets the value of the bookmarkView property.
     * 
     */
    public boolean isBookmarkView() {
        return bookmarkView;
    }

    /**
     * Sets the value of the bookmarkView property.
     * 
     */
    public void setBookmarkView(boolean value) {
        this.bookmarkView = value;
    }

    /**
     * Gets the value of the bookmarkAdd property.
     * 
     */
    public boolean isBookmarkAdd() {
        return bookmarkAdd;
    }

    /**
     * Sets the value of the bookmarkAdd property.
     * 
     */
    public void setBookmarkAdd(boolean value) {
        this.bookmarkAdd = value;
    }

    /**
     * Gets the value of the bookmarkEdit property.
     * 
     */
    public boolean isBookmarkEdit() {
        return bookmarkEdit;
    }

    /**
     * Sets the value of the bookmarkEdit property.
     * 
     */
    public void setBookmarkEdit(boolean value) {
        this.bookmarkEdit = value;
    }

    /**
     * Gets the value of the bookmarkDelete property.
     * 
     */
    public boolean isBookmarkDelete() {
        return bookmarkDelete;
    }

    /**
     * Sets the value of the bookmarkDelete property.
     * 
     */
    public void setBookmarkDelete(boolean value) {
        this.bookmarkDelete = value;
    }

    /**
     * Gets the value of the retentionView property.
     * 
     */
    public boolean isRetentionView() {
        return retentionView;
    }

    /**
     * Sets the value of the retentionView property.
     * 
     */
    public void setRetentionView(boolean value) {
        this.retentionView = value;
    }

    /**
     * Gets the value of the retentionCreate property.
     * 
     */
    public boolean isRetentionCreate() {
        return retentionCreate;
    }

    /**
     * Sets the value of the retentionCreate property.
     * 
     */
    public void setRetentionCreate(boolean value) {
        this.retentionCreate = value;
    }

    /**
     * Gets the value of the retentionRemove property.
     * 
     */
    public boolean isRetentionRemove() {
        return retentionRemove;
    }

    /**
     * Sets the value of the retentionRemove property.
     * 
     */
    public void setRetentionRemove(boolean value) {
        this.retentionRemove = value;
    }

    /**
     * Gets the value of the managePresets property.
     * 
     */
    public boolean isManagePresets() {
        return managePresets;
    }

    /**
     * Sets the value of the managePresets property.
     * 
     */
    public void setManagePresets(boolean value) {
        this.managePresets = value;
    }

    /**
     * Gets the value of the managePatrollingProfiles property.
     * 
     */
    public boolean isManagePatrollingProfiles() {
        return managePatrollingProfiles;
    }

    /**
     * Sets the value of the managePatrollingProfiles property.
     * 
     */
    public void setManagePatrollingProfiles(boolean value) {
        this.managePatrollingProfiles = value;
    }

    /**
     * Gets the value of the managePresetLocks property.
     * 
     */
    public boolean isManagePresetLocks() {
        return managePresetLocks;
    }

    /**
     * Sets the value of the managePresetLocks property.
     * 
     */
    public void setManagePresetLocks(boolean value) {
        this.managePresetLocks = value;
    }

    /**
     * Gets the value of the retrieveEdgeRecordings property.
     * 
     */
    public boolean isRetrieveEdgeRecordings() {
        return retrieveEdgeRecordings;
    }

    /**
     * Sets the value of the retrieveEdgeRecordings property.
     * 
     */
    public void setRetrieveEdgeRecordings(boolean value) {
        this.retrieveEdgeRecordings = value;
    }

}
