package com.home.modifiedforloop;

import java.util.ArrayList;

public class EnhanceForLoop {
public static void main(String[] args) {
	String States[]= {"russia","usa","california","opuen","maharashtra"};
    for(int i =0; i<States.length;i++)
    {
    	System.out.println("Standarad loops for loop : satae name: "+ States[i]);
    }
    System.out.println();
    
    
    
    ///enchanced for loops.....
    for(String i:States)
    {
    	
    	System.out.println("Enhanced for loop : state name :"+ i);
    }
    
    ///RETRIVING ELEMENTS FROM A N ARRARY
    ArrayList<String> cities =new ArrayList<String>();
    cities.add("mumbai");
    cities.add("delhi");

    cities.add("pune");

    cities.add("new york");    //check here are two words

    cities.add("latur");

    cities.add("amravati");

    for(int i=0; i<cities.size();i++) {
    	System.out.println("Standard for loop: cities name /: "+cities.get(i));
    }
    
    //enhanced for loop 
    for(String city :cities) {
    	System.out.println("enhanced for loop:"+city);
    }
    
} 
}
