package com.book2.applet;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class myapp extends JApplet {
  
	String str;
	@Override
	public void init() {
		str=getParameter("fontname");
		
		
 	}
	@Override
	public void paint(Graphics g) {
 		super.paint(g);
 		g.setFont(new Font(str,Font.ITALIC,13));
 		g.drawString("hello world", 100, 200);
	}
	 @Override
		public void start() {
		 System.out.println("start called");
	 	}
	 @Override
		public void stop() {
		 System.out.println("stop called");

	 	}
	 @Override
		public void destroy() {
		 System.out.println("destroy called");

	 	}
	 public static void main(String[] args) {
		new myApplet(); 
	}
}
