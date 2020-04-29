package com.home.buckyprograms3;

import java.io.File;
import java.util.Scanner;

public class Readingfrmfile {
        
	 private Scanner x;
	 
	 public void openfile()
	 {
		 try {
			 x= new Scanner(new File("fred.txt"));
		 }
		 catch(Exception e)
		 {
			 System.out.println("Could not find the file.....");
		 }
	 }
	public void readfile()
	{
		while(x.hasNext()) {
			String a= x.next();
			String b= x.next();
			String c= x.next();
		    System.out.printf("%s %s %s\n",a,b,c );
		}
	}
	public void closefile()
	{
		x.close();
	}
}
