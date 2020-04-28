package swing;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Notepad extends JFrame {
    JMenuBar mb;
    JMenu mfile,medit;
    JMenuItem miopen,miclose,micut,micopy,mipaste;
    JTextArea txtdoc;
    public Notepad()
    {
    	initframe();
    	initcomponent();
    	designFrame();
    	handleevents();
    	
    	
    }
    private void handleevents() {
		micut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 
				
			}
		}); 
		
	}
	private void designFrame() {
		 setLayout(new FlowLayout());
		 setJMenuBar(mb);
		 mb.add(mfile);
		 mb.add(medit);
		 mfile.add(miopen);
		 mfile.add(miclose);
		 medit.add(micopy);
		 medit.add(micut);
		 medit.add(mipaste);
		  add(txtdoc);
		
	}
	private void initcomponent() {
		 mb=new JMenuBar();
		 mfile = new JMenu("File");
		 medit =new JMenu("Edit");
		 miopen =new JMenuItem("open");
		 miclose =new JMenuItem("close");
		 micut =new JMenuItem("cut");
		 micopy =new JMenuItem("copy");
		 mipaste =new JMenuItem("paste");
		 txtdoc = new  JTextArea(40,40);
		 
		
	}
	private void initframe()
    {
    	setSize(400,400);
    	setVisible(true);
    	setResizable(false);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	 public static void main(String[] args) {
		new Notepad();
	}
}
