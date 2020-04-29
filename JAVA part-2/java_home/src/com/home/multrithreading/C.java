package com.home.multrithreading;

public class C extends Thread {
    public void run()
    {
    	for(int i=1;i>0;i++)
   	 {
   		 
   		 System.out.println("\tForm Thread C:i="+i);
   	 }
   	 System.out.println("end of thread C");
    }
}
