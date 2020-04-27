package com.lab06.JavaSupportAPI2;

public class OuterMethodLocal {
       private int i;

	public OuterMethodLocal() {
		this.i = 10;
	}
	public void display(){
		System.out.println(i);
		/*Inner in = new Inner();             // writing here is wrong ..check for the error
		 in.calculate();*/
	class Inner{
		int sum=0;
		public void calculate()
		{
			for(int a=0;a<=i;a++)
			{
				sum =sum +a;
				System.out.println("sum is ="+sum);
				//System.out.println(y);
			}//for loop of inner class
		}//inner class method
	}//inner class end
	Inner in = new Inner();
	 in.calculate();
	}  //end of outer display 
}
