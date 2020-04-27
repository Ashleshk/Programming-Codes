package com.lab01.InhertanceAndPolymorphism;

public class Main {
	public static void showdetail(Employee e){
		if(e instanceof manager)
		{
			System.out.println(e instanceof manager);
			System.out.println(e); 
		}
}
    public static void main(String []args){
    	/*manager m =new manager();
    	//m.calculate()
    	System.out.print(m+" ");
    	m.calculate();
    	MarketingExecutive me =new  MarketingExecutive(2000, 500, 1500);
    	System.out.print(me+" ");
    	me.calculate();*/
    	Employee e[] =new Employee[3];
    	e[0]=new manager();
    	e[1]=new MarketingExecutive(5000, 200, 1000);
    	showdetail(e[0]);
    	showdetail(e[1]);
    	System.out.println(e[1] instanceof manager);
		e.toString();
	}
    	
    	
    	
    }

