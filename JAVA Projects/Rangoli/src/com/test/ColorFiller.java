package com.test;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class ColorFiller implements ActionListener, MouseListener,
		MouseMotionListener, ComponentListener {

	mainClass Main;
	int Index, colval, x, y;
	Graphics2D g;
	int c;
	JOptionPane jp;

	ColorFiller(mainClass mc) {
		Main = mc;
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
	}

	void boundaryfill1(int x1, int y1) {

		// System.out.println(colval);

		if (colval != Main.arr.get(Index).bf.getRGB(x1, y1)) {
			return;
		}

		else {
			// Main.g.getColor();
			// long int clr = Main.arr.get(Index)
			Main.arr.get(Index).bf.setRGB(x1, y1, c);

			if ((y1 < Main.arr.get(Index).bf.getHeight() - 1)
					&& (x1 < Main.arr.get(Index).bf.getWidth() - 1) && (x1 > 0)
					&& (y1 > 0)) {
				boundaryfill(x1, y1 - 1);

				boundaryfill(x1 + 1, y1 + 1);
				boundaryfill1(x1 - 1, y1);
				boundaryfill(x1 + 1, y1 - 1);

				boundaryfill1(x1 - 1, y1 - 1);
				boundaryfill1(x1 - 1, y1 + 1);
				boundaryfill(x1 + 1, y1);

				boundaryfill(x1, y1 + 1);

				boundaryfill1(x1 - 1, y1);
				boundaryfill1(x1 + 1, y1);
				boundaryfill1(x1 - 1, y1 - 1);
				boundaryfill1(x1 - 1, y1 + 1);
				boundaryfill1(x1, y1 - 1);
				boundaryfill1(x1, y1 + 1);
				boundaryfill1(x1 + 1, y1 + 1);

				boundaryfill1(x1 + 1, y1 - 1);

			}
		}
	}

	void boundaryfill(int x1, int y1) {
		if (colval != Main.arr.get(Index).bf.getRGB(x1, y1)) {
			return;
		}

		else {
			Main.arr.get(Index).bf.setRGB(x1, y1, c);

			if ((x1 < Main.arr.get(Index).bf.getWidth() - 1)
					&& (y1 < Main.arr.get(Index).bf.getHeight() - 1)
					&& (x1 > 0) && (y1 > 0)) {
				boundaryfill(x1 + 1, y1);
				boundaryfill(x1, y1 + 1);
				boundaryfill(x1, y1 - 1);
				boundaryfill(x1 + 1, y1 - 1);

			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		if (Index >= 0) {
			if (!Main.fill.isSelected()) {
				Main.arr.get(Index).jp.removeMouseListener(this);
				Main.arr.get(Index).jp.removeMouseMotionListener(this);
			} else {
				if (Main.eraser.isSelected()) {
					Main.eraser.doClick();
				}
				Main.arr.get(Index).jp.addMouseListener(this);
				Main.arr.get(Index).jp.addMouseMotionListener(this);
				Main.arr.get(Index).jp.addComponentListener(this);
				// System.out.println("Componenet added");
			}

		} else {
			jp.showMessageDialog(Main.frame, "Please Select a Frame First ",
					"rAnGoLi", jp.INFORMATION_MESSAGE);
			Main.fill.setSelected(false);
		}

	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

		if (Main.g == null) {
			jp.showMessageDialog(Main.frame, "Please Select Color ", "rAnGoLi",	jp.INFORMATION_MESSAGE);
			return;
		}
		x = arg0.getX();
		y = arg0.getY();
		Color cl = Main.g.getColor();
		c = cl.getRGB();
		colval = Main.arr.get(Index).bf.getRGB(x, y);
		boundaryfill1(x, y);
		Paint();
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Index = Main.getIndex();
		Toolkit t = Toolkit.getDefaultToolkit();
		Image CursorImage = t.createImage("cursors\\bucket.GIF");
		Cursor cur = t.createCustomCursor(CursorImage, new Point(5, 5),
				"pencil");
		// Cursor cur = new Cursor(1);
		Main.arr.get(Index).jp.setCursor(cur);
		System.out.println("Mouse Entereed");
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		Paint();
	}

	private void Paint() {
		Index = Main.getIndex();
		g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
		g.drawImage(Main.arr.get(Index).bf, null, 0, 0);
	}

	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub

	}
}
