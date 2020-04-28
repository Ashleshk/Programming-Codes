package com.book2.swingintro;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demodrawing  extends JFrame{
   DrawingArea left = new  DrawingArea();
   DrawingArea right = new DrawingArea();
   int flip =0;
public demodrawing( ) {
	 left.setBackground(Color.white);
	 right.setBackground(Color.black);
	 JButton b=new JButton("click here");
	 b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 if(flip==1)
			 {
				 left.setMyColor(Color.red);
				 right.setMyColor(Color.blue);
				 flip=0;
			 }
			 else
			 {
				 left.setMyColor(Color.blue);
				 right.setMyColor(Color.red);
				 flip=1;
			 }
		}
	});
	 
	 Container content = this.getContentPane();
	 content.setLayout(new FlowLayout());
	 content.add(b);
	 content.add(left);
	 content.add(right);
	 this.setTitle("demo drawing by using Jpanel");
	 this.pack();
  }
   
}
