package com.lab07.anonymousInnerclass;

public class chocolate {
   String Nmae,Flavour;
   double price;
   public chocolate( ) {
		Nmae = "magnum";
		Flavour = "chocos";
		this.price = 250.0;
	}
public chocolate(String nmae, String flavour, double price) {
	Nmae = nmae;
	Flavour = flavour;
	this.price = price;
}
public void eatChocalote(){
	System.out.println("hi there enjoy "+Nmae+" "+ Flavour+" worth of "+price
			);
}  


}
