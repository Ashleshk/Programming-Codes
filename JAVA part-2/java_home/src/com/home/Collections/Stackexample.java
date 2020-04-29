package com.home.Collections;

import java.util.Stack;

public class Stackexample {
   public static void main(String[] args) {
	Stack st =new Stack();      //simsilarly HASHTABLE   object
	st.push("JAVA");
	st.push("LAtest");
	st.push("edition");
	st.push("-fifth");
	st.push("430");
	System.out.println("the elements of the stack: "+st);
	System.out.println("the elemts at the top:"+st.peek());
    System.out.println("the lements poped out of the stack: "+st.pop());
    System.out.println("the elements in a stack after the pop out an elements: "+st);
    System.out.println("the result of searching: "+ st.search("rre"));
    System.out.println("the result of searching: "+ st.search("-fifth"));
   
   
   
   }
}
