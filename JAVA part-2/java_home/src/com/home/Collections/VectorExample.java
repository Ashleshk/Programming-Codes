package com.home.Collections;

 
import java.util.Iterator;
import java.util.Vector;

 

public class VectorExample {
	public static void main(String[] args) {
		Vector  tx =new Vector();
		tx.add("Banana");
		tx.add("Chiku");
		tx.add("Apple");
		tx.add("Esplain");
		tx.add("grapes");
		tx.add("mango");      
		Iterator  it = tx.iterator();
		while(it.hasNext())
		  System.out.println("elemenets are :"+tx);
}
}
