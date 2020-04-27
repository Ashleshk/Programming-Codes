package com.lab05.Cloning;

import com.lab05.Interfaces.Rectangle;

public class Main {
    public static void main(String []args)throws CloneNotSupportedException
    
    {    
    
    	  Employee e = new Employee();
    	  Employee e1 =(Employee)e.clone();
    	  e1.display();
    	  e.display();
    	  
    	  
    	  
    	
    }
   
    
}
