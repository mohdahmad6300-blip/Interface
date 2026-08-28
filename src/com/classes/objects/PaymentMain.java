package com.classes.objects;

import com.classes.CardPayment;
import com.classes.CashPayment;
import com.classes.UpiPayment;



public class PaymentMain {

	public static void main(String[] args) {
		
		UpiPayment upi = new UpiPayment(1000);
		upi.pay(500);
		upi.refund(5000);
		
		System.out.println("==================================");
		
		CardPayment card = new CardPayment(500);
		card.pay(100);
		
		System.out.println("==================================");
		
		CashPayment cash = new CashPayment(600);
		cash.pay(10);

	}

}
