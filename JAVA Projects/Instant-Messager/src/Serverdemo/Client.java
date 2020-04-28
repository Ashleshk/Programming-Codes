package Serverdemo;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame{
     private JTextArea chatwindow;
     private JTextField usertext;
     private ObjectOutputStream output;
     private ObjectInputStream input;
     private String message="";
     private String serverIP;
     private Socket connection;
     
     //cotr
     public Client(String host)
     {
    	 super("Client");
    	 serverIP=host;
    	 usertext = new JTextField();
    	 usertext.setEditable(false);
    	 usertext.addActionListener(
    			 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
 						sendMessage(e.getActionCommand());
 						usertext.setText("");
 						
					}
				}
    			 
    			 
    			 );
    	 add(usertext,BorderLayout.NORTH);
    	 chatwindow = new JTextArea();
    	 add(new JScrollPane(chatwindow),BorderLayout.CENTER);
    	 setSize(500,300);
	     setLocation(600,300);
	     setVisible(true);
     }
	
	//connect to server
     public void startRunning() {
    	 try {
    		 connectToServer();
    		 setupStreams();
    		 whileChatting();
    		 
    	 }catch(EOFException eofexception) {
    		 showMessage("\nClient terminated connection");
    	 }
    	 catch(IOException ioe) {ioe.printStackTrace();}
    	 finally {
    		 closeCrap();
    	 }
     }
	
 //close the streams and sockets
	
	private void closeCrap() {
		showMessage("\nClosing connections ... ");
		abletoType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException e) {e.printStackTrace();}		
	}

	//connect to server
	private void connectToServer() throws IOException{
 	   showMessage("\n\nATTEmmpting connections.....");	
 	   connection=new Socket(InetAddress.getByName(serverIP),6789);
 	   showMessage("COnnected to : "+connection.getInetAddress().getHostName());
	}
	//setup the streams send nad receive message
	private void setupStreams() throws IOException {
       output= new ObjectOutputStream(connection.getOutputStream());
       output.flush();
       input= new ObjectInputStream(connection.getInputStream());
       showMessage("\n\ndude your streams are good to go...");
	}
	//while chhating with server
	private void whileChatting() throws IOException {
		abletoType(true);
		 do {
			 try {
				 message=(String) input.readObject();
				 showMessage("\n"+message);
			 }
			 catch(ClassNotFoundException c) {showMessage("\nidk wtf that user send!");}
			 //have a conversation
		 }while(!message.equals("SERVER-END"));
    	   
       }
	private void sendMessage(String message)
	{
		try {
			output.writeObject("\nCLIENT-"+message);
			output.flush();
			showMessage("\nCLIENT-"+message);
		}catch(IOException ioexception) {chatwindow.append("\n error: dude i cant send that message");}
		
	}
	//updatess chatwindow
			private void showMessage(final String s) {
				SwingUtilities.invokeLater( 
						 new Runnable() {
							    
							@Override
							public void run() {
	 							chatwindow.append(s);
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
								usertext.setEditable(tof);
							}
						   }
						);
			}

}
