package com.home.buckyprograms;

public class VARARGS {
    public static void main(String[] args) {
		System.out.println(Average(46,85,62,9,875,2));
	}
    public static int Average(int ...numbers)
    {
    	int total=0;
    	for(int x : numbers)
    	{
    		total +=x;
    		
    	}
    	return  total/numbers.length;
    }
}
