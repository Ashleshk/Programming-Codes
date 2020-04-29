package com.hashset;


import java.util.*;

public class hashsetdemo {
    public static void main(String[] args) {
		
    	String[] things= {"apples","bob","ham","bob"};
    	List<String> list=Arrays.asList(things);
    	System.out.println(list);
    	
    	System.out.println();
    	
    	Set<String> set = new HashSet<String>(list);
    	System.out.println(set);
	}
}
