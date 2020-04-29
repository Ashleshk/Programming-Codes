package com.home.buckyprograms;

 public class ForLoop2 {
     public static void main(String[] args) {
    	 int a[]= {2,3,5,6,84,2};
    	 int total=0;
    	 for(int x:a)    // x means "holds type" ,:means "of" , a means"variablea_array"
    	 {
    		 total+=x;
    	 }
    	 System.out.println("total:"+total);
	}
}
