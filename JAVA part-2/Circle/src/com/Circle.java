package com;

 
import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.*;
 
public class Circle extends JPanel
{
    Point[] points;
    GeneralPath circle;
    final int INC = 5;
 
    public Circle()
    {
        initPoints();
        // to fill the circle we need to make something
        // that we can fill: a geometry primitive
        initCircle();
    }
 
    private void initPoints()
    {
        int numberOfPoints = 360/INC;
        points = new Point[numberOfPoints];
        double cx = 200.0;
        double cy = 200.0;
        double r = 75.0;
        int count = 0;
        for(int theta = 0; theta < 360; theta+=INC)
        {
            int x = (int)(cx + r * Math.cos(Math.toRadians(theta)));
            int y = (int)(cy + r * Math.sin(Math.toRadians(theta)));
            points[count++] = new Point(x, y);
        }
    }
 
    private void initCircle()
    {
        circle = new GeneralPath();
        for(int j = 0; j < points.length; j++)
        {
            if(j == 0)
                circle.moveTo(points[j].x, points[j].y);
            else
                circle.lineTo(points[j].x, points[j].y);
        }
        circle.closePath();
    }
 
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(Color.pink);
        g2.fill(circle);
        g2.setPaint(Color.red);
        Point p1 = points[0];
        for(int j = 1; j <= points.length; j++)
        {
            Point p2 = points[j % points.length];
            g2.drawLine(p1.x, p1.y, p2.x, p2.y);
            p1 = p2;
        }
    }
 
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new Circle());
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}