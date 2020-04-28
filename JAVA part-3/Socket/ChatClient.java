package com.book2.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
         Socket connection;
         DataOutputStream dos;
         DataInputStream dis,disi;
		public ChatClient() throws UnknownHostException, IOException
		{
			connection = new Socket("192.168.1.7",2000);
			System.out.println("REQUEST SEND");
		   	 
		}
		public void talk()
		{
			   String str= new String("");
			   try {
				dis= new DataInputStream(connection.getInputStream());
				dos=new DataOutputStream(connection.getOutputStream());
	     	    disi= new DataInputStream(System.in);
	     	    
	     	   while(true)
     	      {
      	    	  String s = disi.readLine();
     	    	  dos.writeUTF(s);
     	    	  System.out.println("Client  :  "+dis.readUTF());
     	      }
				   
			} catch (IOException e) {
 				e.printStackTrace();
			}
     	      
			
		}
		public static void main(String[] args) throws UnknownHostException, IOException {
			ChatClient c=new ChatClient();
		    c.talk();
		}
         
         
}
