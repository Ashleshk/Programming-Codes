package com.home.applet_html;

import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;

import javax.swing.JApplet;

public class UserIN extends JApplet{

	TextField text1,text2;
	@Override
	public void init() {
		text1= new TextField(8);
		text2= new TextField(8);
		add(text1);
		add(text2);
		text1.setText("0");
		text2.setText("0"); 
	}
	@Override
	public void paint(Graphics g) {
 		super.paint(g);
 		int x=0,y=0,z=0;
 		String s1,s2,s3;
 		g.drawString("Input a number in a box ", 10, 50);
 		try {
 			s1=text1.getText();
 			x=Integer.parseInt(s1);
 			s2=text2.getText();
 			y=Integer.parseInt(s2);
 		}catch(Exception ex)
 		{}
 			z=x+y;
 			s3=String.valueOf(z);
 			g.drawString("the sum is :", 10, 75);
 			g.drawString(s3, 100, 75);
 			
 		
 		
	}
	public boolean action(Event event,Object object)
		{
			repaint();
			return true;
		}
	
	
	
}
