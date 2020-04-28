package com.test;

 

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JOptionPane;

public class XClearClass implements ActionListener,ComponentListener {

	/**
	 * @param args
	 */
	
	mainClass Main;
	int Index;
	Graphics2D gd;
	JOptionPane jp;
	
	

	public XClearClass(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
		Index = Main.getIndex();
		//gd=(Graphics2D) Main.arr.get(Index).jp.getGraphics();
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		gd=(Graphics2D) Main.arr.get(Index).jp.getGraphics();
		
		if (Main.spray.isSelected()) {
			Main.spray.doClick();
			
		}
		if (Main.eraser.isSelected()) {
			Main.eraser.doClick();
			
		}
		
		
		if (Index>= 0) {
			Main.arr.get(Index).jp.repaint();
			Main.arr.get(Index).gc.setColor(Main.arr.get(Index).jp.getBackground());
			Main.arr.get(Index).gc.fillRect(0,0,1075,820);
			//Main.arr.get(Index).jp.setBackground(Color.white);
		}
		else {
			jp.showMessageDialog(Main.frame,"Please Select a Frame First ","rAnGoLi",jp.INFORMATION_MESSAGE);
			Main.ClearScreen.setSelected(false);
		}
		
		
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
