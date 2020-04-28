package com.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

public class BackColorListener implements ActionListener {

	mainClass Main;
	
	
	public BackColorListener(mainClass mc){
		Main = mc;
	}
	
	int Index;
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color set_color = JColorChooser.showDialog(Main.frame, "",Color.blue);
		Index = Main.getIndex();
		if (set_color == null){
			Main.arr.get(Index).jp.setBackground(Main.arr.get(Index).jp.getBackground());
		}
		else {
		Main.arr.get(Index).jp.setBackground(set_color);
		
		}
		
	}

}
