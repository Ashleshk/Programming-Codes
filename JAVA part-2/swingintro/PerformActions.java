package com.book2.swingintro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerformActions implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		 String caption=arg0.getActionCommand();
		 if(caption.equals("submit"))
		 {
			 System.out.println("will be performing database later...");
		 }
		 else if (caption.equals("cancel"))
		 {
			 System.out.println("will need to stop execution and return to base....");
		 }

	}

}
