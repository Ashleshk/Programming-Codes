package com.test;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class fillCircleClass implements ActionListener, MouseMotionListener, MouseListener,ComponentListener  {

	mainClass Main;
	Graphics2D gd = null;
	int Index;
	 private int x1,x2,y1,y2;
	 private int tempx1,tempx2,tempy1,tempy2;
	 private boolean isrel = false;
	 JOptionPane jp;
	 
	 
	
	public fillCircleClass(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
		gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (Main.eraser.isSelected()) {
			
			Main.eraser.doClick();
			
			}
		
		
			
		Index = Main.getIndex();
		if (Index >=0){
			
			if (! Main.FillCircle.isSelected()){	
			
				Main.arr.get(Index).jp.removeMouseListener(this);
				Main.arr.get(Index).jp.removeMouseMotionListener(this);
				
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
			Main.FillCircle.setSelected(false);
		}
	}

	
	public void Paint()
	{	int ht,wt,r,g,b;
		gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		Main.arr.get(Index).gc.setColor(Main.g.getColor());
		gd.setColor(Main.g.getColor());
		r=Main.g.getColor().getRed()+50>255?Main.g.getColor().getRed()-50:Main.g.getColor().getRed()+50;
		g=Main.g.getColor().getGreen()+50>255?Main.g.getColor().getGreen()-50:Main.g.getColor().getGreen()+50;
		b=Main.g.getColor().getBlue()+50>255?Main.g.getColor().getBlue()-50:Main.g.getColor().getBlue()+50;

		Color c =new Color(r,g,b);
		gd.setColor(c);
		
		Main.arr.get(Index).gc.setColor(c);
		
		if(isrel == false){
			ht = x1>x2?(x1-x2):(x2-x1);
			wt = y1>y2?(y1-y2):(y2-y1);
			if((x1>x2)&&(y1>y2)){
				gd.setXORMode(Color.red);
				//g1.setColor(Color.red);
				//Main.arr.get(Index).gc.setXORMode(Color.red);
				gd.fillOval(x2,y2,ht,wt);
				//Main.arr.get(Index).gc.fillOval(x2,y2,ht,wt);

			}
			else if(((x2>x1)&&(y2>y1)))
			{	gd.setXORMode(Color.red);
//			Main.arr.get(Index).gc.setXORMode(Color.red);
				gd.fillOval(x1,y1,ht,wt);
	//			Main.arr.get(Index).gc.fillOval(x1,y1,ht,wt);
			}
			else if(((x2>x1)&&(y1>y2)))
					{gd.setXORMode(Color.red);
		//			Main.arr.get(Index).gc.setXORMode(Color.red);
						gd.fillOval(x1,y2,ht,wt);
			//			Main.arr.get(Index).gc.fillOval(x1,y2,ht,wt);
					}
			else if(((x1>x2)&&(y2>y1)))
					{gd.setXORMode(Color.red);
				//	Main.arr.get(Index).gc.setXORMode(Color.red);
						gd.fillOval(x2,y1,ht,wt);
					//	Main.arr.get(Index).gc.fillOval(x2,y1,ht,wt);
					}
			
			
			ht = tempx1>tempx2?(tempx1-tempx2):(tempx2-tempx1);
			wt = tempy1>tempy2?(tempy1-tempy2):(tempy2-tempy1);
			if((tempx1>tempx2)&&(tempy1>tempy2)){
				
				gd.setXORMode(Color.red);
				//Main.arr.get(Index).gc.setXORMode(Color.red);
				gd.fillOval(tempx2,tempy2,ht,wt);
				//Main.arr.get(Index).gc.fillOval(tempx2,tempy2,ht,wt);
			
			
			}
			else if(((tempx2>tempx1)&&(tempy2>tempy1)))
			{
				gd.setXORMode(Color.red);
			//	Main.arr.get(Index).gc.setXORMode(Color.red);
				gd.fillOval(tempx1,tempy1,ht,wt);
				//Main.arr.get(Index).gc.fillOval(tempx1,tempy1,ht,wt);
				
			}
			else if(((tempx2>tempx1)&&(tempy1>tempy2)))
					{
				gd.setXORMode(Color.red);
			//	Main.arr.get(Index).gc.setXORMode(Color.red);
				gd.fillOval(tempx1,tempy2,ht,wt);
				//Main.arr.get(Index).gc.fillOval(tempx1,tempy2,ht,wt);		
						
					}
			else if(((tempx1>tempx2)&&(tempy2>tempy1)))
					{	
				
				gd.setXORMode(Color.red);
				//Main.arr.get(Index).gc.setXORMode(Color.red);
						gd.fillOval(tempx2,tempy1,ht,wt);
					//	Main.arr.get(Index).gc.fillOval(tempx2,tempy1,ht,wt);
						
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
					gd.fillOval(x2,y2,ht,wt);
					Main.arr.get(Index).gc.fillOval(x2,y2,ht,wt);

				}
				else if(((x2>x1)&&(y2>y1)))
				{	gd.setColor(Main.g.getColor());
				Main.arr.get(Index).gc.setColor(Main.g.getColor());
					gd.fillOval(x1,y1,ht,wt);
					Main.arr.get(Index).gc.fillOval(x1,y1,ht,wt);	
				}
				else if(((x2>x1)&&(y1>y2)))
						{gd.setColor(Main.g.getColor());
						Main.arr.get(Index).gc.setColor(Main.g.getColor());	
							gd.fillOval(x1,y2,ht,wt);
							Main.arr.get(Index).gc.fillOval(x1,y2,ht,wt);
							
						}
				else if(((x1>x2)&&(y2>y1)))
						{gd.setColor(Main.g.getColor());
						Main.arr.get(Index).gc.setColor(Main.g.getColor());
							gd.fillOval(x2,y1,ht,wt);
							Main.arr.get(Index).gc.fillOval(x2,y1,ht,wt);
							
						}
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
