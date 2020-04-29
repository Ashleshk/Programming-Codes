package check2;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.util.Observer;

public class Backimage extends Canvas {
     Image img;
 
     public Backimage()
     {
    	  img=Toolkit.getDefaultToolkit().getImage("F:/images_mini/bank.jpg");
     }
    public void paint(Graphics g) {
    	 Graphics2D g2 = (Graphics2D)g;
    	 g2.drawImage(img, 0, 0,640, 400,this) ;
    }
}
