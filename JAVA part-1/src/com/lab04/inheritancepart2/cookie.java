package com.lab04.inheritancepart2;

public class cookie extends dessert {
     double no_of_cookie,total_price;

	public cookie( ) {
		this.no_of_cookie = 5;
	}

	public cookie(double no_of_cookie) {
		this.no_of_cookie = no_of_cookie;
	}
 
	public void calculate()
	{
	 total_price=(price*no_of_cookie)/12; 	
		
	}

	@Override
	public String toString() {
		return "cookie [no_of_cookie=" + no_of_cookie + ", total_price="
				+ total_price + "]";
	}
} 
