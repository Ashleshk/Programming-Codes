package com.lab04.inheritancepart2;

public class dessert {
    String name;
    protected double price;
    
	public dessert( ) {
		 
		this.name = "butterscotch";
		this.price = 150;
	}
	public dessert(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "dessert [name=" + name + ", price=" + price + "]";
	}
	public void calculate()
	{
	  	
		
	}
    
	
}
