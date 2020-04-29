package com.home.buckyprograms;

import java.util.Scanner;

public class muliclasses_part {
   public static void main(String[] args) {
	   multiple_classes m= new multiple_classes();
	    m.simplemessage();
	    System.out.println(m.hashCode());
	   
	    Scanner input = new Scanner(System.in);
	    System.out.print ("enter your name here:" );
	    String s =input.nextLine();
	    m.simplemessage(s);
}
}
