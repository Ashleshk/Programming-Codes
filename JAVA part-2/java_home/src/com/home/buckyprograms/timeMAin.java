package com.home.buckyprograms;

public class timeMAin {
   public static void main(String[] args) {
	   Timeclassdemo t= new Timeclassdemo();
	   System.out.println(t.tomilitray());
	   t.settime(13, 27, 55);
	   System.out.println(t.tomilitray());
	   System.out.println(t.toString());
}
}
