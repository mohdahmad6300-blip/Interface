package com.classes.objects;

import com.classes.Email;
import com.classes.Notification;
import com.classes.Push;
import com.classes.Sms;

public class NotificationMain {

	public static void main(String[] args) {
		
		Notification not;
		
		not = new Email();
		not.send("Your Order Has Been Shipped..");
		
		System.out.println("================================================");
		
		not = new Sms();
		not.send("OTP is 7685.");
		
		System.out.println("================================================");
		
		not = new Push();
		not.send("You Have 3 new Messages...");
	}
}
