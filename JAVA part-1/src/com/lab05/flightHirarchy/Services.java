package com.lab05.flightHirarchy;

public enum Services {
     
      
    	newspaper(500,10),dinner(5000,2),coco(100,1),coffee(50,2);
      public int rate,qty;

	private Services(int rate,int qty) {
		this.rate = rate;
		this.qty=qty;
	}

	private Services( ) {
		this.rate = 20;
		this.qty=33;
	}
        
   
}
