package com.mile.ServerCommandService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;


@WebServiceClient(name = "ServerCommandService", 
                  wsdlLocation = "file:/C:/Program Files/Milestone/MIPSDK/WSDL/ServerCommandService.wsdl",
                  targetNamespace = "http://videoos.net/2/XProtectCSServerCommand") 
public class ServerCommandService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://videoos.net/2/XProtectCSServerCommand", "ServerCommandService");
    public final static QName ServerCommandServiceSoap = new QName("http://videoos.net/2/XProtectCSServerCommand", "ServerCommandServiceSoap");
    public final static QName ServerCommandServiceSoap1 = new QName("http://videoos.net/2/XProtectCSServerCommand", "ServerCommandServiceSoap1");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Program Files/Milestone/MIPSDK/WSDL/ServerCommandService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServerCommandService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Program Files/Milestone/MIPSDK/WSDL/ServerCommandService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServerCommandService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServerCommandService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerCommandService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServerCommandService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServerCommandService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServerCommandService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ServerCommandServiceSoap
     */
    @WebEndpoint(name = "ServerCommandServiceSoap")
    public ServerCommandServiceSoap getServerCommandServiceSoap() {
        return super.getPort(ServerCommandServiceSoap, ServerCommandServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerCommandServiceSoap
     */
    @WebEndpoint(name = "ServerCommandServiceSoap")
    public ServerCommandServiceSoap getServerCommandServiceSoap(WebServiceFeature... features) {
        return super.getPort(ServerCommandServiceSoap, ServerCommandServiceSoap.class, features);
    }
    /**
     *
     * @return
     *     returns ServerCommandServiceSoap
     */
    @WebEndpoint(name = "ServerCommandServiceSoap1")
    public ServerCommandServiceSoap getServerCommandServiceSoap1() {
        return super.getPort(ServerCommandServiceSoap1, ServerCommandServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerCommandServiceSoap
     */
    @WebEndpoint(name = "ServerCommandServiceSoap1")
    public ServerCommandServiceSoap getServerCommandServiceSoap1(WebServiceFeature... features) {
        return super.getPort(ServerCommandServiceSoap1, ServerCommandServiceSoap.class, features);
    }

}
