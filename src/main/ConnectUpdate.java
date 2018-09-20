package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class ConnectUpdate {
public static int requestid;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectUpdate connectupdate=new ConnectUpdate();
		try {
			connectupdate.connectupdate();
		} catch (KeyManagementException | XPathExpressionException | NoSuchAlgorithmException | IOException
				| ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
	public static void connectupdate() throws XPathExpressionException, IOException, ParserConfigurationException, SAXException, KeyManagementException, NoSuchAlgorithmException {	
	Authentication client=new Authentication();
	client.bypass();
	String token=client.doPost();
	String ip="localhost";
	int port =7563;
	String str;
	try {
		Socket s=new Socket(ip,port);
		
	
		while(true) {		
		str=String.format( "<?xml version=\"1.0\" encoding=\"utf-8\"?><methodcall><requestid>%d</requestid>"+
		"<methodname>connectupdate</methodname>"+"<connectparam>id=b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89&amp;connectiontoken=%s</connectparam>"+"</methodcall>\r\n\r\n",++requestid,token);
		break;
		}
		System.out.println(str);
	OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
	PrintWriter out=new PrintWriter(os);
	out.println(str);
	out.flush();
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	String response=br.readLine();
	System.out.println(response);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
