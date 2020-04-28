 

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class appletdeemo extends JApplet{
 @Override
public void paint(Graphics g) {
 	super.paint(g);
 	
 	g.setColor(Color.CYAN);
 	g.drawString("hello world", 50, 50);
}
}
