package com.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorListener implements ActionListener {

		mainClass Main=null;
	
	
	
	public ColorListener(mainClass mc) {
		Main=mc;
	}
	
	
   int Index;
   Color c = null;
   
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		
		if (Index >= 0){
			Main.g = Main.arr.get(Index).jp.getGraphics();
		for (int i = 0; i<15; i++){
			if (("ColorButton" + i).equalsIgnoreCase(e.getActionCommand())){
				c=new Color (Main.rc[i], Main.gc[i], Main.bc[i]);
				 
				Main.g.setColor(c);
				
				
					}
			
		}
		
	}
	}
	
}
