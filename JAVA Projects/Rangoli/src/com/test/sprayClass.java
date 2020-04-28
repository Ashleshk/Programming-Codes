package com.test;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class sprayClass implements ActionListener,MouseMotionListener,MouseListener,ComponentListener {
	
	private mainClass Main;
	private int x1, y1, x2, y2, x3, y3;
	private int temp1,temp2;
	int Index;
	Graphics2D g; 
	JOptionPane jp;
	static int temp=1;
	boolean isReleased=false;
	public sprayClass(mainClass mc){
		Main = mc;
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		
	}
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		if (Index >=0){
			g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
			g.setColor(Color.BLACK);
			Main.arr.get(Index).gc.setColor(Color.BLACK);
			if (! Main.spray.isSelected()){	
			
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
			
				jp.showMessageDialog(Main.frame,"Please Select Frame ","rAnGoLi",jp.INFORMATION_MESSAGE);
				Main.spray.setSelected(false);
			
		}
	}


	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		temp1 = (int) (Math.random()*15);
		temp2 = (int) (Math.random()*15);
			x2=e.getX();
			y2=e.getY();
			
			
			x1=x2+temp1;
			y1=y2+temp2;
			
	g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
	g.setColor(Main.g.getColor());
	Main.arr.get(Index).gc.setColor(Main.g.getColor());
	g.fill3DRect(x1,y1,2,2,true);
	Main.arr.get(Index).gc.fill3DRect(x1,y1,2,2,true);
	
	for(int i=0;i<5;i++){
		g.fill3DRect((int) (x1+Math.random()*15),(int) (y1+Math.random()*15),2,2,true);
		Main.arr.get(Index).gc.fill3DRect((int) (x1+Math.random()*15),(int) (y1+Math.random()*15),2,2,true);
	}
			
	}


	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
				
		
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
	if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		return;
		
	}
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.setColor(Main.g.getColor());
		Main.arr.get(Index).gc.setColor(Main.g.getColor());
		g.fill3DRect(x1,y1,2,2,true);
		Main.arr.get(Index).gc.fill3DRect(x1,y1,2,2,true);
		
		for(int i=0;i<20;i++){
			
			
			g.fill3DRect((int) (x1+Math.random()*15),(int) (y1+Math.random()*15),2,2,true);
			Main.arr.get(Index).gc.fill3DRect((int) (x1+Math.random()*15),(int) (y1+Math.random()*15),2,2,true);

		}
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	
		Index = Main.getIndex();
		Toolkit t = Toolkit.getDefaultToolkit();
		Image CursorImage = t.createImage("cursors\\spray.GIF");
		Cursor cur =t.createCustomCursor(CursorImage, new Point(5,5),"spray");
		Main.arr.get(Index).jp.setCursor(cur);
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}


	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		Paints();
	}

	 void Paints(){
			Index = Main.getIndex();
			g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		 g.drawImage(Main.arr.get(Index).bf,null,0,0);
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
