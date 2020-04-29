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
import java.sql.SQLException;
import java.sql.Statement;
 

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
import javax.swing.table.DefaultTableModel;
 

public class MiniStatement extends JFrame implements ActionListener{
	JFrame jf;
    Font f,f1;
	JButton b1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	 
	Connection con;
	PreparedStatement ps,ps1;
	Statement stmt;
	ResultSet rs;
	 
     
    int atno,acno,pno;
    String actype,strdate,strtime;
    float givam,amt,abal,amtmin,sumbal;
   
	DefaultTableModel model = new DefaultTableModel();
    JTable tabGrid = new JTable(model);
    JScrollPane scrlPane = new JScrollPane(tabGrid);

    public MiniStatement(int atno1,int acno1,int pno1,String actype1)
    {
        atno=atno1;
     	acno=acno1;
     	pno=pno1;
     	actype=actype1;//int atno=1000,acno=10001;
     	 

     	jf=new JFrame();
     	try {
			 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\bak2.jpg")))));
		} catch (IOException e) {
			System.out.println("image failure");
		}
		f = new Font("Times New Roman",Font.BOLD,20);//button
		f1 = new Font("Times New Roman",Font.BOLD,15);//label
		jf.setLayout(null);

	 

		l1=new JLabel("MINI STATEMENT");
	    l1.setFont(new Font("Times New Roman",Font.BOLD,30));
	    l1.setForeground(Color.BLUE);
		l1.setBounds(270,70,500,30);
		jf.add(l1);

		l2=new JLabel("Account Holder:");
		l2.setFont(f1);
		l2.setForeground(Color.red);
		l2.setBounds(100,250,150,20);
		jf.add(l2);

		l3=new JLabel( );
		l3.setFont(f1);
		l3.setForeground(Color.DARK_GRAY);
		l3.setBounds(100,270,150,20);
		jf.add(l3);
		

		l4=new JLabel("Acc no:");
		l4.setFont(f1);
		l4.setForeground(Color.red);
		l4.setBounds(350,250,70,20);
		jf.add(l4);

		l5=new JLabel( );
		l5.setFont(f1);
		l5.setForeground(Color.DARK_GRAY);
		l5.setBounds(350,270,150,20);
		jf.add(l5);

		l6=new JLabel("ATM NO:");
		l6.setFont(f1);
		l6.setForeground(Color.red);
		l6.setBounds(600,250,110,20);
		jf.add(l6);

		l7=new JLabel();
		l7.setFont(f1);
		l7.setForeground(Color.DARK_GRAY);
		l7.setBounds(600,270,300,20);
		jf.add(l7);

		scrlPane.setBounds(100,300,600,190);
  		jf.add(scrlPane);
        tabGrid.setFont(new Font ("Aerial",0,15));

   	    model.addColumn("TR-Date");
       	model.addColumn("Deposit-amt");
     	model.addColumn("Withdraw-amt");
     	model.addColumn("Balance");

     	l8=new JLabel("Available balance:");
		l8.setFont(f1);
		l8.setForeground(Color.red);
		l8.setBounds(100,500,130,20);
		jf.add(l8);

		l9=new JLabel();
		l9.setFont(f1);
		l9.setForeground(Color.DARK_GRAY);
		l9.setBounds(230,500,150,20);
		jf.add(l9);

	    b1=new JButton("Cancel" );
		Image img2 = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage(); 
		b1.setIcon(new ImageIcon(img2));
		b1.setFont(f);
		b1.setBounds(320,600,150,60);
		jf.add(b1);
		b1.addActionListener(this);

	    jf.setTitle("Mini Statement");
	    jf.setSize(800,700);
		jf.setLocation(520,150);
		jf.setResizable(false);
	    jf.setVisible(true);

         try
		 {
		   Class.forName("com.mysql.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		   System.out.println("Connected to database.");
		ps1=con.prepareStatement("select * from transaction where atmno='"+atno+"' and accno='"+acno+"'");
            rs=ps1.executeQuery();
             int r=0;
             rs.last();
		    while(rs.previous())
	        {
	       model.insertRow(r++,new Object[]{rs.getString(7),rs.getString(4),rs.getString(5),rs.getString(6)});

		     }

		   ps=con.prepareStatement("select * from accountdetail where atmno='"+atno+"' and accno='"+acno+"'");
	       rs=ps.executeQuery();
		   while(rs.next())
	        {
			   String acname=rs.getString(5);
			   System.out.println(acname);
			   l3.setText(acname);
			   int accno =rs.getInt(2);
			   System.out.println("account number is :"+accno);
			   l5.setText(String.valueOf(accno));
			   String atno2=rs.getString(1);
			   System.out.println("ATM NO is :"+atno2);
			   l7.setText(atno2);
			   String curbal=rs.getString(6);
			   System.out.println("Available balance are:"+curbal+"/-");
			   l9.setText(curbal+"/-");
	    	}
		 	con.close();
		 }
         catch(SQLException se)
		{
		System.out.println(se);
	    //JOptionPane.showMessageDialog(null,"SQL Error:"+se);
        }
	    catch(Exception e)
	     {
	     System.out.println(e);
		 //JOptionPane.showMessageDialog(null,"Error:"+e);
	     }

	     
    }
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getSource()==b1)
		{	 
           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
	       
	        
           	new Welcome();
           	jf.setVisible(false);
		}
      }
    /*  public static void main(String args[])
	  {
		new MiniStatement(1000,10001,1111,"saving");
	  }
*/
}
