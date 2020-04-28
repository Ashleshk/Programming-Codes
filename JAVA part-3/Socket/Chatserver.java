package com.book2.Socket;

 
 import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Chatserver {
         Socket connection;
         ServerSocket server;
         DataOutputStream dos;
         DataInputStream dis,disi;
         public Chatserver()
         {
        	 try {
        	 server =new ServerSocket(2000);
        	 
				connection = server.accept();
				System.out.println("REQUEST RECIEVED>>>>");
			} catch (IOException e) {
 				e.printStackTrace();
			}
        	 
         }
         public void talk() throws IOException   {
        	      dis= new DataInputStream(connection.getInputStream());
        	      dos=new DataOutputStream(connection.getOutputStream());
        	      disi= new DataInputStream(System.in);
        	      
        	      while(true)
        	      {
        	    	  System.out.println(dis.readUTF());
        	    	  String s = disi.readLine();
        	    	  dos.writeUTF("Client  :  "+s);
        	      }
         }
         public static void main(String[] args) throws IOException {
			Chatserver s =new Chatserver();
			s.talk();
		}
     
}
