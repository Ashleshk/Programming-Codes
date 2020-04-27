package com.lab03.passByReference;

import com.lab01.basicProgram.MyDate;

public class EmployeeREDEFINED {
     int empid;
     String empname;
     MyDate birthDate;
      public EmployeeREDEFINED() {
		empid=0;
	   empname=""	;
	   birthDate=new MyDate();
      }
      public EmployeeREDEFINED(int i,String nm, MyDate dt)
      {
    	  empid=i;
   	   empname=nm	;
   	   birthDate=dt;
    	  
      }
      public void display(){
    	  System.out.println("empid= "+ empid+"  "+"empname="+empname+"  "+"birthdate= "+ birthDate );
      }
      public static void main(String args[])
      {
    	  EmployeeREDEFINED e1 =new EmployeeREDEFINED();
    	  EmployeeREDEFINED e2 = new EmployeeREDEFINED(2,"abcdefghijkl",new MyDate(28,"feb",2015));
    	  
    	  e1.display();
    	  e2.display(); 
      }
     

}