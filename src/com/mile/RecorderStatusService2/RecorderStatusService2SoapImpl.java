
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.mile.RecorderStatusService2;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2018-09-13T13:01:05.890-04:00
 * Generated source version: 2.4.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "RecorderStatusService2",
                      portName = "RecorderStatusService2Soap",
                      targetNamespace = "http://videoos.net/2/XProtectCSRecorderStatus2",
                      wsdlLocation = "file:/C:/Program Files/Milestone/MIPSDK/WSDL/RecorderStatusService2.wsdl",
                      endpointInterface = "com.mile.RecorderStatusService2.RecorderStatusService2Soap")
                      
public class RecorderStatusService2SoapImpl implements RecorderStatusService2Soap {

    private static final Logger LOG = Logger.getLogger(RecorderStatusService2SoapImpl.class.getName());

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#subscribeDeviceStatus(java.lang.String  token ,)java.lang.String  statusSessionId ,)com.mile.RecorderStatusService2.ArrayOfGuid  deviceIds )*
     */
    public void subscribeDeviceStatus(java.lang.String token,java.lang.String statusSessionId,com.mile.RecorderStatusService2.ArrayOfGuid deviceIds) { 
        LOG.info("Executing operation subscribeDeviceStatus");
        System.out.println(token);
        System.out.println(statusSessionId);
        System.out.println(deviceIds);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#stopStatusSession(java.lang.String  token ,)java.lang.String  statusSessionId )*
     */
    public void stopStatusSession(java.lang.String token,java.lang.String statusSessionId) { 
        LOG.info("Executing operation stopStatusSession");
        System.out.println(token);
        System.out.println(statusSessionId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getArchiveStorageStatus(java.lang.String  token )*
     */
    public com.mile.RecorderStatusService2.ArrayOfStorageStatus getArchiveStorageStatus(java.lang.String token) { 
        LOG.info("Executing operation getArchiveStorageStatus");
        System.out.println(token);
        try {
            com.mile.RecorderStatusService2.ArrayOfStorageStatus _return = new com.mile.RecorderStatusService2.ArrayOfStorageStatus();
            java.util.List<com.mile.RecorderStatusService2.StorageStatus> _returnStorageStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.StorageStatus>();
            com.mile.RecorderStatusService2.StorageStatus _returnStorageStatusVal1 = new com.mile.RecorderStatusService2.StorageStatus();
            _returnStorageStatusVal1.setStorageId("StorageId475260949");
            _returnStorageStatusVal1.setName("Name660890763");
            _returnStorageStatusVal1.setPath("Path229559668");
            _returnStorageStatusVal1.setAvailable(false);
            _returnStorageStatusVal1.setUsedSpaceInBytes(new java.math.BigInteger("-89133842444562620448501939796578495155"));
            _returnStorageStatusVal1.setFreeSpaceInBytes(new java.math.BigInteger("52697598835803604322805165524371686511"));
            _returnStorageStatus.add(_returnStorageStatusVal1);
            _return.getStorageStatus().addAll(_returnStorageStatus);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#subscribeEventStatus(java.lang.String  token ,)java.lang.String  statusSessionId ,)com.mile.RecorderStatusService2.ArrayOfGuid  eventIds )*
     */
    public void subscribeEventStatus(java.lang.String token,java.lang.String statusSessionId,com.mile.RecorderStatusService2.ArrayOfGuid eventIds) { 
        LOG.info("Executing operation subscribeEventStatus");
        System.out.println(token);
        System.out.println(statusSessionId);
        System.out.println(eventIds);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getVersion(*
     */
    public int getVersion() { 
        LOG.info("Executing operation getVersion");
        try {
            int _return = -551973152;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getCurrentDeviceStatus(java.lang.String  token ,)com.mile.RecorderStatusService2.ArrayOfGuid  deviceIds )*
     */
    public com.mile.RecorderStatusService2.Status getCurrentDeviceStatus(java.lang.String token,com.mile.RecorderStatusService2.ArrayOfGuid deviceIds) { 
        LOG.info("Executing operation getCurrentDeviceStatus");
        System.out.println(token);
        System.out.println(deviceIds);
        try {
            com.mile.RecorderStatusService2.Status _return = new com.mile.RecorderStatusService2.Status();
            com.mile.RecorderStatusService2.ArrayOfCameraDeviceStatus _returnCameraDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfCameraDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.CameraDeviceStatus> _returnCameraDeviceStatusArrayCameraDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.CameraDeviceStatus>();
            com.mile.RecorderStatusService2.CameraDeviceStatus _returnCameraDeviceStatusArrayCameraDeviceStatusVal1 = new com.mile.RecorderStatusService2.CameraDeviceStatus();
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.933-04:00"));
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setDeviceId("DeviceId924622609");
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setIsChange(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setEnabled(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setStarted(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setError(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorNotLicensed(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorNoConnection(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setRecording(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setDbMoveInProgress(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorOverflow(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorWritingGop(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setDbRepairInProgress(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setMotion(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatus.add(_returnCameraDeviceStatusArrayCameraDeviceStatusVal1);
            _returnCameraDeviceStatusArray.getCameraDeviceStatus().addAll(_returnCameraDeviceStatusArrayCameraDeviceStatus);
            _return.setCameraDeviceStatusArray(_returnCameraDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfInputDeviceStatus _returnInputDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfInputDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.InputDeviceStatus> _returnInputDeviceStatusArrayInputDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.InputDeviceStatus>();
            com.mile.RecorderStatusService2.InputDeviceStatus _returnInputDeviceStatusArrayInputDeviceStatusVal1 = new com.mile.RecorderStatusService2.InputDeviceStatus();
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.937-04:00"));
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setDeviceId("DeviceId33038315");
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setIsChange(true);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setEnabled(false);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setStarted(true);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setError(true);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setErrorNotLicensed(false);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setErrorNoConnection(true);
            com.mile.RecorderStatusService2.IOState _returnInputDeviceStatusArrayInputDeviceStatusVal1State = com.mile.RecorderStatusService2.IOState.ACTIVATED;
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setState(_returnInputDeviceStatusArrayInputDeviceStatusVal1State);
            _returnInputDeviceStatusArrayInputDeviceStatus.add(_returnInputDeviceStatusArrayInputDeviceStatusVal1);
            _returnInputDeviceStatusArray.getInputDeviceStatus().addAll(_returnInputDeviceStatusArrayInputDeviceStatus);
            _return.setInputDeviceStatusArray(_returnInputDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfOutputDeviceStatus _returnOutputDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfOutputDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.OutputDeviceStatus> _returnOutputDeviceStatusArrayOutputDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.OutputDeviceStatus>();
            com.mile.RecorderStatusService2.OutputDeviceStatus _returnOutputDeviceStatusArrayOutputDeviceStatusVal1 = new com.mile.RecorderStatusService2.OutputDeviceStatus();
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.938-04:00"));
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setDeviceId("DeviceId-1863848262");
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setIsChange(false);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setEnabled(true);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setStarted(false);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setError(true);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setErrorNotLicensed(false);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setErrorNoConnection(false);
            com.mile.RecorderStatusService2.IOState _returnOutputDeviceStatusArrayOutputDeviceStatusVal1State = com.mile.RecorderStatusService2.IOState.DEACTIVATED;
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setState(_returnOutputDeviceStatusArrayOutputDeviceStatusVal1State);
            _returnOutputDeviceStatusArrayOutputDeviceStatus.add(_returnOutputDeviceStatusArrayOutputDeviceStatusVal1);
            _returnOutputDeviceStatusArray.getOutputDeviceStatus().addAll(_returnOutputDeviceStatusArrayOutputDeviceStatus);
            _return.setOutputDeviceStatusArray(_returnOutputDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfMicrophoneDeviceStatus _returnMicrophoneDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfMicrophoneDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.MicrophoneDeviceStatus> _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.MicrophoneDeviceStatus>();
            com.mile.RecorderStatusService2.MicrophoneDeviceStatus _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1 = new com.mile.RecorderStatusService2.MicrophoneDeviceStatus();
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.939-04:00"));
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setDeviceId("DeviceId-651087757");
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setIsChange(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setEnabled(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setStarted(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setError(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorNotLicensed(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorNoConnection(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setRecording(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setDbMoveInProgress(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorOverflow(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorWritingGop(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setDbRepairInProgress(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatus.add(_returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1);
            _returnMicrophoneDeviceStatusArray.getMicrophoneDeviceStatus().addAll(_returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatus);
            _return.setMicrophoneDeviceStatusArray(_returnMicrophoneDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfSpeakerDeviceStatus _returnSpeakerDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfSpeakerDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.SpeakerDeviceStatus> _returnSpeakerDeviceStatusArraySpeakerDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.SpeakerDeviceStatus>();
            com.mile.RecorderStatusService2.SpeakerDeviceStatus _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1 = new com.mile.RecorderStatusService2.SpeakerDeviceStatus();
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.940-04:00"));
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setDeviceId("DeviceId1755406291");
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setIsChange(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setEnabled(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setStarted(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setError(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorNotLicensed(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorNoConnection(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setRecording(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setDbMoveInProgress(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorOverflow(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorWritingGop(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setDbRepairInProgress(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatus.add(_returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1);
            _returnSpeakerDeviceStatusArray.getSpeakerDeviceStatus().addAll(_returnSpeakerDeviceStatusArraySpeakerDeviceStatus);
            _return.setSpeakerDeviceStatusArray(_returnSpeakerDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfEventStatus _returnEventStatusArray = new com.mile.RecorderStatusService2.ArrayOfEventStatus();
            java.util.List<com.mile.RecorderStatusService2.EventStatus> _returnEventStatusArrayEventStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.EventStatus>();
            com.mile.RecorderStatusService2.EventStatus _returnEventStatusArrayEventStatusVal1 = new com.mile.RecorderStatusService2.EventStatus();
            _returnEventStatusArrayEventStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.942-04:00"));
            _returnEventStatusArrayEventStatusVal1.setEventId("EventId527500730");
            _returnEventStatusArrayEventStatusVal1.setSourceId("SourceId-938016770");
            _returnEventStatusArrayEventStatus.add(_returnEventStatusArrayEventStatusVal1);
            _returnEventStatusArray.getEventStatus().addAll(_returnEventStatusArrayEventStatus);
            _return.setEventStatusArray(_returnEventStatusArray);
            com.mile.RecorderStatusService2.ConfigurationChangedStatus _returnConfigurationChangedStatus = new com.mile.RecorderStatusService2.ConfigurationChangedStatus();
            _returnConfigurationChangedStatus.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.942-04:00"));
            _return.setConfigurationChangedStatus(_returnConfigurationChangedStatus);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getVideoDeviceStatistics(java.lang.String  token ,)com.mile.RecorderStatusService2.ArrayOfGuid  deviceIds )*
     */
    public com.mile.RecorderStatusService2.ArrayOfVideoDeviceStatistics getVideoDeviceStatistics(java.lang.String token,com.mile.RecorderStatusService2.ArrayOfGuid deviceIds) { 
        LOG.info("Executing operation getVideoDeviceStatistics");
        System.out.println(token);
        System.out.println(deviceIds);
        try {
            com.mile.RecorderStatusService2.ArrayOfVideoDeviceStatistics _return = new com.mile.RecorderStatusService2.ArrayOfVideoDeviceStatistics();
            java.util.List<com.mile.RecorderStatusService2.VideoDeviceStatistics> _returnVideoDeviceStatistics = new java.util.ArrayList<com.mile.RecorderStatusService2.VideoDeviceStatistics>();
            com.mile.RecorderStatusService2.VideoDeviceStatistics _returnVideoDeviceStatisticsVal1 = new com.mile.RecorderStatusService2.VideoDeviceStatistics();
            _returnVideoDeviceStatisticsVal1.setDeviceId("DeviceId-788162574");
            com.mile.RecorderStatusService2.ArrayOfVideoStreamStatistics _returnVideoDeviceStatisticsVal1VideoStreamStatisticsArray = new com.mile.RecorderStatusService2.ArrayOfVideoStreamStatistics();
            java.util.List<com.mile.RecorderStatusService2.VideoStreamStatistics> _returnVideoDeviceStatisticsVal1VideoStreamStatisticsArrayVideoStreamStatistics = new java.util.ArrayList<com.mile.RecorderStatusService2.VideoStreamStatistics>();
            _returnVideoDeviceStatisticsVal1VideoStreamStatisticsArray.getVideoStreamStatistics().addAll(_returnVideoDeviceStatisticsVal1VideoStreamStatisticsArrayVideoStreamStatistics);
            _returnVideoDeviceStatisticsVal1.setVideoStreamStatisticsArray(_returnVideoDeviceStatisticsVal1VideoStreamStatisticsArray);
            _returnVideoDeviceStatistics.add(_returnVideoDeviceStatisticsVal1);
            _return.getVideoDeviceStatistics().addAll(_returnVideoDeviceStatistics);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#startStatusSession(java.lang.String  token )*
     */
    public java.lang.String startStatusSession(java.lang.String token) { 
        LOG.info("Executing operation startStatusSession");
        System.out.println(token);
        try {
            java.lang.String _return = "_return282700971";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getStatus(java.lang.String  token ,)java.lang.String  statusSessionId ,)int  millisecondsTimeout )*
     */
    public com.mile.RecorderStatusService2.Status getStatus(java.lang.String token,java.lang.String statusSessionId,int millisecondsTimeout) { 
        LOG.info("Executing operation getStatus");
        System.out.println(token);
        System.out.println(statusSessionId);
        System.out.println(millisecondsTimeout);
        try {
            com.mile.RecorderStatusService2.Status _return = new com.mile.RecorderStatusService2.Status();
            com.mile.RecorderStatusService2.ArrayOfCameraDeviceStatus _returnCameraDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfCameraDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.CameraDeviceStatus> _returnCameraDeviceStatusArrayCameraDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.CameraDeviceStatus>();
            com.mile.RecorderStatusService2.CameraDeviceStatus _returnCameraDeviceStatusArrayCameraDeviceStatusVal1 = new com.mile.RecorderStatusService2.CameraDeviceStatus();
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.946-04:00"));
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setDeviceId("DeviceId-861528563");
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setIsChange(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setEnabled(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setStarted(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setError(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorNotLicensed(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorNoConnection(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setRecording(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setDbMoveInProgress(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorOverflow(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setErrorWritingGop(true);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setDbRepairInProgress(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatusVal1.setMotion(false);
            _returnCameraDeviceStatusArrayCameraDeviceStatus.add(_returnCameraDeviceStatusArrayCameraDeviceStatusVal1);
            _returnCameraDeviceStatusArray.getCameraDeviceStatus().addAll(_returnCameraDeviceStatusArrayCameraDeviceStatus);
            _return.setCameraDeviceStatusArray(_returnCameraDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfInputDeviceStatus _returnInputDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfInputDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.InputDeviceStatus> _returnInputDeviceStatusArrayInputDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.InputDeviceStatus>();
            com.mile.RecorderStatusService2.InputDeviceStatus _returnInputDeviceStatusArrayInputDeviceStatusVal1 = new com.mile.RecorderStatusService2.InputDeviceStatus();
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.948-04:00"));
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setDeviceId("DeviceId-1361172462");
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setIsChange(true);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setEnabled(false);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setStarted(true);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setError(false);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setErrorNotLicensed(false);
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setErrorNoConnection(false);
            com.mile.RecorderStatusService2.IOState _returnInputDeviceStatusArrayInputDeviceStatusVal1State = com.mile.RecorderStatusService2.IOState.ACTIVATED;
            _returnInputDeviceStatusArrayInputDeviceStatusVal1.setState(_returnInputDeviceStatusArrayInputDeviceStatusVal1State);
            _returnInputDeviceStatusArrayInputDeviceStatus.add(_returnInputDeviceStatusArrayInputDeviceStatusVal1);
            _returnInputDeviceStatusArray.getInputDeviceStatus().addAll(_returnInputDeviceStatusArrayInputDeviceStatus);
            _return.setInputDeviceStatusArray(_returnInputDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfOutputDeviceStatus _returnOutputDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfOutputDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.OutputDeviceStatus> _returnOutputDeviceStatusArrayOutputDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.OutputDeviceStatus>();
            com.mile.RecorderStatusService2.OutputDeviceStatus _returnOutputDeviceStatusArrayOutputDeviceStatusVal1 = new com.mile.RecorderStatusService2.OutputDeviceStatus();
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.949-04:00"));
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setDeviceId("DeviceId1749187562");
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setIsChange(true);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setEnabled(true);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setStarted(true);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setError(false);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setErrorNotLicensed(false);
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setErrorNoConnection(false);
            com.mile.RecorderStatusService2.IOState _returnOutputDeviceStatusArrayOutputDeviceStatusVal1State = com.mile.RecorderStatusService2.IOState.ACTIVATED;
            _returnOutputDeviceStatusArrayOutputDeviceStatusVal1.setState(_returnOutputDeviceStatusArrayOutputDeviceStatusVal1State);
            _returnOutputDeviceStatusArrayOutputDeviceStatus.add(_returnOutputDeviceStatusArrayOutputDeviceStatusVal1);
            _returnOutputDeviceStatusArray.getOutputDeviceStatus().addAll(_returnOutputDeviceStatusArrayOutputDeviceStatus);
            _return.setOutputDeviceStatusArray(_returnOutputDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfMicrophoneDeviceStatus _returnMicrophoneDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfMicrophoneDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.MicrophoneDeviceStatus> _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.MicrophoneDeviceStatus>();
            com.mile.RecorderStatusService2.MicrophoneDeviceStatus _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1 = new com.mile.RecorderStatusService2.MicrophoneDeviceStatus();
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.950-04:00"));
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setDeviceId("DeviceId-2125120252");
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setIsChange(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setEnabled(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setStarted(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setError(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorNotLicensed(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorNoConnection(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setRecording(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setDbMoveInProgress(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorOverflow(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setErrorWritingGop(true);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1.setDbRepairInProgress(false);
            _returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatus.add(_returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatusVal1);
            _returnMicrophoneDeviceStatusArray.getMicrophoneDeviceStatus().addAll(_returnMicrophoneDeviceStatusArrayMicrophoneDeviceStatus);
            _return.setMicrophoneDeviceStatusArray(_returnMicrophoneDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfSpeakerDeviceStatus _returnSpeakerDeviceStatusArray = new com.mile.RecorderStatusService2.ArrayOfSpeakerDeviceStatus();
            java.util.List<com.mile.RecorderStatusService2.SpeakerDeviceStatus> _returnSpeakerDeviceStatusArraySpeakerDeviceStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.SpeakerDeviceStatus>();
            com.mile.RecorderStatusService2.SpeakerDeviceStatus _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1 = new com.mile.RecorderStatusService2.SpeakerDeviceStatus();
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.951-04:00"));
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setDeviceId("DeviceId34267883");
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setIsChange(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setEnabled(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setStarted(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setError(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorNotLicensed(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorNoConnection(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setRecording(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setDbMoveInProgress(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorOverflow(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setErrorWritingGop(true);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1.setDbRepairInProgress(false);
            _returnSpeakerDeviceStatusArraySpeakerDeviceStatus.add(_returnSpeakerDeviceStatusArraySpeakerDeviceStatusVal1);
            _returnSpeakerDeviceStatusArray.getSpeakerDeviceStatus().addAll(_returnSpeakerDeviceStatusArraySpeakerDeviceStatus);
            _return.setSpeakerDeviceStatusArray(_returnSpeakerDeviceStatusArray);
            com.mile.RecorderStatusService2.ArrayOfEventStatus _returnEventStatusArray = new com.mile.RecorderStatusService2.ArrayOfEventStatus();
            java.util.List<com.mile.RecorderStatusService2.EventStatus> _returnEventStatusArrayEventStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.EventStatus>();
            com.mile.RecorderStatusService2.EventStatus _returnEventStatusArrayEventStatusVal1 = new com.mile.RecorderStatusService2.EventStatus();
            _returnEventStatusArrayEventStatusVal1.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.954-04:00"));
            _returnEventStatusArrayEventStatusVal1.setEventId("EventId-1333503769");
            _returnEventStatusArrayEventStatusVal1.setSourceId("SourceId-270408389");
            _returnEventStatusArrayEventStatus.add(_returnEventStatusArrayEventStatusVal1);
            _returnEventStatusArray.getEventStatus().addAll(_returnEventStatusArrayEventStatus);
            _return.setEventStatusArray(_returnEventStatusArray);
            com.mile.RecorderStatusService2.ConfigurationChangedStatus _returnConfigurationChangedStatus = new com.mile.RecorderStatusService2.ConfigurationChangedStatus();
            _returnConfigurationChangedStatus.setTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T13:01:05.955-04:00"));
            _return.setConfigurationChangedStatus(_returnConfigurationChangedStatus);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getRecordingStorageStatus(java.lang.String  token )*
     */
    public com.mile.RecorderStatusService2.ArrayOfStorageStatus getRecordingStorageStatus(java.lang.String token) { 
        LOG.info("Executing operation getRecordingStorageStatus");
        System.out.println(token);
        try {
            com.mile.RecorderStatusService2.ArrayOfStorageStatus _return = new com.mile.RecorderStatusService2.ArrayOfStorageStatus();
            java.util.List<com.mile.RecorderStatusService2.StorageStatus> _returnStorageStatus = new java.util.ArrayList<com.mile.RecorderStatusService2.StorageStatus>();
            com.mile.RecorderStatusService2.StorageStatus _returnStorageStatusVal1 = new com.mile.RecorderStatusService2.StorageStatus();
            _returnStorageStatusVal1.setStorageId("StorageId-808147303");
            _returnStorageStatusVal1.setName("Name309834121");
            _returnStorageStatusVal1.setPath("Path377292403");
            _returnStorageStatusVal1.setAvailable(true);
            _returnStorageStatusVal1.setUsedSpaceInBytes(new java.math.BigInteger("-8590703541397013648076565442789583296"));
            _returnStorageStatusVal1.setFreeSpaceInBytes(new java.math.BigInteger("7118492702918503910475295512808119472"));
            _returnStorageStatus.add(_returnStorageStatusVal1);
            _return.getStorageStatus().addAll(_returnStorageStatus);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#subscribeConfigurationStatus(java.lang.String  token ,)java.lang.String  statusSessionId ,)boolean  subscribe )*
     */
    public void subscribeConfigurationStatus(java.lang.String token,java.lang.String statusSessionId,boolean subscribe) { 
        LOG.info("Executing operation subscribeConfigurationStatus");
        System.out.println(token);
        System.out.println(statusSessionId);
        System.out.println(subscribe);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getRecorderStatus(*
     */
    public com.mile.RecorderStatusService2.AttachAndConnectionState getRecorderStatus() { 
        LOG.info("Executing operation getRecorderStatus");
        try {
            com.mile.RecorderStatusService2.AttachAndConnectionState _return = new com.mile.RecorderStatusService2.AttachAndConnectionState();
            _return.setAttachState("AttachState1346112490");
            _return.setConnectionState("ConnectionState-1042005890");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.RecorderStatusService2.RecorderStatusService2Soap#getAudioDeviceStatistics(java.lang.String  token ,)com.mile.RecorderStatusService2.ArrayOfGuid  deviceIds )*
     */
    public com.mile.RecorderStatusService2.ArrayOfAudioDeviceStatistics getAudioDeviceStatistics(java.lang.String token,com.mile.RecorderStatusService2.ArrayOfGuid deviceIds) { 
        LOG.info("Executing operation getAudioDeviceStatistics");
        System.out.println(token);
        System.out.println(deviceIds);
        try {
            com.mile.RecorderStatusService2.ArrayOfAudioDeviceStatistics _return = new com.mile.RecorderStatusService2.ArrayOfAudioDeviceStatistics();
            java.util.List<com.mile.RecorderStatusService2.AudioDeviceStatistics> _returnAudioDeviceStatistics = new java.util.ArrayList<com.mile.RecorderStatusService2.AudioDeviceStatistics>();
            com.mile.RecorderStatusService2.AudioDeviceStatistics _returnAudioDeviceStatisticsVal1 = new com.mile.RecorderStatusService2.AudioDeviceStatistics();
            _returnAudioDeviceStatisticsVal1.setDeviceId("DeviceId1568803158");
            com.mile.RecorderStatusService2.ArrayOfAudioStreamStatistics _returnAudioDeviceStatisticsVal1AudioStreamStatisticsArray = new com.mile.RecorderStatusService2.ArrayOfAudioStreamStatistics();
            java.util.List<com.mile.RecorderStatusService2.AudioStreamStatistics> _returnAudioDeviceStatisticsVal1AudioStreamStatisticsArrayAudioStreamStatistics = new java.util.ArrayList<com.mile.RecorderStatusService2.AudioStreamStatistics>();
            _returnAudioDeviceStatisticsVal1AudioStreamStatisticsArray.getAudioStreamStatistics().addAll(_returnAudioDeviceStatisticsVal1AudioStreamStatisticsArrayAudioStreamStatistics);
            _returnAudioDeviceStatisticsVal1.setAudioStreamStatisticsArray(_returnAudioDeviceStatisticsVal1AudioStreamStatisticsArray);
            _returnAudioDeviceStatistics.add(_returnAudioDeviceStatisticsVal1);
            _return.getAudioDeviceStatistics().addAll(_returnAudioDeviceStatistics);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
