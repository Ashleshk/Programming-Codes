package com.lab09.GenericsAndCollection2;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
		HashSet<String> s =new HashSet<>();
		s.add("core java");
		s.add("asdfd");
		s.addAll(s);
		System.out.println(s);

		s.clear();
		System.out.println(s);
	  System.out.println(s.equals(null));
	  s.add("core java");
		s.add("asdfd");
		s.add("saghetuetja");
		System.out.println(s.equals(null));
	  s.hashCode();
	  System.out.println(s.isEmpty());
	 System.out.println( s.size());
	}
}
