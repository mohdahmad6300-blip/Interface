package com.classes;

public class UpiPayment implements Payment{


	@Override
	public void pay(double amt) {
		System.out.println("Payment through Upi..");
		System.out.println("Paid Rs."+amt);
		
	}

}
