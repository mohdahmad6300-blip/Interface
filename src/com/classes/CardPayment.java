package com.classes;

public class CardPayment implements Payment{

	@Override
	public void pay(double amt) {
		
		System.out.println("Payment Through Card .. ");
		System.out.println("Paid Rs."+amt);
		
	}
	
	
}
