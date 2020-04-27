package com.lab07.String;

public class StringBUilderdemo {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("test");  //OBJEECT NAME WILL BE CHANGED FROM HERE
		
		System.out.println(sb.hashCode());
		sb.append("helloo ");
		System.out.println(sb+" "+sb.hashCode());  ///  CHECK HERE THE OBJECT HAS THE SAME HASHCODE
		sb.append('B');
		System.out.println(sb); 
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
