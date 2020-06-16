package org.learn.socket;
import java.io.*;  
import java.net.*;  
public class ClientDemo {

	public static void main(String[] args) {
		try{      
			Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello");  
			dout.flush();  
			dout.close();  
			s.close();  
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
