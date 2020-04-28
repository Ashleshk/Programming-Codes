package com.book2.swingintro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingArea extends JPanel{

	Color drawColor;
	public DrawingArea(){
		drawColor =Color.green;
		setPreferredSize(new Dimension(100,100));
	}
	public void paintComponents(Graphics g)
	 {
		 super.paintComponents(g);
		 g.setColor(drawColor);
		 int w= getWidth();
		 int h =getHeight();
		 g.drawLine(0, 0, w, h);
		 g.drawLine(0, 0, w, 0);
	 }
	public void setMyColor(Color x)	
	{
		drawColor =x;
		repaint();
	}
	
	
}
