package com.lab03.passbyvalue;
import java.lang.Math;

public class PassByValue {
	public static void main(String [] args)
	{
		double x=100 ;
		System.out.println("before"+ x);
		 doubleIt (x);
		System.out.println("after"+x);
		double y=Math.sqrt(x);
		System.out.println("y="+y);
	}
	public static void doubleIt(double   arg){
		
		arg *=2;
	}
}  
 
 