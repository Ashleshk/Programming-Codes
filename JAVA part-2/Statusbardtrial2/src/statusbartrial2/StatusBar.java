package statusbartrial2;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import  com.l2fprod.common.swing.*;


public class StatusBar {
   public StatusBar() {
	// TODO Auto-generated constructor stub
	   StatusBar statusBar = new StatusBar();
	  
	   //statusBar.setZoneBorder(BorderFactory.createLineBorder(Color.GRAY));
	   statusBar.setZones(
	       new String[] { "first_zone", "second_zone", "remaining_zones" },
	       new Component[] {
	           new JLabel("first"),
	           new JLabel("second"),
	           new JLabel("remaining")
	       },
	       new String[] {"25%", "25%", "*"}
	   );
}
}
