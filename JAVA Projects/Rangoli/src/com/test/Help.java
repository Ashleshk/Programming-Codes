package com.test;




import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;

import javax.swing.JFrame;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

public class Help extends JFrame implements ActionListener,TreeSelectionListener{
	
	int count=0,length=0,j=0,first=0,min=0;  
	JTree tree=null;
	Panel jp=null;
	JTextArea txt ;
	
	int curX=0,curY=0;
	
	String type=null;
	String application=null;
	Runtime r=null;

	JTextArea Jarea;
	
	String stng="rAnGoLi";
	String name=stng;
	
	String selectedItem=null;
	DefaultTreeCellRenderer renderer=null;
	DefaultMutableTreeNode root=new DefaultMutableTreeNode(name);
	

	JTextArea lb=null,tmp=null;

	DefaultMutableTreeNode i=new DefaultMutableTreeNode("rAnGoLi Overview");
	
	DefaultMutableTreeNode c=new DefaultMutableTreeNode("Common Tasks");
	
	DefaultMutableTreeNode h=new DefaultMutableTreeNode("Eraser");
	
	DefaultMutableTreeNode g=new DefaultMutableTreeNode("Text Area");
	//DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Draw a Straight Line");
	
	
	
	
	DefaultMutableTreeNode d=new DefaultMutableTreeNode("Draw Images");
	DefaultMutableTreeNode d1=new DefaultMutableTreeNode("Draw A free Form Line with pencil");
	DefaultMutableTreeNode d2=new DefaultMutableTreeNode("Draw a Straight Line");
	DefaultMutableTreeNode d3=new DefaultMutableTreeNode("Draw a Rectangle or Square");
	DefaultMutableTreeNode d4=new DefaultMutableTreeNode("Draw a Rounded Rectangle");
	DefaultMutableTreeNode d5=new DefaultMutableTreeNode("Draw a Circle");
	
	
	DefaultMutableTreeNode y=new DefaultMutableTreeNode("Work with Colors");
	DefaultMutableTreeNode y1=new DefaultMutableTreeNode("Set deafult Foreground and Background Color");
	DefaultMutableTreeNode y2=new DefaultMutableTreeNode("Fill an area with Color");
	DefaultMutableTreeNode y3=new DefaultMutableTreeNode("Paint with a Brush");
	DefaultMutableTreeNode y4=new DefaultMutableTreeNode("Create an Airbrush Effect");
	DefaultMutableTreeNode y5=new DefaultMutableTreeNode("Create Custom Colors");
	DefaultMutableTreeNode y6=new DefaultMutableTreeNode("Use Black and White instead of Colors");
	
	
	DefaultMutableTreeNode e=new DefaultMutableTreeNode("Work with 3D");

	DefaultMutableTreeNode e1=new DefaultMutableTreeNode("3D");
	/*DefaultMutableTreeNode e2=new DefaultMutableTreeNode("Fill an area with Color");
	DefaultMutableTreeNode e3=new DefaultMutableTreeNode("Paint with a Brush");
	DefaultMutableTreeNode e4=new DefaultMutableTreeNode("Create an Airbrush Effect");
	DefaultMutableTreeNode e5=new DefaultMutableTreeNode("Create Custom Colors");
	DefaultMutableTreeNode e6=new DefaultMutableTreeNode("Use Black and White instead of Colors");*/
	DefaultMutableTreeNode h1=new DefaultMutableTreeNode("Erase any area");
	DefaultMutableTreeNode g1=new DefaultMutableTreeNode("Type and Format Text");
	
	
	
	
	
	JPanel temp=null;

	Font f=null;
	Font f1=null;
	long len=0;
	boolean status=false;
	DefaultMutableTreeNode node=null;
	JButton b=null,next=null;
	DefaultMutableTreeNode branch=null;
	
	String str[]=null;
	String temp_str[]=null;
	JSplitPane jsp=new JSplitPane();
	
	JScrollPane jsc,sc;
	
	
	JLabel label=null;
	JLabel label1=null;
	JLabel label2=null;
	JLabel label3=null;
	JLabel label4=null;
	Point p,p1;
	
	String st=null,string=null;
	
	Help() {
		
		
		super("rAnGoLi - HELP");
		setBackground(Color.DARK_GRAY );
			
		root.add(i);
		root.add(c);
	
		root.add(d);
		root.add(h);
		root.add(g);
		root.add(y);
		root.add(e);
		
	
		d.add(d1);
		d.add(d2);
		d.add(d3);
		d.add(d4);
		d.add(d5);
	
		e.add(e1);
	
		h.add(h1);
		g.add(g1);
		
		y.add(y1);
		y.add(y2);
		y.add(y3);
		y.add(y4);
		y.add(y5);
	
		setBackground(new Color(100,100,0));
		tree=new JTree(root);
		renderer=new DefaultTreeCellRenderer();
		renderer.setLeafIcon(new ImageIcon("Y:\\leafbook.jpg"));
		renderer.setOpenIcon(new ImageIcon("Y:\\openbook.jpg"));
		renderer.setClosedIcon(new ImageIcon("Y:\\book.jpg"));
		//renderer.set
		tree.setCellRenderer(renderer);
		
		tree.setToggleClickCount(1);       //on how many clicks does the tree expand..
		
	
		jp=new Panel();
		
		sc=new JScrollPane(jp);
		
	
		jp.setLayout(new FlowLayout());
		
		
		sc=new JScrollPane(jp,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JScrollPane jp = new JScrollPane();
		//jp.setVisible(true);
		add(jp);
		jsc=new JScrollPane(tree);
		
		add(jsc);
		add(sc);
		txt = new JTextArea();
		txt.setEditable(false);
		//txt.setEnabled(false);
		txt.setBackground(Color.LIGHT_GRAY);
	//	tree.setBackground(new Color(100,100,0));
	    //tree.setForeground(Color.BLACK);
	
	
		jsp.setLeftComponent(jsc);
		jsp.setRightComponent(sc);
		jsp.setRightComponent(txt);
		
		
		
		add(jsp);
		setSize(1200,900);
		setVisible(true);

					
		tree.addTreeSelectionListener(this);
	}
	
	public void valueChanged (TreeSelectionEvent e) {
		
		jp.removeAll();
		
	
		
		branch=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
		
		selectedItem=branch.toString();
		System.out.println(selectedItem);
		
		if(selectedItem.equalsIgnoreCase("Common tasks")){
		f=new Font("dialog",Font.PLAIN,18);
		//txt.setForeground(Color.BLACK);
	 	txt.setFont(f);	
	 	txt.setText("\n\n\n");
	 	txt.append("\tCommon Tasks\n\n");
	 	txt.append("\t----------------------\n\n");
	 	
	 	
	 	
	 	txt.append("\tThe following tasks are frequently performed when you use Paint.\n\n");

	 
	 	txt.append("\t\t=>   Draw a Straight Line\n");
	 	txt.append("\t\t=>   Draw a Rectangle or Square\n");
	 	txt.append("\t\t=>   Draw a Rounded Rectangle\n");
	 	txt.append("\t\t=>   Draw a Circle\n");
	 	txt.append("\t\t=>   Fill Area with Color\n");
	 	
	 	txt.append("\t\t=>   Using the AirBrush for Sprayer Purpose\n");
	 	txt.append("\t\t=>   Type and Format Text\n");
		}
		
	 	
	 	if(selectedItem.equalsIgnoreCase("Rangoli Overview")){
 			//txt.setBounds(200,200,200,200 );
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
					
 			
 			f=new Font("dialog",Font.PLAIN,18);
 		 	txt.setFont(f);	
 		 	txt.setText("\n\n\n\n");
 		 	txt.append("\trAnGoLi Overview\n");
 		 	txt.append("\t--------------------------\n\n");
		 	
 		 	txt.append("\n");
 	
 			
 			txt.append("\t\t->   rAnGoLi is a drawing tool you can use to create simple or elaborate drawings.\n");
 			txt.append("\t\t->   These drawings can be either black-and-white or color, and can be saved as bitmap files \n");
 			txt.append("\t\t->   You can even use Paint to view and edit scanned photos. \n");
 			txt.append("\t\t->   You can also use Paint to work with pictures, such as .gif files.\n");
 			txt.append("\t\t->   You can paste a Paint picture into another document you've created,\n");
 			txt.append("\t\t       or use it as your desktop background.\n");
 			
 			
 			jp.repaint();
 		}


	 	
	 	if(selectedItem.equalsIgnoreCase("Draw A free Form Line with pencil")){
 			//txt.setBounds(200,200,200,200 );
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
		 	txt.setText("\n");
		 	txt.append("\n");
		 	txt.append("\n");
		 	txt.append("\n");
		 	
		 	txt.append("\tDraw A free Form Line with pencil\n");
	    	txt.append("\t----------------------------------------------\n\n\n");
		 	
 			txt.append("\t1.In the toolbox click Pencil 	");
 			
 			txt.append("\n");
 			txt.append("\t2.Drag the pointer to draw the line freely.\n");
 	
 			txt.append("\n\n\n");
 			
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
 			txt.append("\tNOTES");
 			txt.append("\n");
 			txt.append("\n");
 			txt.append("\t->   When you drag the pointer the foreground color is used which is black by default.\n");
 			txt.append("\t->   To draw a colored Line first select the required color and then click on the line button in the Toolbox down.\n");
 			txt.append("\t->   Drag-To move an item on the screen by selecting the item and then pressing and \n");
 			txt.append("\t       holding down the mouse button while moving the mouse.\n");
 			
 			
 			jp.repaint();
 		}
	 	
	 	
		
		
 		if(selectedItem.equalsIgnoreCase("Draw a Straight Line")){
 			//txt.setBounds(200,200,200,200 );
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
		 	txt.setText("\n");
		 	txt.append("\n");
		 	txt.append("\n");
		 	txt.append("\n");
		 	
		 	txt.append("\tDraw a Straight Line\n");
	    	txt.append("\t---------------------------\n\n\n");
		 	
 			txt.append("\t1.In the toolbox click Line ");
 			
 			txt.append("\n");
 			txt.append("\t2.With a specific starting point drag the pointer to the required ending point\n");
 			txt.append("\t   and draw the line");
 			txt.append("\n\n\n");
 			
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
 			txt.append("\tNOTES");
 			txt.append("\n");
 			txt.append("\n");
 			txt.append("\t->   You can draw a perfectly horizontal, vertical, or 45-degree diagonal line \n");
 			txt.append("\t->   When you drag the pointer the foreground color is used which is black by default\n");
 			txt.append("\t->   To draw a colored Line first select the required color \n"); 
 			txt.append("\t       and then click on the line button in the Toolbox down.");
 			
 			jp.repaint();
 		}
 		
 		
 		if(selectedItem.equalsIgnoreCase("Draw a rectangle or square")){
 			//txt.setBounds(200,200,200,200 );
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
		 	
		 	txt.setText("\n\n\n\n");
		 	
		 	txt.append("\tDraw a rectangle or square\n");
	    	txt.append("\t------------------------------------\n\n\n");

 			txt.append("\t1.In the toolbox click Rectangle\n ");
 				
 		    txt.append("\t2.To draw a rectangle, drag the pointer diagonally in the direction you want.\n\n\n ");
 		     f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
 			txt.append("\tNOTES\n\n");
 			txt.append("\t->   When you drag the pointer, the foreground color is used \n");
 			txt.append("\t       to draw the line surrounding the shape,\n");
 			txt.append("\t       and the background color is used to fill the shape. \n");
 			txt.append("\t->   The border width of the box is fixed.\n");
 			

 			jp.repaint();
 		}
 		
 		
 		if(selectedItem.equalsIgnoreCase("Draw a Rounded Rectangle")){
 			//txt.setBounds(200,200,200,200 );
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
 		 			
		 	txt.setText("\n\n\n\n");
		 	
		 	txt.append("\tDraw a Rounded Rectangle\n");
	    	txt.append("\t-------------------------------------\n\n\n");
		 	
		 	
 			txt.append("\t1.To create a Square cornered shape click Rounded Rectangle\n");
 			txt.append("\t2.To draw a rectangle, drag the pointer diagonally in the direction you want.\n\n");
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
		 	
 			txt.append("\tNOTES\n\n");
 			txt.append("\t->   When you drag the pointer, the foreground color is used to draw the line surrounding the shape, \n");
 			txt.append("\t       and the background color is used to fill the shape. \n");
 			txt.append("\t->   The border width of the box is fixed.\n");
 			
 			jp.repaint();
 			 			
 			 		}
 			
 		
 		
 		
 	if(selectedItem.equalsIgnoreCase("Draw a Circle")){
 			//txt.setBounds(200,200,200,200 );
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
 		 			
		 	txt.setText("\n\n\n\n");
		 	
		 	txt.append("\tDraw a Circle\n");
	    	txt.append("\t------------------\n\n\n");
	     	
		 	
 			txt.append("\t1.In the toolbox click Circle\n");
 			txt.append("\t2.Drag the pointer to draw the ellipse or the circle.\n\n\n ");
 			f=new Font("dialog",Font.PLAIN,18);
		 	txt.setFont(f);	
 			txt.append("\tNOTES\n\n");
 			txt.append("\t->   When you drag the pointer, the foreground color is \n");
 			txt.append("\t       used to draw the line surrounding the shape,\n");
 			txt.append("\t       and the background color is used to fill the shape. \n");
 			txt.append("\t->   The border width of the circle or ellipse is fixed \n");




 			//txt.append("To change the border thickness, click the line or curve tool in the toolbox, and then click the thickness you want in the box below the toolbox. ");
 			jp.repaint();
 			 			
 			 		
 	}
 		
 	if(selectedItem.equalsIgnoreCase("Fill an area with Color")){
			//txt.setBounds(200,200,200,200 );
			f=new Font("dialog",Font.PLAIN,18);
	     	txt.setFont(f);	
		 			
			//txt.append("\n");
	     	txt.setText("\n\n\n\n");
	     	
	     	txt.append("\tFill an area with Color\n");
	    	txt.append("\t-----------------------------\n\n\n");
	     	
			txt.append("\t1.In the tool box click Fill With Color.\n");
			txt.append("\t2.Click a color in the color box if the color you want is different,\n");
			txt.append("\t    from either current foreground or the background color.\n ");
			txt.append("\t3.Click the area or the object you want to fill.\n\n\n");
			txt.append("\tNOTES\n\n");
			txt.append("\t->   If the shape you want to fill has any breaks in its border, \n");
			txt.append("\t       the fill color spreads to the rest of the drawing area.\n");
			txt.append("\t->   To fill with foreground color select the color from the tool box.\n");
			txt.append("\t->   To fill with the background color select the color from the 3DBackground option in the toolbar. ");
			jp.repaint();
			 				 		
	}
 	

 	
 		
 	if(selectedItem.equalsIgnoreCase("Type and Format Text")){
		//txt.setBounds(200,200,200,200 );
		f=new Font("dialog",Font.PLAIN,18);
    	txt.setFont(f);	
	 			
		//txt.append("\n");
    	txt.setText("\n\n\n\n");
    	
    	txt.append("\tType and Format Text\n");
    	txt.append("\t---------------------------\n\n\n");
    	
		txt.append("\t1.You can only enter text into an image when you are in any one of the three views. \n");
		txt.append("\t2.In the toolbox, click Text. \n ");
		txt.append("\t3.To create a text frame, drag the pointer diagonally to the size you want. \n");
		txt.append("\t4.On the text tool bar, click the font, size, color and style you want for the text. \n");
		txt.append("\t5.Type your text. You can also paste text into a text box, but not graphics.\n\n\n");
		txt.append("\tNOTES\n\n");
		txt.append("\t->   You can enter text in a text box only once. When you click outside the box,\n");
		txt.append("\t       the text is converted to a graphic image and you cannot make it active again.   \n");
		txt.append("\t->   To change the color of the text, click a color in the color box. \n");
		txt.append("\t->   The color of the text is defined by the foreground color.\n");
		txt.append("\t->   Three views(skins) available are metallic,motif and windows(classic).\n");
		txt.append("\t->   The default skin is metal.");
		jp.repaint();
		
		 				 		
}
 	
 	
 	
 	
 	
 	if(selectedItem.equalsIgnoreCase("Erase any area")){
			//txt.setBounds(200,200,200,200 );
			f=new Font("dialog",Font.PLAIN,18);
	 	txt.setFont(f);	
	 	txt.setText("\n");
	 	txt.append("\n");
	 	txt.append("\n");
	 	txt.append("\n");
	 	
	 	txt.append("\tErase any area\n");
    	txt.append("\t----------------------\n\n\n");
	 	
	 	
	 	
			txt.append("\t1.In the toolbox click Eraser ");
			
			txt.append("\n");
			txt.append("\t2.Drag the pointer over the area you want to erase.\n");
			txt.append("\t3.Right-click a color in the color box if the color you want\n ");
			txt.append("\t   to erase with is different from the current background color.\n");
			txt.append("\t4.To erase an entire image either click outside the selected area\n"); 
			txt.append("\t    if any part of the image is selected or on the image menu click Clear Image.");
			txt.append("\n\n\n");
			
			
			txt.append("\tNOTES");
			txt.append("\n");
			txt.append("\n");
			txt.append("\t->   The current background color is the eraser color.\n ");
			txt.append("\t->   You can change the background color by right-clicking another color in the color box.  \n");
			
			txt.append("\t->   The current background color will be used to fill the cleared area\n");
			txt.append("\t       in case of erasing an entire image.\n");
			
			jp.repaint();
		}
 	
 	
 	
 	
 	if(selectedItem.equalsIgnoreCase("Set deafult Foreground and Background Color")){
		//txt.setBounds(200,200,200,200 );
		f=new Font("dialog",Font.PLAIN,18);
    	txt.setFont(f);	
	 			
		//txt.append("\n");
    	txt.setText("\n\n\n\n");
    	txt.append("\tSet deafult Foreground and Background Color\n");
    	txt.append("\t---------------------------------------------------------------\n\n\n");
		txt.append("\t1.To set the background color click on 3DBackground. \n");
		txt.append("\t2.The user can select any color from the JColorChooser according to the RGB settings. \n ");
		txt.append("\t3.To set the foreground color the user can select any color from the color buttons provided\n");
		txt.append("\t   or can set any custom color with the help of the Color option present inside TOOLS. \n\n\n");
		
	
		txt.append("\tNOTES\n\n");
		txt.append("\t->   The foreground color is used for lines, borders of shapes, and text.  \n");
		
		txt.append("\t->   The default Background color is White and the default Foreground color is Black. \n");
	
		jp.repaint();
		 				 		
}
 	
 	
 	
 	if(selectedItem.equalsIgnoreCase("Create Custom Colors")){
		//txt.setBounds(200,200,200,200 );
		f=new Font("dialog",Font.PLAIN,18);
    	txt.setFont(f);	
	 			
		//txt.append("\n");
    	txt.setText("\n\n\n\n");
    	txt.append("\tCreate Custom Colors\n");
    	txt.append("\t------------------------------\n\n\n");
		txt.append("\t1.In the color box click the color you want to change. \n");
		txt.append("\t2.In the TOOL option click the color menu to get a user defined color optionality.\n");
		txt.append("\t3.Click and Define Custom Colors using swatches. \n ");
		
		txt.append("\t4.Click the HSB to change the Hue and saturation (Sat), \n");
		txt.append("\t   and then move the slider in the color gradient to change the luminescence (Lum). \n");
	    txt.append("\t5.Click OK button to apply the selected option. \n\n\n");
		

		txt.append("\tNOTES\n\n");
		txt.append("\t->   The foreground color is used for lines, borders of shapes, and text.\n");
		
		txt.append("\t->   The default Background color is White and the default Foreground color is Black. \n");
	
		jp.repaint();
		 				 		
}
 	
 	 	 		
 	if(selectedItem.equalsIgnoreCase("Paint with a Brush")){
	
		f=new Font("dialog",Font.PLAIN,18);
    	txt.setFont(f);	
	 			
		//txt.append("\n");
    	txt.setText("\n\n\n\n");
    	txt.append("\tPaint with a Brush\n");
    	txt.append("\t-------------------------\n\n\n");
		txt.append("\t1.In the toolbox click Brush \n");
		txt.append("\t2.To paint, drag the pointer over the image.\n\n\n ");
	
		txt.append("\tNOTES\n\n");
		
		txt.append("\t->   When you drag the pointer, the brush uses the foreground color.\n");
		
		txt.append("\t->   To use the background color select the color from the 3DBackground option in the tool bar.\n");
	
		jp.repaint();
		 				 		
}
 	
 	if(selectedItem.equalsIgnoreCase("Create an Airbrush Effect")){
 		
 		f=new Font("dialog",Font.PLAIN,18);
    	txt.setFont(f);	
	 			
    	txt.setText("\n\n\n\n");
    	
    	txt.append("\tCreate an Airbrush Effect\n");
    	txt.append("\t----------------------------------\n\n\n");
		txt.append("\t1.In the toolbox click  Airbrush \n");
		txt.append("\t2.To paint, drag the pointer over the image.\n\n\n ");
	
		txt.append("\tNOTES\n\n");
		txt.append("\t->   When you drag the pointer,the airbrush sprays with the foreground color. \n");
		
		txt.append("\t->   To use the background color select the color from the 3DBackground option in the tool bar.\n");
	
		jp.repaint();
 	}
 	
 	
 	
 	
if(selectedItem.equalsIgnoreCase("3D")){
 		
 		f=new Font("dialog",Font.PLAIN,18);
    	txt.setFont(f);	
	 			
    	txt.setText("\n\n\n\n");
    	
    	txt.append("\tWork with 3D\n");
    	txt.append("\t-------------------\n\n\n");
		txt.append("\t1.To create 3D effects in your image click on the 3DLines or the  \n");
		txt.append("\t   adjacent 3DCircles option in the tool bar down.  \n");
		txt.append("\t2.The default color is black. To create 3d effects of a particular color \n");
		txt.append("\t   select the color from the color boxes and then select the required\n");
		txt.append("\t   optionality(3DLines or 3DCircles).  \n");
		txt.append("\t3.Drag the pointer in the direction you want to get  \n");
		txt.append("\t   the required action performed.  \n\n\n\n");
		 
		txt.append("\tCreate Colorful Backgrounds\n");
		txt.append("\t---------------------------------------\n\n\n");
		txt.append("\t1.To create color full backgrounds so that you can save it for future use  \n");
		txt.append("\t   click on the 3DColorfulRectangle or ColorfulLines option in the tool box below. \n");
		txt.append("\t2.This is basically used to create custom effects. \n");
		
		jp.repaint();
 	}
 		 	 			
 		}
		

	 

/*	public static void main(String args[]) {
		new Help();
		
	}*/

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}