package com.home.coderectificatiom;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JApplet;

public class test2 extends JApplet implements AdjustmentListener{

	private Scrollbar bar;
	private int old,newtemp=0;
	private int fahr=32;
	@Override
	public void init() {
 		bar=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
 		bar.addAdjustmentListener(this);
 		setLayout(new BorderLayout());
 		add("north",bar);
	}
	@Override
	public void paint(Graphics g) {
 		super.paint(g);
 		g.drawString("celsius="+newtemp, 30, 50);
 		g.drawString("fahrenheit="+fahr, 30, 70); 
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
 		newtemp=bar.getValue();
 		if(newtemp!=old)
 		{
 			fahr= newtemp*9/5+32;
 			old=newtemp;
 		}
	}
 
	
}
