
package com.mile.ServerCommandService;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import main.Authentication;
import main.Configuration;


public final class ServerCommandServiceSoap_ServerCommandServiceSoap_Client {
	public static String token;

    private static final QName SERVICE_NAME = new QName("http://videoos.net/2/XProtectCSServerCommand", "ServerCommandService");

    private ServerCommandServiceSoap_ServerCommandServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
    	
    	Authentication client=new Authentication();
    	client.bypass();
        token=client.doPost();
    	//Configuration config=new Configuration();
    	//config.doPostConfig();
        URL wsdlURL = ServerCommandService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        ServerCommandService ss = new ServerCommandService(wsdlURL, SERVICE_NAME);
        ServerCommandServiceSoap port = ss.getServerCommandServiceSoap();
        port.login("B7A0CFD7-F9DF-405E-A2C7-5A545B9B3D89", token);
        
        
        
        
        {
        System.out.println("Invoking setCustomSettingDataGlobal...");
        java.lang.String _setCustomSettingDataGlobal_token = "_setCustomSettingDataGlobal_token-3224068";
        java.lang.String _setCustomSettingDataGlobal_customSettingId = "_setCustomSettingDataGlobal_customSettingId1257912908";
        com.mile.ServerCommandService.CustomSettingData _setCustomSettingDataGlobal_customSettingData = new com.mile.ServerCommandService.CustomSettingData();
        _setCustomSettingDataGlobal_customSettingData.setDataVersion(-1851041056);
        com.mile.ServerCommandService.CustomSettingData.CustomSettingDataXml _setCustomSettingDataGlobal_customSettingDataCustomSettingDataXml = new com.mile.ServerCommandService.CustomSettingData.CustomSettingDataXml();
        java.util.List<java.lang.Object> _setCustomSettingDataGlobal_customSettingDataCustomSettingDataXmlContent = new java.util.ArrayList<java.lang.Object>();
        java.lang.Object _setCustomSettingDataGlobal_customSettingDataCustomSettingDataXmlContentVal1 = null;
        _setCustomSettingDataGlobal_customSettingDataCustomSettingDataXmlContent.add(_setCustomSettingDataGlobal_customSettingDataCustomSettingDataXmlContentVal1);
        _setCustomSettingDataGlobal_customSettingDataCustomSettingDataXml.getContent().addAll(_setCustomSettingDataGlobal_customSettingDataCustomSettingDataXmlContent);
        _setCustomSettingDataGlobal_customSettingData.setCustomSettingDataXml(_setCustomSettingDataGlobal_customSettingDataCustomSettingDataXml);
        boolean _setCustomSettingDataGlobal_forceOverride = false;
        com.mile.ServerCommandService.SetCustomSettingResultType _setCustomSettingDataGlobal__return = port.setCustomSettingDataGlobal(_setCustomSettingDataGlobal_token, _setCustomSettingDataGlobal_customSettingId, _setCustomSettingDataGlobal_customSettingData, _setCustomSettingDataGlobal_forceOverride);
        System.out.println("setCustomSettingDataGlobal.result=" + _setCustomSettingDataGlobal__return);


        }
        {
        System.out.println("Invoking setCustomSettingDataUser...");
        java.lang.String _setCustomSettingDataUser_token = "_setCustomSettingDataUser_token-190905507";
        java.lang.String _setCustomSettingDataUser_customSettingId = "_setCustomSettingDataUser_customSettingId2046371637";
        com.mile.ServerCommandService.CustomSettingData _setCustomSettingDataUser_customSettingData = new com.mile.ServerCommandService.CustomSettingData();
        _setCustomSettingDataUser_customSettingData.setDataVersion(-1715682150);
        com.mile.ServerCommandService.CustomSettingData.CustomSettingDataXml _setCustomSettingDataUser_customSettingDataCustomSettingDataXml = new com.mile.ServerCommandService.CustomSettingData.CustomSettingDataXml();
        java.util.List<java.lang.Object> _setCustomSettingDataUser_customSettingDataCustomSettingDataXmlContent = new java.util.ArrayList<java.lang.Object>();
        java.lang.Object _setCustomSettingDataUser_customSettingDataCustomSettingDataXmlContentVal1 = null;
        _setCustomSettingDataUser_customSettingDataCustomSettingDataXmlContent.add(_setCustomSettingDataUser_customSettingDataCustomSettingDataXmlContentVal1);
        _setCustomSettingDataUser_customSettingDataCustomSettingDataXml.getContent().addAll(_setCustomSettingDataUser_customSettingDataCustomSettingDataXmlContent);
        _setCustomSettingDataUser_customSettingData.setCustomSettingDataXml(_setCustomSettingDataUser_customSettingDataCustomSettingDataXml);
        boolean _setCustomSettingDataUser_forceOverride = true;
        com.mile.ServerCommandService.SetCustomSettingResultType _setCustomSettingDataUser__return = port.setCustomSettingDataUser(_setCustomSettingDataUser_token, _setCustomSettingDataUser_customSettingId, _setCustomSettingDataUser_customSettingData, _setCustomSettingDataUser_forceOverride);
        System.out.println("setCustomSettingDataUser.result=" + _setCustomSettingDataUser__return);


        }
        {
        System.out.println("Invoking getServerVersion...");
        java.lang.String _getServerVersion__return = port.getServerVersion();
        System.out.println("getServerVersion.result=" + _getServerVersion__return);


        }
        {
        System.out.println("Invoking getViewGroupData...");
        java.lang.String _getViewGroupData_token = "_getViewGroupData_token-189373274";
        java.lang.String _getViewGroupData_viewGroupId = "_getViewGroupData_viewGroupId-1730560990";
        com.mile.ServerCommandService.ViewGroup _getViewGroupData__return = port.getViewGroupData(_getViewGroupData_token, _getViewGroupData_viewGroupId);
        System.out.println("getViewGroupData.result=" + _getViewGroupData__return);


        }
        {
        System.out.println("Invoking markedDataCreate...");
        java.lang.String _markedDataCreate_token = "_markedDataCreate_token1986305273";
        java.lang.String _markedDataCreate_markedDataId = "_markedDataCreate_markedDataId-1239451523";
        com.mile.ServerCommandService.ArrayOfGuid _markedDataCreate_deviceIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _markedDataCreate_deviceIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _markedDataCreate_deviceIdsGuidVal1 = "_markedDataCreate_deviceIdsGuidVal1774560328";
        _markedDataCreate_deviceIdsGuid.add(_markedDataCreate_deviceIdsGuidVal1);
        _markedDataCreate_deviceIds.getGuid().addAll(_markedDataCreate_deviceIdsGuid);
        javax.xml.datatype.XMLGregorianCalendar _markedDataCreate_timeStart = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.123-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataCreate_timeTag = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.127-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataCreate_timeEnd = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.132-04:00");
        java.lang.String _markedDataCreate_reference = "_markedDataCreate_reference-902277535";
        java.lang.String _markedDataCreate_header = "_markedDataCreate_header94501526";
        java.lang.String _markedDataCreate_description = "_markedDataCreate_description919360735";
        int _markedDataCreate_markedDataType = 2119735450;
        boolean _markedDataCreate_useRetention = false;
        javax.xml.datatype.XMLGregorianCalendar _markedDataCreate_retentionExpire = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.134-04:00");
        com.mile.ServerCommandService.RetentionOption _markedDataCreate_retentionOption = new com.mile.ServerCommandService.RetentionOption();
        _markedDataCreate_retentionOption.setRetentionUnits(705997822);
        com.mile.ServerCommandService.RetentionOptionType _markedDataCreate_retentionOptionRetentionOptionType = com.mile.ServerCommandService.RetentionOptionType.YEARS;
        _markedDataCreate_retentionOption.setRetentionOptionType(_markedDataCreate_retentionOptionRetentionOptionType);
        com.mile.ServerCommandService.MarkedDataResult _markedDataCreate__return = port.markedDataCreate(_markedDataCreate_token, _markedDataCreate_markedDataId, _markedDataCreate_deviceIds, _markedDataCreate_timeStart, _markedDataCreate_timeTag, _markedDataCreate_timeEnd, _markedDataCreate_reference, _markedDataCreate_header, _markedDataCreate_description, _markedDataCreate_markedDataType, _markedDataCreate_useRetention, _markedDataCreate_retentionExpire, _markedDataCreate_retentionOption);
        System.out.println("markedDataCreate.result=" + _markedDataCreate__return);


        }
        {
        System.out.println("Invoking matrixMonitorActivateCamera...");
        java.lang.String _matrixMonitorActivateCamera_token = "_matrixMonitorActivateCamera_token1898834942";
        java.lang.String _matrixMonitorActivateCamera_matrixMonitorId = "_matrixMonitorActivateCamera_matrixMonitorId-582866928";
        java.lang.String _matrixMonitorActivateCamera_deviceId = "_matrixMonitorActivateCamera_deviceId-1001005456";
        port.matrixMonitorActivateCamera(_matrixMonitorActivateCamera_token, _matrixMonitorActivateCamera_matrixMonitorId, _matrixMonitorActivateCamera_deviceId);


        }
        {
        System.out.println("Invoking updatePresetPosition...");
        java.lang.String _updatePresetPosition_token = "_updatePresetPosition_token-1288875464";
        java.lang.String _updatePresetPosition_id = "_updatePresetPosition_id-1432933566";
        java.lang.String _updatePresetPosition_deviceId = "_updatePresetPosition_deviceId286775641";
        port.updatePresetPosition(_updatePresetPosition_token, _updatePresetPosition_id, _updatePresetPosition_deviceId);


        }
        {
        System.out.println("Invoking getCustomSettingDataUser...");
        java.lang.String _getCustomSettingDataUser_token = "_getCustomSettingDataUser_token-311563036";
        java.lang.String _getCustomSettingDataUser_customSettingId = "_getCustomSettingDataUser_customSettingId-202968929";
        com.mile.ServerCommandService.CustomSetting _getCustomSettingDataUser__return = port.getCustomSettingDataUser(_getCustomSettingDataUser_token, _getCustomSettingDataUser_customSettingId);
        System.out.println("getCustomSettingDataUser.result=" + _getCustomSettingDataUser__return);


        }
        {
        System.out.println("Invoking getVersion...");
        int _getVersion__return = port.getVersion();
        System.out.println("getVersion.result=" + _getVersion__return);


        }
        {
        System.out.println("Invoking logout...");
        java.lang.String _logout_instanceId = "_logout_instanceId-1033841080";
        java.lang.String _logout_currentToken = "_logout_currentToken-256447983";
        port.logout(_logout_instanceId, _logout_currentToken);


        }
        {
        System.out.println("Invoking markedDataSearch...");
        java.lang.String _markedDataSearch_token = "_markedDataSearch_token19503951";
        com.mile.ServerCommandService.ArrayOfGuid _markedDataSearch_deviceIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _markedDataSearch_deviceIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _markedDataSearch_deviceIdsGuidVal1 = "_markedDataSearch_deviceIdsGuidVal539752449";
        _markedDataSearch_deviceIdsGuid.add(_markedDataSearch_deviceIdsGuidVal1);
        _markedDataSearch_deviceIds.getGuid().addAll(_markedDataSearch_deviceIdsGuid);
        java.lang.String _markedDataSearch_searchText = "_markedDataSearch_searchText446191336";
        com.mile.ServerCommandService.ArrayOfString _markedDataSearch_users = new com.mile.ServerCommandService.ArrayOfString();
        java.util.List<java.lang.String> _markedDataSearch_usersString = new java.util.ArrayList<java.lang.String>();
        java.lang.String _markedDataSearch_usersStringVal1 = "_markedDataSearch_usersStringVal-2018799109";
        _markedDataSearch_usersString.add(_markedDataSearch_usersStringVal1);
        _markedDataSearch_users.getString().addAll(_markedDataSearch_usersString);
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_createdFromTime = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.148-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_createdToTime = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.148-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_markedDataFromTime = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.149-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_markedDataToTime = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.150-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_tagTimeFromTime = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.150-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_tagTimeToTime = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.151-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_retentionExpireFrom = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.152-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataSearch_retentionExpireTo = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.152-04:00");
        int _markedDataSearch_pageIndex = -1166982619;
        int _markedDataSearch_pageSize = -1237028718;
        com.mile.ServerCommandService.SortOrderOption _markedDataSearch_sortOrder = com.mile.ServerCommandService.SortOrderOption.USER_NAME;
        boolean _markedDataSearch_sortAscending = true;
        com.mile.ServerCommandService.ArrayOfMarkedData _markedDataSearch__return = port.markedDataSearch(_markedDataSearch_token, _markedDataSearch_deviceIds, _markedDataSearch_searchText, _markedDataSearch_users, _markedDataSearch_createdFromTime, _markedDataSearch_createdToTime, _markedDataSearch_markedDataFromTime, _markedDataSearch_markedDataToTime, _markedDataSearch_tagTimeFromTime, _markedDataSearch_tagTimeToTime, _markedDataSearch_retentionExpireFrom, _markedDataSearch_retentionExpireTo, _markedDataSearch_pageIndex, _markedDataSearch_pageSize, _markedDataSearch_sortOrder, _markedDataSearch_sortAscending);
        System.out.println("markedDataSearch.result=" + _markedDataSearch__return);


        }
        {
        System.out.println("Invoking bookmarkCreate...");
        java.lang.String _bookmarkCreate_token = "_bookmarkCreate_token1156099615";
        java.lang.String _bookmarkCreate_deviceId = "_bookmarkCreate_deviceId1026110743";
        javax.xml.datatype.XMLGregorianCalendar _bookmarkCreate_timeBegin = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.154-04:00");
        javax.xml.datatype.XMLGregorianCalendar _bookmarkCreate_timeTrigged = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.155-04:00");
        javax.xml.datatype.XMLGregorianCalendar _bookmarkCreate_timeEnd = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.157-04:00");
        java.lang.String _bookmarkCreate_reference = "_bookmarkCreate_reference123701052";
        java.lang.String _bookmarkCreate_header = "_bookmarkCreate_header-1827587476";
        java.lang.String _bookmarkCreate_description = "_bookmarkCreate_description1313257534";
        com.mile.ServerCommandService.Bookmark _bookmarkCreate__return = port.bookmarkCreate(_bookmarkCreate_token, _bookmarkCreate_deviceId, _bookmarkCreate_timeBegin, _bookmarkCreate_timeTrigged, _bookmarkCreate_timeEnd, _bookmarkCreate_reference, _bookmarkCreate_header, _bookmarkCreate_description);
        System.out.println("bookmarkCreate.result=" + _bookmarkCreate__return);


        }
        {
        System.out.println("Invoking getVmoServicesList...");
        com.mile.ServerCommandService.ArrayOfDictionaryEntry _getVmoServicesList__return = port.getVmoServicesList();
        System.out.println("getVmoServicesList.result=" + _getVmoServicesList__return);


        }
        {
        System.out.println("Invoking markedDataUpdate...");
        java.lang.String _markedDataUpdate_token = "_markedDataUpdate_token-183286635";
        java.lang.String _markedDataUpdate_markedDataId = "_markedDataUpdate_markedDataId316764660";
        com.mile.ServerCommandService.ArrayOfGuid _markedDataUpdate_deviceIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _markedDataUpdate_deviceIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _markedDataUpdate_deviceIdsGuidVal1 = "_markedDataUpdate_deviceIdsGuidVal2103800941";
        _markedDataUpdate_deviceIdsGuid.add(_markedDataUpdate_deviceIdsGuidVal1);
        _markedDataUpdate_deviceIds.getGuid().addAll(_markedDataUpdate_deviceIdsGuid);
        javax.xml.datatype.XMLGregorianCalendar _markedDataUpdate_timeStart = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.160-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataUpdate_timeTag = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.160-04:00");
        javax.xml.datatype.XMLGregorianCalendar _markedDataUpdate_timeEnd = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.161-04:00");
        java.lang.String _markedDataUpdate_reference = "_markedDataUpdate_reference-1421878770";
        java.lang.String _markedDataUpdate_header = "_markedDataUpdate_header2000812874";
        java.lang.String _markedDataUpdate_description = "_markedDataUpdate_description-560684588";
        int _markedDataUpdate_markedDataType = 1951803261;
        boolean _markedDataUpdate_useRetention = false;
        javax.xml.datatype.XMLGregorianCalendar _markedDataUpdate_retentionExpire = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.169-04:00");
        com.mile.ServerCommandService.RetentionOption _markedDataUpdate_retentionOption = new com.mile.ServerCommandService.RetentionOption();
        _markedDataUpdate_retentionOption.setRetentionUnits(389506785);
        com.mile.ServerCommandService.RetentionOptionType _markedDataUpdate_retentionOptionRetentionOptionType = com.mile.ServerCommandService.RetentionOptionType.DAYS;
        _markedDataUpdate_retentionOption.setRetentionOptionType(_markedDataUpdate_retentionOptionRetentionOptionType);
        com.mile.ServerCommandService.MarkedDataResult _markedDataUpdate__return = port.markedDataUpdate(_markedDataUpdate_token, _markedDataUpdate_markedDataId, _markedDataUpdate_deviceIds, _markedDataUpdate_timeStart, _markedDataUpdate_timeTag, _markedDataUpdate_timeEnd, _markedDataUpdate_reference, _markedDataUpdate_header, _markedDataUpdate_description, _markedDataUpdate_markedDataType, _markedDataUpdate_useRetention, _markedDataUpdate_retentionExpire, _markedDataUpdate_retentionOption);
        System.out.println("markedDataUpdate.result=" + _markedDataUpdate__return);


        }
        {
        System.out.println("Invoking checkSmartClientVersion...");
        int _checkSmartClientVersion_major = 1690765835;
        int _checkSmartClientVersion_minor = -1923207919;
        java.lang.String _checkSmartClientVersion_revision = "_checkSmartClientVersion_revision1609116128";
        com.mile.ServerCommandService.SmartClientVersion _checkSmartClientVersion__return = port.checkSmartClientVersion(_checkSmartClientVersion_major, _checkSmartClientVersion_minor, _checkSmartClientVersion_revision);
        System.out.println("checkSmartClientVersion.result=" + _checkSmartClientVersion__return);


        }
        {
        System.out.println("Invoking getConfigurationHardware...");
        java.lang.String _getConfigurationHardware_token = "_getConfigurationHardware_token951836327";
        com.mile.ServerCommandService.ArrayOfGuid _getConfigurationHardware_hardwareIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _getConfigurationHardware_hardwareIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _getConfigurationHardware_hardwareIdsGuidVal1 = "_getConfigurationHardware_hardwareIdsGuidVal1250728597";
        _getConfigurationHardware_hardwareIdsGuid.add(_getConfigurationHardware_hardwareIdsGuidVal1);
        _getConfigurationHardware_hardwareIds.getGuid().addAll(_getConfigurationHardware_hardwareIdsGuid);
        com.mile.ServerCommandService.ArrayOfHardwareInfo _getConfigurationHardware__return = port.getConfigurationHardware(_getConfigurationHardware_token, _getConfigurationHardware_hardwareIds);
        System.out.println("getConfigurationHardware.result=" + _getConfigurationHardware__return);


        }
        {
        System.out.println("Invoking getViewGroups...");
        java.lang.String _getViewGroups_token = "_getViewGroups_token1258391038";
        com.mile.ServerCommandService.ArrayOfViewGroupInfo _getViewGroups__return = port.getViewGroups(_getViewGroups_token);
        System.out.println("getViewGroups.result=" + _getViewGroups__return);


        }
        {
        System.out.println("Invoking bookmarkGetNewReference...");
        java.lang.String _bookmarkGetNewReference_token = "_bookmarkGetNewReference_token-1940413852";
        java.lang.String _bookmarkGetNewReference_deviceId = "_bookmarkGetNewReference_deviceId-813265553";
        boolean _bookmarkGetNewReference_live = true;
        com.mile.ServerCommandService.BookmarkReference _bookmarkGetNewReference__return = port.bookmarkGetNewReference(_bookmarkGetNewReference_token, _bookmarkGetNewReference_deviceId, _bookmarkGetNewReference_live);
        System.out.println("bookmarkGetNewReference.result=" + _bookmarkGetNewReference__return);


        }
        {
        System.out.println("Invoking getPresets...");
        java.lang.String _getPresets_token = "_getPresets_token-1459481507";
        java.lang.String _getPresets_deviceId = "_getPresets_deviceId-203143152";
        com.mile.ServerCommandService.ArrayOfPresetInfo _getPresets__return = port.getPresets(_getPresets_token, _getPresets_deviceId);
        System.out.println("getPresets.result=" + _getPresets__return);


        }
        {
        System.out.println("Invoking bookmarkSearchTime...");
        java.lang.String _bookmarkSearchTime_token = "_bookmarkSearchTime_token274739346";
        javax.xml.datatype.XMLGregorianCalendar _bookmarkSearchTime_time = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.173-04:00");
        com.mile.ServerCommandService.TimeDuration _bookmarkSearchTime_timeLimit = new com.mile.ServerCommandService.TimeDuration();
        _bookmarkSearchTime_timeLimit.setMicroSeconds(-18788261801248460l);
        int _bookmarkSearchTime_countLimit = -623151805;
        com.mile.ServerCommandService.ArrayOfMediaDeviceType _bookmarkSearchTime_deviceTypes = new com.mile.ServerCommandService.ArrayOfMediaDeviceType();
        java.util.List<com.mile.ServerCommandService.MediaDeviceType> _bookmarkSearchTime_deviceTypesMediaDeviceType = new java.util.ArrayList<com.mile.ServerCommandService.MediaDeviceType>();
        com.mile.ServerCommandService.MediaDeviceType _bookmarkSearchTime_deviceTypesMediaDeviceTypeVal1 = com.mile.ServerCommandService.MediaDeviceType.MICROPHONE;
        _bookmarkSearchTime_deviceTypesMediaDeviceType.add(_bookmarkSearchTime_deviceTypesMediaDeviceTypeVal1);
        _bookmarkSearchTime_deviceTypes.getMediaDeviceType().addAll(_bookmarkSearchTime_deviceTypesMediaDeviceType);
        com.mile.ServerCommandService.ArrayOfGuid _bookmarkSearchTime_optDeviceIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _bookmarkSearchTime_optDeviceIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _bookmarkSearchTime_optDeviceIdsGuidVal1 = "_bookmarkSearchTime_optDeviceIdsGuidVal70681412";
        _bookmarkSearchTime_optDeviceIdsGuid.add(_bookmarkSearchTime_optDeviceIdsGuidVal1);
        _bookmarkSearchTime_optDeviceIds.getGuid().addAll(_bookmarkSearchTime_optDeviceIdsGuid);
        com.mile.ServerCommandService.ArrayOfString _bookmarkSearchTime_optUsers = new com.mile.ServerCommandService.ArrayOfString();
        java.util.List<java.lang.String> _bookmarkSearchTime_optUsersString = new java.util.ArrayList<java.lang.String>();
        java.lang.String _bookmarkSearchTime_optUsersStringVal1 = "_bookmarkSearchTime_optUsersStringVal-1083932434";
        _bookmarkSearchTime_optUsersString.add(_bookmarkSearchTime_optUsersStringVal1);
        _bookmarkSearchTime_optUsers.getString().addAll(_bookmarkSearchTime_optUsersString);
        java.lang.String _bookmarkSearchTime_optSearchStr = "_bookmarkSearchTime_optSearchStr775229320";
        com.mile.ServerCommandService.ArrayOfBookmark _bookmarkSearchTime__return = port.bookmarkSearchTime(_bookmarkSearchTime_token, _bookmarkSearchTime_time, _bookmarkSearchTime_timeLimit, _bookmarkSearchTime_countLimit, _bookmarkSearchTime_deviceTypes, _bookmarkSearchTime_optDeviceIds, _bookmarkSearchTime_optUsers, _bookmarkSearchTime_optSearchStr);
        System.out.println("bookmarkSearchTime.result=" + _bookmarkSearchTime__return);


        }
        {
        System.out.println("Invoking markedDataGetNewReference...");
        java.lang.String _markedDataGetNewReference_token = "_markedDataGetNewReference_token-806208045";
        com.mile.ServerCommandService.ArrayOfGuid _markedDataGetNewReference_deviceIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _markedDataGetNewReference_deviceIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _markedDataGetNewReference_deviceIdsGuidVal1 = "_markedDataGetNewReference_deviceIdsGuidVal-1709572525";
        _markedDataGetNewReference_deviceIdsGuid.add(_markedDataGetNewReference_deviceIdsGuidVal1);
        _markedDataGetNewReference_deviceIds.getGuid().addAll(_markedDataGetNewReference_deviceIdsGuid);
        boolean _markedDataGetNewReference_live = true;
        com.mile.ServerCommandService.MarkedDataReference _markedDataGetNewReference__return = port.markedDataGetNewReference(_markedDataGetNewReference_token, _markedDataGetNewReference_deviceIds, _markedDataGetNewReference_live);
        System.out.println("markedDataGetNewReference.result=" + _markedDataGetNewReference__return);


        }
        {
        System.out.println("Invoking getClientProfile...");
        java.lang.String _getClientProfile_token = "_getClientProfile_token1506984786";
        boolean _getClientProfile_withSetting = false;
        com.mile.ServerCommandService.ClientProfile _getClientProfile__return = port.getClientProfile(_getClientProfile_token, _getClientProfile_withSetting);
        System.out.println("getClientProfile.result=" + _getClientProfile__return);


        }
        {
        System.out.println("Invoking bookmarkUpdate...");
        java.lang.String _bookmarkUpdate_token = "_bookmarkUpdate_token981947035";
        java.lang.String _bookmarkUpdate_bookmarkId = "_bookmarkUpdate_bookmarkId-474735613";
        java.lang.String _bookmarkUpdate_deviceId = "_bookmarkUpdate_deviceId-1984313624";
        javax.xml.datatype.XMLGregorianCalendar _bookmarkUpdate_timeBegin = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.177-04:00");
        javax.xml.datatype.XMLGregorianCalendar _bookmarkUpdate_timeTrigged = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.177-04:00");
        javax.xml.datatype.XMLGregorianCalendar _bookmarkUpdate_timeEnd = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.178-04:00");
        java.lang.String _bookmarkUpdate_reference = "_bookmarkUpdate_reference39708817";
        java.lang.String _bookmarkUpdate_header = "_bookmarkUpdate_header-1706290392";
        java.lang.String _bookmarkUpdate_description = "_bookmarkUpdate_description1293233293";
        com.mile.ServerCommandService.Bookmark _bookmarkUpdate__return = port.bookmarkUpdate(_bookmarkUpdate_token, _bookmarkUpdate_bookmarkId, _bookmarkUpdate_deviceId, _bookmarkUpdate_timeBegin, _bookmarkUpdate_timeTrigged, _bookmarkUpdate_timeEnd, _bookmarkUpdate_reference, _bookmarkUpdate_header, _bookmarkUpdate_description);
        System.out.println("bookmarkUpdate.result=" + _bookmarkUpdate__return);


        }
        {
        System.out.println("Invoking getProductInfo...");
        com.mile.ServerCommandService.ProductInfo _getProductInfo__return = port.getProductInfo();
        System.out.println("getProductInfo.result=" + _getProductInfo__return);


        }
        {
        System.out.println("Invoking createPreset...");
        java.lang.String _createPreset_token = "_createPreset_token1546737822";
        java.lang.String _createPreset_deviceId = "_createPreset_deviceId-1194518947";
        java.lang.String _createPreset_name = "_createPreset_name-858550238";
        java.lang.String _createPreset__return = port.createPreset(_createPreset_token, _createPreset_deviceId, _createPreset_name);
        System.out.println("createPreset.result=" + _createPreset__return);


        }
        {
        System.out.println("Invoking isOnline...");
        boolean _isOnline__return = port.isOnline();
        System.out.println("isOnline.result=" + _isOnline__return);


        }
        {
        System.out.println("Invoking queryRecorderInfo...");
        java.lang.String _queryRecorderInfo_token = "_queryRecorderInfo_token890407839";
        java.lang.String _queryRecorderInfo_recorderId = "_queryRecorderInfo_recorderId-477205435";
        com.mile.ServerCommandService.RecorderInfo _queryRecorderInfo__return = port.queryRecorderInfo(_queryRecorderInfo_token, _queryRecorderInfo_recorderId);
        System.out.println("queryRecorderInfo.result=" + _queryRecorderInfo__return);


        }
        {
        System.out.println("Invoking getCustomSettingDataGlobal...");
        java.lang.String _getCustomSettingDataGlobal_token = "_getCustomSettingDataGlobal_token815294289";
        java.lang.String _getCustomSettingDataGlobal_customSettingId = "_getCustomSettingDataGlobal_customSettingId-1862827166";
        com.mile.ServerCommandService.CustomSetting _getCustomSettingDataGlobal__return = port.getCustomSettingDataGlobal(_getCustomSettingDataGlobal_token, _getCustomSettingDataGlobal_customSettingId);
        System.out.println("getCustomSettingDataGlobal.result=" + _getCustomSettingDataGlobal__return);


        }
        {
        System.out.println("Invoking getConfigurationRecorders...");
        java.lang.String _getConfigurationRecorders_token = "_getConfigurationRecorders_token1648772566";
        com.mile.ServerCommandService.ArrayOfGuid _getConfigurationRecorders_recorderIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _getConfigurationRecorders_recorderIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _getConfigurationRecorders_recorderIdsGuidVal1 = "_getConfigurationRecorders_recorderIdsGuidVal369638372";
        _getConfigurationRecorders_recorderIdsGuid.add(_getConfigurationRecorders_recorderIdsGuidVal1);
        _getConfigurationRecorders_recorderIds.getGuid().addAll(_getConfigurationRecorders_recorderIdsGuid);
        com.mile.ServerCommandService.ArrayOfRecorderInfo _getConfigurationRecorders__return = port.getConfigurationRecorders(_getConfigurationRecorders_token, _getConfigurationRecorders_recorderIds);
        System.out.println("getConfigurationRecorders.result=" + _getConfigurationRecorders__return);


        }
        {
        System.out.println("Invoking getSystemLicenseInfo...");
        com.mile.ServerCommandService.SystemLicenseInfo _getSystemLicenseInfo__return = port.getSystemLicenseInfo();
        System.out.println("getSystemLicenseInfo.result=" + _getSystemLicenseInfo__return);


        }
        {
        System.out.println("Invoking alertsGetAroundWithSpan...");
        java.lang.String _alertsGetAroundWithSpan_token = "_alertsGetAroundWithSpan_token-792813675";
        com.mile.ServerCommandService.ArrayOfGuid _alertsGetAroundWithSpan_alertIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _alertsGetAroundWithSpan_alertIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _alertsGetAroundWithSpan_alertIdsGuidVal1 = "_alertsGetAroundWithSpan_alertIdsGuidVal1347842632";
        _alertsGetAroundWithSpan_alertIdsGuid.add(_alertsGetAroundWithSpan_alertIdsGuidVal1);
        _alertsGetAroundWithSpan_alertIds.getGuid().addAll(_alertsGetAroundWithSpan_alertIdsGuid);
        javax.xml.datatype.XMLGregorianCalendar _alertsGetAroundWithSpan_centerTime = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.205-04:00");
        com.mile.ServerCommandService.TimeDuration _alertsGetAroundWithSpan_maxTimeBefore = new com.mile.ServerCommandService.TimeDuration();
        _alertsGetAroundWithSpan_maxTimeBefore.setMicroSeconds(-8339040290728267865l);
        int _alertsGetAroundWithSpan_maxCountBefore = -1129779838;
        com.mile.ServerCommandService.TimeDuration _alertsGetAroundWithSpan_maxTimeAfter = new com.mile.ServerCommandService.TimeDuration();
        _alertsGetAroundWithSpan_maxTimeAfter.setMicroSeconds(9137197584652839379l);
        int _alertsGetAroundWithSpan_maxCountAfter = 799461655;
        com.mile.ServerCommandService.ArrayOfAlertOccurrence _alertsGetAroundWithSpan__return = port.alertsGetAroundWithSpan(_alertsGetAroundWithSpan_token, _alertsGetAroundWithSpan_alertIds, _alertsGetAroundWithSpan_centerTime, _alertsGetAroundWithSpan_maxTimeBefore, _alertsGetAroundWithSpan_maxCountBefore, _alertsGetAroundWithSpan_maxTimeAfter, _alertsGetAroundWithSpan_maxCountAfter);
        System.out.println("alertsGetAroundWithSpan.result=" + _alertsGetAroundWithSpan__return);


        }
        {
        System.out.println("Invoking queryChanges...");
        java.lang.String _queryChanges_token = "_queryChanges_token1364111056";
        javax.xml.datatype.XMLGregorianCalendar _queryChanges_changesFrom = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-09-13T12:46:27.207-04:00");
        com.mile.ServerCommandService.ArrayOfChange _queryChanges__return = port.queryChanges(_queryChanges_token, _queryChanges_changesFrom);
        System.out.println("queryChanges.result=" + _queryChanges__return);


        }
        {
        System.out.println("Invoking querySystemMonitorStateSourcesByIds...");
        com.mile.ServerCommandService.ArrayOfString _querySystemMonitorStateSourcesByIds_ids = new com.mile.ServerCommandService.ArrayOfString();
        java.util.List<java.lang.String> _querySystemMonitorStateSourcesByIds_idsString = new java.util.ArrayList<java.lang.String>();
        java.lang.String _querySystemMonitorStateSourcesByIds_idsStringVal1 = "_querySystemMonitorStateSourcesByIds_idsStringVal-83660336";
        _querySystemMonitorStateSourcesByIds_idsString.add(_querySystemMonitorStateSourcesByIds_idsStringVal1);
        _querySystemMonitorStateSourcesByIds_ids.getString().addAll(_querySystemMonitorStateSourcesByIds_idsString);
        com.mile.ServerCommandService.ArrayOfSystemMonitorStateSource _querySystemMonitorStateSourcesByIds__return = port.querySystemMonitorStateSourcesByIds(_querySystemMonitorStateSourcesByIds_ids);
        System.out.println("querySystemMonitorStateSourcesByIds.result=" + _querySystemMonitorStateSourcesByIds__return);


        }
        {
        System.out.println("Invoking eventTrigger...");
        java.lang.String _eventTrigger_token = "_eventTrigger_token-1181779121";
        java.lang.String _eventTrigger_eventId = "_eventTrigger_eventId1323875723";
        port.eventTrigger(_eventTrigger_token, _eventTrigger_eventId);


        }
        {
        System.out.println("Invoking bookmarkSearchFromBookmark...");
        java.lang.String _bookmarkSearchFromBookmark_token = "_bookmarkSearchFromBookmark_token1491985395";
        java.lang.String _bookmarkSearchFromBookmark_fromBookmarkId = "_bookmarkSearchFromBookmark_fromBookmarkId-473288512";
        com.mile.ServerCommandService.TimeDuration _bookmarkSearchFromBookmark_timeLimit = new com.mile.ServerCommandService.TimeDuration();
        _bookmarkSearchFromBookmark_timeLimit.setMicroSeconds(2233212710509464542l);
        int _bookmarkSearchFromBookmark_countLimit = 1045231041;
        com.mile.ServerCommandService.ArrayOfMediaDeviceType _bookmarkSearchFromBookmark_deviceTypes = new com.mile.ServerCommandService.ArrayOfMediaDeviceType();
        java.util.List<com.mile.ServerCommandService.MediaDeviceType> _bookmarkSearchFromBookmark_deviceTypesMediaDeviceType = new java.util.ArrayList<com.mile.ServerCommandService.MediaDeviceType>();
        com.mile.ServerCommandService.MediaDeviceType _bookmarkSearchFromBookmark_deviceTypesMediaDeviceTypeVal1 = com.mile.ServerCommandService.MediaDeviceType.CAMERA;
        _bookmarkSearchFromBookmark_deviceTypesMediaDeviceType.add(_bookmarkSearchFromBookmark_deviceTypesMediaDeviceTypeVal1);
        _bookmarkSearchFromBookmark_deviceTypes.getMediaDeviceType().addAll(_bookmarkSearchFromBookmark_deviceTypesMediaDeviceType);
        com.mile.ServerCommandService.ArrayOfGuid _bookmarkSearchFromBookmark_optDeviceIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _bookmarkSearchFromBookmark_optDeviceIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _bookmarkSearchFromBookmark_optDeviceIdsGuidVal1 = "_bookmarkSearchFromBookmark_optDeviceIdsGuidVal1264353212";
        _bookmarkSearchFromBookmark_optDeviceIdsGuid.add(_bookmarkSearchFromBookmark_optDeviceIdsGuidVal1);
        _bookmarkSearchFromBookmark_optDeviceIds.getGuid().addAll(_bookmarkSearchFromBookmark_optDeviceIdsGuid);
        com.mile.ServerCommandService.ArrayOfString _bookmarkSearchFromBookmark_optUsers = new com.mile.ServerCommandService.ArrayOfString();
        java.util.List<java.lang.String> _bookmarkSearchFromBookmark_optUsersString = new java.util.ArrayList<java.lang.String>();
        java.lang.String _bookmarkSearchFromBookmark_optUsersStringVal1 = "_bookmarkSearchFromBookmark_optUsersStringVal39377249";
        _bookmarkSearchFromBookmark_optUsersString.add(_bookmarkSearchFromBookmark_optUsersStringVal1);
        _bookmarkSearchFromBookmark_optUsers.getString().addAll(_bookmarkSearchFromBookmark_optUsersString);
        java.lang.String _bookmarkSearchFromBookmark_optSearchStr = "_bookmarkSearchFromBookmark_optSearchStr278966615";
        com.mile.ServerCommandService.ArrayOfBookmark _bookmarkSearchFromBookmark__return = port.bookmarkSearchFromBookmark(_bookmarkSearchFromBookmark_token, _bookmarkSearchFromBookmark_fromBookmarkId, _bookmarkSearchFromBookmark_timeLimit, _bookmarkSearchFromBookmark_countLimit, _bookmarkSearchFromBookmark_deviceTypes, _bookmarkSearchFromBookmark_optDeviceIds, _bookmarkSearchFromBookmark_optUsers, _bookmarkSearchFromBookmark_optSearchStr);
        System.out.println("bookmarkSearchFromBookmark.result=" + _bookmarkSearchFromBookmark__return);


        }
        {
        System.out.println("Invoking markedDataDelete...");
        java.lang.String _markedDataDelete_token = "_markedDataDelete_token-1687119182";
        com.mile.ServerCommandService.ArrayOfGuid _markedDataDelete_markedDataIds = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _markedDataDelete_markedDataIdsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _markedDataDelete_markedDataIdsGuidVal1 = "_markedDataDelete_markedDataIdsGuidVal1182521056";
        _markedDataDelete_markedDataIdsGuid.add(_markedDataDelete_markedDataIdsGuidVal1);
        _markedDataDelete_markedDataIds.getGuid().addAll(_markedDataDelete_markedDataIdsGuid);
        com.mile.ServerCommandService.ArrayOfMarkedDataResult _markedDataDelete__return = port.markedDataDelete(_markedDataDelete_token, _markedDataDelete_markedDataIds);
        System.out.println("markedDataDelete.result=" + _markedDataDelete__return);


        }
        {
        System.out.println("Invoking markedDataGet...");
        java.lang.String _markedDataGet_token = "_markedDataGet_token-782372333";
        java.lang.String _markedDataGet_markedDataId = "_markedDataGet_markedDataId1702600253";
        com.mile.ServerCommandService.MarkedData _markedDataGet__return = port.markedDataGet(_markedDataGet_token, _markedDataGet_markedDataId);
        System.out.println("markedDataGet.result=" + _markedDataGet__return);


        }
        {
        System.out.println("Invoking login...");
        java.lang.String _login_instanceId = "_login_instanceId392302269";
        java.lang.String _login_currentToken = "_login_currentToken2059295332";
        com.mile.ServerCommandService.LoginInfo _login__return = port.login(_login_instanceId, _login_currentToken);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking getSmartClientVersion...");
        com.mile.ServerCommandService.SmartClientVersion _getSmartClientVersion__return = port.getSmartClientVersion();
        System.out.println("getSmartClientVersion.result=" + _getSmartClientVersion__return);


        }
        {
        System.out.println("Invoking updatePresetName...");
        java.lang.String _updatePresetName_token = "_updatePresetName_token-1676294129";
        java.lang.String _updatePresetName_id = "_updatePresetName_id-1260776760";
        java.lang.String _updatePresetName_deviceId = "_updatePresetName_deviceId-987052376";
        java.lang.String _updatePresetName_newName = "_updatePresetName_newName-463976138";
        port.updatePresetName(_updatePresetName_token, _updatePresetName_id, _updatePresetName_deviceId, _updatePresetName_newName);


        }
        {
        System.out.println("Invoking eventTriggerWithMetadata...");
        java.lang.String _eventTriggerWithMetadata_token = "_eventTriggerWithMetadata_token875343429";
        java.lang.String _eventTriggerWithMetadata_eventId = "_eventTriggerWithMetadata_eventId-290411840";
        com.mile.ServerCommandService.ArrayOfKeyValue _eventTriggerWithMetadata_metadata = new com.mile.ServerCommandService.ArrayOfKeyValue();
        java.util.List<com.mile.ServerCommandService.KeyValue> _eventTriggerWithMetadata_metadataKeyValue = new java.util.ArrayList<com.mile.ServerCommandService.KeyValue>();
        com.mile.ServerCommandService.KeyValue _eventTriggerWithMetadata_metadataKeyValueVal1 = new com.mile.ServerCommandService.KeyValue();
        _eventTriggerWithMetadata_metadataKeyValueVal1.setKey("Key-2077645876");
        _eventTriggerWithMetadata_metadataKeyValueVal1.setValue("Value-958344032");
        _eventTriggerWithMetadata_metadataKeyValue.add(_eventTriggerWithMetadata_metadataKeyValueVal1);
        _eventTriggerWithMetadata_metadata.getKeyValue().addAll(_eventTriggerWithMetadata_metadataKeyValue);
        port.eventTriggerWithMetadata(_eventTriggerWithMetadata_token, _eventTriggerWithMetadata_eventId, _eventTriggerWithMetadata_metadata);


        }
        {
        System.out.println("Invoking querySystemMonitorStateSourcesByTypes...");
        com.mile.ServerCommandService.ArrayOfString _querySystemMonitorStateSourcesByTypes_types = new com.mile.ServerCommandService.ArrayOfString();
        java.util.List<java.lang.String> _querySystemMonitorStateSourcesByTypes_typesString = new java.util.ArrayList<java.lang.String>();
        java.lang.String _querySystemMonitorStateSourcesByTypes_typesStringVal1 = "_querySystemMonitorStateSourcesByTypes_typesStringVal1656359532";
        _querySystemMonitorStateSourcesByTypes_typesString.add(_querySystemMonitorStateSourcesByTypes_typesStringVal1);
        _querySystemMonitorStateSourcesByTypes_types.getString().addAll(_querySystemMonitorStateSourcesByTypes_typesString);
        com.mile.ServerCommandService.ArrayOfSystemMonitorStateSource _querySystemMonitorStateSourcesByTypes__return = port.querySystemMonitorStateSourcesByTypes(_querySystemMonitorStateSourcesByTypes_types);
        System.out.println("querySystemMonitorStateSourcesByTypes.result=" + _querySystemMonitorStateSourcesByTypes__return);


        }
        {
        System.out.println("Invoking setViewGroupData...");
        java.lang.String _setViewGroupData_token = "_setViewGroupData_token-409402303";
        java.lang.String _setViewGroupData_viewGroupId = "_setViewGroupData_viewGroupId18613180";
        com.mile.ServerCommandService.ViewGroupData _setViewGroupData_viewGroupdata = new com.mile.ServerCommandService.ViewGroupData();
        _setViewGroupData_viewGroupdata.setDataVersion(621576652);
        _setViewGroupData_viewGroupdata.setXmlVersion(-1276612041);
        com.mile.ServerCommandService.ViewGroupData.ViewGroupDataXml _setViewGroupData_viewGroupdataViewGroupDataXml = new com.mile.ServerCommandService.ViewGroupData.ViewGroupDataXml();
        java.util.List<java.lang.Object> _setViewGroupData_viewGroupdataViewGroupDataXmlContent = new java.util.ArrayList<java.lang.Object>();
        java.lang.Object _setViewGroupData_viewGroupdataViewGroupDataXmlContentVal1 = null;
        _setViewGroupData_viewGroupdataViewGroupDataXmlContent.add(_setViewGroupData_viewGroupdataViewGroupDataXmlContentVal1);
        _setViewGroupData_viewGroupdataViewGroupDataXml.getContent().addAll(_setViewGroupData_viewGroupdataViewGroupDataXmlContent);
        _setViewGroupData_viewGroupdata.setViewGroupDataXml(_setViewGroupData_viewGroupdataViewGroupDataXml);
        com.mile.ServerCommandService.SetViewGroupDataResultType _setViewGroupData__return = port.setViewGroupData(_setViewGroupData_token, _setViewGroupData_viewGroupId, _setViewGroupData_viewGroupdata);
        System.out.println("setViewGroupData.result=" + _setViewGroupData__return);


        }
        {
        System.out.println("Invoking getDevicesDisabled...");
        java.lang.String _getDevicesDisabled_token = "_getDevicesDisabled_token496166630";
        com.mile.ServerCommandService.ArrayOfDeviceDisabledInfo _getDevicesDisabled__return = port.getDevicesDisabled(_getDevicesDisabled_token);
        System.out.println("getDevicesDisabled.result=" + _getDevicesDisabled__return);


        }
        {
        System.out.println("Invoking bookmarkDelete...");
        java.lang.String _bookmarkDelete_token = "_bookmarkDelete_token1387643541";
        java.lang.String _bookmarkDelete_bookmarkId = "_bookmarkDelete_bookmarkId-51535991";
        port.bookmarkDelete(_bookmarkDelete_token, _bookmarkDelete_bookmarkId);


        }
        {
        System.out.println("Invoking orderPresets...");
        java.lang.String _orderPresets_token = "_orderPresets_token-1863981114";
        java.lang.String _orderPresets_deviceId = "_orderPresets_deviceId-326223581";
        com.mile.ServerCommandService.ArrayOfGuid _orderPresets_ids = new com.mile.ServerCommandService.ArrayOfGuid();
        java.util.List<java.lang.String> _orderPresets_idsGuid = new java.util.ArrayList<java.lang.String>();
        java.lang.String _orderPresets_idsGuidVal1 = "_orderPresets_idsGuidVal990285465";
        _orderPresets_idsGuid.add(_orderPresets_idsGuidVal1);
        _orderPresets_ids.getGuid().addAll(_orderPresets_idsGuid);
        port.orderPresets(_orderPresets_token, _orderPresets_deviceId, _orderPresets_ids);


        }
        {
        System.out.println("Invoking bookmarkGet...");
        java.lang.String _bookmarkGet_token = "_bookmarkGet_token-1918905265";
        java.lang.String _bookmarkGet_bookmarkId = "_bookmarkGet_bookmarkId1865869663";
        com.mile.ServerCommandService.Bookmark _bookmarkGet__return = port.bookmarkGet(_bookmarkGet_token, _bookmarkGet_bookmarkId);
        System.out.println("bookmarkGet.result=" + _bookmarkGet__return);


        }
        {
        System.out.println("Invoking getUserInfo...");
        java.lang.String _getUserInfo_token = "_getUserInfo_token-422287374";
        com.mile.ServerCommandService.UserInfo _getUserInfo__return = port.getUserInfo(_getUserInfo_token);
        System.out.println("getUserInfo.result=" + _getUserInfo__return);


        }
        {
        System.out.println("Invoking getConfiguration...");
        java.lang.String _getConfiguration_token = "_getConfiguration_token1118331135";
        com.mile.ServerCommandService.ConfigurationInfo _getConfiguration__return = port.getConfiguration(_getConfiguration_token);
        System.out.println("getConfiguration.result=" + _getConfiguration__return);


        }
        {
        System.out.println("Invoking deletePreset...");
        java.lang.String _deletePreset_token = "_deletePreset_token-435156864";
        java.lang.String _deletePreset_id = "_deletePreset_id654198877";
        java.lang.String _deletePreset_deviceId = "_deletePreset_deviceId-575789903";
        port.deletePreset(_deletePreset_token, _deletePreset_id, _deletePreset_deviceId);


        }

        System.exit(0);
    }

}
