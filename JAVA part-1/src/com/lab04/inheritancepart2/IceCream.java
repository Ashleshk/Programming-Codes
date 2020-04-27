package com.lab04.inheritancepart2;

public class IceCream extends dessert {
     String flavour;
     double qty,total_price;
	public IceCream( ) {
		this.flavour = "chocolate";
		this.qty = 4;
	}
	public IceCream(String flavour, double qty) {
		this.flavour = flavour;
		this.qty = qty;
	}
	 
	@Override
	public String toString() {
		return "IceCream [flavour=" + flavour + ", qty=" + qty
				+ ", total_price=" + total_price + "]";
	}
	public void calculate()
	{
	 total_price=price*qty; 	
		
	}
}
