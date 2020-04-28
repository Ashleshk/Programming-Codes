package com.book2.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
   public static void main(String[] args) throws IOException {
	 File f = new File("D:\\ashlesh.txt");
	 try {
		FileInputStream fin =new FileInputStream(f);
		int i=1;
		while((i=fin.read())!=-1)
		{
			System.out.print ((char)i);    //  print only 1 st -+line 
		}
	} catch (FileNotFoundException e) {
 		e.printStackTrace();
	}
}
}
