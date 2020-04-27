package com.lab11.labManual;

public class Employee implements Cloneable{
   int emp_id;
   static int i;
   static  int   counter=54;
   String name;//name[]={"ashlesh","tony stark","ironman","hulkbuster"};
   int basicsal; //basicsal[]={200,5000,600,8000},py=98,tr=87,tp=55;
   int netsal=0;
    
 

 
public Employee( ) {
	this.emp_id = 100;//+counter;
	 name="ashlesh";
	 basicsal = 5000;
	//counter++;
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
/*public void calculate(){
	   basicsal=basicsal + py+tr;
	   netsal=basicsal-tp;
	 System.out.print("grossal="+basicsal+"netsal="+netsal);
 }*/
@Override
public Object clone() throws CloneNotSupportedException {
	 
	return super.clone();
}

}