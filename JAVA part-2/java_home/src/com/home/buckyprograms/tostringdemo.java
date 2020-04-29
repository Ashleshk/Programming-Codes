package com.home.buckyprograms;

public class tostringdemo {                  //composition
   private int month,day,year;
   public tostringdemo(int m, int d,int y)
   {
	   month=m;day=d;year=y;
	   System.out.printf("the constructor for this is %s",this);
   }
@Override
public String toString() {
	return "tostringdemo [month=" + month + ", day=" + day + ", year=" + year + "]";
}
   
}
