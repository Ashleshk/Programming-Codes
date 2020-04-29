package com.home.buckyprograms2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jframedemo  extends JFrame {
      private JLabel item1;
      public Jframedemo()
      {
    	  super("this title bar");
    	  setLayout(new FlowLayout());
    	  
    	  item1=new JLabel("this is  item");
    	  item1.setToolTipText("ths is gonna show up on hover");
    	  add(item1);
    	  
      }
}
