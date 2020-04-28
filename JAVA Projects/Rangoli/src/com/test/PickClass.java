package com.test;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PickClass implements ActionListener, MouseListener {

	mainClass Main;
	Robot rob = null;
	int x1,y1;
	Color str;
	int  Index;
	
	
	public PickClass(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
	}

	
	

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Index = Main.getIndex();
			if (Index >= 0){

				if (Main.Pick.isSelected()){
			Main.arr.get(Index).jp.addMouseListener(this);
			
			
			try {
				rob=new Robot();
				
			} catch (AWTException err) {
				// TODO Auto-generated catch block
				err.printStackTrace();
			}
			
			
			
			}
				
				
			}
			else {
				Main.arr.get(Index).jp.removeMouseListener(this);
			}
		}

		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
			if (Main.Pick.isSelected()) {
			
			x1=arg0.getX();
			y1=arg0.getY();
			

			int i = Main.arr.get(Index).bf.getRGB(x1,y1);
			//Main.arr.get(Index).gc.setBackground(Color.WHITE);
			Color f = new Color(i);
			//str=rob.getPixelColor(x1,y1);
			Main.g.setColor(f);
			int ire = f.getRGB();
			
				System.out.println("color" + ire);
				if (ire == -16777216){
					System.out.println("white color");
					Main.showPickColor.setBackground(Color.white);
				}
			
				else {
			Main.showPickColor.setBackground(f);
				}
			}
			
		}

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
		
		}

		
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			Cursor cur=new Cursor(0);
			Main.arr.get(Index).jp.setCursor(cur);
			
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}


