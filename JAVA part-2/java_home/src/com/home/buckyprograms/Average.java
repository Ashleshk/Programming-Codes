package com.home.buckyprograms;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total=0;
		int grade;
		int average;
		int counter=0;
		while(counter<10)
		{
			grade=s.nextInt();
			total= total+grade;
			counter++;
		}
		average=total/10;
		System.out.println("your average is:"+average);
	}
}
