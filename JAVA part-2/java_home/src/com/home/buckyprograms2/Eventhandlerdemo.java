package com.home.buckyprograms2;

import java.awt.ActiveEvent;
import  java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;;
 


public class Eventhandlerdemo  extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordfiled;
	public Eventhandlerdemo( )
			throws HeadlessException {
		super("the title");
	setLayout(new FlowLayout());
	item1= new JTextField(10);
	add(item1);
	
	item2= new JTextField("enter text here");
	add(item2);
	
	item3= new JTextField("uneditable",20);
	item3.setEditable(false);
	add(item3);
	
	passwordfiled = new JPasswordField("passwrod");
	add(passwordfiled);
	
	
	thehandler handler = new thehandler();
	item1.addActionListener(handler);
	item2.addActionListener(handler);
	item3.addActionListener(handler);
	passwordfiled.addActionListener(handler);
	
	}
	private class thehandler implements ActionListener{
	 
		public void actionPerformed(ActionEvent e) {
 			  String string="";
 			  if(e.getSource()==item1)
 			  {
 				  string=String.format("field 1: %s", e.getActionCommand());
 			  }
 			  else if(e.getSource()==item2)
 			  {
 				  string=String.format("field 2: %s", e.getActionCommand());
 			  }
 			  else if(e.getSource()==item3)
 			  {
 				  string=String.format("field 3: %s", e.getActionCommand());
 			  }
 			  else if (e.getSource()==passwordfiled)
 			  {
 				 string=String.format("passwordfield  : %s", e.getActionCommand());
 			  }
 			  
 			  JOptionPane.showMessageDialog(null, string);
		}
	}
    
    
    
}
