package main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Image {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Socket socket;
			int portNumber=7563;
			//System.out.println("Connected to "+ socket);
			 String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
			 		"\r\n" + 
			 		"<methodcall>\r\n" + 
			 		"\r\n" + 
			 		"  <requestid>1</requestid>\r\n" + 
			 		"\r\n" + 
			 		"  <methodname>connect</methodname>\r\n" + 
			 		"\r\n" + 
			 		"  <username>a</username>\r\n" + 
			 		"\r\n" + 
			 		"  <password>a</password>\r\n" + 
			 		"\r\n" + 
			 		"  <cameraid>b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89</cameraid>\r\n" + 
			 		"\r\n" + 
			 		"  <connectparam>id=b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89&amp;connectiontoken=TOKEN#65dba773-245c-47e4-b947-fc784b2e4b4d#desktop-b6l2oac//ServerConnector#</connectparam>\r\n" + 
			 		"\r\n" + 
			 		"</methodcall>;";

			    socket = new Socket(InetAddress.getLocalHost(), portNumber);
			    System.out.println("Connected to "+socket);

			    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			    str = (String) ois.readObject();
			    System.out.println(str);
			    socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
