package com.classes;

public class C implements A,B{

	@Override
	public void show() {
		
		A.super.show();
		B.super.show();
		System.out.println("C");
	}

}
