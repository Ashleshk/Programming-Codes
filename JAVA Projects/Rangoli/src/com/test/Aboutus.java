package com.test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Aboutus {
	JFrame jf = null;
	//Image img;
	Graphics gc;
	BufferedImage img;
	public Aboutus() {
		// TODO Auto-generated constructor stub

		img=new BufferedImage(500,500,BufferedImage.TYPE_INT_ARGB);;
		jf = new JFrame("About Rangoli");
		jf.setBounds(200,200,743,530);
		jf.setResizable(false);
		jf.setIgnoreRepaint(true);
		
		File f=new File("icons\\aboutus.jpg");
		try {
			img=ImageIO.read(f);
		} catch (IOException f1) {
			// TODO Auto-generated catch block
			f1.printStackTrace();
		}
	
		jf.setVisible(true);
		Paint();
		
		
		
		
	}
	
	public void Paint(){
		if (img != null){
			gc = jf.getGraphics();
			if (gc!= null){
		gc.drawImage(img,0,0, null);
			}
		}
		else {
			System.out.println("img missing");
		}
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jf.repaint();
	}
}
