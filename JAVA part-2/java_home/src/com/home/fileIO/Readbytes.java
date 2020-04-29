package com.home.fileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class Readbytes {

	public static void main(String[] args) {
		FileInputStream infile =null;
		int b;
		try
		{
			infile= new FileInputStream("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO\\city.txt");
			while((b=infile.read())!=-1)
			{
				System.out.print((char)b);
			}
			infile.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}
}
