package com.Day3.Customer;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name,id,city;
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter id:");
		id=sc.nextLine();
		System.out.println("Enter city:");
		city=sc.nextLine();
		
		
		System.out.println();
		
		
		
		// Default Constructor
		
		Customer c1=new Customer();
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		
		System.out.println(c1);
		
		//Parameterized Customer
		
		Customer c2=new Customer(name,id,city);
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter id:");
		id=sc.nextLine();
		System.out.println("Enter city:");
		city=sc.nextLine();
		
		c2.setCustomerCity(city);
		c2.setCustomerId(id);
		c2.setCustomerName(name);
		
		sc.close();
		
		System.out.println(c2);
		
		

	}

}
