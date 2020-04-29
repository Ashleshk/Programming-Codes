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
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class AccountType extends JFrame implements ActionListener
 {
    JFrame jf;
    Font f,f1;
	JButton b1,bs1,bc1;
	JLabel l2,l4;
	JTextField t1; 
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	 
    Timer t;
    int atno,acno,pno;
	String actype,actypegive;

    public AccountType(int atno1,int acno1,int pno1) throws SQLException, ClassNotFoundException
     {
     	atno=atno1;
     	acno=acno1;
     	pno=pno1;

     	jf=new JFrame();
     	 
		f = new Font("Times New Roman",Font.BOLD,20);           //button
		f1 = new Font("Times New Roman",Font.BOLD,25);          //label
		jf.setLayout(null);
		try {
			 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\bank.jpg")))));
		} catch (IOException e) {
			System.out.println("image failure");
		}
		 

		l4=new JLabel("Account Type");
	    l4.setFont(new Font("Times New ROman",Font.BOLD,30));
	    l4.setForeground(Color.BLUE);
		l4.setBounds(300,250,300,30);
		jf.add(l4);

    	l2=new JLabel("Select Account Type:");
		l2.setFont(f1);
		l2.setForeground(Color.WHITE);
		l2.setBounds(120,400,250,30);
		jf.add(l2);

		bs1=new JButton("Saving");
		 Image img = new  ImageIcon(this.getClass().getResource("/saving.png")).getImage();
		bs1.setIcon(new ImageIcon(img));
		bs1.setFont(f);
		bs1.setBounds(390,360,180,60);
		jf.add(bs1);
		bs1.addActionListener(this);

		bc1=new JButton("Current");
		Image img1 = new  ImageIcon(this.getClass().getResource("/current.png")).getImage();
		bc1.setIcon(new ImageIcon(img1));
		bc1.setFont(f);
		bc1.setBounds(390,440,180,60);
		jf.add(bc1);
		bc1.addActionListener(this);

		b1=new JButton("Cancel");
		Image img2 = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage();
		b1.setIcon(new ImageIcon(img2));
		b1.setFont(f);
		b1.setBounds(300,550,180,60);
		jf.add(b1);
		b1.addActionListener(this);

		t1 = new JTextField(20);
		t1.setBounds(0,640,800,25);
		t1.setBackground(Color.LIGHT_GRAY);
		jf.add(t1); 

		 jf.setTitle("ACCOUNT TYPE");
	     jf.setSize(800,700);
		 jf.setLocation(520,150);
		 jf.setResizable(false);
	     jf.setVisible(true);
	     
	     Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		    
		    
		    ps=(PreparedStatement) con.prepareStatement("select * from accountdetail where atmno='"+atno+"' and accno='"+acno+"'");
		       rs=ps.executeQuery();
			   while(rs.next())
		        {
				   String acname=rs.getString(5);
				   System.out.println(acname);
				   t1.setText(acname);
		        }
			   ps.close();
			   con.close();
	     t =new Timer(20000,this);// 20 millisecond
         t.start();
   }
     public void actionPerformed(ActionEvent ae)
     {
     	if(ae.getSource()==t)
     	{
     			t.stop();
 int reply=JOptionPane.showConfirmDialog(null,"Do you want continue?","ATM Time Warning",JOptionPane.YES_NO_OPTION);

	             if (reply == JOptionPane.YES_OPTION)
	   			{
	   				 
	   				t.start();
	   		    }
	   		  else if (reply == JOptionPane.NO_OPTION)
	   		    {
	   		    	 
	   		    	t.stop();
                   new Welcome();
         	       jf.setVisible(false);
		        }
     	}
        else if(ae.getSource()==b1)
		{
			 
            t.stop();
           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
	         
           	new Welcome();
           	jf.setVisible(false);
		}
		else if(ae.getSource()==bs1)//saving account matching
		{
			 
			t.stop();

			 try
	         {

	        int foundrec = 0;
	        Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		    System.out.println("Connected to database.");
		    
            ps=(PreparedStatement) con.prepareStatement("select acctype from accountdetail where atmno='"+atno+"' and accno='"+acno+"' and pinno='"+pno+"' ");
	        rs=ps.executeQuery();
		    while(rs.next())
	        {
              actypegive=rs.getString(1);
              System.out.println(actypegive);
	          foundrec = 1;
	        }
	       if (foundrec == 1)
             {
             	if(actypegive.equals("saving"))
             	{
                   actype="saving";
             	  System.out.println(actypegive);
                  new TransactionMenu(atno,acno,pno,actype);
		       	 jf.setVisible(false);
             	}
               else
              {
         JOptionPane.showMessageDialog(null,"Your account type is not match with given account type.","Warning",JOptionPane.WARNING_MESSAGE);
              
              new Welcome();
               jf.setVisible(false);
              }
            }
	       ps.close();
	       con.close();
        }
        catch(SQLException se)
		{
		System.out.println(se);
		se.printStackTrace( );
        }
	    catch(Exception e)
	     {
	     System.out.println(e);
		   e.printStackTrace( );
	     }

		}
		else if(ae.getSource()==bc1)//current account matching
		{
		   
		    	t.stop();
			 try
	         {

	        int foundrec1 = 0;
	        Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		    System.out.println("Connected to database.");
            ps=(PreparedStatement) con.prepareStatement("select acctype from accountdetail where atmno='"+atno+"' and accno='"+acno+"' and pinno='"+pno+"' ");
	        rs=ps.executeQuery();
		    while(rs.next())
	        {
              actypegive=rs.getString(1);
              System.out.println(actypegive);
	          foundrec1 = 1;
	        }
	       if (foundrec1 == 1)
             {
             	if(actypegive.equals("current"))
             	{
                     actype="current";
             	  System.out.println(actype);
                  new TransactionMenu(atno,acno,pno,actype);
		       	 jf.setVisible(false);
             	}
               else
              {
         JOptionPane.showMessageDialog(null,"Your account type is not match with given account type.","Warning",JOptionPane.WARNING_MESSAGE);
            
              new Welcome();
               jf.setVisible(false);
              }
            }
	       con.close();
        }
        catch(SQLException se)
		{
		System.out.println(se);
	    JOptionPane.showMessageDialog(null,"SQL Error:"+se);
        }
	    catch(Exception e)
	     {
	     System.out.println(e);
		   JOptionPane.showMessageDialog(null,"Error:"+e);
	     }
	  }
   }
    /* public static void main(String args[])
	  {
		new AccountType();
	 }*/
	 
}







