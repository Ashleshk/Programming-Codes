package com.lab01.InhertanceAndPolymorphism;

public class manager extends Employee{
        double petrol_allow;
        double food_allow;
       double other_allow,grossal,netsal;
       public manager() {
    	   super(301,"tanya",80000);
   		this.petrol_allow =0.08*basicsal;
   		this.food_allow = 0.13*basicsal;
   		this.other_allow = 0.03*basicsal;
   		System.out.println("i am manager default");
   	}
	public manager(double petrol_allow, double food_allow, double other_allow) {
		super(301,"tanya",80000);
		 
		this.petrol_allow = petrol_allow;
		this.food_allow = food_allow;
		this.other_allow = other_allow;
		System.out.println("i am manager paramerzed");
	}
	@Override
	public String toString() {
		 super.toString();
		return "manager [petrol_allow=" + petrol_allow + ", food_allow="
				+ food_allow + ", other_allow=" + other_allow + "]";
	}
       public void calculate(){
    	   grossal=basicsal+petrol_allow+other_allow+food_allow ;
     	  netsal=grossal-1000;
     	  System.out.print("grossal="+grossal+"netsal="+netsal);
       }
}
