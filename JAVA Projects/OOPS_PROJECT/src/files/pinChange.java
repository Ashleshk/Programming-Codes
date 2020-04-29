package files;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import com.mysql.jdbc.Statement;

 

public class pinChange extends JFrame implements ActionListener{
	//private static final long serialVersionUID = 1L;
	JFrame jf;
    Font f,f1;
    JButton b1,b2,b3;
	JLabel l1,l2,l3;
	JPasswordField pwd1,pwd2,pwd3;
	
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	 int atno,acno,pno;
	 int pp1,pp2,pp3;
	 String actype;
	public pinChange(int atno1,int acno1,int pno1,String actype1)
	{
		atno=atno1;
		acno=acno1;
		pno=pno1;
		actype=actype1;
		
		jf=new JFrame();
		jf.setLayout(null);
		try {
			 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\back.jpg")))));
		} catch (IOException e) {
			System.out.println("image failure");
		}
		f = new Font("Times New Roman",Font.BOLD,20);                      // for button
		f1 = new Font("Times New Roman",Font.BOLD,25);                     //for label
		jf.setLayout(null);
		
		l1=new JLabel("Old pin");
	    l1.setFont(f1);
	    l1.setForeground(Color.BLUE);
		l1.setBounds(250,250,300,30);
		jf.add(l1);
		
		l2=new JLabel("New pin");
	    l2.setFont(f1);
	    l2.setForeground(Color.BLUE);
		l2.setBounds(250,300,300,30);
		jf.add(l2);
		
		l3=new JLabel("Confirm pin");
	    l3.setFont(f1);
	    l3.setForeground(Color.BLUE);
		l3.setBounds(250,350,300,30);
		jf.add(l3);
		
		pwd1=new JPasswordField(10);
		pwd1.setFont(f1);
		pwd1.setBounds(400,250,200,30);
		jf.add(pwd1);
		
		pwd2=new JPasswordField(10);
		pwd2.setFont(f1);
		pwd2.setBounds(400,300,200,30);
		jf.add(pwd2);
		
		pwd3=new JPasswordField(10);
		pwd3.setFont(f1);
		pwd3.setBounds(400,350,200,30);
		jf.add(pwd3);
		
		b1=new JButton("Enter");
		Image img = new  ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		b1.setIcon(new ImageIcon(img));
		b1.setFont(f);
		b1.setBounds(120,450,150,60);
		jf.add(b1);
		b1.addActionListener(this);

		b2=new JButton("Clear");
		Image img1 = new  ImageIcon(this.getClass().getResource("/clear.png")).getImage();
		b2.setIcon(new ImageIcon(img1));
		b2.setFont(f);
		b2.setBounds(310,450,150,60);
		jf.add(b2);
		b2.addActionListener(this);

		b3=new JButton("Cancel");
		Image img2 = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage(); 
		b3.setIcon(new ImageIcon(img2));
		b3.setFont(f);
		b3.setBounds(500,450,150,60);
		jf.add(b3);
		b3.addActionListener(this);
		
		jf.setTitle("Pin Change");
		jf.setSize(800,700);
		jf.setLocation(520,150) ;
	    jf.setResizable(false);
		jf.setVisible(true);
	}		    
		    public void actionPerformed(ActionEvent ae)
		    {
		    	if(ae.getSource()==b1)    //ok hai
		    	{
		    		if(((pwd1.getText()).equals(""))&&((pwd2.getText()).equals(""))&&((pwd3.getText()).equals("")))		    			
		    		{
		    			JOptionPane.showInternalMessageDialog(this, "Please enter old PIN no 1 times and new PIN 2 times !!","Warning",JOptionPane.WARNING_MESSAGE);
		    		}
		    		else if((Integer.parseInt(pwd2.getText()))!=(Integer.parseInt(pwd3.getText())))
		 	       {
		  JOptionPane.showMessageDialog(this,"NEW PIN and does not match with repeated PIN !!","Warning",JOptionPane.WARNING_MESSAGE);
		 		    
		 		   	pwd1.setText("");
		 			pwd2.setText("");
		 			pwd3.setText("");
		 	       }
		    		else
		    		{
		    			try
		    			{
		    				int foundrec =0;
		    				int oldpin=Integer.parseInt(pwd1.getText());
		    				Class.forName("com.mysql.jdbc.Driver");
		    				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		    				System.out.println("Connection established");
		    				pp1=Integer.parseInt(pwd1.getText());
		    				pp2=Integer.parseInt(pwd2.getText());
		    				pp3=Integer.parseInt(pwd3.getText());
		    				ps=con.prepareStatement("select * from accountdetail  where atmno='"+atno+"' and accno='"+acno+"' and acctype='"+actype+"' and pinno='"+oldpin+"' ");
		    			    rs=ps.executeQuery();
		    			    while(rs.next())
		    			    {
		    			    	foundrec=1;
		    			    }
		    			    if(foundrec==1)
		    			    {
		    			    	   stmt=(Statement) con.createStatement();
		    			    	   stmt.executeUpdate("update accountdetail set pinno="+pp2+" where atmno='"+atno+"' and accno='"+acno+"' and acctype='"+actype+"' and pinno='"+pp1+"' ");
		    			    	   JOptionPane.showMessageDialog(null,"You have update PIN no succesfully.");
		    			    	   new Welcome();
		    			    	   jf.setVisible(false);
		    			    	   con.close();
		    			    	
		    			    }
		    			    else
		   		         {
		   		         JOptionPane.showMessageDialog(null,"You enter wrong old PIN no.");
		   		         	pwd1.setText("");
		   		         	pwd2.setText("");
		   		        	pwd3.setText("");
		   		         }
		   		         
		    			    
		    			}
		    			catch(Exception e) {
		    				e.printStackTrace();
		    			}
		    		}
		    	}
		    	else if(ae.getSource()==b2) // clear hai
		    	{
		    		pwd1.setText("");
					pwd2.setText("");
					pwd3.setText("");
		    	}
		    	else              //cancel
		    	{
		    	 	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
			      
		           	new Welcome();
		           	jf.setVisible(false);
		    	}
		    }
		   /* public static void main(String args[])
		    {
		    	new pinChange(1000,10001,1111,"saving");
		    }*/

}
