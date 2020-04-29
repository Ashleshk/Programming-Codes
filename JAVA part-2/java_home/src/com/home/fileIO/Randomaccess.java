package com.home.fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Randomaccess {
public static void main(String[] args) {
	RandomAccessFile rfile;
	try 
	{
		rfile =new RandomAccessFile("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO\\city.txt","rw") ;
		rfile.seek(rfile.length());
		rfile.writeBytes("MUmbai\n");
		rfile.close();
	}
	catch(IOException r) {
		r.printStackTrace();
	}
}
}
