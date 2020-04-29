package com.home.buckyprograms3;

import java.io.File;

public class fileiodemo {
   public static void main(String[] args) {
	File file = new File("F:\\JAVA PROGRAMS\\bucky.txt");
	if(file.exists())
		System.out.println(file.getName());
	else
		System.out.println("this does not exist");
 }
}