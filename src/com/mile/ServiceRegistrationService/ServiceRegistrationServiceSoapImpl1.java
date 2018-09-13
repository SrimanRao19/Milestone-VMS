
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.mile.ServiceRegistrationService;

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
 * 2018-09-13T12:59:43.969-04:00
 * Generated source version: 2.4.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "ServiceRegistrationService",
                      portName = "ServiceRegistrationServiceSoap1",
                      targetNamespace = "http://videoos.net/2/XProtectCSServiceRegistration",
                      wsdlLocation = "file:/C:/Program Files/Milestone/MIPSDK/WSDL/ServiceRegistrationService.wsdl",
                      endpointInterface = "com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap")
                      
public class ServiceRegistrationServiceSoapImpl1 implements ServiceRegistrationServiceSoap {

    private static final Logger LOG = Logger.getLogger(ServiceRegistrationServiceSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap#getServices(*
     */
    public com.mile.ServiceRegistrationService.ArrayOfServiceInfo getServices() { 
        LOG.info("Executing operation getServices");
        try {
            com.mile.ServiceRegistrationService.ArrayOfServiceInfo _return = new com.mile.ServiceRegistrationService.ArrayOfServiceInfo();
            java.util.List<com.mile.ServiceRegistrationService.ServiceInfo> _returnServiceInfo = new java.util.ArrayList<com.mile.ServiceRegistrationService.ServiceInfo>();
            com.mile.ServiceRegistrationService.ServiceInfo _returnServiceInfoVal1 = new com.mile.ServiceRegistrationService.ServiceInfo();
            _returnServiceInfoVal1.setType("Type2061343791");
            _returnServiceInfoVal1.setInstance("Instance-1709270299");
            com.mile.ServiceRegistrationService.ArrayOfString _returnServiceInfoVal1Uri = new com.mile.ServiceRegistrationService.ArrayOfString();
            java.util.List<java.lang.String> _returnServiceInfoVal1UriString = new java.util.ArrayList<java.lang.String>();
            _returnServiceInfoVal1Uri.getString().addAll(_returnServiceInfoVal1UriString);
            _returnServiceInfoVal1.setUri(_returnServiceInfoVal1Uri);
            _returnServiceInfoVal1.setName("Name-1045767131");
            _returnServiceInfoVal1.setDescription("Description450331496");
            _returnServiceInfoVal1.setTrusted(false);
            _returnServiceInfoVal1.setEnabled(true);
            _returnServiceInfo.add(_returnServiceInfoVal1);
            _return.getServiceInfo().addAll(_returnServiceInfo);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap#unregisterService(java.lang.String  instance )*
     */
    public void unregisterService(java.lang.String instance) { 
        LOG.info("Executing operation unregisterService");
        System.out.println(instance);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap#getServiceData(java.lang.String  instance )*
     */
    public java.lang.String getServiceData(java.lang.String instance) { 
        LOG.info("Executing operation getServiceData");
        System.out.println(instance);
        try {
            java.lang.String _return = "_return-1022196577";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap#enableService(java.lang.String  instance ,)boolean  enabled )*
     */
    public void enableService(java.lang.String instance,boolean enabled) { 
        LOG.info("Executing operation enableService");
        System.out.println(instance);
        System.out.println(enabled);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap#getServicesIncludingDisabled(*
     */
    public com.mile.ServiceRegistrationService.ArrayOfServiceInfo getServicesIncludingDisabled() { 
        LOG.info("Executing operation getServicesIncludingDisabled");
        try {
            com.mile.ServiceRegistrationService.ArrayOfServiceInfo _return = new com.mile.ServiceRegistrationService.ArrayOfServiceInfo();
            java.util.List<com.mile.ServiceRegistrationService.ServiceInfo> _returnServiceInfo = new java.util.ArrayList<com.mile.ServiceRegistrationService.ServiceInfo>();
            com.mile.ServiceRegistrationService.ServiceInfo _returnServiceInfoVal1 = new com.mile.ServiceRegistrationService.ServiceInfo();
            _returnServiceInfoVal1.setType("Type-1714363636");
            _returnServiceInfoVal1.setInstance("Instance-1537167248");
            com.mile.ServiceRegistrationService.ArrayOfString _returnServiceInfoVal1Uri = new com.mile.ServiceRegistrationService.ArrayOfString();
            java.util.List<java.lang.String> _returnServiceInfoVal1UriString = new java.util.ArrayList<java.lang.String>();
            _returnServiceInfoVal1Uri.getString().addAll(_returnServiceInfoVal1UriString);
            _returnServiceInfoVal1.setUri(_returnServiceInfoVal1Uri);
            _returnServiceInfoVal1.setName("Name-1396750220");
            _returnServiceInfoVal1.setDescription("Description-285631955");
            _returnServiceInfoVal1.setTrusted(false);
            _returnServiceInfoVal1.setEnabled(false);
            _returnServiceInfo.add(_returnServiceInfoVal1);
            _return.getServiceInfo().addAll(_returnServiceInfo);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap#setServiceData(java.lang.String  instance ,)java.lang.String  customData )*
     */
    public boolean setServiceData(java.lang.String instance,java.lang.String customData) { 
        LOG.info("Executing operation setServiceData");
        System.out.println(instance);
        System.out.println(customData);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.mile.ServiceRegistrationService.ServiceRegistrationServiceSoap#registerService(java.lang.String  type ,)java.lang.String  instance ,)com.mile.ServiceRegistrationService.ArrayOfString  uri ,)java.lang.String  name ,)java.lang.String  description ,)java.lang.String  customData )*
     */
    public boolean registerService(java.lang.String type,java.lang.String instance,com.mile.ServiceRegistrationService.ArrayOfString uri,java.lang.String name,java.lang.String description,java.lang.String customData) { 
        LOG.info("Executing operation registerService");
        System.out.println(type);
        System.out.println(instance);
        System.out.println(uri);
        System.out.println(name);
        System.out.println(description);
        System.out.println(customData);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}