package com.home.fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Randomio {
  public static void main(String[] args) {
	RandomAccessFile file =null;
	try
	{
		file =new RandomAccessFile( "F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO\\rand.dat", "rw");
		file.writeChar('X');
		file.writeInt(555);
		file.writeDouble(3.1423);
		file.seek(0);
		System.out.println(file.readChar());
		System.out.println(file.readInt());
		System.out.println(file.readDouble());
		file.seek(2);
		System.out.println(file.readInt());
		file.setLength(file.length());
		file.writeBoolean(false);
		file.seek(4);
		System.out.println(file.readBoolean());
		file.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
