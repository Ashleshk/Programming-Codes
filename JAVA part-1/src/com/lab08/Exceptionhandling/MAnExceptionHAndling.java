package com.lab08.Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MAnExceptionHAndling {
  public static void main(String[] args)throws IOException {
	 FileInputStream fs =null;
	  System.out.println("namaskar....");
	  try
	  {
		    fs  =new FileInputStream("stt.txt"); 
	  }catch(FileNotFoundException ex){
		  System.out.println("dsgasgfsbdf");
	  }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  finally{
		     System.out.println("do next");
		     fs.close();
	  }
	  System.out.println("file not found");
}
}
