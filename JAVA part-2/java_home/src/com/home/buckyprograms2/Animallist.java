package com.home.buckyprograms2;

public class Animallist {
        
	
	 private Animal[] thelist = new Animal[5];
	   private int i=0;
       public void add(Animal a)
       {
    	   if(i<thelist.length)
    	   {
    		   thelist[i]=a;
    		   System.out.println("Animal added at index "+i);i++;
    	   }
       }
}
