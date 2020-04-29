package com.home.buckyprograms2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui extends JFrame{
    private JButton reg;
    private JButton custum;
    private JTextField tf;
    private JCheckBox boldbox,italicbox;
    
    
	public Gui() {
		 super("The title");
		 setLayout(new FlowLayout());
		 
		 tf = new JTextField("this is a sentence",20);
		 tf.setFont(new Font("Serif", Font.PLAIN, 14));
		 add(tf);
		 
		 boldbox= new JCheckBox("bold");
		 italicbox= new JCheckBox("italic");
		 System.out.println("5424");
		  
		 add(boldbox);
		 add(italicbox);
		 
		 reg = new JButton("Reg button");
		 add(reg);
		 
		 Icon b = new ImageIcon(getClass().getResource("4.png"));
		 Icon x = new ImageIcon(getClass().getResource("x.png"));
		 
		 
		 custum= new JButton("Custum",b);
		 custum.setRolloverIcon(x);
		 add(custum);
		 
		 
		 Handlerclass handler = new Handlerclass();
		 boldbox.addItemListener(handler);
		 italicbox.addItemListener(handler);
		 reg.addActionListener(handler);
		 custum.addActionListener(handler);
		 
	}
	private class Handlerclass implements ActionListener,ItemListener{

		@Override
		public void actionPerformed(ActionEvent e) {
 			    JOptionPane.showMessageDialog(null, String.format("%s",	 e.getActionCommand()));
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
 			Font font = null;
 			if(boldbox.isSelected() && italicbox.isSelected())
 			{
 				font= new Font("serif", font.BOLD+font.ITALIC, 14);
 			}
 			else if(boldbox.isSelected())
 			{
 				font= new Font("serif", font.BOLD, 14);
 			}
 			else if(italicbox.isSelected())
 			{
 				font= new Font("serif", font.ITALIC, 14);
 			}else
 				font = new Font("serif",font.PLAIN,14);
 			
 			
 			tf.setFont(font);
		}
	}  
}
