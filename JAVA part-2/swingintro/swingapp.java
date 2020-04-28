package com.book2.swingintro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class swingapp {
 public static void main(/*String[] args*/) {
	final JFrame frame = new JFrame("Jpasswordfield demo:");
	JLabel lbluser =new JLabel("USERNAME");
	final JTextField tfuser =new JTextField(20);
	lbluser.setLabelFor(tfuser);
	JLabel lblpassword = new JLabel("Password:");
	final JPasswordField pfpassword = new JPasswordField(20);
    lblpassword.setLabelFor(pfpassword);
	JButton btncancel = new JButton("cancel") ;
	JButton btnclear = new JButton("clear") ;
	JButton btnlogin = new JButton("submit") ;
	btncancel.addActionListener(new PerformActions());
	btnclear.addActionListener(new PerformActions());
	btnlogin.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) { 
			tfuser.setText ("");
			pfpassword.setText("");
		}
	});
	JPanel panel =new JPanel();
	panel.setLayout(new FlowLayout());
	panel.add(lbluser);
	panel.add(tfuser);
	panel.add(lblpassword);
	panel.add(pfpassword);
	panel.add(btnlogin);
	panel.add(btncancel);
	panel.add(btnclear);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,300);
	frame.getContentPane().add(panel);
	frame.setVisible(true);
	
	}
}

