package com.home.fileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteIntegers {
   public static void main(String[] args) {
	DataInputStream dis =null;
	DataOutputStream dos = null;
	File intfile =new File("F:\\JAVA PROGRAMS\\programINhome2\\java_home\\src\\com\\home\\fileIO\\Rand.txt");
	try
	{
		dos = new DataOutputStream(new FileOutputStream(intfile));
		for(int i=0;i<20;i++)
		{
			dos.writeInt((int)(Math.random()*100));
		}
	}
	catch(IOException r) {
		System.out.println(r.getMessage());
	}
	finally
	{
		try
		{
			dos.close();
		}
		catch(IOException  e) {}
	}
	try
	{
		dis=new DataInputStream(new FileInputStream(intfile));
		for(int i=0;i<20;i++)
		{
			int n =dis.readInt();
			System.out.println(n+" ");
		}
	}
	catch(IOException e) {
		
		System.out.println(e.getMessage());}
		finally
		{
			try
			{
				dis.close();
			}catch(IOException ef) {}
		}
		
		
		
	}
	
}

