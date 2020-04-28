package com.chapter1.program2;

  class room {
     float l;
     float b;
     void getdata(float a,float b) {
    	 l=a;this.b=b;
     }
}
public class MultipleClasses
{
	
public static void main(String []args) {
	
	float area;
	room m=new room();
	m.getdata(14, 54);
	area=m.l*m.b;
	System.out.println("area is="+area);
}
}
