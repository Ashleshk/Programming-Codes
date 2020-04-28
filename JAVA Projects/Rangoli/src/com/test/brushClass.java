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

public class brushClass implements ActionListener, MouseListener, MouseMotionListener,ComponentListener {

	
	mainClass  Main;
	 Graphics2D g = null;
	 int Index;
	 static int x,y,a,b;
	int size=2;

	JOptionPane jp = null;
	
	
	
	public brushClass(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		Index = Main.getIndex();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Index = Main.getIndex();
		if (Index >= 0){
			if (! Main.brush.isSelected()){	
				
				Main.arr.get(Index).jp.removeMouseListener(this);
				Main.arr.get(Index).jp.removeMouseMotionListener(this);
				//Main.arr.get(Index).jp.removeComponentListener(this);
				
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
			Main.brush.setSelected(false);
		}

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		a=x=e.getX();b=y=e.getY();
	if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		
		
	}
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		a=x=e.getX();b=y=e.getY();
if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		
		
	}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		Toolkit t = Toolkit.getDefaultToolkit();
		Image CursorImage = t.createImage("cursors\\brush.GIF");
		Cursor cur =t.createCustomCursor(CursorImage, new Point(5,5),"brush");
		Main.arr.get(Index).jp.setCursor(cur);
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		a=x;b=y;x=e.getX();y=e.getY();
		
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.setColor(Main.g.getColor());
		Main.arr.get(Index).gc.setColor(Main.g.getColor());
		size = Main.combo.getSelectedIndex();
		
		
		if ( Main.brush.isSelected()){
		
		for(int i=0;i<size;i++)
		{
			g.drawLine(a,b,x,y);
			Main.arr.get(Index).gc.drawLine(a,b,x,y);
			g.drawLine(a+i,b+i,x,y);
			Main.arr.get(Index).gc.drawLine(a+i,b+i,x,y);
			g.drawLine(a-i,b-i,x,y);
			Main.arr.get(Index).gc.drawLine(a-i,b-i,x,y);
			g.drawLine(a,b,x+i,y+i);
			Main.arr.get(Index).gc.drawLine(a,b,x+i,y+i);
			g.drawLine(a,b,x-i,y-i);
			Main.arr.get(Index).gc.drawLine(a,b,x-i,y-i);

			g.drawLine(a+i,b,x,y-i);
			Main.arr.get(Index).gc.drawLine(a+i,b,x,y-i);
			g.drawLine(a+i,b,x-i,y);
			Main.arr.get(Index).gc.drawLine(a+i,b,x-i,y);

			g.drawLine(a-i,b,x-i,y);
			Main.arr.get(Index).gc.drawLine(a-i,b,x-i,y);
			g.drawLine(a-i,b,x,y-i);
			Main.arr.get(Index).gc.drawLine(a-i,b,x,y-i);


			g.drawLine(a,b-i,x-i,y);
			Main.arr.get(Index).gc.drawLine(a,b-i,x-i,y);
			g.drawLine(a,b-i,x,y-i);
			Main.arr.get(Index).gc.drawLine(a,b-i,x,y-i);
			g.drawLine(a+1,b,x,y+i);
			Main.arr.get(Index).gc.drawLine(a+1,b,x,y+i);
			g.drawLine(a,b+i,x-i,y-i);
			Main.arr.get(Index).gc.drawLine(a,b+i,x-i,y-i);



			g.drawLine(a+i,b,x,y);
			Main.arr.get(Index).gc.drawLine(a+i,b,x,y);
			g.drawLine(a-i,b,x,y);
			Main.arr.get(Index).gc.drawLine(a-i,b,x,y);
			g.drawLine(a,b+i,x,y);
			Main.arr.get(Index).gc.drawLine(a,b+i,x,y);
			g.drawLine(a,b+i,x,y);
			Main.arr.get(Index).gc.drawLine(a,b+i,x,y);
			g.drawLine(a,b,x+i,y);
			Main.arr.get(Index).gc.drawLine(a,b,x+i,y);
			g.drawLine(a,b,x-i,y);
			Main.arr.get(Index).gc.drawLine(a,b,x-i,y);
			g.drawLine(a,b,x,y+i);
			Main.arr.get(Index).gc.drawLine(a,b,x,y+i);
			g.drawLine(a,b,x,y-i);
			Main.arr.get(Index).gc.drawLine(a,b,x,y-i);
			g.drawLine(a+i,b,x+i,y);
			Main.arr.get(Index).gc.drawLine(a+i,b,x+i,y);
			g.drawLine(a+i,b,x-i,y);
			Main.arr.get(Index).gc.drawLine(a+i,b,x-i,y);
			g.drawLine(a,b+i,x,y+i);
			Main.arr.get(Index).gc.drawLine(a,b+i,x,y+i);
			g.drawLine(a+i,b,x,y+i);
			Main.arr.get(Index).gc.drawLine(a+i,b,x,y+i);
			g.drawLine(a,b+i,x+i,y);
			Main.arr.get(Index).gc.drawLine(a,b+i,x+i,y);


			g.drawLine(a+i,b+i,x+i,y+i);
			Main.arr.get(Index).gc.drawLine(a+i,b+i,x+i,y+i);
			g.drawLine(a-i,b+i,x-i,y-i);
			Main.arr.get(Index).gc.drawLine(a-i,b+i,x-i,y-i);
			g.drawLine(a+i,b-i,x+i,y+i);
			Main.arr.get(Index).gc.drawLine(a+i,b-i,x+i,y+i);
			g.drawLine(a-i,b+i,x+i,y+i);
			Main.arr.get(Index).gc.drawLine(a-i,b+i,x+i,y+i);
			g.drawLine(a-i,b-i,x+i,y+i);
			Main.arr.get(Index).gc.drawLine(a-i,b-i,x+i,y+i);
			g.drawLine(a+i,b+i,x-i,y+i);
			Main.arr.get(Index).gc.drawLine(a+i,b+i,x-i,y+i);
			g.drawLine(a+i,b+i,x-i,y-i);
			Main.arr.get(Index).gc.drawLine(a+i,b+i,x-i,y-i);
			g.drawLine(a+i,b+i,x+i,y-i);
			Main.arr.get(Index).gc.drawLine(a+i,b+i,x+i,y-i);
			g.drawLine(a-i,b+i,x+i,y-i);
			Main.arr.get(Index).gc.drawLine(a-i,b+i,x+i,y-i);
			g.drawLine(a-i,b+i,x-i,y+i);
			Main.arr.get(Index).gc.drawLine(a-i,b+i,x-i,y+i);
			g.drawLine(a+i,b-i,x-i,y+i);
			Main.arr.get(Index).gc.drawLine(a+i,b-i,x-i,y+i);
			g.drawLine(a+i,b-i,x+i,y-i);
			Main.arr.get(Index).gc.drawLine(a+i,b-i,x+i,y-i);

					
			
		}
		}
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		Paints();
	}

	private void Paints() {
		// TODO Auto-generated method stub
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
