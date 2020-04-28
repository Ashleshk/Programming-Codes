package com.test;
 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserButtonListener implements ActionListener {

	ChooseColorListener Clst;
	
	public UserButtonListener(ChooseColorListener ColList) {
	
		// TODO Auto-generated constructor stub
		
		Clst = ColList;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	//String str = (String) e.getSource();
//	String str = e.getActionCommand();
		
		if (e.getSource()==Clst.b1){
			
			Clst.Main.g.setColor(Clst.b1.getBackground());
		}
		
		if (e.getSource()==Clst.b2){
			
			Clst.Main.g.setColor(Clst.b2.getBackground());
		}
		
		if (e.getSource()==Clst.b3){
			Clst.Main.g.setColor(Clst.b3.getBackground());	
			
		}
		
		if (e.getSource()==Clst.b4){
			
			Clst.Main.g.setColor(Clst.b4.getBackground());
		}
		
		if (e.getSource()==Clst.b5){
			Clst.Main.g.setColor(Clst.b5.getBackground());
			
		}
		
		
		
	}

}
