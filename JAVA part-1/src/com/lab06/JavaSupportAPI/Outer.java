package com.lab06.JavaSupportAPI;

public class Outer {
       private int a,b;

	public Outer() {
		this.a = 2;
		this.b =4;
		System.out.println("i am outer class");
	}
	public void showData()
	{
		System.out.println(" "+a+" "+b);
		
		
	}//end of outer class
    
	
	//inner class
	public class Inner{
		private int  c;

		public Inner( ) {
			this.c = 10;
			System.out.println("i am the inner class");
		}
		public void display() {
			System.out.println(Outer.this);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(this);
			
		}
		
	}
}
