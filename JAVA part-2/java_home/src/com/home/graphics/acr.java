package com.home.graphics;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class acr extends Applet {

	 @Override
	public void paint(Graphics g) {
		 g.drawArc(60, 125, 80, 40, 180, 180);
		 g.fillArc(60, 125, 80, 40, 180, 180);
		// g.setFont(Font.MONOSPACED);   //The method setFont(Font) in the type Graphics is not applicable for the arguments (String
		 g.drawString("ARC EXAMPLE", 50, 50);
	}	
}
