package com.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newInternalFrameClass implements ActionListener {

	mainClass Main;
	
	FrameClass IntFrame= null;
	int Index;
	
	public newInternalFrameClass(mainClass mc) {
		
		Main = mc;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (e.getSource() == Main.newFile || e.getActionCommand().equalsIgnoreCase("new")){
		
		Index=Main.getIndex();
		
		IntFrame = new FrameClass();
		
	
		
		Main.jDPane.add(IntFrame);
		
		
		 Main.arr.add(IntFrame);
		 
		 IntFrame.moveToFront();
		 
		// Main.jtp.add("Untitled",IntFrame);
		 //Main.jtp.add("Untitled",IntFrame);
	}
	else {
		
	}
	}
}
