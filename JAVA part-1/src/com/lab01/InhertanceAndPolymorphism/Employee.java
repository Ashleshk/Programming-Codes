package com.lab01.InhertanceAndPolymorphism;

public class Employee implements Cloneable{
   int emp_id;
   String name;
   int basicsal,py=98,tr=87,tp=55;
   int netsal=0;
 

public Employee(){
	  this(12,"ram",300000);
}
public Employee(int id,String s,int bassal   ){
	  
	  emp_id=id;
	   name=s; 
	  basicsal=bassal;
	  System.out.println("i am a employee..");
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", name=" + name + ", basicsal="
			+ basicsal + "]";
}
public void calculate(){
	   basicsal=basicsal + py+tr;
	   netsal=basicsal-tp;
	 System.out.print("grossal="+basicsal+"netsal="+netsal);
 }
@Override
public Object clone() throws CloneNotSupportedException {
	 
	return super.clone();
}

}