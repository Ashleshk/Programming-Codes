package com.home.buckyprograms2;

import javax.swing.JFrame;

public class guimain {
   public static void main(String[] args) {
	  Guiradiobutton go = new Guiradiobutton();
	  Gui gi = new Gui();
	   go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   go.setSize(250,250);
	   go.setVisible(true);
	   gi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   gi.setSize(500,500);
	   gi.setVisible(true);
}
}
