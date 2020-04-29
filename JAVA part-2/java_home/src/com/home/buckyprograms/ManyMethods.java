package com.home.buckyprograms;

public class ManyMethods {
     private String girlname;
     
     public ManyMethods( ) {


		 girlname = "namarata";
	}
	public void setname(String name)
     {
    	  girlname= name;
    	  
     }
     public String getname()
     {
    	 return girlname;
     }
     public void saying()
     {
    	 System.out.println("your first gf was "+getname());
     }
}
