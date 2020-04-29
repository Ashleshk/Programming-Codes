package com.home.buckyprograms;

import java.util.Scanner;

public class swtichdemo {
    public static void main(String[] args) {
		int age ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age:");
		age=s.nextInt( );
		System.out.println(age);
		switch(age)
		{
		case 1 : System.out.println("you can walk..");break;
		case 2: System.out.println("talk..");break;
		case 3:System.out.println("you can run");break;
		case 4: System.out.println("you are old");break;
		default:System.out.println("you are too old...");
		}
	}
}
