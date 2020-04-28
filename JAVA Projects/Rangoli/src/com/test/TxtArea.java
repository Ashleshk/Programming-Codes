package com.test;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;


public class TxtArea implements ComponentListener,ActionListener,ItemListener,Cloneable,MouseMotionListener, MouseListener{


	public static int getxPressed=0;

	public static int getyPressed=0;

	public static int getxReleased=0;

	public int getxCurrent=0,getyCurrent=0;

	public static int getyReleased=0;
	
	boolean isReleased=true;

	JFrame frame=null;

	JTextArea txt,text;
	JToggleButton bold;

	 JToggleButton italics;
	 Image img3=null;
JOptionPane jp;


	// JToggleButton underline;
	 boolean display_bufferimage=false;
	 JComboBox combosize = null;
	 JComboBox combofont = null;
	 JButton b = null;
	 String txtstring=null;

	GraphicsEnvironment ge=null;

	 String combofnt=null;
	 String fontstyle[];
	String st=null;
	 int fntsize;
	 JMenuBar tool;
	 JScrollPane jsp=null;






	public BufferedImage img=null,temp=null;

	String str=null;
	mainClass Main;
	
	
	

	Graphics2D g2D,g=null;
	int Index;

	int WIDTH=0,HEIGHT=0;
	JTextArea txtarea=null;

	    TxtArea(mainClass mc) {

	    	    	
	    	Main=mc;
	    	Index=Main.getIndex();
	    	
	    }
	    
	    
	    
	 public void actionPerformed(ActionEvent e){

		 
		if (Main.eraser.isSelected()){
			Main.eraser.doClick();
		}
		
		
		 
	    	if(e.getSource()==b){
	    		Index=Main.getIndex();
	    		
	    		
	   		 text.setEditable(false);
	   		 text.setVisible(false);
	   		 Main.arr.get(Index).jp.remove(text);
	   		 
	   		 g=(Graphics2D) Main.arr.get(Index).jp.getGraphics();

	   		
	   		 st=txt.getText();
	   		 Font fnt=txt.getFont();
	   		 int size=fnt.getSize();
	   		 String string=fnt.getFontName();
	   		 int type=fnt.getStyle();


	   		 Font font=new Font(string,type,size);
	   		
	   		 Main.arr.get(Index).gc.setFont(font);
	   		 g.setFont(font);
	   		 
	   		
	   		 
	   		 
	   		 Main.arr.get(Index).gc.setColor(Color.BLACK);
	   		 g.setColor(Color.BLACK);
	   		 
	   		 Main.arr.get(Index).gc.drawString(st,getxPressed,getyPressed+3);
	   		 g.drawString(st,getxPressed,getyPressed+3);

	   		 Paint();
	   		 
	   		 frame.dispose();
	   		



	    	}
	    	else
	    	{
	    		if (!Main.Text.isSelected()){
	    			//Main.arr.get(Index).jp.removeComponentListener(this);
		    		Main.arr.get(Index).jp.removeMouseMotionListener(this);
		    		Main.arr.get(Index).jp.removeMouseListener(this);
		    		System.out.println("rtext is not selected");
	    		}
	    		else {
	    		
	    		
	    		
	    		Index=Main.getIndex();
	    
	    		System.out.println("M listening");
	    		g=(Graphics2D) Main.arr.get(Index).jp.getGraphics();

	    		txtarea=new JTextArea();


	    		Main.arr.get(Index).jp.addComponentListener(this);
	    		Main.arr.get(Index).jp.addMouseMotionListener(this);
	    		Main.arr.get(Index).jp.addMouseListener(this);
	    		}
	    	}

	
	}




	    public void Paint() {
			Index = Main.getIndex();
			g = (Graphics2D) Main.arr.get(Index).jp.getGraphics();
	    	    g.drawImage(Main.arr.get(Index).bf,null,0,0);
	    	   
		}



	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
	
		Paint();
	}





	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub

	}





	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub

	}





	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub

	}



	 void Text() {

		txt=new JTextArea(5,20);


		ge=GraphicsEnvironment.getLocalGraphicsEnvironment();

		frame=new JFrame("Font");

		frame.setLayout(null);


		tool=new JMenuBar();
	   	tool.setLayout(new GridLayout(1,0));

		frame.setJMenuBar(tool);

		fontstyle = ge.getAvailableFontFamilyNames();
		Integer fontsize[]=new Integer[50];

		for(int i=1;i<fontsize.length;i++) {
			fontsize[i]=new Integer(i*4);
		}


		combofont=new JComboBox(fontstyle);
		combofont.setBounds(0,0,30,30);
		tool.add(new JLabel(" FONT-NAME "));
		tool.add(combofont);



		tool.add(new JLabel(" FONT-SIZE "));
		combosize=new JComboBox(fontsize);

		tool.add(combosize);
		tool.add(new JLabel("  "));
		combosize.setEditable(true);
		combosize.addItemListener(this);
		combofont.addItemListener(this);
		bold=new JToggleButton(new ImageIcon("y:\\icons\\bold.gif"));
		tool.add(bold);

		italics=new JToggleButton(new ImageIcon("y:\\icons\\italic.gif"));
		tool.add(italics);
	

		bold.addItemListener(this);
		italics.addItemListener(this);
	



		frame.setResizable(false);
		b=new JButton("OK");

		b.setBounds(0,250,550,40);
		b.addActionListener(this);
		//b.addActionListener(new Txt(this));




		jsp=new JScrollPane(txt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(0,0,550,250);
		frame.add(jsp);

		frame.setSize(560,360);
		frame.add(b);

		txtstring=txt.getText();
		System.out.println(txtstring);
		//
		frame.setVisible(true);
		combofnt=fontstyle[0];
		fntsize = 10;


	}


	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		Font f=null;


		if(e.getSource()==combosize){

			Integer s=(Integer)combosize.getSelectedItem();
			fntsize=s.intValue();
			f=new Font(combofnt,Font.PLAIN,fntsize);
			txt.setFont(f);
		}
		else if(e.getSource()==combofont){
			combofnt =  (String) combofont.getSelectedItem();
			f=new Font(combofnt,Font.PLAIN,fntsize);
			txt.setFont(f);
		}

		if(bold.isSelected()) {
			
			//f=new Font(combofnt,Font.BOLD,50);
			System.out.println("in Bold");
			Font f1 = new Font("",Font.BOLD,txt.getFont().getSize());
		System.out.println(	f1.isBold());
			System.out.println(txt.getFont());
			txt.setFont(f1);

		}
		else{
			f=new Font(combofnt,Font.PLAIN,fntsize);
			txt.setFont(f);
		}

		if(italics.isSelected()) {
			f=new Font(combofnt,Font.ITALIC,fntsize);
			txt.setFont(f);
		}
		

	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
		getxPressed=e.getX();
		getyPressed=e.getY();
		System.out.println(getxPressed+"        "+getyPressed);
	}



	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Released");
		getxReleased=e.getX();
		getyReleased=e.getY();
		System.out.println(getxReleased+"    "+getyReleased);
		g.setColor(Color.RED);


	    text=new JTextArea();
	    Main.arr.get(Index).jp.add(text);
	    text.setBounds(getxPressed,getyPressed,getxReleased-getxPressed,getyReleased-getyPressed);
		display_bufferimage=false;
		//Paint();
    // if(isReleased==true){
    	   Text();
	}



	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		Cursor cur = new Cursor(0);
		Index = Main.getIndex();
		Main.arr.get(Index).jp.setCursor(cur);
		
	}



	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}














