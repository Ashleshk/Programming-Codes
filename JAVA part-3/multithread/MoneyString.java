package com.book2.multithread;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MoneyString extends JFrame implements Runnable{
     int x1,x2;
     Thread t1,t2;
     
    public MoneyString( ) {
		 setVisible(true);
		 setSize(300,300);
		 x1=10;
		 x2=290;
		 t1 =new Thread(this,"ONE");
		 t2 =new Thread(this,"TWO");
		 t1.start();
		 t2.start();
	}
    @Override
    public void paint(Graphics g) {
    	     	super.paint(g);
    	     	g.drawString("HELLO", x1, 100);
    	     	g.drawString("WELCOME", x2, 200);
    }

	@Override
    public void run() {
 	for(;;)
 	{
 		if(Thread.currentThread()==t1)
 		{
 			x1++;repaint();try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 		}
 		if(Thread.currentThread()==t2)
 		{
 			x2--;repaint();try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
 		}	
 	}
    }
	public static void main(String[] args) {
		new MoneyString();
	}

}
