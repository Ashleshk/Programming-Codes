package com.lab05.Interfaces2;

public class MyDate implements Printable{
	int day ;static int d=27,m=07,y=98;
	private String month;
	int year;
	public void print()
	{
		System.out.println(" SPIDERMAN HOMECOMING......!!!!!!!!");
		
	}
	public MyDate(){
		this(6,"december",2001);
	}
	public MyDate(int d,String s,int y){
		day=d;
		month=s;
		year=y;
	}
	public void initDate(){
		
		/*day=1;
		month="july";
		year=2017;*/
		
	}
	public void displayDate(){
		System.out.println("Date is "+day+"-"+month+"-"+year);
		
	}
	public static void SHowdate(){
		System.out.println("Date is "+d+"-"+m+"-"+y);
		
	}
	public void setDay(int d){
		day=d;
		
	}
	public void setMonth(String m){
		month=m;
		
	}
	public void setYear(int y){
		year=y;
		
	}
	public int getDay(){
		 return day;
		
	}
	public String getMonth(){
		 return month ;
		
	}
	public int getYear( ){
		return year;
		
	}
	public String toString(){
		return day+"/"+month+"/"+year;
		
	}
	 
	 
	 

}
