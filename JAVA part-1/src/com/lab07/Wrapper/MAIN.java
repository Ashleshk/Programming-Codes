package com.lab07.Wrapper;

public class MAIN {
public static void main(String[] args) {
	int i=10;
	Integer it = new Integer(i);
	System.out.println(i);
	System.out.println(it);
	System.out.println(it.compareTo(i));
	System.out.println(it.doubleValue());
	System.out.println(it.equals(10));
	System.out.println(it.floatValue());
	System.out.println(it .hashCode());
	System.out.println(it.intValue());
	System.out.println(it.longValue());
	System.out.println(it.toString());
	System.out.println(it.byteValue());
	System.out.println(it.getClass());
	System.out.println(it.shortValue());
	System.out.println(it.MAX_VALUE);
	System.out.println(it.MIN_VALUE);
	System.out.println(it.SIZE);
	System.out.println(it.lowestOneBit(9));
	System.out.println(it.toHexString(23));
	 
	
	System.out.println(it.doubleValue());
}
}
