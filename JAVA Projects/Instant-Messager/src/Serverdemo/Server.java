package Serverdemo;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 

public class Server extends JFrame {
 
	 private JTextField userText;
	 private JTextArea chatWindow;
	 private ObjectOutputStream output;
	 private ObjectInputStream input;
	 private ServerSocket server;
	 private Socket connection;
	 
	 public Server() {
		super("ashlesh's iNstant messenger");
		userText = new JTextField();
		userText.setEditable(false);
	    userText.addActionListener( 
	    		new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
						sendMessage(event.getActionCommand()); 
						userText.setText("");
						
					}
				}
	    	);
	    add(userText,BorderLayout.NORTH);
	    chatWindow = new JTextArea();
	     add(new JScrollPane(chatWindow));
	     setSize(500,300);
	     setLocation(600,300);
	     setVisible(true);
	     
	 }
	 //set up and run he server
	 public void startRunning()
	 {
		 try {
			 server =new ServerSocket(6789,100);
			 while(true) 
			 {
				 try {
					 waitForConnection();
					 setupStreams();
					 whileChatting();
					 
				 }
				 catch(EOFException eofexception) {
					 showMessage("\nserver ended the connection!");
				 }
				 finally {
					 closeCrap();
				 }
			 }
		 }
		 catch(IOException e) {e.printStackTrace();}
	 }
	 
	 
	
	//wait for connection  then display connection info
		private void waitForConnection() throws IOException{
			 showMessage("\nwaiting for someone to connect...");
			 connection = server.accept();
			 showMessage("\nNow connected to  :  " +connection.getInetAddress().getHostName());

			 
		}
		//get stream to end and recieve data
		private void setupStreams() throws IOException {
				output=new ObjectOutputStream(connection.getOutputStream());
				output.flush();
				input =new ObjectInputStream(connection.getInputStream());
				showMessage("\nStreams are now setup!!");
				
		}
	 
	//during the coversation 
		private void whileChatting() throws IOException{
			 String message ="you are now connnected";		
			 sendMessage(message);
			 abletoType(true);
			 do {
				 try {
					 message=(String) input.readObject();
					 showMessage("\n"+message);
				 }
				 catch(ClassNotFoundException c) {showMessage("\nidk wtf that user send!");}
				 //have a conversation
			 }while(!message.equals("CLIENT-END"));
		}
	
	//close streams and sockets after done chatting
		private void closeCrap()
		{
			showMessage("\nClosing connections ... ");
			abletoType(false);
			try{
				output.close();
				input.close();
				connection.close();
			}
			catch(IOException e) {e.printStackTrace();}
		}
		//send a message to client
		private void sendMessage(String message)
		{
			try {
				output.writeObject("\nSERVER-"+message);
				output.flush();
				showMessage("\nSERVER-"+message);
			}catch(IOException ioexception) {chatWindow.append("\n error: dude i cant send that message");}
			
		}
		//updatess chatwindow
		private void showMessage(final String s) {
			SwingUtilities.invokeLater( 
					 new Runnable() {
						
						@Override
						public void run() {
 							chatWindow.append(s);
						}
					   }
					);
			
		}
		
		// let the user type into chat
		private void abletoType(final boolean tof) {
			SwingUtilities.invokeLater( 
					 new Runnable() {
						
						@Override
						public void run() {
							userText.setEditable(tof);
						}
					   }
					);
		}
}
