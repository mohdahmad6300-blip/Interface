package com.classes;

public class Sms implements Notification
{

	@Override
	public void send(String message) {
		System.out.println("Sms Message : "+message);
		
	}
}
