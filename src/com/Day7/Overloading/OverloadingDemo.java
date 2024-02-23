package com.Day7.Overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
	
		ConstructorOverloading c =new ConstructorOverloading(); //Default constructor invoked
		System.out.println(c);
		
		ConstructorOverloading c2=new ConstructorOverloading(10.0f); //Single aurguement
		System.out.println(c2);
		
		ConstructorOverloading c3=new ConstructorOverloading(10.0f,20.3f); // Two arguments
		System.out.println(c3);
	
		
		System.out.println("------------------------Method Overloading-----------------------");
		
		
		System.out.println("Addition of two integers : " + MethodOverloading.addition(100,200));
		System.out.println("Addition of two floating numbers : " + MethodOverloading.addition(10.5f, 20.5f));
		System.out.println("Addition of first integer and second float : " + MethodOverloading.addition(10,20.5f));
		System.out.println("Addition of first float second integer : " + MethodOverloading.addition(10.5f,20));
		System.out.println("Addition of two Strings : " + MethodOverloading.addition("ABC","DEF"));
		
		
	}

}
