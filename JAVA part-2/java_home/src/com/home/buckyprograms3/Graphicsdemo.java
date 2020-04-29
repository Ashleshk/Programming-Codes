package com.home.buckyprograms3;

 
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Graphicsdemo extends JPanel{
      @Override
    public void paintComponent(Graphics g) {
    	 
    	super.paintComponent(g);
    	this.setBackground(Color.white);
    	
    	g.setColor(Color.BLUE);
    	g.fillRect(25, 25, 100, 30);
    	
    	
    	g.setColor(new Color(190,81,215));  // none shall go above 255
    	g.fillRect(25, 65, 100, 30);
    	
    	g.setColor(Color.RED);
    	g.drawString("ashlesh", 25, 150);
    	
    	g.setColor(Color.ORANGE);
    	g.fill3DRect(25,200, 26, 85, true);
    	
    }
}
