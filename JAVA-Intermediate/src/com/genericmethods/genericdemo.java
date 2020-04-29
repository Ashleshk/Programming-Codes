package com.genericmethods;

public class genericdemo {
  public static void main(String[] args) {
	
  //wayto avoid overload methods
	  Integer[] iray= {1,2,3,4};
	  Character[] cray= {'a','s','h','l'};
	  
	  printme(iray); //this search for integer arg printme if not present go for generic meethod
	  printme(cray);
	  
	  
	  ////////////////
	  System.out.println(max(23,42,1));
	  System.out.println(max("apples","top","bats"));
	  
	  
	  
}
  //generic methods
  ///<T> comes before void becuase of  syntax.
  public static <T> void printme(T[] i)
  {
	  for(T x:i)
		  System.out.printf("%s ",x);
	  System.out.println();
  }
  
  //generic return type  for datatyoes that are comparabele
  public static <T extends Comparable<T>> T max(T a, T b,T c) {
	  T m = a;
	  if(b.compareTo(a)>0)
		  m=b;
	  if(c.compareTo(m)>0)
		  m=c;
	  return m;
  }
   
}
