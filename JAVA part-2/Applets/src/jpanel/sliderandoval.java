package jpanel;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class sliderandoval extends JPanel{
	
	private int d=10;
	@Override
	public void paint(Graphics g) {
	 
		super.paintComponent(g);
		g.fillOval(10, 10, d, d);
	}
	
	public void SetD(int newD) {
		d=(newD>=0 ? newD:10);
		repaint();
	}
   public Dimension getPreferrreSize() {
	   return new Dimension(200,200);
   }
	   public Dimension getMinimumSize() {
		   return  getPreferrreSize() ;
   }
}
