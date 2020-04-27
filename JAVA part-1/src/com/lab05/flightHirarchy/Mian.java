package com.lab05.flightHirarchy;

public class Mian {
    public static void main(String []agrs){
    	 //Flight f= new Flight()  
		  MyDate date= new MyDate();
		  date.displayDate();
		  Domestic d =new Domestic();
		  d.Ticketcl();
		  International i = new International();
		  i.Ticketcl();
		  i.Flightdetails();
		  d.Flightdetails();
		 
    	
    	
    }
}
