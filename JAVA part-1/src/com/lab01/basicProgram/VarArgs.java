package com.lab01.basicProgram;

public class VarArgs {
    public void addTest(String s, int ... x){
    	System.out.println(s);
    	for(int i=0;i<x.length;i++)
    	{
    		System.out.println(x[i]);
    		
    	}
    	
    }
    public void addTest1(  int ... x){
    	 
    	for(int i=0;i<x.length;i++)
    	{
    		System.out.print(x[i]+"\t");
    	
    		
    	}
    	
}
}
