package com.LInkedlist;
import java.util.*;

public class LInkedlist {
      public static void main(String[] args) {
		
    	  
    	  String[] things = {"apples","noobs","pwgne","bacon","GoaATS"};
	      List<String> list1= new LinkedList<String>( );
       for(String x  : things)
    	   list1.add(x);
       
       
 	  String[] things2 = {"sausage","bacon","gaots","harrypotter"};
	      List<String> list2= new LinkedList<String>( );
    for(String y  : things2)
 	   list2.add(y);
      
    list1.addAll(list2);
    list2=null;
    
    printME(list1);
    removeStuff(list1,2,5);
    printME(list1);
    reverseMe(list1);
      
    }

	private static void reverseMe(List<String> l) {
		// TODO Auto-generated method stub
	
		ListIterator<String> a=l.listIterator(l.size());
		while(a.hasPrevious())
			System.out.printf("%s ",a.previous());
	}

	private static void removeStuff(List<String> l, int i, int j) {
		// TODO Auto-generated method stub
		l.subList(i, j).clear();
	}

	private static void printME(List<String> l) {
		// TODO Auto-generated method stub
		for(String b: l)
			System.out.printf("%s ",b);
		System.out.println("\n\n");
	}
}
