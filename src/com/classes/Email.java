package com.classes;

public class Email implements Notification
{

	@Override
	public void send(String message) {
		System.out.println("Email Message : "+message);
		
	}

}
