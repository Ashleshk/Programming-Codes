package com.lab09.GenericsAndCollection;
 

public class TEstbox {
public static void main(String[] args) {
	/*BOx b  =new BOx("hello");
	BOx b1  =new BOx(new Integer(10));
	b=b1;
	String s= (String)b.getob();

}*/
	/*
	GEnericBOx<String>s =new GEnericBOx<String>("String");
    GEnericBOx<Integer> i= new GEnericBOx<Integer>(15);
    //s=i;         ...........its an error to write this statement after its been decalered type
	String s1=s.getob();
    System.out.println(s);	
    System.out.println(s1);	*/
	
	
	
	
	GenreicMUltiple<String,Integer, Double> i =new GenreicMUltiple<>("heollo", 10, 20.56);
	System.out.println(i);
}

}
