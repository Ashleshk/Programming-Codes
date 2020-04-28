package com.test;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class FrameClass extends JInternalFrame {

	/**
	 * @param args
	 */
	Graphics2D g,gc;
	 BufferedImage bf;
	public  Image img;
	 JPanel jp;
	 JScrollPane ScrollBar = null;
	
	public FrameClass () {
		setLayout(new BorderLayout());
	    setClosable(true);
	    setBounds(0,0,1075,813);
	    
	    setMaximizable(true);
	    setClosable(true);
		setResizable(true);
		setAutoscrolls(true);
		setClosable(true);
		
		
	    // Adding JPanel to the Internal frame
	    jp=new JPanel();	
	    //add(jp,BorderLayout.CENTER);
	    jp.setBackground(Color.WHITE);
	    ScrollBar = new JScrollPane();
	    jp.add(ScrollBar);
	    add(jp,BorderLayout.CENTER);
	     bf = new BufferedImage(1075,813,BufferedImage.TYPE_INT_ARGB);
		gc=bf.createGraphics();
		g=(Graphics2D) jp.getGraphics();
		//g.setColor(Color.BLACK);
		//gc.setColor(Color.WHITE);
		//gc.fill3DRect(0,0,1050,820,true);
	     setVisible(true);
	     
	     
	}
	
	
	
			}
			
	
	
	
	
