package com.home.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copybytes {
  public static void main(String[] args) {
	FileInputStream infile = null;
	FileOutputStream outfile= null;
	byte byteread;
	try
	{
		infile=new FileInputStream("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO\\in.txt");
		outfile =new FileOutputStream("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO\\out.txt");
		do
		{
			byteread=(byte) infile.read();
			outfile.write(byteread);
			
		}while(byteread !=-1);
	}catch(FileNotFoundException e) {
		System.out.println("file not found");
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		try
		{
			infile.close();
			outfile.close();
		}catch(IOException e) {}
	}
	
}
}
