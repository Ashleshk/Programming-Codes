package com.home.graphics;

import java.applet.Applet;
import java.awt.Graphics;

 

public class Controlloop extends Applet
{
  @Override
public void paint(Graphics g) {
	 for(int i=0;i<=10;i++)
	 {  
		if(i%2==0)
		     g.drawOval(120, i*60+10, 50, 50);
		else
			g.fillOval(120, i*60+10, 50, 50);
	 }
}
}
