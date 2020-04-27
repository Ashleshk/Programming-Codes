package com.lab05.flightHirarchy;

public class International extends Flight {
    double ticketfare;
    String  type;
	public International( ) {
		this.ticketfare = 2000000;
		this.type = "bussiness";
	}
	public International(double ticketfare, String type) {
		this.ticketfare = ticketfare;
		this.type = type;
	}

	public void Ticketcl()
	{   double total=0.0f;
	    if(type.equals("business"))
	    {
		
		for(Services ser : s){
			System.out.println(ser);
			total=total+(ser.rate +ser.qty);
		}
		System.out.println("totalfare cost is:"+(ticketfare+total)*2);
	    }
	}
}
