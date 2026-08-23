package com.classes;

public class CashPayment implements Payment
{

	@Override
	public void pay(double amt) {
		System.out.println("Payment Through Cash .. ");
		System.out.println("Paid Rs."+amt);
		
	}

}
