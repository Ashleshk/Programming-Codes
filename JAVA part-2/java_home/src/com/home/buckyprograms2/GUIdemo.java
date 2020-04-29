package com.home.buckyprograms2;

import javax.swing.JOptionPane;

public class GUIdemo {
      public static void main(String[] args) {
		   String fn=JOptionPane.showInputDialog("Enter first nuymber:");
		   String sn=JOptionPane.showInputDialog("Enter second nuymber:");
		   //conerting string to nuimbers
		   int num1= Integer.parseInt(fn);
		   int num2= Integer.parseInt(sn);
		   int sum= num1+num2;
		   JOptionPane.showMessageDialog (null, "the answer is "+sum,"the title" ,JOptionPane.PLAIN_MESSAGE);
	}
}
