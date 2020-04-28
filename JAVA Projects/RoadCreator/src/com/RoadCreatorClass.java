package com;

 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;

public class RoadCreatorClass extends JPanel {

    private MouseHandler mouseHandler = new MouseHandler();

    GeneralPath path = null;
    private boolean drawing = false;

    public RoadCreatorClass() {
        this.setPreferredSize(new Dimension(600, 600));
        this.addMouseListener(mouseHandler);
        this.addMouseMotionListener(mouseHandler);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.blue);
     
         
        if (path!=null) {
            g2d.draw(path);
        }
    }

    private class MouseHandler extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            Point p = e.getPoint(); 
            if (!drawing) {
                path = new GeneralPath();
                path.moveTo(p.x, p.y);
                drawing = true;
            } else {
                path.lineTo(p.x, p.y);
            }

            repaint();
        }
    }

    public void display() {
        JFrame f = new JFrame("Road Creator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(this);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
    	RoadCreatorClass rc = new RoadCreatorClass();
        rc.display();
    }
}