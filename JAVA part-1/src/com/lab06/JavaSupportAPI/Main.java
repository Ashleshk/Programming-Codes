package com.lab06.JavaSupportAPI;

public class Main {
     public static void main(String []args){
    	 Outer o = new Outer();
    	 Outer.Inner i = o.new Inner();
    	 i.display(); 
    	 
    	 //     OR
    	 
    	 Outer.Inner in= new Outer().new Inner();
    	 in.getClass();
    	 in.display();
     }
     
}
