package com.classes;

public class Rectangle implements Shape {

	double l, w;
	
	public Rectangle(double l, double w)
	{
		this.l = l;
		this.w = w;
	}

	@Override
	public double calculateArea() {
	
		return l*w;
	}
}
