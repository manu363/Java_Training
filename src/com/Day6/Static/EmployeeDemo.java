package com.Day6.Static;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		
		System.out.println(Employee.CompanyName); //Static Variables can be accessed through class name
		Employee e=new Employee("Shubham",005);
		System.out.println(e);
		System.out.println(Employee.CompanyName);
		System.out.println(Employee.salary);
		
		
		// Similarly, create the second object of the class and pass the two arguments.

		e=new Employee("Rahul",123);
		System.out.println(e);
		
		
	}

}
