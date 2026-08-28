package com.classes.objects;

import com.classes.CurrentAccount;
import com.classes.SavingAccount;

public class BankMAin 
{
   public static void main(String[] args) {
	 
	   //Saving Account.
		SavingAccount saving = new SavingAccount(5000);
		saving.deposit(100000);
		saving.withdraw(5000);
		saving.checkBalance();
		
		//Current Account.
	    CurrentAccount current = new CurrentAccount(6000);
	    current.deposit(4000);
		current.withdraw(2000);
		current.checkBalance();
}
}
