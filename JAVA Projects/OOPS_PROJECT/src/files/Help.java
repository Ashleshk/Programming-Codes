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
 
public class Help extends JFrame implements ActionListener{

	JFrame jf;
    Font f,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JButton cancel;
	 
	 
     

		Help()
		{
	     	jf=new JFrame();
	    	try {
				 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\bank.jpg")))));
				 
			} catch (IOException e) {
				System.out.println("image failure");
			}
	     	
	     	f = new Font("Times New Roman",Font.BOLD,20);//button
	   		f1 = new Font("Times New Roman",Font.BOLD+Font.ITALIC,25);//label
			jf.setLayout(null);
			 

			l1=new JLabel("Help");
		    l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		    l1.setForeground(Color.BLUE);
			l1.setBounds(360,140,200,30);
			jf.add(l1);

			l2=new JLabel("Cash Withdrawal: options used to getting money from the ATM.");
			l2.setFont(f);
			l2.setForeground(Color.WHITE);
			l2.setBounds(40,200,670,25);
			jf.add(l2);

			l3=new JLabel("Balance Inquiry: A balance inquiry is a review of any type of account ");
			l3.setFont(f);
			l3.setForeground(Color.WHITE);
			l3.setBounds(40,240,670,25);
	    	jf.add(l3);

	    	l4=new JLabel("Mini statement used to print your balance.");
		    l4.setFont(f);
			l4.setForeground(Color.WHITE);
			l4.setBounds(40,280,650,25);
			jf.add(l4);

			l5=new JLabel("Electricty bill used pay electricty bill.");
			l5.setFont(f);
			l5.setForeground(Color.WHITE);
			l5.setBounds(40,320,650,25);
			jf.add(l5);

			l6=new JLabel("cash deposit used deposit money into your account.");
			l6.setFont(f);
			l6.setForeground(Color.WHITE);
			l6.setBounds(40,360,650,25);
			jf.add(l6);

			l7=new JLabel("PIN change option used to change PIN no of ATM card.");
			l7.setFont(f);
			l7.setForeground(Color.WHITE);
			l7.setBounds(40,400,670,25);
			jf.add(l7);


			l8=new JLabel("Loan information option used to give various loan rate.");
			l8.setFont(f);
			l8.setForeground(Color.WHITE);
			l8.setBounds(40,440,650,25);
			jf.add(l8);


			l9=new JLabel("For more information Visit our your nearest branch of PICT-Bank.");
			l9.setFont(f);
			l9.setForeground(Color.WHITE);
			l9.setBounds(40,480,700,25);
			jf.add(l9);

			l10=new JLabel("This ATM project developed by,");
			l10.setFont(f);
			l10.setForeground(Color.RED);
			l10.setBounds(40,520,300,25);
			jf.add(l10);

			l11=new JLabel("Ashlesh, Megha and Adil");
			l11.setFont(f1);
			l11.setForeground(Color.RED);
			l11.setBounds(320,530,500,30);
			jf.add(l11);

			l12=new JLabel("Under the guidence of ");
			l12.setFont(f);
			l12.setForeground(Color.RED);
			l12.setBounds(40,570,200,20);
			jf.add(l12);

			l13=new JLabel("Mr Zakee Ahmed Sir");
			l13.setFont(f1);
			l13.setForeground(Color.RED);
			l13.setBounds(250,580,250,30);
			jf.add(l13);

			cancel=new JButton("Cancel");
			Image img2 = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage(); 
		    cancel.setIcon(new ImageIcon(img2));
			cancel.setFont(f);
			cancel.setBounds(600,600,150,60);
			cancel.addActionListener(this);
			jf.add(cancel);

			 

		 	jf.setTitle("Help");
	        jf.setSize(800,700);
			jf.setLocation(520,150);
		 	jf.setResizable(false);
	   		jf.setVisible(true);

	   	   

	}

	 
			public void actionPerformed(ActionEvent ae)
			 {
		         if(ae.getSource()==cancel)
				{
					 
		           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
			         
		           	new Welcome();
		           	jf.setVisible(false);
				}
			}
			/*public static void main(String[] args) {
				new Help();
			}*/
			  
		}
 
