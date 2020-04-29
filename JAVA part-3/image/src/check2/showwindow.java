package check2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class showwindow {
    public static void main(String[] args) {
		JFrame f = new JFrame("background");
		JLabel l3;
		f.setSize(600, 400);
		f.setLocation(360, 160);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     
	     
	     l3=new JLabel("ATM Services");
			l3.setFont(new Font("Times New Roman",Font.BOLD,30));
			l3.setForeground(Color.BLUE);
			l3.setBounds(10,10,30,30);
			 
			 Backimage  b =new  Backimage();
			      f.add(b);
			       f.add(l3);
    
    }
}
