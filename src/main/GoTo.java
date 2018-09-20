package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;
public class GoTo {

	public static int compressionrate=100;

	public static void main(String[] args) throws KeyManagementException, XPathExpressionException, NoSuchAlgorithmException, IOException, ParserConfigurationException, SAXException {
		Connect.connect();
		System.out.println("CONNECTED TO THE CAMERA..");
		GoTo.getImage();
	}
	public static void getImage() {
		String ip="localhost";
		int port =7563;
		try {	
		Socket s=new Socket(ip,port);	
		System.out.println("Connected to "+s);
		String str=String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?><methodcall><requestid>1</requestid>"+"<methodname>goto</methodname>"+"<time>"+System.currentTimeMillis()+"</time>"+
				 "<compressionrate>90"
				 + "</compressionrate>"+"<keyframesonly>no</keyframesonly>"+"</methodcall>\r\n\r\n");
		DataOutputStream os=new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
		PrintWriter out=new PrintWriter(os);
		out.println(str);
		out.flush();
		System.out.println(str);
		DataInputStream inStream = new DataInputStream
				(new BufferedInputStream(s.getInputStream( )));			
		int response=inStream.read();
		System.out.println(response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
}
}
