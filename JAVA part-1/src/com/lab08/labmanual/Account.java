package com.lab08.labmanual;

import java.util.Scanner;
import com.lab08.labmanual.*;
 

public class Account {
      public static void main(String []args)
      {
    	  double wthbal ,total=1200;
    	  System.out.println("ENter the amount of withdrawal:");
    	  Scanner s =new  Scanner(System.in);
    	  wthbal=s.nextDouble();
    	  try{
    		  if(total-wthbal <=1000)
    		  {
    			  System.out.println("EXCEPTION OCCURED");
    			  throw new LessBalanceException("Exception occuredddddddd");
    		  }
    		  
    	  }
    	  catch(LessBalanceException lb){
    	lb.printStackTrace();
    	  }
      }
       
       
      
       
}
