package com.classes;

public class Push implements Notification
{
	@Override
	public void send(String message) {
		System.out.println("Push Message : "+message);
		
	}
}
