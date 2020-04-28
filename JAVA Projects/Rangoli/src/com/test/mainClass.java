package com.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.beans.PropertyVetoException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;


public class mainClass {

	 
	JToolBar toolBarUp = new  JToolBar();
	JToolBar toolBarRight = new  JToolBar();
	JToolBar toolBarLeft = new  JToolBar();
	JToolBar toolBarBottom = new  JToolBar();
	
	// Color Array 
	int []rc={0,255,0,0,100,200,20,255,128,128,192,128,128,150,255};
	int []gc={0,0,100,0,10,10,10,200,128,0,255,192,128,128,128};
	int []bc={0,0,0,150,150,150,150,10,64,128,255,192,255,192,128};
	
	ArrayList <FrameClass> arr = new ArrayList();
	JTabbedPane jtp=null;
	
	static int x1, y1, x2, y2;
	
	 JFrame frame = null;
	 JDesktopPane jDPane = null;
	 FrameClass IntFrame= null;
	 Graphics g = null;
	 
	 JButton b = null;
	
	 // Declaration of menu  bar
	 JMenuBar mBarTop = null;
	 JMenuBar mBarBottom = null;
	 JMenuBar mBarRight = null;
	 JMenuBar mBarLeft = null;
	 
	 // Declaration of Buttons
	 JButton newFile = null;
	
	 JButton SaveButton = null;
	 JButton openButton = null;
	 JButton ColorChooser = null;
	 JButton BackColor = null;
	 JButton ClearScreen = null;
	 
	 
	 JButton ColorButton = null;
	 JButton Color1 = null;
	 JButton Color2 = null;
	 JButton Color3 = null;
	 JButton Color4 = null;
	 JButton Color5 = null;
	 
	
	
	 JButton ClearAll = null;
	 JButton RectBg = null;
	 JButton LineBg = null;
	 JButton showPickColor = null;
	 

	 // Declaration of toggle buttons used for drawing basic shapes
	 JToggleButton rectangle = null;
	 JToggleButton circle= null;
	 JToggleButton line = null;
	 JToggleButton eraser = null;
	 JToggleButton pencil = null;
	 JToggleButton spray = null;
	 JToggleButton fillRect = null;
	 JToggleButton roundRect=null;
	 JToggleButton brush = null;
	 JToggleButton TDLines = null;
	 JToggleButton TDCircles = null;
	 JToggleButton FillCircle = null;
	 JToggleButton Text=null;
	 JToggleButton Pick = null;
	 JToggleButton fill = null;
	 
	 
	 JComboBox combo = null;
	
	 
	 
	 int Index;
	 
	 
	 JMenuBar mbar = new JMenuBar();
	 JMenuItem importImage = null;
	 
	
	 // Constructor of the main class to initialize Frame and its basic properties
	mainClass() {
		
		 jDPane = new JDesktopPane();
		 jDPane.setBackground(Color.LIGHT_GRAY);
		 frame = new JFrame("Rangoli");		 		  
		 IntFrame = new FrameClass();
		 jDPane.add(IntFrame);
		 
		 
		  frame.add(jDPane);
		  frame.setBounds(0,0,1280,990);
		
		  
		  arr.add(IntFrame);
		  
		  
		  IntFrame.jp.setIgnoreRepaint(true);
		  IntFrame.grabFocus();
		  
		  try {
			  IntFrame.jp.grabFocus();
			IntFrame.setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	  
		    
	}
	
	
	
	// Function to Show Frame to the User
	public void ShowFrame() {
		frame.setVisible(true);
	}
	
	
	// Function for adding menu items and menubar to the main parent Window
	public void addMenuBars() {
		
		
		
		frame.setJMenuBar(mbar);
		JMenu file = new JMenu("File");
		//mbar.add(file);
		JMenuItem newfile = new JMenuItem("New") ;
		JMenuItem openfile = new JMenuItem("Open"); 
		JMenuItem savefile = new JMenuItem("Save"); 
		JMenuItem saveasfile = new JMenuItem("Save As JPEG"); 
		JMenuItem closefile = new JMenuItem("Close"); 
		file.add(newfile);
		file.add(openfile);
		file.add(savefile);
		file.add(saveasfile);
		file.addSeparator();
		file.add(closefile);
		
		
		
		newfile.addActionListener(new newInternalFrameClass(this));
		savefile.addActionListener(new SaveClass(this));
		saveasfile.addActionListener(new saveJpg(this));
		openfile.addActionListener(new openClass(this));
		closefile.addActionListener(new CloseListener(this));
		
		
		mbar.add(file);
		
		JMenu ImportOption = new JMenu("Import");
		importImage = new JMenuItem("Import Image");
		ImportOption.add(importImage);
		importImage.addActionListener(new ImportImageClass(this));
		
		mbar.add(ImportOption);
		JMenu Skins = new JMenu("Change Skin");
		JMenuItem metal = new JMenuItem("Metal");
		JMenuItem motif = new JMenuItem("Motif");
		JMenuItem windows = new JMenuItem("Windows");
		Skins.add(metal);
		Skins.add(motif);
		Skins.add(windows);
		
		// Listeners to change look and feel of the application
		metal.addActionListener(new LnFclass (this));
		motif.addActionListener(new LnFclass (this));
		windows.addActionListener(new LnFclass (this));
		mbar.add(Skins);
		
	
		
		
		JMenu Status = new JMenu ("Status");
		
		JMenuItem ShowStatus = new JMenuItem("Show Status");
		Status.add(ShowStatus);
		ShowStatus.addActionListener(new Status(this));
		mbar.add(Status);
		
		JMenu help = new JMenu("Help");
		JMenuItem aboutus = new JMenuItem("About Rangoli");
		JMenuItem helpTpc = new JMenuItem("Help Topics");
		help.add(aboutus);
		help.add(helpTpc);
		helpTpc.addActionListener(new callHelp(this));
		aboutus.addActionListener(new callAboutus(this));
		
		mbar.add(help);
		
		
	}
	
	
	// Function to add Toolbars to the main parent Window
	public void addToolBars() {
		
			
		    newFile = new JButton(new ImageIcon("icons\\new.GIF"));
		    
	       
	        SaveButton = new JButton(new ImageIcon("icons\\save.GIF"));
	     
	        openButton = new JButton(new ImageIcon("icons\\open.GIF"));
	        ColorChooser = new JButton(new ImageIcon("icons\\fg.GIF"));
	       
	    
	        openButton.setToolTipText("Open");
	        SaveButton.setToolTipText("Save");
	        ColorChooser.setToolTipText("Color");
		
	        SaveButton.addActionListener(new SaveClass(this));
	        openButton.addActionListener(new openClass(this));
	        JLabel lb = new JLabel("  Brush Size");
	       
	        
	        combo = new JComboBox();
	        combo.setSize(80,80);
	        for (int i = 1;i<=10; i++ ){
				Integer I = i;
				
			combo.addItem(I);
			}
	        
	       combo.setSelectedIndex(1); 
	     
	       toolBarUp.setFloatable(false);
	       toolBarBottom.setFloatable(false);
	       toolBarRight.setFloatable(false);
	       toolBarLeft.setFloatable(false);
	       
        toolBarUp.add(newFile);// everything is a component
        toolBarUp.add(openButton);
        toolBarUp.add(SaveButton);
        toolBarUp.add(ColorChooser);
        toolBarUp.add(lb);
        toolBarUp.setLayout(new FlowLayout(FlowLayout.LEFT));
        toolBarUp.add(combo);
        
		combo.addActionListener(new brushClass(this)); 
		
        
		
		
        newFile.addActionListener(new newInternalFrameClass(this));
        frame.getContentPane().add(toolBarUp,BorderLayout.NORTH);
        
        ColorChooser.addActionListener(new ChooseColorListener(this));
        
        // Adding componenets to the toolbar at the bottom side
        line = new JToggleButton(new ImageIcon("icons\\line.GIF"));
        line.addActionListener(new ListenerClass(this));
        //line.addComponentListener(new ListenerClass(this));
        
        circle = new JToggleButton(new ImageIcon("icons\\circle1.GIF"));
        circle.addActionListener(new CircleClass(this));
        
        BackColor = new JButton(new ImageIcon("icons\\my.gif"));
        BackColor.addActionListener(new BackColorListener(this));
        BackColor.setToolTipText("Change Background Color");
        
        fillRect = new JToggleButton(new ImageIcon ("icons//rect1.gif"));
        fillRect.addActionListener(new fillRect(this));
        
        FillCircle = new JToggleButton(new ImageIcon("icons\\fillCircle.GIF"));
        FillCircle.addActionListener(new fillCircleClass(this));
        FillCircle.setToolTipText("Filled Circle");
        
        
        
        Text=new JToggleButton("TextArea");
        Text.addActionListener(new TxtArea(this));
        Text.setToolTipText("Insert Text");
        
       
        
        
        Pick = new JToggleButton("Pick Color");
        Pick.addActionListener(new PickClass(this));
        
        
        showPickColor = new JButton("    ");
        showPickColor.setEnabled(false);
        
        roundRect = new JToggleButton(new ImageIcon ("icons\\roundrect.gif"));
        roundRect.addActionListener(new roundRectListener(this));
      
        
        RectBg = new JButton(new ImageIcon ("icons\\3Dback.jpg"));
        RectBg.addActionListener(new RectBgListener(this));
        RectBg.setToolTipText("3 D Colorfull Rectangle Background");
        
        LineBg = new JButton(new ImageIcon ("icons\\myline.GIF"));
        LineBg.addActionListener(new LineBgListener(this));
        LineBg.setToolTipText("ColorFull Lines background");
        
        TDLines = new JToggleButton(new ImageIcon("icons\\3DLines.gif"));
        TDLines.addActionListener(new TDLinesListener(this));
        TDLines.setToolTipText("Three D Lines");
        
        
        TDCircles = new JToggleButton (new ImageIcon("icons\\myCircle.gif"));
        TDCircles.addActionListener(new TDClrcleListener(this));
        TDCircles.setToolTipText("Three D Circles");
        
    	
        
        fillRect.setToolTipText("Solid Rectangle");
        roundRect.setToolTipText("Round Edge Rectangle");
     
        
        
        eraser = new JToggleButton(new ImageIcon("icons\\cd.GIF"));
        eraser.addActionListener(new EraserClass(this));
        
        spray = new JToggleButton(new ImageIcon ("icons\\air.GIF"));
        spray.addActionListener(new sprayClass(this));
        spray.setToolTipText("Air Brush");
    
        
        
        for (int i = 0; i<15; i++){
        	ColorButton = new JButton();
        	ColorButton.addActionListener(new ListenerClass(this));
        	
        	Color colorObj = new Color(rc[i], gc[i], bc[i]);
        	ColorButton.setBackground(colorObj);
        	ColorButton.setActionCommand("ColorButton" + i);
        	
        	ColorButton.addActionListener(new ColorListener(this));
        	ColorButton.setSize(200,502);
        	ColorButton.setText("    ");
        	
        	toolBarBottom.add(ColorButton);
        	
        	}
        
       
        
        frame.getContentPane().add(toolBarBottom,BorderLayout.SOUTH);
    	toolBarBottom.setBounds(500,500,100,50);
        
    
    	toolBarRight.add(FillCircle);
        toolBarRight.add(circle);
        toolBarRight.add(fillRect);
        toolBarRight.add(roundRect);
        toolBarBottom.add(BackColor);
        toolBarBottom.add(RectBg);
        toolBarBottom.add(LineBg);
        toolBarBottom.add(TDLines);
        toolBarBottom.add(TDCircles);
        toolBarBottom.add(Pick);
        toolBarBottom.add(showPickColor);
  
    	
    	rectangle = new JToggleButton(new ImageIcon("icons\\rect.gif"));
    	rectangle.addActionListener(new RectangleListener(this));
    	  rectangle.setToolTipText("Rectangle");
    
    	toolBarLeft.setLayout(new GridLayout(0,1));
    	toolBarRight.add(rectangle);
    	frame.getContentPane().add(toolBarRight,BorderLayout.EAST);
    	
    	
    	fill = new JToggleButton(new ImageIcon("cursors\\bucket.GIF"));
    	fill.addActionListener(new ColorFiller(this));
    	
    	
    	
    	
    	pencil = new JToggleButton(new ImageIcon("icons\\tab_pencil.gif"));
    	pencil.addActionListener(new PencilClass(this));
    	
    	ClearScreen = new JButton(new ImageIcon("icons\\clear.GIF")); 
    	ClearScreen.addActionListener(new XClearClass(this));
    	
    	brush = new JToggleButton(new ImageIcon("icons\\brush.GIF"));
    	brush.addActionListener(new brushClass(this));
    	
    	brush.setToolTipText("Brush");
    	pencil.setToolTipText("Pencil");
    	eraser.setToolTipText("Eraser");
    	line.setToolTipText("Line");
    	ClearScreen.setToolTipText("Clear All");
    	//spray = new JToggleButton("Spray");
    	
    	toolBarRight.setLayout(new GridLayout(0,1));
    	
    	
    	toolBarLeft.add(pencil);
    	toolBarLeft.add(fill);
    	toolBarLeft.add(line);
    	toolBarLeft.add(eraser);
    	toolBarLeft.add(spray);
    	toolBarLeft.add(ClearScreen);
    	toolBarLeft.add(brush);
    	toolBarLeft.add(Text);
    	
    	frame.getContentPane().add(toolBarLeft,BorderLayout.WEST);
    	
        
	}
	
	
	
	 
        public int getIndex() {
		
		JInternalFrame jit = jDPane.getSelectedFrame();
		
		if (arr.contains(jit)) 
			
		return (arr.indexOf(jit));
		
		else 
			
		return (-1);
		
	}
	
	
	// main function which calls every Function 
	public static void main(String[] args) {
     mainClass my =   new mainClass();
     
  
   my.addMenuBars();  
   my.addToolBars();
   
   my.ShowFrame();
  
	}
	
	
	

}
