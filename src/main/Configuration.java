package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.mile.ServerCommandService.ServerCommandService;

public class Configuration {
public static String token;
	public static void main(String[] args) throws Exception {
		//This renews the token when the token expires
		Authentication client=new Authentication();
		client.bypass();
		token=client.doPost();
		Configuration config=new Configuration();
		config.doPostConfig();	
		
	} 
	public void doPostConfig() throws IOException, XPathExpressionException, ParserConfigurationException, SAXException {
	    	 String url = "https://localhost//ManagementServer/ServerCommandService.svc";
	 	     URL obj = new URL(url);
	 	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 	    //add request header
	 	     con.setRequestMethod("POST");
	 	     con.setRequestProperty("Host", "localhost");
	 	     con.setRequestProperty("Authorization", "Basic c3JpbWFuOnNyaW1hbg==");
	 	     con.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
	 	     con.setRequestProperty("Accept", "application/xml");
	 	     con.setRequestProperty("SOAPAction", "http://videoos.net/2/XProtectCSServerCommand/IServerCommandService/GetConfiguration");
	 	     con.setRequestProperty("Content-Length","544");
	 	     String body = String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
	 	    		"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
	 	    		"  <soap:Body>\r\n" + 
	 	    		"    <GetConfiguration xmlns=\"http://videoos.net/2/XProtectCSServerCommand\">\r\n" + 
	 	    		"      <instanceId>B7A0CFD7-F9DF-405E-A2C7-5A545B9B3D89</instanceId>\r\n" + 
	 	    		"      <currentToken>%s</currentToken>\r\n" + 
	 	    		"    </GetConfiguration>\r\n" + 
	 	    		"  </soap:Body>\r\n" + 
	 	    		"</soap:Envelope>",token);
	 	    // Send post request
	 	     System.out.println(body);
	 	    con.setDoOutput(true);
	 	    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	 	    wr.writeBytes(body);
	 	    wr.flush();
	 	    wr.close();	 	
	 	    BufferedReader in = new BufferedReader(
	 	            new InputStreamReader(con.getInputStream()));
	 	    String inputLine;
	 	    StringBuffer response = new StringBuffer();

	 	    while ((inputLine = in.readLine()) != null) {
	 	        response.append(inputLine);
	 	        }
	 	   String configresponse=response.toString();
	 	   System.out.println(configresponse);
	}


}
