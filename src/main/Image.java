package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class Image {

public static String token;
	public static void main(String[] args) throws ClassNotFoundException, XPathExpressionException, ParserConfigurationException, SAXException, KeyManagementException, NoSuchAlgorithmException, IOException {
	Authentication client=new Authentication();
	client.bypass();
	String token=client.doPost();
	String ip="localhost";
	int port =7563;
	try {
		Socket s=new Socket(ip,port);
		String str=String.format( "<?xml version=\"1.0\" encoding=\"utf-8\"?><methodcall><requestid>0</requestid>"+
		"<methodname>connect</methodname><username>a</username><password>a</password>"+"<cameraid>b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89</cameraid><alwaysstdjpeg>yes</alwaysstdjpeg>"+
		"<transcode><allframes>yes</allframes></transcode>" +"<connectparam>id=b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89&amp;connectiontoken=%s"+"</connectparam></methodcall>\r\n\r\n",token);
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
