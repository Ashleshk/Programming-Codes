package com.lab05.Interfaces2;

public class Employee implements Printable {
      private int emp_id;
      private String emp_name;
      static int count;
      private double basicsal,HRA ,medical,PF,PT,netsal,grossal;
      public Employee(){
    	  this(123,"ramu",20000,98);
      }
      public Employee(int id,String s,double bassal ,double medic ){
    	 count++;
    	  emp_id=id;
    	  emp_name=s; 
    	  basicsal=bassal;
    	  medical=medic;
    	   
      }
      public void display(){
    	  HRA=0.5*basicsal;
    	  PF=0.12*basicsal;
    	  PT=200;
    	  grossal=basicsal+HRA+medical;
    	  netsal=grossal-(PF+PT);
    	  
    	  System.out.println("basic_sal= "+basicsal+"\ngross_sal= "+grossal+"\nnet_sal= "+netsal);
    	  System.out.println("total count="+count);
      }
      public void print()
      {
    	  System.out.println("MY NAME IS ANTHONY GONSALVISS......");
    	  
      }
      
      
      public int getid(){
    	  
    	  return emp_id;
      }
      public String getname(){
    	  
    	  return emp_name;
      }
      public double getbasicsal(){
	  
	  return basicsal;
      }
      public double getmedical(){
	  
	  return medical;
      }
      
     public void setid(int id){
    	 emp_id=id;
     }
     public void setnam(String s){
    	 emp_name=s;
     } public void setsal(double bs){
    	 basicsal=bs;
      
     } public void setmedical(double  med){
    	 medical=med;
      
      
     }
  
   
  
}
