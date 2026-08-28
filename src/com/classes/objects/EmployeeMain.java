package com.classes.objects;

import com.classes.Employee;
import com.classes.FullTimeEmployee;
import com.classes.Intern;
import com.classes.PartTimeEmployee;


public class EmployeeMain {

	public static void main(String[] args) {
	  
		Employee employee;
		
		employee = new FullTimeEmployee("Ahmad",60000);
		Employee.company();
		employee.displayDetails();
		employee.calculateSalary();
		
		System.out.println("///////////////////////////////////////..");
		employee = new PartTimeEmployee("Tabrez", 600, 5);
		Employee.company();
		employee.displayDetails();
		employee.calculateSalary();
		
		System.out.println("///////////////////////////////////////..");
		employee = new Intern("Aboozar", 15000);
		Employee.company();
		employee.displayDetails();
		employee.calculateSalary();

	}

}
