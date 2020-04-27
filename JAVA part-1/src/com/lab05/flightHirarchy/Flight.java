package com.lab05.flightHirarchy;

public abstract class Flight {
       double ticket;
       String frmstation,tostation;
        MyDate date;
        Services s[];
        
		public Flight(double ticket, String frmstation, String tostation,
				MyDate date) {
			this.ticket = ticket;
			this.frmstation =frmstation;
			this.tostation = tostation;
			this.date = date;
			s=new Services[5];
			s[0]= Services.newspaper;
			
			
			s=Services.values();
		}
		public Flight(){
			this.ticket = 210000;
			this.frmstation = "pune";
			this.tostation = "mumbai";
			MyDate date =new MyDate();
			date.displayDate();
			s=Services.values();
		}
		public String Flightdetails(){
			 return "Flight [ticket=" + ticket + ", frmstation=" + frmstation
						+ ", tostation=" + tostation + ", date=" + date + "]";
			 
		}
		public void Ticketcl()
		{   double total=0.0f;
			for(Services ser : s){
				System.out.println(ser);
				total=total+(ser.rate + ser.qty);
			}
			ticket=total + ticket;
			System.out.println("totalfare cost is:"+ticket);

			
		}
        
       
}
