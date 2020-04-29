package com.home.stack_dynamic;

public class IFTest2 {
	public static void main(String args[]) {
		Dynstack mystack1 = new Dynstack(5);
		Dynstack mystack2 = new Dynstack(8);
		// these loops cause each stack to grow
		for(int i=0; i<12; i++) mystack1.push(i);
		for(int i=0; i<20; i++) mystack2.push(i);
		System.out.println("Stack in mystack1:");
		for(int i=0; i<12; i++)
		System.out.println(mystack1.pop());
		System.out.println("Stack in mystack2:");
		 
		for(int i=0; i<20; i++)
		System.out.println(mystack2.pop());
}
}
