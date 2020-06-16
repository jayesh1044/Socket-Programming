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
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

		  
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			  
			String str="",str2="";  
			
			while(!str.equals("exit")){  
			str=dis.readUTF();  
			System.out.println("client says: "+str);
			System.out.println("Enter text");
			str2=br.readLine();  
			dout.writeUTF(str2);  
			dout.flush();  
			}  
			dis.close();  
			s.close();  
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
