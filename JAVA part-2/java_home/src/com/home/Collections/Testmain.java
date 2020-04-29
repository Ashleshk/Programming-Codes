package com.home.Collections;

public class Testmain {
	public static void main(String[] args) {
		Car mycar;
		Bird mybird;
		MyStack s = new MyStack();
		s.push1(new Car());
		s.push2(new Bird());
		mycar=(Car)s.pop();
		System.out.println("the first elements in the list:"+mycar);
		mybird=(Bird)s.bottom();
		System.out.println("the last elements in the list"+mybird);
		
	}
	
}
