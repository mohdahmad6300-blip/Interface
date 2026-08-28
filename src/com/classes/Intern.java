package com.classes;

public class Intern implements Employee
{
	String name;
	double stipend;
	
	public Intern(String name, double stipend) {
	     this.name = name;
	     this.stipend = stipend;
	}

	@Override
	public void calculateSalary() 
	{
	   System.out.println("Stipend : "+stipend);	
		
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee Type : Intern");
		System.out.println("Employee Name : "+name);
}

}
