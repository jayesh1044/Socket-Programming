package org.learn.socket;

import java.net.*;
import java.io.*;

public class ServerDemo {

	public static void main(String[] args) {
		
		try{  
			ServerSocket ss=new ServerSocket(6666);  
			Socket s=ss.accept(); 
			System.out.println("Client connected!");
			
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();  
			
			System.out.println("Client Says : "+str);  
			ss.close();  
			}
		catch(SocketException e)
		{
				System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
				System.out.println(e.getMessage());
		}

	}

}
