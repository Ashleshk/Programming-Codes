package com.home.buckyprograms2;

public enum enumerationdemo {
          bucky("nice","22"),kelsey("cutie","12"),julie("bigmistake","12"),nicole("italian,","13"),candy("gfgdf","764");

     private final String desc,year;
       enumerationdemo(String description,String birthday) {
    	   desc=description;year=birthday;
 	}
       public  String getdecs()
       {
    	   return desc;
       }
       public  String getyear()
       {
    	   return year;
       }
}
