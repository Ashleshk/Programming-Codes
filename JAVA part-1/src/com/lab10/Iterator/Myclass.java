package com.lab11.Iterator;

import java.util.Iterator;
import java.util.Vector;

import com.lab05.Cloning.Employee;

 

public class Myclass {
    
    public static void main(String[] args) {
     Employee e =new Employee();
	 Vector<Integer> c =new Vector<>();
	// c.addElement(e);
	  Iterator it =c.iterator();
	  while(it.hasNext())
	  {
		  e=(Employee)it.next();
	  }
	 
	}
	
}
