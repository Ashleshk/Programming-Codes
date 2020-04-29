package com.home.Collections;

import java.util.LinkedList;

public class MyStack {

	private LinkedList list = new LinkedList();
	public void push1(Object o)
	{
		list.addFirst(o);
		
	}
	public void push2(Object obj)
	{
		list.addLast(obj);
	}
	public Object bottom()
	{
		return list.getLast();
	}
	public  Object pop() {
		 return list.removeFirst();
	}

	
}
