package com.book2.multithread;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BOuncyBalls extends JFrame implements Runnable {

	int x1, x2, x3;
	Thread red, blue, green;

	public BOuncyBalls() {
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
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				} else {
					x1++;
					repaint();
					try {
						red.sleep(5);
					} catch (InterruptedException e) {
 						e.printStackTrace();
					}
				}

			}
			if (Thread.currentThread().getName().equals("blue")) {
				if (x2 == 250) {
					synchronized (this) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				} else {
					x2++;
					repaint();
					try {
						blue.sleep(15);
					} catch (InterruptedException e) {
 						e.printStackTrace();
					}
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
					try {
						green.sleep(25);
					} catch (InterruptedException e) {
 						e.printStackTrace();
					}

				}

			}

		}
	}

	public static void main(String[] args) {
		new BOuncyBalls();
	}

}
