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

/**
 * 
 */

/**
 * @author t0058
 *
 */
class ListenerClass implements ActionListener , MouseMotionListener, MouseListener, ComponentListener {
	
private	mainClass Main=null;
	Graphics2D gd, gc;
	JOptionPane jp;
	 private static	int x1, y1, x2, y2;
	 private int tempx1,tempx2,tempy1,tempy2;
	 private boolean isrel = false;
	 int Index;
		
	 
	public ListenerClass(mainClass mc) {
		Main=mc;
		// gd=(Graphics2D) Main.arr.get(Index).jp.getGraphics();
	}
	
	
    
   
   
    public void Paint()
	{	int r,g,b;
	
	if ( Main.line.isSelected()){
	
		gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		
		gd.setColor(Main.g.getColor());
		Main.arr.get(Index).gc.setColor(Main.g.getColor());

		r=Main.g.getColor().getRed()+50>245?Main.g.getColor().getRed()-50:Main.g.getColor().getRed()+50;
		g=Main.g.getColor().getGreen()+50>245?Main.g.getColor().getGreen()-50:Main.g.getColor().getGreen()+50;
		b=Main.g.getColor().getBlue()+50>245?Main.g.getColor().getBlue()-50:Main.g.getColor().getBlue()+50;
		
		Color c =new Color(r,g,b);
		
		gd.setColor(c);
		
		if(isrel == false){
			gd.setXORMode(Color.red);
			gd.drawLine(x1,y1,x2,y2);
							
				
			gd.setXORMode(Color.red);
			gd.drawLine(tempx1,tempy1,tempx2,tempy2);
									
				
			tempx1=x1;
			tempx2=x2;
			tempy1=y1;
			tempy2=y2;
		}
			
			else{
				
				gd.setColor(Main.g.getColor());
				Main.arr.get(Index).gc.setColor(Main.g.getColor());
				gd.drawLine(x1,y1,x2,y2);
				Main.arr.get(Index).gc.drawLine(x1,y1,x2,y2);
							
						}
	}
	}
    
    
    void Paints(){
		Index = Main.getIndex();
		gd = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
    	gd.drawImage(Main.arr.get(Index).bf,null,0,0);
    }
    
    
    
    
    
	public void actionPerformed(ActionEvent e) {
			
			Index = Main.getIndex();
			if (Index >=0){
		//	System.out.println(Main.g.getColor());
				jp = new JOptionPane();
				
				
				
				
				if (! Main.line.isSelected()){	
				
					Main.arr.get(Index).jp.removeMouseListener(this);
					Main.arr.get(Index).jp.removeMouseMotionListener(this);
				//	Main.arr.get(Index).jp.removeComponentListener( this);
			}
			else {
				
				if (Main.eraser.isSelected()){
					Main.eraser.doClick();
					}
				
				Main.arr.get(Index).jp.addMouseListener(this);
				Main.arr.get(Index).jp.addMouseMotionListener(this);
				Main.arr.get(Index).jp.addComponentListener( this);
				
			}
					
				
			}
			
			else {
				jp.showMessageDialog(Main.frame,"Please Select Frame ","rAnGoLi",jp.INFORMATION_MESSAGE);
				Main.line.setSelected(false);
			}
			
			}



	
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
	x1 = 0;
	x2 = 0;
	y1 = 0;
	y2 = 0;
	System.out.println("componenet resized"); 
	//Paints();
	//Main.arr.get(Index).repaint();
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
		
		if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		
		
	}
		x1 =tempx1= tempx2=x2=e.getX();
		y1 =tempy1= tempy2=y2=e.getY();
		
		isrel = false;
		
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
		System.out.println("Mouse Exit");
	}


}
