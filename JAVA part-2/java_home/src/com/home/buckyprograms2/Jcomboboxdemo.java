package com.home.buckyprograms2;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jcomboboxdemo extends JFrame{
    private JComboBox  box;
    private JLabel picture;
    
    private static String[] filename= {"4.png","x.png","5.jpg"};
    private Icon[] pics= {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1])),new ImageIcon(getClass().getResource(filename[2]))};
	
    
    public Jcomboboxdemo() throws HeadlessException {
		super("the Jcombobox");
		setLayout(new FlowLayout());
		
		
		box= new JComboBox (filename);
		
		//anomynous innerclass
		box.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				 if(e.getStateChange()==ItemEvent.SELECTED)
				 {
					 picture.setIcon(pics[box.getSelectedIndex()]);
				 }
				 
			}
		});
		add(box);
		picture= new JLabel(pics[0]);
		add(picture);
	}
    
    
    


}
