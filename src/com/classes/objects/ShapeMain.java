package com.classes.objects;

import com.classes.*;

public class ShapeMain {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(50, 80);
		double res = r.calculateArea();
        System.out.println("Area Of Rectangle : "+res);
        
        Circle c = new Circle(8);
        double res1 = c.calculateArea();
        System.out.println("Area Of Circle : "+res1);
        
        Sqaure s = new Sqaure(5);
        double res2 = s.calculateArea();
        System.out.println("Area Of Sqaure : "+res2);
        
		
	}

}
