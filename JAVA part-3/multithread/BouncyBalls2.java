package com.book2.multithread;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BouncyBalls2 extends JFrame implements Runnable {

	int x1, x2, x3;
	Thread red, blue, green;

	public BouncyBalls2() {
		setVisible(true);
		setSize(500, 700);
		x1 = x2 = x3 = 10;
		red = new Thread(this, "red");
		blue = new Thread(this, "blue");
		green = new Thread(this, "green");
		red.start();
		blue.start();
		green.start();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(x1, 100, 20, 20);
		g.setColor(Color.blue);
		g.fillOval(x2, 200, 20, 20);
		g.setColor(Color.green);
		g.fillOval(x3, 300, 20, 20);
	}

	@Override
	public void run() {
		for (;;) {
			if (Thread.currentThread().getName().equals("red")) {
				if (x1 == 250) {
					synchronized (this) {
						 
					}
				} else {
					x1++;
					repaint();
					 
				}

			}
			if (Thread.currentThread().getName().equals("blue")) {
				if (x2 == 250) {
					synchronized (this) {
						 
					}
				} else {
					x2++;
					repaint();
					 
				}

			}
			if (Thread.currentThread().getName().equals("green")) {
				if (x3 == 250) {
					synchronized (this) {
						notifyAll();
						x1 = x2 = x3 = 10;
					}
				} else {
					x3++;
					repaint();
					 

				}

			}
			
		}
	}

	public static void main(String[] args) {
		new BOuncyBalls();
	}

}
