package com.test;

import java.awt.FileDialog;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;




public class ImportImageClass implements ActionListener,ComponentListener,MouseListener {

	mainClass Main=null;
	int Index;
	Graphics2D g = null;
	Graphics2D gc=null;;
	
	Image img = null;
	Image img1 = null;
	int x,y;
	
	JOptionPane jp ;
	
	
	BufferedImage image=new BufferedImage(1075,820,BufferedImage.TYPE_INT_ARGB);;
	BufferedImage bi=null;
//	ImageObserver b = new ImageObserver();
	
	
	public ImportImageClass(mainClass mc ){
		Main = mc;
		
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		Index = Main.getIndex();
		
		if (Index >= 0){
			
			
			
			FileDialog fd = new FileDialog(Main.frame, "File Dialog");
			fd.setVisible(true);
			g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
			
			Main.arr.get(Index).jp.addComponentListener(this);
			

					
			File f=new File(fd.getDirectory()+ fd.getFile());
			try {
				image=ImageIO.read(f);
			} catch (IOException f1) {
				// TODO Auto-generated catch block
				f1.printStackTrace();
			}
		
			Main.arr.get(Index).gc.drawImage(image,null,0,0);
			Main.arr.get(Index).setTitle(fd.getFile());
			
			Main.arr.get(Index).jp.addMouseListener(this);
			Paint();
			
			
			
		}
			
		else {
			jp.showMessageDialog(Main.frame,"Please Select a Frame First ","rAnGoLi",jp.INFORMATION_MESSAGE);
			
		}


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



	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}



	private void Paint() {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.drawImage(Main.arr.get(Index).bf,null,0,0);
		
	}



	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}