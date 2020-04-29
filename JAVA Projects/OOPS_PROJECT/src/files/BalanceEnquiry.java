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
 
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

 
import com.mysql.jdbc.Statement;

public class BalanceEnquiry extends JFrame implements ActionListener {

	int atno,acno,pno;
	String actype ;
	String strdate,strtime;
	
	JFrame jf;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1;
	
	Connection con;
	Statement st;
	ResultSet rs;
	
	Date date;
	GregorianCalendar calendar;
	
	
	public BalanceEnquiry(int atno1,int acno1,int pno1,String actype1) {
		
		Font f,f1;
		atno=atno1;
		acno=acno1;
		pno=pno1;
		actype=actype1;
		
		date=new Date();
		calendar=new GregorianCalendar();
		calendar.setTime(date);
        strdate =calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DATE);
        strtime=date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();

        System.out.println(strdate + " : "+ strtime);
		
		jf= new JFrame( );
		try {
			 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\back.jpg")))));
			 
		} catch (IOException e) {
			System.out.println("image failure");
		}
		f=new Font("Times New Roman", Font.BOLD, 20);
		f1=new Font("Times New Roman", Font.BOLD, 25);
		jf.setLayout(null);
		
		l1=new JLabel("Balance Enquiry");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(250,250,250,30);
		jf.add(l1);
		
		l2=new JLabel("Date");
		l2.setFont(f1);
		l2.setForeground(Color.magenta);
		l2.setBounds(100,300,70,30);
		jf.add(l2);
		
		l3=new JLabel(strdate);
		l3.setFont(f1);
		l3.setForeground(Color.BLACK);
		l3.setBounds(100,350,150,30);
		jf.add(l3);
		
		l4=new JLabel("Time");
		l4.setFont(f1);
		l4.setForeground(Color.magenta);
		l4.setBounds(300,300,70,30);
		jf.add(l4);
		
		l5=new JLabel(strtime);
		l5.setFont(f1);
		l5.setForeground(Color.BLACK);
		l5.setBounds(300,350,150,30);
		jf.add(l5);

		l6=new JLabel("Atm no");
		l6.setFont(f1);
		l6.setForeground(Color.magenta);
		l6.setBounds(500,300,110,30);
		jf.add(l6);
		
		l7=new JLabel();
		l7.setFont(f1);
		l7.setForeground(Color.BLACK);
		l7.setBounds(500,350,300,30);
		jf.add(l7);

		l8=new JLabel("Available Balance in Rs:");
		l8.setFont(f1);
		l8.setForeground(Color.magenta);
		l8.setBounds(100,400,270,30);
		jf.add(l8);

		l9=new JLabel();
		l9.setFont(f1);
		l9.setForeground(Color.BLACK);
		l9.setBounds(380,400,270,30);
		jf.add(l9);

		l10=new JLabel("Thank You For Banking With PICT BANK ");
		l10.setFont(f);
		l10.setForeground(Color.RED);
		l10.setBounds(200,450,650,20);
		jf.add(l10);
		
		b1=new JButton("Cancel");
		Image img = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage(); 
	    b1.setIcon(new ImageIcon(img));
		b1.setFont(f);
		b1.setBounds(280,500,150,60);
		jf.add(b1);
		b1.addActionListener(this);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
		    System.out.println("Connected to database.");
		   
		      st=(Statement) con.createStatement(); 
		        rs=st.executeQuery("select balance from accountdetail where atmno='"+atno+"' and pinno='"+pno+"'");
		         rs.next();
		        int avbal=rs.getInt(1);
		       System.out.println("available balance is :"+avbal);
		       
		       l7.setText(String.valueOf(atno));
		       l9.setText(String.valueOf(avbal)+"  /-");
		       st.close();
				con.close();
		       
		} catch ( Exception e1) {
			 
			e1.printStackTrace();
		}

		
		jf.setTitle("BALANCE ENQUIRY");
		jf.setSize(800,700);
		jf.setLocation(520, 150);
		jf.setResizable(false);
		jf.setVisible(true);
		 
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
		       
           	new Welcome();
           	jf.setVisible(false);			
		}
	}
	/*public static void main(String[] args) {
		new BalanceEnquiry(1000, 10001, 1111, "Saving");
	}*/

}
