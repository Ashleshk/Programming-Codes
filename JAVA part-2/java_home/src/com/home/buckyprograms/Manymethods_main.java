package com.home.buckyprograms;

import java.util.Scanner;

public class Manymethods_main {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   ManyMethods m= new ManyMethods();
	   System.out.print("Enter  your gf name here:");
	   String g=input.nextLine();
	   m.saying();
	   m.setname(g);
	   m.saying();
	   System.out.printf("\ni used printf of c %s",g);
}
}
