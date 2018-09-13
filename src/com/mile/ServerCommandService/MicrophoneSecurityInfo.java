
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MicrophoneSecurityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MicrophoneSecurityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Live" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Browse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GetSequences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExportDatabase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookmarkView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookmarkAdd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookmarkEdit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookmarkDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetentionView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetentionCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetentionRemove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RetrieveEdgeRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StopRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicrophoneSecurityInfo", propOrder = {
    "live",
    "browse",
    "getSequences",
    "exportDatabase",
    "bookmarkView",
    "bookmarkAdd",
    "bookmarkEdit",
    "bookmarkDelete",
    "retentionView",
    "retentionCreate",
    "retentionRemove",
    "retrieveEdgeRecordings",
    "startRecording",
    "stopRecording"
})
public class MicrophoneSecurityInfo {

    @XmlElement(name = "Live")
    protected boolean live;
    @XmlElement(name = "Browse")
    protected boolean browse;
    @XmlElement(name = "GetSequences")
    protected boolean getSequences;
    @XmlElement(name = "ExportDatabase")
    protected boolean exportDatabase;
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
    @XmlElement(name = "RetrieveEdgeRecordings")
    protected boolean retrieveEdgeRecordings;
    @XmlElement(name = "StartRecording")
    protected boolean startRecording;
    @XmlElement(name = "StopRecording")
    protected boolean stopRecording;

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

}
