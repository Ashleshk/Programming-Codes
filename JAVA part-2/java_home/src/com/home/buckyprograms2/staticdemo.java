package com.home.buckyprograms2;

public class staticdemo {
      private String first,last;
      private static int meembers=0;
	public staticdemo(String first, String last) {
		 
		this.first = first;
		this.last = last;meembers++;
		System.out.printf("Constructors for %s %s,memebers in club %d\n",first,last,meembers);
	}
	
	public String getfirst()
	{
		return first;
	}
	public String getlast()
	{
		return last;
	}
     
      public static int getmembers() {
    	  return meembers;
      }
}
