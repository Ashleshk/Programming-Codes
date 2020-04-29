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
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
 

public class TransactionMenu extends JFrame implements ActionListener
{

	JFrame jf;
    Font f,f1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel l1;
	JTextField t1;
	 
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	 
    Timer t;
    int atno,acno,pno;
	String actype;

    public TransactionMenu(int atno1,int acno1,int pno1,String actype1)
    {
    	atno=atno1;
     	acno=acno1;
     	pno=pno1;
     	actype=actype1;

    	jf=new JFrame();
		f = new Font("Times New Roman",Font.BOLD,20);//button
		f1 = new Font("Times New Roman",Font.BOLD,25);//label
		jf.setLayout(null);
		try {
			jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\1.jpg")))));
		//	 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("F:\\images_mini\\IMG.jpg")))));
		} catch (IOException e) {
			System.out.println("image failure");
		}

		 
        

		l1=new JLabel("Select Any One Option From The Following");
		l1.setFont(f1);
		l1.setForeground(Color.BLUE);
		l1.setBounds(130,250,600,30);
		jf.add(l1);

        b1=new JButton("Cash Withdrawal");
		b1.setFont(f);
		b1.setBounds(120,300,200,50);
		jf.add(b1);
		b1.addActionListener(this);

		b2=new JButton("Balance Enquiry");
		b2.setFont(f);
		b2.setBounds(120,400,200,50);
		jf.add(b2);
		b2.addActionListener(this);

		b3=new JButton("Mini Statement");
		b3.setFont(f);
		b3.setBounds(120,500,200,50);
		jf.add(b3);
		b3.addActionListener(this);

		 
		
		b4=new JButton("Pin change");
		b4.setFont(f);
		b4.setBounds(450,300,200,50);
		jf.add(b4);
		b4.addActionListener(this);

		b5=new JButton("Loan Information");
		b5.setFont(f);
		b5.setBounds(450,400,200,50);
		jf.add(b5);
		b5.addActionListener(this);

		b6=new JButton("Help");
		b6.setFont(f);
		b6.setBounds(450,500,200,50);
		jf.add(b6); 
		b6.addActionListener(this);

		b7=new JButton("Cancel");
		Image img = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage();
		b7.setIcon(new ImageIcon(img));
		b7.setFont(f);
		b7.setBounds(300,580,170,60);
		jf.add(b7);
		b7.addActionListener(this);
		
		t1 = new JTextField(20);
		t1.setBounds(0,640,800,25);
		t1.setBackground(Color.LIGHT_GRAY);
		jf.add(t1); 

		try {
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
			   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
     	 jf.setTitle("TRANSACTION MENU");
	     jf.setSize(800,700);
		 jf.setLocation(520,150);
		 jf.setResizable(false);
	     jf.setVisible(true);

	     t =new Timer(20000,this);// 20 miLLisecond
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
          	new CashWithdrawal(atno,acno,pno,actype);
          	jf.setVisible(false);
		}

		else if(ae.getSource()==b2)
		{
       	  
       	   	t.stop();
          	new BalanceEnquiry(atno,acno,pno,actype);
          	jf.setVisible(false);
		}
		else if(ae.getSource()==b3)
		{
		 
			 t.stop();
			  new MiniStatement(atno,acno,pno,actype);
			 jf.setVisible(false);

		}
		 
		else if(ae.getSource()==b4)
		{
             
            t.stop();
          	new pinChange(atno,acno,pno,actype);
          	jf.setVisible(false);
		}

		else if(ae.getSource()==b5)
		{
          
          	t.stop();
          	new LoanInformation();
          	jf.setVisible(false);
		}
		else if(ae.getSource()==b6)
		{
          	 
          	t.stop();
          	new Help();
          	jf.setVisible(false);
		}

		else if(ae.getSource()==b7)
		{
            
           	t.stop();
           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
	       
           	new Welcome();
           	jf.setVisible(false);
		}
	 

    }
    /* public static void main(String args[])
	  {
		new TransactionMenu(1000,10001,1111,"saving");
	 } */
}
