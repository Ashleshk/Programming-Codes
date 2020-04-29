package com.home.buckyprograms;

public class passingArrayTOmethods {
  
  public static void change(int x[])
  {
	  for(int i=0;i<x.length;i++)
	  {
		  x[i]+=5;
	  }
  }
	public static void main(String[] args) {
		int a[]= {2,5,63,5,5};
		  change(a);
		  System.out.println("new array");
		  for(int y : a)
		  {
			  System.out.println(y);
		  }
		     //int[] arr = new int[] ;
		    // System.out.println(arr[1]); 
		   
	}
}
