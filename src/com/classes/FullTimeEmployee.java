package com.classes;

public class FullTimeEmployee implements Employee
{
	String name;
	double monthSalary;
	
	public FullTimeEmployee(String name, double monthSalary) {
	     this.name = name;
	     this.monthSalary = monthSalary;
	}

	@Override
	public void calculateSalary() 
	{
	   System.out.println("Full-Time Salary : "+monthSalary);	
		
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee Type : Full Time");
		System.out.println("Employee Name : "+name);
}
     
}
