package com.lab08.Exceptionhandling;

import com.lab01.InhertanceAndPolymorphism.Employee;

public class CheckedExceptionHandlimg {
    

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e= new Employee();
		try
		{
			 Employee e1=(Employee) e.clone();
		}
		catch(CloneNotSupportedException ex)
		{
			 ex.printStackTrace();
			 System.out.println(ex.getMessage());
		}
		System.out.println("AYE dighana");
	}
}
