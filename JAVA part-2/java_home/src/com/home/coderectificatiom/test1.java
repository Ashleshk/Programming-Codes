package com.home.coderectificatiom;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class test1 extends JApplet{

	@Override
	public void paint(Graphics g) {
	  int inset;
	  int rectheight,rectwidth;
	  g.setColor(Color.blue);
	  g.fillRect(0, 0, 300, 160);
		inset =0;
		rectheight=159;
		rectwidth=299;
		 g.setColor(Color.red);
		 g.drawString ("rectangles", 150, 200);
		 while(rectwidth>=0&&rectheight>=0)
		 {
			 
			 g.drawRect(inset, inset, rectwidth, rectheight);
			 inset +=15;
			 rectwidth -= 30;
			 rectheight -= 30;
		 }
		 
	}
	public static void main(String[] args) {
		new test1();
	}
}
