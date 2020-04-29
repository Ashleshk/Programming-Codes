package com.home.buckyprograms3;

import javax.swing.JFrame;

public class graphicsmain {
    public static void main(String[] args) {
		 JFrame j= new JFrame("Graphics");
		 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Graphicsdemo go = new Graphicsdemo();
		 j.add(go);
		 j.setSize(300,300);
		 j.setVisible(true);
	}
}
