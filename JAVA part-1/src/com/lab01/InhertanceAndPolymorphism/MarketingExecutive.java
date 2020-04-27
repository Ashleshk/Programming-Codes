package com.lab01.InhertanceAndPolymorphism;

public class MarketingExecutive extends Employee {
       double distance,grossal,netsal;
       double tourallowance=distance*5;
       double telephone =1500;
	public MarketingExecutive(double distance, double tourallowance,double telephone) {
		super(410,"ashlesh",200000);
		this.distance = distance;
		this.tourallowance = tourallowance;
		this.telephone = telephone;
		System.out.println("i am marketing manager");
		
	}
	@Override
	public String toString() {
		super.toString();
		return "MarketingExecutive [distance=" + distance + ", tourallowance="
				+ tourallowance + ", telephone=" + telephone + "]";
	} 
	public void calculate(){
 	   grossal=basicsal+distance+tourallowance ;
  	  netsal=grossal-telephone;
  	System.out.print("grossal="+grossal+"netsal="+netsal);
    }

}
