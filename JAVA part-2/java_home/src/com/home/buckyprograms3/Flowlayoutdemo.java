package com.home.buckyprograms3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public  class Flowlayoutdemo extends JFrame{
      private JButton lb,cb,rb;
      private FlowLayout layout;
      private Container container;
	public Flowlayoutdemo(  )
			 {
		super("Flowlayout");
		  
		 layout =new FlowLayout();
		container = getContentPane();                      //very important staemenet
				setLayout(layout);
		
		lb= new JButton("left");
		add(lb);
		lb.addActionListener(new ActionListener() {
			
			 
			public void actionPerformed(ActionEvent e) {
 				layout.setAlignment(FlowLayout.LEFT);
 				layout.layoutContainer(container);
			}
		});
		cb= new JButton("center");
		add(cb);
		cb.addActionListener(new ActionListener() {
			 
			public void actionPerformed(ActionEvent e) {
 				layout.setAlignment(FlowLayout.CENTER);
 				layout.layoutContainer(container);
			}
		});
		rb= new JButton("right");
		add(rb);
		rb.addActionListener(new ActionListener() {
			 
			public void actionPerformed(ActionEvent e) {
 				layout.setAlignment(FlowLayout.RIGHT);
 				layout.layoutContainer(container);
			}
		});
	}
      
      
}
