package com.home.fileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write   {
  public static void main(String[] args) {
	byte cities[]= {'D','E','L','H','I','\n','M','A','D','R','A','S','\n','L','O','N','D','O','N','\n'};
    FileOutputStream outfile =null;
    try
    {
    	outfile=new FileOutputStream("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO\\city.txt");
    	outfile.write(cities);   // write data to doesn't  write with \n in txt file
    	//outfile.write('\n');
    	outfile.write('a');
    	outfile.close();
    }
    catch(IOException ioe)
    {
    	System.out.println(ioe);
    	
    }
  
  }
}
