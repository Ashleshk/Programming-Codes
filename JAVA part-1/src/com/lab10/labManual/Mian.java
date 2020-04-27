package com.lab11.labManual;

import java.util.ArrayList;
import java.util.Collections;
 

public class Mian {
public static void main(String[] args) {
	/*Employee e = new Employee() ;
	
	HashSet<String> skillsets =new HashSet<>();
    skillsets.add("GOOD");
    */
	/*PriorityQueueDemp p =new PriorityQueueDemp();
	p.queueMethod();*/
	Employee e =new  Employee(134, "tony stark", 2000);
	Employee f =new Employee(412, "caption america", 2);
	 Employee g =new Employee(234, "hulk buster", 52600);
	 
	ArrayList< Employee> s = new ArrayList<>();
	s.add(e);
	s.add(f);
	s.add(g);
	System.out.println("showing report.....");
	System.out.println(s);
	
	Collections.sort(s, new Sortutil());
	System.out.println("sorted object......");
	System.out.println(s);

}
}
