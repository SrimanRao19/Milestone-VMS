package main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
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

public class Live {

	public static void main(String[] args) throws KeyManagementException, XPathExpressionException, NoSuchAlgorithmException, IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub
		Live live=new Live();
		live.live();
	}
		public static void live() throws KeyManagementException, XPathExpressionException, NoSuchAlgorithmException, IOException, ParserConfigurationException, SAXException {
			Connect.connect();
			String ip="localhost";
			int port =7563;
			String str;
			try {
				Socket s=new Socket(ip,port);
				
			
				while(true) {		
				str=String.format( "<?xml version=\"1.0\" encoding=\"utf-8\"?><methodcall><requestid>1</requestid>"+
				"<methodname>live</methodname>"+"compressionrate>100</compressionrate>"+"</methodcall>\r\n\r\n");
				break;
				}
				System.out.println(str);
			OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
			PrintWriter out=new PrintWriter(os);
			out.println(str);
			out.flush();
			DataInputStream inStream = new DataInputStream
					(new BufferedInputStream(s.getInputStream( )));			
			int response=inStream.read();
			System.out.println(response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}

	}


