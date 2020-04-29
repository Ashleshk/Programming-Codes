package com.home.buckyprograms2;

import java.util.EnumSet;

public class mainde {
public static void main(String[] args) {
	for(enumerationdemo people: enumerationdemo.values())
	{
		System.out.printf("%s\t%s\t%s\n",people,people.getdecs(),people.getyear());
	}
	System.out.println("and for the range of consrtants!!!!");
	
	for(enumerationdemo people :EnumSet.range(enumerationdemo.kelsey, enumerationdemo.candy))          //enumset range 
		System.out.printf("%s\t%s\t%s\n",people,people.getdecs(),people.getyear());
	 
}
}
