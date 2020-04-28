package statusbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;

public class StatusBardemo implements ActionListener{
	JLabel  statusLabel,l2;
	 Timer t;
           public StatusBardemo() throws IOException {
			JFrame frame = new JFrame();
			JPanel back = new JPanel(); 
			
			JLabel jp = new JLabel(new ImageIcon(ImageIO.read(new File("F:\\\\images_mini\\\\bank.jpg"))));
		
			back.add(jp);
			back.setBorder(new BevelBorder(BevelBorder.RAISED));
			
			l2=new JLabel("Welcome To Pict Bank");
			l2.setFont(new Font("Times New Roman",Font.BOLD,40));
			l2.setForeground(Color.BLUE);
			l2.setBounds(10,20,500,30);
			back.add(l2);
			
			frame.add(back);
			// create the status bar panel and shove it down the bottom of the frame
			JPanel statusPanel = new JPanel();
			statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
			
			//Creates a bevel border with the specified type and whose colors
			//will be derived from the background color of the component
			//passed into the paintBorder method.
			frame.add(statusPanel, BorderLayout.SOUTH);
			statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 20));
			// statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
			  statusLabel = new JLabel( );
		  
			 statusPanel.add(statusLabel);
			 

			frame.setVisible(true);
			frame.setResizable(true);
			frame.setSize(800, 800);
			
			frame.setSize(800,750);
		frame.setLocation(520,150) ;
			t =new Timer(2000 ,  this);// 20 Millisecond
	         t.start();
           }
	     	public void actionPerformed(ActionEvent a) {
				if(a.getSource()==t)
				{ 
					 statusLabel.setText("bar");
					 
					 t.stop();
					
				}
				
			}	 
		 
           public static void main(String[] args) throws IOException {
   			StatusBardemo st =new StatusBardemo();
   		}
		 
	 
}
