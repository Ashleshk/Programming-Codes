package com.home.program12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class appletdeemo extends JApplet{
 
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
 	g.drawString("hello world", 50, 50);
}
}
