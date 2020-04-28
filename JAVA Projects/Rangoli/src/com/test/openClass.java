package com.test;

import java.awt.FileDialog;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class openClass implements ActionListener, ComponentListener{

	mainClass Main;
	int Index;
	Image img;
	Graphics2D g,gd;
	FrameClass IntFrame = null;
	BufferedImage bi=null;
		
	public openClass(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
		
				
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	bi=new BufferedImage(1075,820,BufferedImage.TYPE_INT_ARGB);
		
		
	Index = Main.getIndex();
	
	IntFrame = new FrameClass();
	
	
	
	Main.jDPane.add(IntFrame);
	
	
	 Main.arr.add(IntFrame);
	 
	g = (Graphics2D) IntFrame.jp.getGraphics();
	IntFrame.jp.addComponentListener(this);
	
	
	
	

		
		
		
		FileDialog fd = new FileDialog(Main.frame, "File Dialog");
		fd.setVisible(true);
		//g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		
		//Main.arr.get(Index).jp.addComponentListener(this);
		

				
		System.out.println(fd.getDirectory()+ fd.getFile());
		
				
		File f=new File(fd.getDirectory()+ fd.getFile());
		try {
			bi=ImageIO.read(f);
		} catch (IOException f1) {
			// TODO Auto-generated catch block
			f1.printStackTrace();
		}
	
        IntFrame.gc.drawImage(bi,null,0,0);    

		IntFrame.setTitle(fd.getFile());
		IntFrame.moveToFront();
		Paint();
		
	
	
	}

	void Paint(){
		Index = Main.getIndex();
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.drawImage(Main.arr.get(Index).bf,null,0,0);
	}

	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		Paint();
	}

	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
