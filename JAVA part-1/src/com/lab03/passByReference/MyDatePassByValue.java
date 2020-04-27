package com.lab03.passByReference;

import com.lab01.basicProgram.MyDate;

public class MyDatePassByValue {
      public static void main(String [] args){
    	  
    	  MyDate date[] = new MyDate[4];
    	  
    	  date[0]=new MyDate(1,"jan",2003);
    	  date[1]=new MyDate(23,"july",2013);
    	  date[2]=new MyDate( 4," ",2016);
    	  
    	date[3]=new MyDate();  // its is wrong becoz it is necessary to give three argument for the parametri
    	  System.out.println("BEFORE" + date[0] + "   "+ date[1]+"  "+ date[2] + "   "+ date[3] + "   "+"\n ");
    	  swap(date );
    	  System.out.println("AFTER" + date[0] + "   "+ date[1]+"  "+ date[2] + "   "+ date[3] + "   "+"\n ");
      }
      public static void swap(MyDate []darr ){
    	  MyDate temp;
    	  temp=darr[0];
    	  darr[0]=darr[1];
    	  darr[1]=temp;
    	  
      }
}
