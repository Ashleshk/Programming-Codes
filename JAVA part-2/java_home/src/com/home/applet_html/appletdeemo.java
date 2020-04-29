package com.home.applet_html;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class appletdeemo extends JApplet {
 
	String str;
	@Override
	public void init() {
		str=getParameter("string");
		if(str==null)
		{
			str="java";
			
		}
		System.out.println("HELLO"+ str);
		
 	}
	
	@Override
public void paint(Graphics g) {
 	super.paint(g);
 	
 	g.setColor(Color.blue);
 	g.drawString(str, 50, 50);
}
}
