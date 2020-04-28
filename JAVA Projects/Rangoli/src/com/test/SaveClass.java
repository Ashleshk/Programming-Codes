package com.test;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SaveClass implements ActionListener {

	mainClass Main;
	
	public SaveClass(mainClass mc) {
		// TODO Auto-generated constructor stub
		Main = mc;
		
	}
	int Index;
	
	BufferedImage myBf = null;
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		
		myBf =  new BufferedImage(1050,820,BufferedImage.TYPE_INT_RGB);
		
		Graphics2D gd = (Graphics2D) myBf.createGraphics();
		
		/*gd.setColor(Color.WHITE);
		gd.fillRect(0,0,1050,820);*/
		
		Color c = Main.arr.get(Index).jp.getBackground();
		
		gd.setColor(c);
		gd.fillRect(0,0,1050,820);
		
		//gd.setBackground(Color.WHITE);
		
		
		
		gd.drawImage(Main.arr.get(Index).bf,null,0,0);
		
		FileDialog fd = new FileDialog(Main.frame,"",FileDialog.SAVE);
		fd.setVisible(true);
		File outputFile = new File (fd.getDirectory()+"/" + fd.getFile()+ ".png");
		
		try {
			ImageIO.write(myBf, "png",outputFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("file not saved");
		}
		
		
		
	}

}
