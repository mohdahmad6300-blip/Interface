package com.classes;

public interface Printer2 
{
    default void print()
    {
    	   message();
    	   System.out.println("Printed .. .. ");
    	
    }
	
	
	
	private void message()
        {
        	   System.out.println("Printing Started .. .. ");
        }
}
