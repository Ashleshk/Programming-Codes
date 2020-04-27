package com.lab07.String;

public class StringBufferdemo {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer();
	System.out.println(sb.hashCode());//OBJEECT NAME WILL BE CHANGED FROM HEREAND IT HOLD DIFF HASHCODE
	sb.append("helloo ");
	System.out.println(sb); 
	sb.append('B');  
	System.out.println(sb+" "+sb.hashCode()); 
	sb.append(542.43);
	System.out.println(sb); 
	sb.append( 547.86);
	System.out.println(sb); 
	System.out.println(sb.capacity());
	sb.deleteCharAt(2);
	System.out.println(sb); 
	System.out.println(sb.equals("helloo"));
	System.out.println(sb); 
	System.out.println(sb.length());
	System.out.println(sb.reverse());
	System.out.println(sb); 
	
}
}
