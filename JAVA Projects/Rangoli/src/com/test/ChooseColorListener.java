package com.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;

public class ChooseColorListener implements ActionListener {

	mainClass Main;
	int Index;
	static JButton a[];
	boolean status = false;
	static int count = 0;
	JButton b1,b2,b3,b4,b5;
	

	
	public ChooseColorListener(mainClass mc) {
	// TODO Auto-generated constructor stub
		Main = mc;
}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		Index = Main.getIndex();
		
		if (Index >= 0){
			
		Color set_color = JColorChooser.showDialog(Main.frame, "",Color.blue);	
		
		Main.g = Main.arr.get(Index).jp.getGraphics();
		Main.g.setColor(set_color);
		
		if (status == false){
		b1 = new JButton("   ");
		b2 = new JButton("   ");
		b3 = new JButton("   ");
		b4 = new JButton("   ");
		b5 = new JButton("   ");
		
		
		b1.addActionListener(new UserButtonListener(this));
		b2.addActionListener(new UserButtonListener(this));
		b3.addActionListener(new UserButtonListener(this));
		b4.addActionListener(new UserButtonListener(this));
		b5.addActionListener(new UserButtonListener(this));
		
		Main.toolBarBottom.add(b1);
		Main.toolBarBottom.add(b2);
		Main.toolBarBottom.add(b3);
		Main.toolBarBottom.add(b4);
		Main.toolBarBottom.add(b5);
		
		
		status = true;
		}
		
	
		
		switch(count){
		case 0:
		case 5:
			b1.setBackground(set_color);
			if (count==5){
				count=0;
			}
			break;
			
		case 1:
			b2.setBackground(set_color);
			break;
			
		case 2:
			b3.setBackground(set_color);
			break;
			
		case 3:
			b4.setBackground(set_color);
			break;
			
		case 4:
			b5.setBackground(set_color);
			break;
		
			
		}
		
		count++;
		
	}
	}
}
	
