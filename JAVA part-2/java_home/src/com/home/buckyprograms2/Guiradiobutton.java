package com.home.buckyprograms2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Guiradiobutton extends JFrame {
    
	
	 private JTextField tf;
	 private Font pf,bf,itf,bif;
	 private JRadioButton pb,bb,ib,bib;
	 private ButtonGroup group;
	public Guiradiobutton() throws HeadlessException {
		super("the title");
		setLayout(new FlowLayout());
		
		tf= new JTextField("ashlesh is awesome",25);
		add(tf);
		
		pb= new JRadioButton("plain",true);
		bb= new JRadioButton("bold",false);
		ib= new JRadioButton("italic",false);
		bib= new JRadioButton("bold and italic",false);

		add(pb);
		add(bb);
		add(ib);add(bib);
		
		
		group= new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf= new Font("serif", Font.PLAIN, 14);
		bf= new Font("serif", Font.BOLD, 14);
		itf= new Font("serif", Font.ITALIC, 14);
		bif= new Font("serif", Font.BOLD+Font.ITALIC, 14);
		
		tf.setFont(pf);
		//this wait for event to happen
		pb.addItemListener(new Handlerclass(pf));
		bb.addItemListener(new Handlerclass(bf));
		ib.addItemListener(new Handlerclass(itf));
		bib.addItemListener(new Handlerclass(bif));
		
		
	}
	private class Handlerclass implements ItemListener{
                private Font font;
		public Handlerclass(Font f) {
			 
		font = f;
		}
		
		public void itemStateChanged(ItemEvent e) {
               tf.setFont(font);			
		}
		
		
	}
	 
	 
}
