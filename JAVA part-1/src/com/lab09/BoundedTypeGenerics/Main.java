package com.lab09.BoundedTypeGenerics;

public class Main {
 public static void main(String[] args) {
	Integer i[]={10,20,30,40,50,60};
	AverageCalci<Integer> ai =new  AverageCalci<>( i);
	System.out.println(ai.calculateavg());

    String []s ={"n"};
   // AverageCalci<String> as = new AverageCalci<>(s);             ......... Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type 
	                                                                //AverageCalci<T>
     
    
    Integer i1[]={10,20,30,40,50,60};
    Double i2[]={10.0,20.0,30.0,40.0,50.0,6.0};           // try changing this value doubkle....
    AverageCalci<Double> ad = new AverageCalci<>(i2);
    AverageCalci<Integer> we  = new AverageCalci<>(i1); 
    System.out.println(we.calculateavg());
    System.out.println(ad.calculateavg());
    System.out.println(we.issameavg(ad));
 }
}
