package com.classes.objects;

import com.classes.CardPayment;
import com.classes.CashPayment;
import com.classes.UpiPayment;



public class PaymentMain {

	public static void main(String[] args) {
		
		UpiPayment upi = new UpiPayment();
		CardPayment card = new CardPayment();
		CashPayment cash = new CashPayment();
		
		upi.pay(500);
		card.pay(800);
		cash.pay(1000);

	}

}
