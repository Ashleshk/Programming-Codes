package com.home.buckyprograms3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 

public class MouseEventsdemo extends JFrame {

	 private String details;
	
	 private JPanel mousepanel;
	 private JLabel statusbar;
	public MouseEventsdemo() throws HeadlessException {
		super("the mouse ");
		
		
		 mousepanel= new JPanel();
		 mousepanel.setBackground(Color.YELLOW);
		 add(mousepanel,BorderLayout.CENTER);
		 
		 
		 statusbar = new JLabel("defualt");
		 add(statusbar, BorderLayout.SOUTH);
		 
		 Handlerclass Handler= new Handlerclass();
		 mousepanel.addMouseListener(Handler);
		 //addMouseListener(new Mouseclass());
		 mousepanel.addMouseMotionListener(Handler);
		
		
	}
/*	private class Mouseclass extends MouseAdapter{
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
   }*/
	private class Handlerclass extends MouseAdapter implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			statusbar.setText("you are dragging the mouse");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			statusbar.setText("you moved a mouse");
		}
 ///  mouse mouse listeneer  method
		@Override
		public void mouseClicked(MouseEvent e) {
			    statusbar.setText(String.format("clicked at %d ,%d", e.getX(),e.getY()));
			    details = String.format("you clicked %d", e.getClickCount());
		   	     if(e.isMetaDown())
		   	          details += "with right mouse button";
		   	     else if(e.isAltDown())
		   	    	 details += "with center mouse button";
		   	     else 
		   	    	 details += "with left mouse button";
		   	     
		   	     statusbar.setText(details);

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			statusbar.setText("you enetered the area" );
			mousepanel.setBackground(Color.RED);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			statusbar.setText(",ouse has left tje area" );
			mousepanel.setBackground(Color.YELLOW);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			    statusbar.setText("you pressed the buttton" );
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			statusbar.setText("you released the buttton" );
		}
		
	}
	 
}
