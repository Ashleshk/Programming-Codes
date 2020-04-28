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

public class EraserClass implements ActionListener, MouseListener, MouseMotionListener,ComponentListener {

mainClass Main=null;
	private int x1, y1, x2, y2;
	
	JOptionPane jp;
	
	
	
	 Graphics2D g;
   int Index;
   
   public EraserClass(mainClass mc) {
		Main=mc;
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		

		
		if (Index >=0){
		
			if (! Main.eraser.isSelected()){	
				
				
				Main.arr.get(Index).jp.removeMouseListener(this);
				Main.arr.get(Index).jp.removeMouseMotionListener(this);
				
		}
		else {
			if (Main.line.isSelected()){
				Main.line.doClick();
				
					}
			if (Main.fillRect.isSelected()){
				Main.fillRect.doClick();
					}
			if (Main.circle.isSelected()){
				Main.circle.doClick();
					}
			if (Main.rectangle.isSelected()){
				Main.rectangle.doClick();
					}
			
			if (Main.pencil.isSelected()){
				Main.pencil.doClick();
					}
			
			if (Main.spray.isSelected()){
				Main.spray.doClick();
					}
			if (Main.roundRect.isSelected()) {
				
				Main.roundRect.doClick();
				
			}

			if (Main.FillCircle.isSelected()) {
		
				Main.FillCircle.doClick();
		
			}
			if (Main.fillRect.isSelected()) {
		
				Main.fillRect.doClick();
		
			}
			if (Main.brush.isSelected()) {
				
				Main.brush.doClick();
		
			}
			if (Main.Text.isSelected()) {
				
				Main.Text.doClick();
		
			}
			if (Main.fill.isSelected()) {
				
				Main.fill.doClick();
		
			}
			
			Main.arr.get(Index).jp.addMouseListener(this);
			Main.arr.get(Index).jp.addMouseMotionListener(this);
		//	Main.arr.get(Index).jp.addComponentListener( this);
		}
						
		}
		
		else {
			jp.showMessageDialog(Main.frame,"Please Select a Frame First ","rAnGoLi",jp.INFORMATION_MESSAGE);
			Main.eraser.setSelected(false);
		}

		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.setColor(Color.white);
		Main.arr.get(Index).gc.setColor(Color.white);
		g.fillRect(x1,y1,25,25);
		Main.arr.get(Index).gc.fillRect(x1,y1,25,25);
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		Toolkit t = Toolkit.getDefaultToolkit();
		Image CursorImage = t.createImage("cursors\\eraser.GIF");
		Cursor cur =t.createCustomCursor(CursorImage, new Point(5,5),"ERASER");
	//	Cursor cur = new Cursor(1);
		Main.arr.get(Index).jp.setCursor(cur);
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.setColor(Color.white);
		Main.arr.get(Index).gc.setColor(Color.white);
		g.fillRect(x1,y1,25,25);
		Main.arr.get(Index).gc.fillRect(x1,y1,25,25);
		
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
