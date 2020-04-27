package com.lab07.String;

public class StringFunda {
     public static void main(String[] args) {
		  String s = "HELLO";
		  System.out.println(s+"  "+s.hashCode());
		  s="JAVA";
		  System.out.println(s+" " +s.hashCode());
		  
		  
		  ////method 2
		  
		  String s1 =new String("hellooooo"); 
		  System.out.println(s1+" "+s1.hashCode());
		  
		  ///method 3
		  
		  
		  String s2[] = {"sdga","gasdfgfd","sfdgas"};
		  System.out.println(s2[2]);
	}
}
