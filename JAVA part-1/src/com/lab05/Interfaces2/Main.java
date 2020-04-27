package com.lab05.Interfaces2;

import com.lab05.Interfaces.Rectangle;

public class Main {
    public static void main(String []args)
    
    {   Printable prn;
    
    	  Employee e = new Employee();
    	  e.print();
    	  /*Rectangle r =new Rectangle();
    	  r.area();*/
    	 /* Rectangle e =new Rectangle();             // object name classes shall be different or either it should be array
    	  e.area();*/
    	  MyDate m= new MyDate(23, "july", 1999);
    	  m.displayDate();
    	  m.print();
    	  
    	  
    	
    }
   
    
}
