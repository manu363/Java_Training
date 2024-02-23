package com.Day6.Static;

public class Employee {
	
	//Declare instance variables.
	
	private String Name;
	private int id;
	
	//Declare a static variable companyName with data type String and assign value
	//SGI which is common for all the objects.
	
	static String CompanyName="SGI";
	static float salary=1000.5f;

	//Declare a two-parameter constructor with parameters named n and i.

	
	Employee(String name, int id) {
		
		this.Name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", id=" + id + "]";
	}

	

	

	
	
	

}
