package com.lab08.Exceptionhandling;

public class uncheckedExceptionHAndling {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		int arr[] ={10,20,30,40,50,60};
		try
		{
			System.out.println(arr[7]);
		}catch(ArrayIndexOutOfBoundsException a){
			a.printStackTrace();
			//throw a;
		}
		System.out.println("ENd of the program");
	}
}



///  when the exception handling go to JVM the code is not run  gracefully ...rather it is terminated


//   for gracefully termination don't throw anything to JVM   