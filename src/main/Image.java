package main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Image {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Socket socket;
			int portNumber=7563;
		socket=new Socket("localhost",portNumber);
		System.out.println("Connected to "+socket);
		String str="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<methodcall> "
				+ "<requestid>1</requestid>"
				+ "<methodname>connect</methodname>"
				+ "<username>a</username>"
				+ "<password>a</password>"
				+ " <cameraid>b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89</cameraid>"				
				+ "<connectparam>id=b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89&amp;connectiontoken=TOKEN#0dcb1434-56a8-4cc4-9c6b-e96eafb65544#desktop-b6l2oac//ServerConnector#</connectparam>"
				+ "</methodcall> "
				+ "\r-\n-\r-\n";
//		String str="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
//				+ "<methodcall> "
//				+ "<requestid>1</requestid>"
//				+ "<methodname>connect</methodname>"
//				+ "<username>sriman</username>"
//				+ "<password>sriman</password>"
//				+ " <cameraid>b7a0cfd7-f9df-405e-a2c7-5a545b9b3d89</cameraid>"	
//				+"</methodcall>"
//				+"\r\n\r\n";
		 System.out.println("..");
		 System.out.println("......");
			    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			   
			    str = (String) ois.readObject();
			    System.out.println(str);
			    //socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
