package com.book2.file;

import java.io.File;
import java.io.IOException;

public class filetext {
    public static void main(String[] args) throws IOException {
		File file = new File("D:\\pra.txt");
		if(!file.isDirectory())
		{
			file.mkdir();
			System.out.println("ITS directory");
		}
		if(!file.isFile())
		{
			file.createNewFile();
			System.out.println("file is file ");
		}
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.length());
		 file.delete();
	}
}
