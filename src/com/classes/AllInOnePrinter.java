package com.classes;

public class AllInOnePrinter implements Printer, Scanner, Fax {

	@Override
	public void sendFax() {
		System.out.println("Sending Fax .. .. ");
		
	}

	@Override
	public void scan() {
	       System.out.println("Scanning Document .. .. ");
		
	}

	@Override
	public void print() {
		System.out.println("Printing Document .. .. ");
		
	}

	

}
