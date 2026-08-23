package com.classes;

public interface Animal 
{
    public void sound();
    
    default void eat() {
    	System.out.println("Animal Eats..");
    }
}
