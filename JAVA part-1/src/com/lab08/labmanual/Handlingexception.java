package com.lab08.labmanual;

import java.util.Scanner;

public class Handlingexception {

	public static void main(String[] args) {
		int a,b;
		Scanner s =new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		try{
			if(b==0)
			{
				System.out.println("Invalid input");
			}
		} catch(ArithmeticException ae)
		{
			 ae.getStackTrace();
			//throw ae;
		}
		System.out.println("division is:"+a/b+"\tremiander:"+a%b);
		} 

	}