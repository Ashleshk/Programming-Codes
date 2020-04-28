package com.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class callAboutus implements ActionListener {
mainClass Main;
	
	
	public callAboutus(mainClass mc) {
		// TODO Auto-generated constructor stub
		
		Main = mc;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Aboutus();
	}

}
