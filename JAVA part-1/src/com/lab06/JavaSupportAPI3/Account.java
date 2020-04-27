package com.lab06.JavaSupportAPI3;

public class Account {
       private int accountid;
       private String accountName;
       private double balance;
       public Account() {
   		this.accountid = 20435;
   		this.accountName = "ASHLESH";
   		this.balance = 4000000;
   	}
	public Account(int accountid, String accountName, double balance) {
		this.accountid = accountid;
		this.accountName = accountName;
		this.balance = balance;
	}
	public void dsplay(){
		System.out.println("Account [accountid=" + accountid + ", accountName="
				+ accountName + ", balance=" + balance + "]"); 
		
	}
	public class Locker{
		private int locid;

		public Locker(int locid) {
			this.locid = locid;
		}

		public Locker() {
			locid=1234;
		}
		public void displayLocker(){
			System.out.println("the account details are");
			 dsplay();
			 System.out.println("LOC_ID="+locid);
		}
		
	}
	 
       
}
