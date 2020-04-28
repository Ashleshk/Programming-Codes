package graphics;
 
/*import java.applet.Applet;
import java.awt.Graphics;
 
 
public class DrawLineExample extends Applet{
 
        public void paint(Graphics g){
               
                /*
                 * to draw line in an applet window use,
                 * void drawLine(int x1,int y1, int x2, int y2)
                 * method.
                 *
                 * This method draws a line between (x1,y1) and (x2,y2)
                 * coordinates in a current color.
                 */
               
                //this will draw a line between (10,10) and (50,50) coordinates.
        //   g.drawLine(10,10,50,50);
               
                //draw vertical line
        // g.drawLine(10,50,10,100);
        //  int xPoints[], yPoints[], nPoints=3;
                //draw horizontal line
       //      g.drawLine(10,10,50,10);
       //       g.drawPolygon(xPoints, yPoints, nPoints);
        //}
//}*/
 
 import java.awt.*;
import java.applet.*;
public class DrawLineExample extends Applet
{
  public void paint(Graphics g)
  {
    int x[] = { 70, 150, 190, 80, 100 };
    int y[] = { 80, 110, 160, 190, 100 };
    g.drawPolygon (x, y, 5);
 
    int x1[] = { 210, 280, 330, 210, 230 };
    int y1[] = { 70, 110, 160, 190, 100 };
    g.fillPolygon (x1, y1, 5);
  }
}


