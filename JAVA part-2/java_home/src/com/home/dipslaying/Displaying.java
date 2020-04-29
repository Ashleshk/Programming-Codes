package com.home.dipslaying;

public class Displaying {
	 
   public static void main(String []args) {
	   System.out.println("Scrren display");
	   int x=22;
	   for(int i=0;i<=9;i++) {
		   
		   for(int j=1;j<=i;j++) {
			   
			   System.out.print(" ");
			   System.out.print(i);
		   }
		   System.out.print("\n");
	   }
	   System.out.println("\nScrreen display done");
	   float f=100.12f ;    ///writting f is neccssary else it take it as double as says it is cant convert double to flaot
	   System.out.println("f="+f);
	   
	   
	   //next code
	    
	   int y=0 ;
	   if(x>10)
	   {y=x;}
	   System.out.println("y="+y);//initialise  y
   }
    
}
