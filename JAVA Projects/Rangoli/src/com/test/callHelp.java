package com.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class callHelp implements ActionListener {

	mainClass Main;
	
	
	public callHelp(mainClass mc) {
		// TODO Auto-generated constructor stub
		
		Main = mc;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Help();
	}

}
