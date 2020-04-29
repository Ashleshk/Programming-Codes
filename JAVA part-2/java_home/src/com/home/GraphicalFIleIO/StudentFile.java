package com.home.GraphicalFIleIO;

import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentFile extends Frame{
       //defining window components
	  TextField number , name,marks;
	  Button enter,done;
	  Label numlabel,namelabel,marklabel;
	  DataOutputStream dos;
	  
	  //initialise the farame
	  public StudentFile()
	  {
		  super("Create student file");
		  setVisible(true);
		  setSize(400,300);
	  }
	  //setup the frame
	  @SuppressWarnings("deprecation")
	private void setup() {
		//resize(400,200);
	    setLayout(new GridLayout(4, 2));
	    number =new TextField(25);
	    numlabel= new Label("Roll number");
	    name = new TextField(25);
	    namelabel=new Label("Student name");
	    marks= new TextField(25);
	    marklabel = new Label("marks");
	    enter= new Button("ENTER");
	    done = new Button("DONE");
	    
	    // add the components to frame
	    add(numlabel);
	    add(number);
	    add(namelabel);
	    add(name);
	    add(marklabel);
	    add(marks);
	    add(enter);
	    add(done);
	     
	    
	    //open the file
	    try
	    {
	    	dos=new DataOutputStream(new FileOutputStream("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\GraphicalFIleIO\\student.txt"));         
	    }catch(IOException e) {}
	  }
	    private void addRecord() {
 			int num;
 			Double d;
 			num=new Integer((number.getText())).intValue();
 			try
 			{
 				dos.writeInt(num);
 				dos.writeUTF(name.getText());
 				d= new Double(marks.getText());
 				dos.writeDouble(d.doubleValue());
 			}catch(IOException e) {}
		
	     //clear the text fields
	    number.setText(" ");
	    name.setText(" ");
	    marks.setText(" ");
	}
	  //adding the record and clearing the textfields
	  public void cleanup() {
		 
        if(!number.getText().equals(" "))
        {
        	addRecord();
        }
        try
        {
        	dos.flush();
        	dos.close();
        
        }catch (IOException e) {
 		}
        
        
	}
	  //processing the event
	  @SuppressWarnings("deprecation")
	public boolean action(Event event,Object o)
	  {
		  if(event.target instanceof Button )
		  {
			  if(event.arg.equals("ENTER"))
			  {
				  addRecord();
				  return true;
			  }
		  }
		  return super.action(event, o);
	  }
		public boolean handleEvent(Event event )
		  {
			  if(event.target instanceof Button )
			  {
				  if(event.arg.equals("DONE"))
				  {
					  cleanup();
					  System.exit(0);
					  return true;
				  }
			  }
			  return super.handleEvent(event);		 
			  }
		  public static void main(String[] args) {
			StudentFile student =new StudentFile();
			student.setup();
		}
		
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
