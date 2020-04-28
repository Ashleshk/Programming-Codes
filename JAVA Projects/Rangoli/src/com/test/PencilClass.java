package com.test;

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

public class PencilClass implements ActionListener, MouseMotionListener, MouseListener,ComponentListener {

	private mainClass Main;
	Graphics2D gd = null;
	JOptionPane jp;
	
	public PencilClass(mainClass mc) {
	Main = mc;
	gd = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
	}
	
	private int Index;
	private int x1, y1, x2, y2;
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		if (Index >=0){
		
			if (! Main.pencil.isSelected()){	
			
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
			Main.pencil.setSelected(false);
		}
	}


	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x1=x2;
		y1=y2;
		x2 = e.getX();
		y2= e.getY();
		
		gd = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		gd.setColor(Main.g.getColor());
		Main.arr.get(Index).gc.setColor(Main.g.getColor());
		gd.drawLine(x1,y1,x2,y2);
		Main.arr.get(Index).gc.drawLine(x1,y1,x2,y2);
		
	}


	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 =x2= e.getX();
		y1 =y2= e.getY();
if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		
		
	}
	}

	 void Paints(){
			Index = Main.getIndex();
			gd = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		 gd.drawImage(Main.arr.get(Index).bf,null,0,0);
	    }
	 
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//Cursor cs = new Cursor()
		
		Index = Main.getIndex();
		Toolkit t = Toolkit.getDefaultToolkit();
		Image CursorImage = t.createImage("cursors\\2pencil.GIF");
		Cursor cur =t.createCustomCursor(CursorImage, new Point(5,5),"pencil");
		//Cursor cur = new Cursor(1);
		Main.arr.get(Index).jp.setCursor(cur);
		System.out.println("Mouse Entereed");
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		Paints();
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
