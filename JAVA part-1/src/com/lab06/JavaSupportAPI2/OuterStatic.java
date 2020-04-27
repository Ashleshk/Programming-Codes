package com.lab06.JavaSupportAPI2;
  

   //  THIS IS TYPE OF THE INNER CLASS METHOD CALLED  .......     \\STATIC\\NESTED INNER CLASS

public class OuterStatic {
     private static int i;
     int b;
     static {
    	 i=100;
    	 
     }
	public OuterStatic() {
		b=200;
	}
	public static void displayOuter()
	{
		System.out.println(i);
	}
	
	//    NED OF THE OUTER CLASS 
     static class Inner{
    	 int c;

		public Inner() {
			c=300;
		}
		public void displayInner()
		{
			System.out.println(i);
			System.out.println(c);
			displayOuter();
			
			//extra tryouts
		//	System.out.println(b);    // b is non-static member... so can't be accesesd..
		}
    	  
     }
}
