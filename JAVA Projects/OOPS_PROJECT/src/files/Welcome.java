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
import javax.swing.JTextField;

public class Welcome extends JFrame implements ActionListener
{
    JFrame jf;
    Font f,f1;
	JButton b,b1;
	JLabel  l2,l3,l4 ;
	JTextField t1;
	
	public Welcome()  
	{
		jf=new JFrame();
		try {
			 jf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("I:\\PROGRAM\\JAVA PROGRAMS\\programINhome2\\OOPS_PROJECT\\img\\bank.jpg")))));
			 
		} catch (IOException e) {
			System.out.println("image failure");
		}
		f = new Font("Times New Roman",Font.BOLD,20);                      // for button
		f1 = new Font("Times New Roman",Font.BOLD,25);                     //for label
		jf.setLayout(null);
 
        l2=new JLabel("Welcome To Pict Bank");
		l2.setFont(new Font("Times New Roman",Font.BOLD,40));
		l2.setForeground(Color.BLUE);
		l2.setBounds(180,230,500,30);
		jf.add(l2);

		l3=new JLabel("ATM Services");
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		l3.setForeground(Color.BLUE);
		l3.setBounds(300,300,300,30);
		jf.add(l3);

		l4=new JLabel("Press OK To Use ATM Service or Press Exit to quit ");
		l4.setFont(f1);
		l4.setForeground(Color.BLUE);
		l4.setBounds(120,370,580,30);
		jf.add(l4);

		 
		
		b=new JButton("Ok");
		Image img = new  ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		b.setIcon(new ImageIcon(img)); 
		b.setFont(f);
	 	b.setBounds(200,550,130,60);
		jf.add(b);
		b.addActionListener(this);
                 
		b1=new JButton("Exit");
	    Image img2 = new  ImageIcon(this.getClass().getResource("/cancel.png")).getImage(); 
	    b1.setIcon(new ImageIcon(img2));
	    b1.setFont(f);
		b1.setBounds(450,550,130,60);
		jf.add(b1);
		b1.addActionListener(this);

        jf.setTitle("WELCOME TO PICT BANK ATM");
	    jf.setSize(800,700);
		jf.setLocation(520,150);
		jf.setResizable(false);
	    jf.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			new Atmcardno();
            jf.setVisible(false);
            
		}
		else if(ae.getSource()==b1)
		{
		    System.exit(0);
		}
    }
	public static void main(String args[])  
	{
		new Welcome();
	}
}
