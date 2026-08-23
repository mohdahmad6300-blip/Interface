package com.classes.objects;

import com.classes.Cat;
import com.classes.Dog;

public class AnimalMain 
{

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.sound();
		c.sound();
		d.play();
		d.eat();
		c.eat();
	}

}
