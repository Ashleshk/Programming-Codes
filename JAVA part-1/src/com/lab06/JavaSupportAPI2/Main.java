package com.lab06.JavaSupportAPI2;

public class Main {
     public static void main(String []args){
    	 OuterStatic.Inner i =new OuterStatic.Inner();
    	 i.displayInner();
        //
    	 //
    	 // implementing method local classes
    	 OuterMethodLocal o =new OuterMethodLocal();
    	 o.display();
     }
     
}
