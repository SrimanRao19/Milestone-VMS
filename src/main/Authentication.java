package main;


//WorkingVersion
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Authentication {
   public static void main(String[] args) throws Exception {
   	  Authentication client=new Authentication();
   	  client.bypass();
   	  String Token=client.doPost();
         System.out.println(Token);
   	
   }
   	public void bypass() throws NoSuchAlgorithmException, KeyManagementException, XPathExpressionException, IOException, ParserConfigurationException, SAXException {
       TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
               public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                   return null;
               }
               public void checkClientTrusted(X509Certificate[] certs, String authType) {
               }
               public void checkServerTrusted(X509Certificate[] certs, String authType) {
               }
           }
       };

       
       
       SSLContext sc = SSLContext.getInstance("SSL");
       sc.init(null, trustAllCerts, new java.security.SecureRandom());
       HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

       HostnameVerifier allHostsValid = new HostnameVerifier() {
           public boolean verify(String hostname, SSLSession session) {
               return true;
           }
       };

      
       HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);    
   };
   public String doPost() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException{
   	 String url = "https://localhost//ManagementServer/ServerCommandService.svc";
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	    //add reuqest header
	    con.setRequestMethod("POST");
	    con.setRequestProperty("Host", "localhost");
	    con.setRequestProperty("Authorization", "Basic c3JpbWFuOnNyaW1hbg==");
	    con.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
	    con.setRequestProperty("Accept", "application/xml");
	    con.setRequestProperty("SOAPAction", "http://videoos.net/2/XProtectCSServerCommand/IServerCommandService/Login");
	    con.setRequestProperty("Content-Length","446");
	    String urlParameters = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
	    		"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
	    		"  <soap:Body>\r\n" + 
	    		"    <Login xmlns=\"http://videoos.net/2/XProtectCSServerCommand\">\r\n" + 
	    		"      <instanceId>B7A0CFD7-F9DF-405E-A2C7-5A545B9B3D89</instanceId>\r\n" + 
	    		"      <currentToken>\"\"</currentToken>\r\n" + 
	    		"    </Login>\r\n" + 
	    		"  </soap:Body>\r\n" + 
	    		"</soap:Envelope>";

	    // Send post request
	    con.setDoOutput(true);
	    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	    wr.writeBytes(urlParameters);
	    wr.flush();
	    wr.close();

	    int responseCode = con.getResponseCode();
	    //System.out.println("\nSending 'POST' request to URL : " + url);
	    //System.out.println("Post parameters : " + urlParameters);
	    //System.out.println("Response Code : " + responseCode);

	    BufferedReader in = new BufferedReader(
	            new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	        }
	    String tokenresponse=response.toString();
	   //Begin Parsing
	   //System.out.println(tokenresponse);
	   DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	   DocumentBuilder builder = factory.newDocumentBuilder();
	   ByteArrayInputStream bis = new ByteArrayInputStream(tokenresponse.getBytes());
	   Document doc = builder.parse(bis);
	   XPath xpath = XPathFactory.newInstance().newXPath();
	   XPathExpression expr=xpath.compile("/Envelope/Body/LoginResponse/LoginResult/Token/text()");
	   String token = (String)expr.evaluate(doc, XPathConstants.STRING);
	   //System.out.println(token);
	   return(token);
   }
   }