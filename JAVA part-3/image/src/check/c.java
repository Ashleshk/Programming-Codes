package check;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.*;
public class c extends JFrame {
  public static void main(String[] args) {
      JFrame frame = new JFrame("main");
     JLabel l4;
     
      frame.setSize(300,300);
      frame.setLocation(300, 150);
     /*  try {
		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("F:\\images_mini\\cancel.jpg")))));
	} catch (IOException e) {
		 
		e.printStackTrace();
	}*/
      
      l4=new JLabel("");
 

	    l4.setFont(new Font("Times New ROman",Font.BOLD,30));
	    l4.setForeground(Color.BLUE);
		l4.setBounds(250,250,300,30);
		 frame.add(l4);
     frame.setResizable(true);
     frame.pack();
     frame.setVisible(true);
  }
}