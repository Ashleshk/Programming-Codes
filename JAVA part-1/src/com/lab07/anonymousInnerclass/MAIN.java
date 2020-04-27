package com.lab07.anonymousInnerclass;

public class MAIN {
 public static void main(String[] args) {
	chocolate c = new chocolate(){
		public void eatChocalote(){
			System.out.println("i am in anonmymous....");
		} 
	};
	c.eatChocalote();
	candy cd =new candy() {
		
		@Override
		public void enjoy() {
			// TODO Auto-generated method stub
			System.out.println("heello i am the candy....");
		}
	};
	cd.enjoy();
	
	Eatable e = new Eatable() {
		
		@Override
		public void eatme() {
			// TODO Auto-generated method stub
			System.out.println("eata me please"+ "   " );
		}
	};
	e.eatme();
	
}
}
