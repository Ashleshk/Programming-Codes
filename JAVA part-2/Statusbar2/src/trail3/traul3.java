package trail3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;

public class traul3 implements ActionListener{
	Timer t;
	JLabel j1;
	JTextField t1;
	
          public traul3(){
        	  JFrame frame = new JFrame();
        	  try {
     			 frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("F:\\images_mini\\bank.jpg")))));
     		} catch (IOException e) {
     			System.out.println("image failure");
     		}
  			 j1 = new JLabel("fg");
  			 frame.add(j1);
  			
  			 t1=new JTextField();
  			 t1.setFont(new Font("Times New Roman",Font.BOLD,20) );
             t1.setPreferredSize(new Dimension(frame.getWidth(), 20));
  			frame.setVisible(true);
  			frame.setSize(800,750);
  		frame.setLocation(520,150) ;
  		 
		 
  			t =new Timer(2000 ,  this);// 20 Millisecond
  	         t.start();
          }
	 
		public void actionPerformed(ActionEvent arg0) {
		    t1.setText("thinfdfndf");
			
		}
		public static void main(String[] args) {
			traul3 t  =new traul3();
		}
}
