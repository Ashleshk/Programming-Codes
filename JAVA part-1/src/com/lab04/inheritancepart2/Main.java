package com.lab04.inheritancepart2;

import com.lab01.InhertanceAndPolymorphism.Employee;
import com.lab01.InhertanceAndPolymorphism.MarketingExecutive;
import com.lab01.InhertanceAndPolymorphism.manager;

public class Main {
	public static void showdetail(dessert d){
		if(d instanceof IceCream)
		{
			System.out.println(d instanceof IceCream);
			System.out.println(d); 
		}
}
    public static void main(String []args){
    	 
    	dessert d[] =new dessert[3];
    	//d[0]=new candy();
    	d[1]=new IceCream("mango",75);
    	showdetail(d[0]);
    	showdetail(d[1]);
    	System.out.println(d[1] instanceof cookie);
		 
	}
}
