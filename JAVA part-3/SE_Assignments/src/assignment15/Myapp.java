package assignment15;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myapp extends Applet implements ActionListener{
      Button b1 ,b2,b3,b4 ;
      TextField t1,t2,t3;
      
      public void init()
      {
    	  setBackground(Color.WHITE);
    	  
    	  b1= new Button("ADD");
    	  b2= new Button("SUB");
    	  b3= new Button("MULTIPLY");
    	  b4= new Button("DIVIDE");
    	  setSize(300, 300);
    	  
    	  b1.addActionListener(this);//b1.setFont(new Font("Aerial", Font.BOLD, 15));
    	  b2.addActionListener(this);
    	  b3.addActionListener(this); 
    	  b4.addActionListener(this); 
    	  
    	  t1 = new TextField(15);
    	  t2 = new TextField(15);
    	  t3 = new TextField(30);
    	  
    	  this.setLayout(null);
    	  add(t1);
    	  t1.setBounds(45, 30, 100, 30);
    	  add(t2);
    	  t2.setBounds(150, 30, 100, 30);
    	  add(t3);
    	  t3.setBounds(45, 70, 205, 30);
    	  add(b1);
    	   
    	  b1.setBounds(45, 130, 100, 50);
    	  add(b2);
    	  b2.setBounds(150, 130, 100, 50);
    	  add(b3);
    	  b3.setBounds(45, 200, 100, 50);
    	  add(b4);
    	  b4.setBounds(150, 200, 100,50);
    	   
    	  
    	   
      }
      
      public void paint(Graphics g) {
	      // Draw a Rectangle around the applet's display area.
	      //g.drawRect(10, 10, getWidth() -25,getHeight() - 25);
    	  g.setColor(Color.red);
	      g.fillRect(10, 10, getWidth() -25,getHeight() - 25);
	     g.setColor(Color.gray);
	      g.fillRect(15, 15, getWidth() -35,getHeight() - 35);
	      g.setFont(new Font("default", Font.BOLD, 25));
	      b1.setFont(new Font("Aerial", Font.BOLD, 15));
	      b2.setFont(new Font("Aerial", Font.BOLD, 15));
	      b3.setFont(new Font("Aerial", Font.BOLD, 15));
	      b4.setFont(new Font("Aerial", Font.BOLD, 15));
      } 
        //play here for layout

	 
	int x = 0,y = 0,z;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s1,s2,s3;
		try
		{
			s1=t1.getText();
			x=Integer.parseInt(s1);
			s2=t2.getText();
			y=Integer.parseInt(s2);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		//Button source= (Button)e.getSource();
		if(e.getSource() ==b1)
		{   z=x+y;
			s3=String.valueOf(z);
			t3.setText(s3);t3.setBackground(Color.lightGray);t3.setFont(new Font("Aerial", Font.CENTER_BASELINE, 15));b1.setBackground(Color.CYAN);
			b2.setBackground(Color.white);
			b3.setBackground(Color.white);
			b4.setBackground(Color.white);
		}
		if(e.getSource() ==b2)
		{
			s3=String.valueOf((x-y));
			t3.setText(s3);t3.setBackground(Color.lightGray);t3.setFont(new Font("Aerial", Font.CENTER_BASELINE, 15));
			b2.setBackground(Color.CYAN);b1.setBackground(Color.white);
			b3.setBackground(Color.white);
			b4.setBackground(Color.white);
			}
		if(e.getSource() ==b3)
		{
			s3=String.valueOf((x*y));
			t3.setText(s3);t3.setBackground(Color.lightGray);t3.setFont(new Font("Aerial", Font.CENTER_BASELINE, 15));
			b3.setBackground(Color.CYAN);
			b1.setBackground(Color.white);
			b2.setBackground(Color.white);
			b4.setBackground(Color.white);
		
		}
		if(e.getSource()==b4)
		{
			s3=String.valueOf((x/y));
			t3.setText(s3);t3.setBackground(Color.lightGray);t3.setFont(new Font("Aerial", Font.CENTER_BASELINE, 15));b4.setBackground(Color.CYAN);
			b2.setBackground(Color.white);
			b3.setBackground(Color.white);
			b1.setBackground(Color.white);
		}
		
	}
	
}
