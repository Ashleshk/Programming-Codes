package com.home.stack;

public class stack implements IntStack  {
	private int stck[];
	private int tos;
	//allocate and initialize stack
	public stack(int size) {
	stck = new int[size];
	tos = -1;
	}
	//Push an item onto the stack
	public void push(int item) {
	if(tos==stck.length-1) // use length member
	System.out.println("Stack is full.");
	else
	stck[++tos] = item;
	}
	//Pop an item from the stack
	public int pop() {
	if(tos < 0) {
	System.out.println("Stack underflow.");
	return 0;
	}
	else
	return stck[tos--];
	}
}
 
 

 