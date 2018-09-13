package com.mile.RecorderStatusService2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2018-09-13T13:01:06.032-04:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", name = "RecorderStatusService2Soap")
@XmlSeeAlso({ObjectFactory.class})
public interface RecorderStatusService2Soap {

    @WebMethod(operationName = "SubscribeDeviceStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/SubscribeDeviceStatus")
    @RequestWrapper(localName = "SubscribeDeviceStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.SubscribeDeviceStatus")
    @ResponseWrapper(localName = "SubscribeDeviceStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.SubscribeDeviceStatusResponse")
    public void subscribeDeviceStatus(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "deviceIds", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        com.mile.RecorderStatusService2.ArrayOfGuid deviceIds
    );

    @WebMethod(operationName = "StopStatusSession", action = "http://videoos.net/2/XProtectCSRecorderStatus2/StopStatusSession")
    @RequestWrapper(localName = "StopStatusSession", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.StopStatusSession")
    @ResponseWrapper(localName = "StopStatusSessionResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.StopStatusSessionResponse")
    public void stopStatusSession(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId
    );

    @WebMethod(operationName = "GetArchiveStorageStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetArchiveStorageStatus")
    @RequestWrapper(localName = "GetArchiveStorageStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetArchiveStorageStatus")
    @ResponseWrapper(localName = "GetArchiveStorageStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetArchiveStorageStatusResponse")
    @WebResult(name = "GetArchiveStorageStatusResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public com.mile.RecorderStatusService2.ArrayOfStorageStatus getArchiveStorageStatus(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token
    );

    @WebMethod(operationName = "SubscribeEventStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/SubscribeEventStatus")
    @RequestWrapper(localName = "SubscribeEventStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.SubscribeEventStatus")
    @ResponseWrapper(localName = "SubscribeEventStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.SubscribeEventStatusResponse")
    public void subscribeEventStatus(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "eventIds", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        com.mile.RecorderStatusService2.ArrayOfGuid eventIds
    );

    @WebMethod(operationName = "GetVersion", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetVersion")
    @RequestWrapper(localName = "GetVersion", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetVersion")
    @ResponseWrapper(localName = "GetVersionResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetVersionResponse")
    @WebResult(name = "GetVersionResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public int getVersion();

    @WebMethod(operationName = "GetCurrentDeviceStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetCurrentDeviceStatus")
    @RequestWrapper(localName = "GetCurrentDeviceStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetCurrentDeviceStatus")
    @ResponseWrapper(localName = "GetCurrentDeviceStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetCurrentDeviceStatusResponse")
    @WebResult(name = "GetCurrentDeviceStatusResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public com.mile.RecorderStatusService2.Status getCurrentDeviceStatus(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "deviceIds", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        com.mile.RecorderStatusService2.ArrayOfGuid deviceIds
    );

    @WebMethod(operationName = "GetVideoDeviceStatistics", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetVideoDeviceStatistics")
    @RequestWrapper(localName = "GetVideoDeviceStatistics", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetVideoDeviceStatistics")
    @ResponseWrapper(localName = "GetVideoDeviceStatisticsResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetVideoDeviceStatisticsResponse")
    @WebResult(name = "GetVideoDeviceStatisticsResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public com.mile.RecorderStatusService2.ArrayOfVideoDeviceStatistics getVideoDeviceStatistics(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "deviceIds", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        com.mile.RecorderStatusService2.ArrayOfGuid deviceIds
    );

    @WebMethod(operationName = "StartStatusSession", action = "http://videoos.net/2/XProtectCSRecorderStatus2/StartStatusSession")
    @RequestWrapper(localName = "StartStatusSession", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.StartStatusSession")
    @ResponseWrapper(localName = "StartStatusSessionResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.StartStatusSessionResponse")
    @WebResult(name = "StartStatusSessionResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public java.lang.String startStatusSession(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token
    );

    @WebMethod(operationName = "GetStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetStatus")
    @RequestWrapper(localName = "GetStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetStatus")
    @ResponseWrapper(localName = "GetStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetStatusResponse")
    @WebResult(name = "GetStatusResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public com.mile.RecorderStatusService2.Status getStatus(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "millisecondsTimeout", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        int millisecondsTimeout
    );

    @WebMethod(operationName = "GetRecordingStorageStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetRecordingStorageStatus")
    @RequestWrapper(localName = "GetRecordingStorageStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetRecordingStorageStatus")
    @ResponseWrapper(localName = "GetRecordingStorageStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetRecordingStorageStatusResponse")
    @WebResult(name = "GetRecordingStorageStatusResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public com.mile.RecorderStatusService2.ArrayOfStorageStatus getRecordingStorageStatus(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token
    );

    @WebMethod(operationName = "SubscribeConfigurationStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/SubscribeConfigurationStatus")
    @RequestWrapper(localName = "SubscribeConfigurationStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.SubscribeConfigurationStatus")
    @ResponseWrapper(localName = "SubscribeConfigurationStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.SubscribeConfigurationStatusResponse")
    public void subscribeConfigurationStatus(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "statusSessionId", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String statusSessionId,
        @WebParam(name = "subscribe", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        boolean subscribe
    );

    @WebMethod(operationName = "GetRecorderStatus", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetRecorderStatus")
    @RequestWrapper(localName = "GetRecorderStatus", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetRecorderStatus")
    @ResponseWrapper(localName = "GetRecorderStatusResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetRecorderStatusResponse")
    @WebResult(name = "GetRecorderStatusResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public com.mile.RecorderStatusService2.AttachAndConnectionState getRecorderStatus();

    @WebMethod(operationName = "GetAudioDeviceStatistics", action = "http://videoos.net/2/XProtectCSRecorderStatus2/GetAudioDeviceStatistics")
    @RequestWrapper(localName = "GetAudioDeviceStatistics", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetAudioDeviceStatistics")
    @ResponseWrapper(localName = "GetAudioDeviceStatisticsResponse", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2", className = "com.mile.RecorderStatusService2.GetAudioDeviceStatisticsResponse")
    @WebResult(name = "GetAudioDeviceStatisticsResult", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
    public com.mile.RecorderStatusService2.ArrayOfAudioDeviceStatistics getAudioDeviceStatistics(
        @WebParam(name = "token", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        java.lang.String token,
        @WebParam(name = "deviceIds", targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2")
        com.mile.RecorderStatusService2.ArrayOfGuid deviceIds
    );
}