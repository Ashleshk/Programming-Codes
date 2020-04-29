package files;

 
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

 

public class LoanInformation extends JFrame implements ActionListener{
	
	JFrame jf;
	Font f,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton cancel;
	
	LoanInformation()
	{
     	jf=new JFrame();
     	try {
			 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\bank.jpg")))));
		} catch (IOException e) {
			System.out.println("image failure");
		}
     	f = new Font("Times New Roman",Font.BOLD,20);//button
   		f1 = new Font("Times New Roman",Font.BOLD,25);//label
		jf.setLayout(null);
		 

		l1=new JLabel("Loan Information");
	    l1.setFont(new Font("Times New ROman",Font.BOLD,30));
	    l1.setForeground(Color.BLUE);
		l1.setBounds(280,250,250,20);
		jf.add(l1);

		l2=new JLabel("Home Loan @ only 9%.");
		l2.setFont(f1);
		l2.setForeground(Color.WHITE);
		l2.setBounds(40,300,680,25);
		jf.add(l2);

		l3=new JLabel("Personal Loan @ only 10%.");
		l3.setFont(f1);
		l3.setForeground(Color.WHITE);
		l3.setBounds(40,350,680,25);
		jf.add(l3);

		l4=new JLabel("Car Loan @ only 12%.");
		l4.setFont(f1);
		l4.setForeground(Color.WHITE);
		l4.setBounds(40,400,680,25);
		jf.add(l4);

		l5=new JLabel("Student Loan @ only 5%.");
		l5.setFont(f1);
		l5.setForeground(Color.WHITE);
		l5.setBounds(40,450,680,25);
    	jf.add(l5);

		l6=new JLabel("Computer or Laptop Loan @ only 8%.");
	    l6.setFont(f1);
		l6.setForeground(Color.WHITE);
		l6.setBounds(40,500,680,25);
		jf.add(l6);

		 

		 

		cancel=new JButton("Cancel",new ImageIcon("cancel.png"));
		Image img  = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage(); 
		cancel.setIcon(new ImageIcon(img ));
		cancel.setFont(f);
		cancel.setBounds(280,580,150,60);
		cancel.addActionListener(this);
		jf.add(cancel);

		 

	 	jf.setTitle("Loan Information");
        jf.setSize(800,700);
		jf.setLocation(520,150);
	 	jf.setResizable(false);
   		jf.setVisible(true);
          }

	@Override
	public void actionPerformed(ActionEvent e) {
		 	
		if(e.getSource()==cancel)
		{
		 
           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
	        new Welcome();
           	jf.setVisible(false);
		}
	}
/*	public static void main(String args[])
	  {
	    	new LoanInformation();
	  } */
}

 