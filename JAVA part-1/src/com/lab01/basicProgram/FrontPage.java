package com.lab01.basicProgram;

public class FrontPage {
	 
	    public static void main(String args[]){
	    	System.out.println("hello world!!!");
	    	MyDate d;
	    	d= new MyDate();
	    	System.out.println(d);
	    	/*int i = Integer.parseInt(args[0]);
	    	d.setDay(i);
	    	d.setMonth(args[i]);
	    	d.setYear(Integer.parseInt(args[2]));*/
	    	/*d.setDay(4);
	    	d.setMonth("jan");
	    	d.setYear(2018);*/
	    	/*d.displayDate();*/
	  /*  	MethodOverloading m =new MethodOverloading();*/
	  /*  	double res = m.add(10,20);
	    	System.out.println(res);
	    	System.out.println(m.add(4.09f,5.08));
	    	System.out.println(m.add("ram", "laxman"));*/
	    /*	VarArgs m= new VarArgs();
	    	int t[]={10,20,30,40,50};
	    	m.addTest("corejava",t);
	    	m.addTest("corejava",10,20,30,40,50);
	    	m.addTest1( 10,20,30,40,50);*/
	    	Employee e,f;
	    	e= new Employee();
	    	f=new Employee(123,"rakesh",34200,99);
	    	f=new Employee(123,"radfhakesh",34200,99);
	    	e.setid(12);
	    	e.setnam("ashlesh");
	    	e.setmedical(98);
	    	e.setsal(2000);
	    	e.display();
	    }
	    
	}


 
