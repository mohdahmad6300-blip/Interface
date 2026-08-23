package com.classes.objects;

import com.classes.Calculator2;

public class Calculator2MAin {

	public static void main(String[] args) {
		Calculator2 add = (a,b) -> a + b;
		int res = add.operate(10, 40);
		System.out.println(res);
		
		Calculator2 sub = (a,b) -> a - b;
		int res1 = sub.operate(100, 40);
		System.out.println(res1);
		
		Calculator2 mul = (a,b) -> a * b;
		int res2 = mul.operate(20, 5);
		System.out.println(res2);
		
		Calculator2 div = (a,b) -> a / b;
		int res3 = div.operate(20, 5);
		System.out.println(res3);
		

	}

}
