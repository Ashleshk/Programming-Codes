package introduction;
import java.awt.*;
import javax.swing.*;
public class code extends JApplet {
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("wow its works", 25, 25);
		g.drawString("the sum is"+sum, 50, 30);
		
	}
	private double sum;
	@Override
	public void init() {
		String fn=JOptionPane.showInputDialog("Enter first number");
		String sn=JOptionPane.showInputDialog("Enter second number");
	    
		 double n1= Double.parseDouble(fn);
		 double n2 = Double.parseDouble(sn);
		 sum = n1 + n2 ;
		 
	
	}

}