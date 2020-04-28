package com.test;

 

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class TDLinesListener implements ActionListener, MouseMotionListener, MouseListener, ComponentListener {

	mainClass Main;
	Graphics2D g,gd;
	JOptionPane jp;
	
	public TDLinesListener(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
		gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
	}
	int Index;
	
	static int x1 , y1, x2, y2;
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		if (Index >=0){
			Main.g = Main.arr.get(Index).jp.getGraphics();
			gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
			
			//Main.g.setColor(Color.BLACK);
		//	Main.arr.get(Index).gc.setColor(Color.BLACK);
	
			if (! Main.TDLines.isSelected()){	
			
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
			Main.TDLines.setSelected(false);
		}
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.setColor(Main.g.getColor());
		Main.arr.get(Index).gc.setColor(Main.g.getColor());
		g.drawLine(x1,y1,x2,y2);
		Main.arr.get(Index).gc.drawLine(x1,y1,x2,y2);
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
	//	x1 = e.getX();
		//y1 = e.getY();
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		
		
	}
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	 void Paints(){
			Index = Main.getIndex();
			g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		 g.drawImage(Main.arr.get(Index).bf,null,0,0);
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
