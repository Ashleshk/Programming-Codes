package com.home.graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class barcharts extends Applet{

	int n=0;
	String label []= {"91","92","93","94"};
	int value []= {110,150,100,170};
	@Override
	public void init() {
		 
	}
	@Override
	public void paint(Graphics g) {
		for(int i=0;i< n;i++)
		 {  

			g.setColor(Color.red);
			g.drawString(label[i], 20, i*50+30);
			g.fillRect(50, i*50+10, value[i], 40);
			
			
		 }
		
		
	}
}
