package com.home.buckyprograms3;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import org.w3c.dom.ls.LSInput;

public class Multiplelsitdemo extends JFrame {
    private JList leftlist,rightlist;
    private JButton  movebutton;
    private static String[] food = {"bacon","wings","ham ","beef","more bacan","samosa"};
	public Multiplelsitdemo() throws HeadlessException {
		super("multiple list demo");
		
		setLayout(new FlowLayout());
		setSize(500,450);
		leftlist= new JList(food);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		
		movebutton= new JButton("move--->");
		movebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 rightlist.setListData(leftlist.getSelectedValues());				
			}
		});
		add(movebutton);
		
		rightlist= new JList<>();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}
    
}
