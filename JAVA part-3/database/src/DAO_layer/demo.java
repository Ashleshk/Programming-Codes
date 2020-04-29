package DAO_layer;

import java.sql.DriverManager;

public class demo {
   public static void main(String[] args) throws Exception {
	  // pqr obj = new pqr();
	   
	   // i don't want to instantiate class but still load the class
	   //then
	   
	   
	   /*    forNmae is used to load the class*/
	    //Class.forName("DAO_layer.pqr")  ;                    
	   
	      Class.forName("DAO_layer.pqr").newInstance();
	    
	     DriverManager.registerDriver(new com.mysql.jdbc.Driver());
}
}
class pqr
{
	
   static
   {
	   System.out.println("in static");
   }
   //instance 
   {
	   System.out.println("in instance");
   }
 
}
