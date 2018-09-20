package main;



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;
public class Test {

	public static int compressionrate=100;

	public static void main(String[] args) throws KeyManagementException, XPathExpressionException, NoSuchAlgorithmException, IOException, ParserConfigurationException, SAXException {
		Connect.connect();
		GoTo.getImage();
	}
	public static void getImage() {
		String ip="localhost";
		int port =7563;
		try {	
//			float interval;
//			System.out.println("Enter the minute for retrieval");
//			Scanner sc=new Scanner(System.in);
//			interval=sc.nextInt();
//			float time=interval*60000;
		Socket s=new Socket(ip,port);	
		String str=String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?><methodcall><requestid>1</requestid>"+"<methodname>goto</methodname>"+"<time>6000000000</time>"+
				 "<compressionrate>100</compressionrate>"+"<keyframesonly>no</keyframesonly>"+"</methodcall>\r\n\r\n");
		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		PrintWriter out=new PrintWriter(os);
		out.println(str);
		out.flush();
		byte[] val=str.getBytes();
		BigInteger bi=new BigInteger(val);
		String s1=bi.toString();		
		System.out.println(s1);
	}
		catch(Exception e) {
			e.printStackTrace();
		}		
}
}
