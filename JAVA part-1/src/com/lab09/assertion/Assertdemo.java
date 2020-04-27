package com.lab09.assertion;

public class Assertdemo {
	static int i=10;
	static int getnum()
	{return i--;}
	
      public static void main(String[] args) {
		 int n ;
	   for(int i=0;i<10;i++)
	   {
		   n=getnum();
             assert n>0;
             System.out.println("n is "+n);
	   }
	}
}
