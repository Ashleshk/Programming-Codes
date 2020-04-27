package com.lab05.flightHirarchy;

public   class Domestic extends Flight{
    double ticketprice;

	public Domestic( double ticketprice) {
		 
		this.ticketprice = ticketprice;
	}

	public Domestic() {
	 ticketprice=200;
	}
	public void Ticketcl()
	{   double total=0.0f;
	
		
		for(Services ser : s){
			System.out.println(ser);
			total=total+(ser.rate +ser.qty);
		}
		System.out.println("totalfare cost is:"+(ticketprice+total));
		
	}
    
}
