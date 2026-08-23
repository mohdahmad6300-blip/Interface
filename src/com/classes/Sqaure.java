package com.classes;

public class Sqaure implements Shape{

	double side;
	
	public Sqaure(double side)
	{
		this.side = side;
		
	}

	@Override
	public double calculateArea() {
		
		return side * side;
	}
}
