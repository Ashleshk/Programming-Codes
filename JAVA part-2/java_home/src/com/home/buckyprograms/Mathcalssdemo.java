package com.home.buckyprograms;

import java.util.Random;

public class Mathcalssdemo {
     public static void main(String[] args) {
		System.out.println(Math.abs(-26.562));
		System.out.println(Math.ceil(7.453));
		System.out.println(Math.floor(7.453));
		System.out.println(Math.max(7.453, 56.43));
		System.out.println(Math.min(7.453, 56.43));
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.sqrt(4));
		
		
		Random dice = new Random();
		int number;
		for(int counter= 1; counter<=10;counter++)
		{
			number=dice.nextInt(3);
			System.out.print (number+ " ");
		}
	}
}
