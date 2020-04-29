package com.home.buckyprograms3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
 

public class Jlistdemo extends JFrame{
       private JList list;
       private static String[] colorname= {"black","red","blue","white","cyan","Dark grey","green"};
       private static  Color[] colors= {Color.BLACK,Color.RED,Color.BLUE,Color.WHITE,Color.CYAN,Color.DARK_GRAY,Color.GREEN};
	public Jlistdemo()  {
		super("the JLIST  DEMO");
		
		setLayout(new FlowLayout());
		setSize(300,500);
		
		list = new JList<>(colorname);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
 				   getContentPane().setBackground(colors[list.getSelectedIndex()]);
 				   
			}
		});
	}
       
       
}
