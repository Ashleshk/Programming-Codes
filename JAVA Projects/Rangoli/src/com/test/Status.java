package com.test;
 

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Status implements ActionListener {
mainClass Main;

 public  Status (mainClass mc) {
	Main = mc;
}

 int Index;
 JFrame statusWindow = null;
 
 
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		statusWindow = new JFrame("Status Window");
		statusWindow.setBounds(1100,90,150,80);
		statusWindow.setLayout(new GridLayout(0,2));
		statusWindow.setResizable(false);
		JLabel label = new JLabel("  Pen Color");
		JButton labelColor = new JButton("  ");
		labelColor.setEnabled(false);
		labelColor.setBackground(Main.g.getColor());
		
		statusWindow.add(label);
		statusWindow.add(labelColor);
		label.setVisible(true);
		labelColor.setVisible(true);
		
		//statusWindow.getContentPane().add(label,BorderLayout.EAST);
		
		
		JLabel label1 = new JLabel("  Back Color");
		JButton labelColor1 = new JButton("  ");
		labelColor1.setBackground(Main.arr.get(Index).jp.getBackground());
		statusWindow.add(label1);
		statusWindow.add(labelColor1);
		labelColor1.setEnabled(false);
		
		statusWindow.setVisible(true);
	}

}

