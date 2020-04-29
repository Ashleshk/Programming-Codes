package com.home.buckyprograms;

public class Timeclassdemo {
      private  int  hour , minute, second ;
      public Timeclassdemo( ) {
        this(0,0,0);
  	}

      public Timeclassdemo(int hour, int minute, int second) {
 		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	public void settime(int h,int m, int s) {
      hour=((h>=0 && h<24)?h:0);
      minute=((m>=0 && h<60)?m:0);
      second=((s>=0 && h<60)?s:0);}
      
      
      public String tomilitray()
      {
    	  
    	  return String.format("%02d:%02d:%02d",hour,minute,second);
      }
      
      public String toString() {
    	  return String.format("%d:%02d:%02d %s", ((hour==0)||(hour==12)?12:hour%12), minute,second,((hour<12)?"AM":"PM"));
      }
}
