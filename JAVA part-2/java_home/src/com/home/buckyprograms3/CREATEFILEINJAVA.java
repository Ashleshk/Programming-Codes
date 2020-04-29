package com.home.buckyprograms3;

import java.io.File;
import java.util.Formatter;

public class CREATEFILEINJAVA {
    public static void main(String[] args) {
		final Formatter x;
    	try
    	{
    		x= new Formatter("fred.txt");
    		System.out.println("file is created");
    		x.format("%s%s%s", "19 ","ashlesh ","khajbage ");
    		x.close();
    	}
    	catch(Exception e) {
    		System.out.println("error!!!!!");
    	}
    
	}
}
