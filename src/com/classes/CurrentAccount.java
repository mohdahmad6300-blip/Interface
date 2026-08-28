package com.classes;

public class CurrentAccount implements Bank{
	
	private double balance;
	public CurrentAccount(double balance)
	{
		this.balance = balance;
		System.out.println();
		System.out.println("Account Opened With Rs. "+balance);
	}
	
	@Override
	public void deposit(double amt) {
		if(amt > 0)
		{
			balance = balance+amt;
			System.out.println(amt+" deposited successfully..");
		}
		else
		{
			System.out.println("Invalid Deposit Amount..");
		}
		
		System.out.println("Current Balance : "+balance);
		
	}

	@Override
	public void withdraw(double amt) {
		if(amt <= 0)
		{
			System.out.println("Invalid Amount ..");
		}
		else if(amt > balance)
		{
			System.out.println("Insufficient Balance .. ");
		}
		else
		{
			balance = balance - amt;
			System.out.println(amt + "Withdrawed Successfully .. ");
		}
		
		System.out.println("Current Balance : "+balance);
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance : "+balance);
	}

}
