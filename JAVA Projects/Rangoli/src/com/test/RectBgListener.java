package com.test;
 

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JOptionPane;

public class RectBgListener implements ActionListener,ComponentListener {

 private	mainClass Main;
 private Graphics2D gd;
 JOptionPane jp;
 
	public RectBgListener(mainClass mc){
		Main = mc;
		gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		
	}
	
	int Index;
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if (Main.g == null){
			
			jp.showMessageDialog(Main.frame,"Please Select Color ","rAnGoLi",jp.INFORMATION_MESSAGE);
		
		
	}
		Index = Main.getIndex();
		gd= (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		
		if (Main.RectBg == e.getSource()){
			Main.arr.get(Index).jp.addComponentListener(this);
			//Main.arr
			System.out.println("component listener ADDED");
			
		}
		
		System.out.println(Main.RectBg.isSelected());
		gd.setColor(Main.g.getColor());
		Main.arr.get(Index).gc.setColor(Main.g.getColor());
				
		if (Index>=0){
			
			for (int i = 0; i<=1000; i++){
				Color c = new Color((int) (Math.random()*254),(int) (Math.random()*254),(int) (Math.random()*254));
				gd.setColor(c);
				Main.arr.get(Index).gc.setColor(c);
				gd.fill3DRect((int) (Math.random()*1240),(int)(Math.random()*990),20,20,true);
				Main.arr.get(Index).gc.fill3DRect((int) (Math.random()*1240),(int)(Math.random()*990),20,20,true);
			}
			
			
		}
		else {
			jp.showMessageDialog(Main.frame,"Please Select a Frame First ","rAnGoLi",jp.INFORMATION_MESSAGE);
			Main.RectBg.setSelected(false);
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
