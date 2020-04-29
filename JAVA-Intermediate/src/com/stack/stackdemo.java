package com.stack;

import java.util.Stack;

public class stackdemo {
			public static void main(String[] args) {
				
				
				Stack<String>  stack=new Stack<String>();
				stack.push("bottom");
				printstack(stack);
				stack.push("second");
				printstack(stack);
				stack.push("third");
				printstack(stack);
				
				stack.pop();	printstack(stack);
				stack.pop();	printstack(stack);
				stack.pop();	printstack(stack);
			}
			private static void printstack(Stack<String> s) {
				if(s.isEmpty())
					System.out.println("you have nothing in stack");
				else
					System.out.printf("%s top \n ",s);
			}
}
