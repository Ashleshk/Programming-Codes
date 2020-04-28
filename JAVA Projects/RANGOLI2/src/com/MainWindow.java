package com;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
 

public class MainWindow extends JFrame implements ActionListener{
	
	JFrame jf;
	JButton Line,Square,Circle;
	JToggleButton Vert_Line,Hori_line,Slantfwd_Line,SlantBkd_line;
	
	public MainWindow() {
		 
		
		setLayout(new FlowLayout());    
		   
		Line = new JButton("Line");
	    Square = new JButton("Square");
	    Circle = new JButton("Circle");
	    Vert_Line=new JToggleButton("VERT");
	    Hori_line=new JToggleButton("hori");
	    Slantfwd_Line=new JToggleButton("slant");
	    SlantBkd_line=new JToggleButton("slant2");
	    
	    
	    
	    Line.addActionListener(this);
	    Square.addActionListener(this);
	                                  // beautification to buttons
	    Line.setFont(new Font("Monospaced", Font.BOLD, 20));
	    Square.setFont(new Font("SansSerif", Font.ITALIC, 20));
	    Circle.setFont(new Font("DialogInput", Font.BOLD+Font.ITALIC, 20));

		Hori_line.setVisible(false);
		Hori_line.setBounds(30,30,50,30);
		Vert_Line.setVisible(false);
		Vert_Line.setBounds(90,30,50,30);
		Slantfwd_Line.setVisible(false);
		Slantfwd_Line.setBounds(170,30,50,30);
		SlantBkd_line.setVisible(false); 
		SlantBkd_line.setBounds(230,30,50,30);
		
		
	    add(Line); 
	    add(Square); 
	    add(Circle); 
	    
		add(Hori_line);
		add(Vert_Line);
		add(Slantfwd_Line);
		add(SlantBkd_line);
		
		setTitle("RANGOLI");
	    setSize(800,700);
		setLocation(520,150);
		setResizable(false);
	    setVisible(true);
	}
	public void lineClass()
	{
		Hori_line.setVisible(true);
		Hori_line.setBounds(30,30,50,30);
		Vert_Line.setVisible(true);
		Vert_Line.setBounds(90,30,50,30);
		Slantfwd_Line.setVisible(true);
		Slantfwd_Line.setBounds(170,30,50,30);
		SlantBkd_line.setVisible(true); 
		SlantBkd_line.setBounds(230,30,50,30);
		
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==Line)
		{
			lineClass(); 
		}
		else if(ae.getSource()==Square)
		{ 
			
		}
		else if(ae.getSource()==Circle)
		{
		    System.exit(0);
		}
	}
	public static void main(String[] args) {
		 new MainWindow();
		 
	}

}
