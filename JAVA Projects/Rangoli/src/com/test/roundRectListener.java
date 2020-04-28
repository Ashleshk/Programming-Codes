package com.test;
 

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class roundRectListener implements ActionListener, MouseListener, MouseMotionListener,ComponentListener {

	
mainClass Main=null;
	
	Graphics2D gd;


	int Index ;
	int x1, y1, x2, y2;
	private int tempx1,tempx2,tempy1,tempy2;
	private boolean isrel = false;
JOptionPane jp;


	public roundRectListener (mainClass mc) {
		Main=mc;
		gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
	}

	
	
	public void Paint()
	{	int ht,wt,r,g,b;
	     gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		//gd.setColor(mainClass.g.getColor());
		Main.arr.get(Index).gc.setColor(Main.g.getColor());
		r=Main.g.getColor().getRed()+50>255?Main.g.getColor().getRed()-50:Main.g.getColor().getRed()+50;
		g=Main.g.getColor().getGreen()+50>255?Main.g.getColor().getGreen()-50:Main.g.getColor().getGreen()+50;
		b=Main.g.getColor().getBlue()+50>255?Main.g.getColor().getBlue()-50:Main.g.getColor().getBlue()+50;
		Color c =new Color(r,g,b);
		Main.arr.get(Index).gc.setColor(c);
		gd.setColor(c);

		
		
		if(isrel == false){
			ht = x1>x2?(x1-x2):(x2-x1);
			wt = y1>y2?(y1-y2):(y2-y1);
			if((x1>x2)&&(y1>y2)){
				gd.setXORMode(Color.red);
				//g1.setColor(Color.red);
				gd.drawRoundRect(x2,y2,ht,wt,15,15);

			}
			else if(((x2>x1)&&(y2>y1)))
			{	gd.setXORMode(Color.red);
				
				gd.drawRoundRect(x1,y1,ht,wt,15,15);
				
			}
			else if(((x2>x1)&&(y1>y2)))
					{gd.setXORMode(Color.red);
				
						gd.drawRoundRect(x1,y2,ht,wt,15,15);
						
					}
			else if(((x1>x2)&&(y2>y1)))
					{gd.setXORMode(Color.red);
				
						gd.drawRoundRect(x2,y1,ht,wt,15,15);
						
					}
			
			
			ht = tempx1>tempx2?(tempx1-tempx2):(tempx2-tempx1);
			wt = tempy1>tempy2?(tempy1-tempy2):(tempy2-tempy1);
			if((tempx1>tempx2)&&(tempy1>tempy2)){
				
				gd.setXORMode(Color.red);
				gd.drawRoundRect(tempx2,tempy2,ht,wt,15,15);
			
			
			}
			else if(((tempx2>tempx1)&&(tempy2>tempy1)))
			{
				gd.setXORMode(Color.red);
				gd.drawRoundRect(tempx1,tempy1,ht,wt,15,15);
				
				
			}
			else if(((tempx2>tempx1)&&(tempy1>tempy2)))
					{
				gd.setXORMode(Color.red);
						gd.drawRoundRect(tempx1,tempy2,ht,wt,15,15);
					
						
					}
			else if(((tempx1>tempx2)&&(tempy2>tempy1)))
					{	
				
				gd.setXORMode(Color.red);
						gd.drawRoundRect(tempx2,tempy1,ht,wt,15,15);
						
						
					}
					
			tempx1=x1;
			tempx2=x2;
			tempy1=y1;
			tempy2=y2;
			}
			else{
				ht = x1>x2?(x1-x2):(x2-x1);
				wt = y1>y2?(y1-y2):(y2-y1);
				if((x1>x2)&&(y1>y2)){
					gd.setColor(Main.g.getColor());
					Main.arr.get(Index).gc.setColor(Main.g.getColor());
					gd.drawRoundRect(x2,y2,ht,wt,15,15);
					Main.arr.get(Index).gc.drawRoundRect(x2,y2,ht,wt,15,15);

				}
				else if(((x2>x1)&&(y2>y1)))
				{	gd.setColor(Main.g.getColor());
				    Main.arr.get(Index).gc.setColor(Main.g.getColor());
					gd.drawRoundRect(x1,y1,ht,wt,15,15);
					Main.arr.get(Index).gc.drawRoundRect(x1,y1,ht,wt,15,15);
					
				}
				else if(((x2>x1)&&(y1>y2)))
						{gd.setColor(Main.g.getColor());
						Main.arr.get(Index).gc.setColor(Main.g.getColor());
							gd.drawRoundRect(x1,y2,ht,wt,15,15);
							Main.arr.get(Index).gc.drawRoundRect(x1,y2,ht,wt,15,15);
							
							
						}
				else if(((x1>x2)&&(y2>y1)))
						{gd.setColor(Main.g.getColor());
						Main.arr.get(Index).gc.setColor(Main.g.getColor());
							gd.drawRoundRect(x2,y1,ht,wt,15,15);
							Main.arr.get(Index).gc.drawRoundRect(x2,y1,ht,wt,15,15);
							
							
						}
			}
		
		
		
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		
		
		if (Main.eraser.isSelected()){
			Main.eraser.doClick();
		}
		
		
		
		if (Index >=0){
		
			if (! Main.roundRect.isSelected()){	
			
				Main.arr.get(Index).jp.removeMouseListener(this);
				Main.arr.get(Index).jp.removeMouseMotionListener(this);
				Main.arr.get(Index).jp.removeComponentListener(this);
				
		}
		else {
			if (Main.eraser.isSelected()){
				Main.eraser.doClick();
					}
			Main.arr.get(Index).jp.addMouseListener(this);
			Main.arr.get(Index).jp.addMouseMotionListener(this);
			Main.arr.get(Index).jp.addComponentListener(this);
			
		}
						
		}
		
		else {
			jp.showMessageDialog(Main.frame,"Please Select a Frame First ","rAnGoLi",jp.INFORMATION_MESSAGE);
			Main.roundRect.setSelected(false);
		}
	}


	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		isrel = false;
		x2 = e.getX();
		y2= e.getY();
		Paint();
	}
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	
		x1 =tempx1= tempx2=x2=e.getX();
		y1 =tempy1= tempy2=y2=e.getY();
		
		isrel = false;
		
if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		
		
	}
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

		isrel = true;
		x2 = e.getX();
		y2= e.getY();
		Paint();
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		Index = Main.getIndex();
		
	
		Cursor cur = new Cursor(1);
		Main.arr.get(Index).jp.setCursor(cur);
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		Paints();
	}

	private void Paints() {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		gd = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		gd.drawImage(Main.arr.get(Index).bf,null,0,0);
	}
	
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	
}
