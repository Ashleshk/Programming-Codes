package com.home.buckyprograms3;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Adapterclsses extends JFrame {
        private String details;
        private JLabel statusbar;
		public Adapterclsses() throws HeadlessException {
			super("Adapter class");
			
			
			statusbar= new JLabel("this is default");
			add(statusbar, BorderLayout.SOUTH);
			addMouseListener(new Mouseclass());
		}
        private class Mouseclass extends MouseAdapter{
        	 public void mouseClicked(MouseEvent e)
        	 {
        		 details = String.format("you clicked %d", e.getClickCount());
        	     if(e.isMetaDown())
        	          details += "with right mouse button";
        	     else if(e.isAltDown())
        	    	 details += "with center mouse button";
        	     else 
        	    	 details += "with left mouse button";
        	     
        	     statusbar.setText(details);
        	 }
        }
}
