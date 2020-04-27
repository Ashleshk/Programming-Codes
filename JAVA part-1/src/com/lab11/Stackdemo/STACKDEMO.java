package com.lab11.Stackdemo;

import java.util.Stack;

public class STACKDEMO {

	public static void main(String[] args) {
		Stack<Integer> numstack =new Stack<>();
	   System.out.println(numstack.empty());
		
		numstack.push(10);
		 
		numstack.push(20); 
		numstack.push(30); 
		numstack.push(40); 
		numstack.push(50);
		System.out.println(numstack);
		numstack.peek();
		System.out.println( numstack.peek()+"  Elements removed:"+numstack.pop());
		System.out.println(numstack.search(30)+1);
		 
	}
}
