package com.lab11.labManual;

 
import java.util.Comparator;
 
 

public class Sortutil implements Comparator<Employee> {
      public int compare(Employee o1,Employee o2)
    
      {
    	  if(o1.emp_id>o2.emp_id)
    	  {
    		  return -1;
    	  }
    	  else if(o1.emp_id<o2.emp_id)
    		  return 1;
    	  return 0;
      }
}
