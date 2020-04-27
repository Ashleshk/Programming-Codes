package com.lab02.OOPsInJava;

public class Student {
      public int rollno;
     public String name;
     private String blood;
      int age;
        public Student() {
		// TODO Auto-generated constructor stub
    	  this( 8 ,"ashlesh","A+",18);
	} 
     public Student(int r, String s,String b,int age){
    	 rollno=r;
    	 name=s;
    	 blood=b;
    	 this.age=age;
     }
     public  void display(){
    	 System.out.print("student details  "+rollno+"  "+name+"  "+blood+ "  "+age+"\n");
     }
}
