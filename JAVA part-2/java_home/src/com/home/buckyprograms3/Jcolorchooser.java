package com.home.buckyprograms3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jcolorchooser extends JFrame {
     private JButton b;
     private Color color =(Color.WHITE);
	private JPanel panel;
     
     public Jcolorchooser( )   {
		super("Colorchooser");
		panel= new JPanel();
		panel.setBackground(color);
		
		b =new JButton("Choose a color");
		b.addActionListener(new ActionListener() {
			
			 
			public void actionPerformed(ActionEvent e) {
			     color = JColorChooser.showDialog(null, "pick your color", color);
			     if(color==null)
			    	 color=(color.WHITE);
				 panel.setBackground(color); 
			}
		});
		add(panel,BorderLayout.CENTER); 
		add(b,BorderLayout.SOUTH);
		 setSize(800,800);
		 setVisible(true);
	}
     
     
}
