package com.home.buckyprograms;

import java.util.Random;

public class Array {
     public static void main(String[] args) {
		
    	/* int b[]= {1,2,3,8,4,2,4,5};
	   int a[]= new int[7];
	   a[0]=532;
	   a[1]=342;
	 System.out.println(a[1]);
	 System.out.println(b[5] );*/
    	 System.out.println("Index\tvalue");
    	 int a[]= {2,3,5,6,84,2};
    	 int b[]= new int[6];
    	 Random rand= new Random();
    	 int total=0;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 System.out.println(i + "\t"+ a[i]);
    		 total+=a[i];
    	 }
    	 System.out.println("total sum:"+total);
    	 for(int i=1;i<10;i++)
    	 {
    		  ++b[1+rand.nextInt(6)];
    	 }
    	 System.out.println("Face\tfrequency");
    	 for(int i=1;i<b.length;i++)
    	 {
    		 System.out.println(i + "\t"+ b[i]);
    		  
    	 }
}
}