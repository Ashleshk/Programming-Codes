package com.home.Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class hashtableSORTING {
     public static void main(String[] args) {
		
	
	
	Hashtable< String, Integer> hash =new Hashtable<>(4);
   String ob= "ABC";
   Integer in =new Integer(563);
   hash.put(ob, in);
   ob= "XYZ";
    in =new Integer(129);
   hash.put(ob, in);
    ob= "MNO";
    in =new Integer(6564);
   hash.put(ob, in);
    System.out.println(hash);
    Vector<String> v =new Vector<>(hash.keySet());
    
    
    //sorting begins                    ..........check for loop   it is different
    Collections.sort(v);         
    for(Enumeration e = v.elements();e.hasMoreElements();)
    {
    	String key=(String)e.nextElement();              //SWAPPING
    	Integer val=(Integer)hash.get(key);
    	System.out.println("key: "+ key + "   Val:"+ val);
    } 
}
}
