package com.home.buckyprograms2;

public class apples {
   public static void main(String[] args) {
	   staticdemo member1= new staticdemo("megan","foxx");
	   staticdemo member2= new staticdemo("alice","tenenesssy");
	   staticdemo member3= new staticdemo("tony ","stark");
	   
	   
	   System.out.println();
	   System.out.println(member1.getfirst());
	   System.out.println(member1.getlast() );
	   System.out.println(member1.getmembers() );
	   
	   System.out.println();
	   System.out.println(member2.getfirst());
	   System.out.println(member2.getlast() );
	   System.out.println(member2.getmembers() );
	   System.out.println();
	   System.out.println(member3.getfirst());
	   System.out.println(member3.getlast() );
	   System.out.println(member3.getmembers() );
	   System.out.println();
	   System.out.println(staticdemo.getmembers());
	   
	   
	   finaldemo f= new finaldemo(16);
	   for(int i =0 ;i<5;i++)
	   {
		    f.add();System.out.printf("%s",f);
	   }
}
}
