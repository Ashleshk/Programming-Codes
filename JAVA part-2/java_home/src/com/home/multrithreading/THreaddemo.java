package com.home.multrithreading;

public class THreaddemo extends Thread{
      @Override
    public void run() {
    	// TODO Auto-generated method stub
    	 for(int i=1;i>0;i++)
    	 {
    		 
    		 System.out.println("\tForm Thread A:i="+i);
    	 }
    	 System.out.println("end of thread A");
    }
}
