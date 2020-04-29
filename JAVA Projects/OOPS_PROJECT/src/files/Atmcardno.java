package files;

 
import javax.imageio.ImageIO;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;
  
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
 
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Atmcardno extends JFrame implements ActionListener
 {
    JFrame jf;
    JPanel statusPanel;
    Font f,f1;
	JButton b1,b2,b3;
	JLabel l2,l3,l4, statuslabel;
	 
    JTextField t1,t2;
   	JPasswordField pwd;
   	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
  
    
    Timer t;
	int atno,acno,pno;
	String curdate;
    Date date;
    GregorianCalendar calendar;


    public Atmcardno()
     {
     	date= new Date();
     	calendar=new GregorianCalendar();
	    calendar.setTime(date);
	    curdate =calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DATE);
	    System.out.println(curdate);

     	jf=new JFrame();
     	try {
			 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\bank.jpg")))));
		} catch (IOException e) {
			System.out.println("image failure");
		}
		f = new Font("Times New Roman",Font.BOLD,20);//button
		f1 = new Font("Times New Roman",Font.BOLD,25);//label
		jf.setLayout(null);

		 

		l4=new JLabel("ATM Card Number");
	    l4.setFont(new Font("Times New Roman",Font.BOLD,30));
	    l4.setForeground(Color.BLUE);
		l4.setBounds(250,250,300,30);
		jf.add(l4);

    	l2=new JLabel("Enter ATM card no:");
		l2.setFont(f1);
		l2.setForeground(Color.WHITE);
		l2.setBounds(120,380,250,30);
		jf.add(l2);

		t1 = new JTextField(20);
		t1.setBounds(370,380,200,30);
		jf.add(t1);

		l3=new JLabel("Enter PIN no:");
		l3.setFont(f1);
		l3.setForeground(Color.WHITE);
		l3.setBounds(120,430,250,30);
		jf.add(l3);

		pwd=new JPasswordField(10);
		pwd.setFont(f1);
		pwd.setBounds(370,430,200,30);
		jf.add(pwd);

		b1=new JButton("Enter");
		Image img = new  ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		b1.setIcon(new ImageIcon(img));
		b1.setFont(f);
		b1.setBounds(120,550,150,60);
		jf.add(b1);
		b1.addActionListener(this);

		b2=new JButton("Clear");
		Image img1 = new  ImageIcon(this.getClass().getResource("/clear.png")).getImage();
		b2.setIcon(new ImageIcon(img1));
		b2.setFont(f);
		b2.setBounds(310,550,150,60);
		jf.add(b2);
		b2.addActionListener(this);

		b3=new JButton("Cancel");
		Image img2 = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage(); 
		b3.setIcon(new ImageIcon(img2));
		b3.setFont(f);
		b3.setBounds(500,550,150,60);
		jf.add(b3);
		b3.addActionListener(this);
		
		t2 = new JTextField(20);
		t2.setBounds(0,640,800,25);
		t2.setBackground(Color.LIGHT_GRAY);
		jf.add(t2);
       /* statusPanel=new JPanel();
        statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));*/
      /*Creates a bevel border with the specified type and whose colors
		will be derived from the background color of the component
		passed into the paintBorder method.*/
      /*  jf.add(statusPanel,BorderLayout.SOUTH);
        statusPanel.setPreferredSize(new Dimension(jf.getWidth(),20));
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
        
        statuslabel =new JLabel("Login Required....");
		statusPanel.add(statuslabel);*/
		
        jf.setTitle("ATM CARD NUMBER");
	    jf.setSize(800,700);
	    jf.setLocation(520,150) ;
		jf.setResizable(false);
	    jf.setVisible(true);

	     t =new Timer(20000,this);// 20 Millisecond
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
		//fetch
            	t.stop();
	    try
	     {
	   		if(((t1.getText()).equals(""))&&((pwd.getText()).equals("")))
	        { 
		    JOptionPane.showMessageDialog(this,"Please enter ATM card no and PIN no!","Warning",JOptionPane.WARNING_MESSAGE);
 	        }
	        else
	        {
	        int foundrec = 0;
	        Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		    System.out.println("Connected to database.");
		    t2.setText("Connected to database.");
            ps=(PreparedStatement) con.prepareStatement("select * from accountdetail where atmno='"+t1.getText()+"' and pinno='"+pwd.getText()+"'");
	        rs=ps.executeQuery();
		    while(rs.next())
	        {

	        atno=rs.getInt(1);   System.out.println("ATM-no:"+atno);
	        acno=rs.getInt(2);   System.out.println("Account-no:"+acno);
	        pno=rs.getInt(3);    System.out.println("pin-no:"+pno);
	        String cardname=rs.getString(5);  System.out.println("card-holder :"+cardname);
	        String expdate=rs.getString(7);

	        try
        	{

    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");                   //CHANGE date format here
    		Date date1 = sdf.parse(expdate);
        	Date date2 = sdf.parse(curdate);

        	System.out.println("expiry date of atm card:"+sdf.format(date1));
            System.out.println("TodayS date:"+sdf.format(date2));

        	if(date1.compareTo(date2)>=0)
        	{
        		System.out.println("Expiry date of atm:"+sdf.format(date1)+" is after today date:"+sdf.format(date2));
        		 JOptionPane.showMessageDialog(null,"Hello "+cardname);
	        
	             new AccountType(atno,acno,pno);
	             jf.setVisible(false);
        	}
        	else if(date1.compareTo(date2)<0)
        	{
        		System.out.println("Date1 is before Date2");
        JOptionPane.showMessageDialog(this,"Your atm card is out of expiry date. Please take new ATM card from your home bank.","Warning",JOptionPane.WARNING_MESSAGE);
		    
	             new Welcome();
	             jf.setVisible(false);

        	}
        	}
        	catch(ParseException ex)
        	{
        	System.out.println("Exception in date format"+ex);
    		ex.printStackTrace();
    	    }

	        foundrec = 1;

	       }
	       if (foundrec == 0)
             {
              JOptionPane.showMessageDialog(null,"Invalid ATM card no or PIN no.","Warning",JOptionPane.WARNING_MESSAGE);
             
              t1.setText("");t2.setText("invalid user...........");
              pwd.setText("");
             }
  	      } con.close();
        }
        catch(SQLException se)
		{
		System.out.println(se);
	      JOptionPane.showMessageDialog(null,"SQL Error  : " +se);
        }
	    catch(Exception e)
	     {
	     System.out.println(e);
		  JOptionPane.showMessageDialog(null,"Error : "+e);
	     }
       }
		else if(ae.getSource()==b2)
		{
		 
			t1.setText("");
			pwd.setText("");

		}
		else if(ae.getSource()==b3)
		{
 
           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
 
           	new Welcome();
           	jf.setVisible(false);
		}
     }
   /* public static void main(String args[])
	  {
		new Atmcardno();
	 }*/
 
}
