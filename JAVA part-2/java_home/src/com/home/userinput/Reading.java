package com.home.userinput;
import java.io.DataInputStream;
public class Reading {
	public static void main(String []args) {
        DataInputStream in =new DataInputStream(System.in);
        int  i=0;
        float f=0.0f;
        try
        {
        	System.out.println("enter a integer:");
        	i=Integer.parseInt(in.readLine());
        	System.out.println("enter a float number:");
        	f=Float.valueOf(in.readLine()).floatValue();
        	
        }
        catch(Exception e) {
        	System.out.println("integer is:"+i);
        	System.out.println("float is:"+f);
        }
	}
}
