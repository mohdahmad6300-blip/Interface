package com.classes;

public class UpiPayment implements Payment{

	 private double balance;
     public UpiPayment(double balance)
     {
    	      this.balance = balance;
    	    
    	      System.out.println("Payment through Upi..");
    	      System.out.println("Balance : "+balance);
     }
	
	
	@Override
	public void pay(double amt) {
		if(amt <= 0)
		{
			System.out.println("Invalid Amount ..");			
		}
		else if(amt > balance)
		{
			System.out.println("Insufficient Balance");
		}
		else {
			balance -= amt;
		System.out.println("Paid Through UPI.\nRs."+amt);
		}
		
	}

	@Override
	public void refund(double amt) {
		if(amt <= 0)
		{
			System.out.println("Invalid Amount ..");			
		}
		else 
		{
			balance += amt;
		System.out.println("Refund Through UPI.\nRs."+amt);
		}
		
	}

}
