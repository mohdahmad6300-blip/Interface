package com.classes;

public class PartTimeEmployee implements Employee
{
	String name;
	double rate;
	int hours;
	
	public PartTimeEmployee(String name, double rate, int hours) {
	     this.name = name;
	     this.rate = rate;
	     this.hours = hours;
	}

	@Override
	public void calculateSalary() 
	{
		double salary = rate * hours;
	   System.out.println("Part-Time Salary : "+salary);	
		
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee Type : Part Time");
		System.out.println("Employee Name : "+name);
}
}
