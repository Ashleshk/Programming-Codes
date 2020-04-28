package web;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class ReadFile extends JFrame{
	
	private JTextField addressbar;
	private JEditorPane display;
	
//ctor
	public ReadFile() {
		 super("ashlesh's browser");
		 addressbar= new JTextField("enter a URL hoss!");
         addressbar.addActionListener( 
        		 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
					  loadCrap(event.getActionCommand()); 
					}
				}
        		 
        		 
        		 );
         add(addressbar,BorderLayout.NORTH);
	  display= new JEditorPane();
	  display.setEditable(false);
	  display.addHyperlinkListener( 
			    new HyperlinkListener() {
			    	public void hyperlinkUpdate(HyperlinkEvent event) {
			    		if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
			    		{
			    			loadCrap(event.getURL().toString());
			    		}
			    	}

					
			                 
			    
			    }
			  
			  );
	  add(new JScrollPane(display),BorderLayout.CENTER);
	  setSize(500,300);
	  setVisible(true);
	}
	private void loadCrap(String string) {
	     try {
	    	 display.setPage(string);
	    	 addressbar.setText(string);
	    	 
	     }
		catch(Exception e) {System.out.println("error");}
	}

}
