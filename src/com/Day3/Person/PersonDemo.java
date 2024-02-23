package com.Day3.Person;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person obj=new Person();
		
		String name,gender;
		int income,age;
		
		// Scanner object to accept user inputs
		
		Scanner sc=new Scanner(System.in);
		
		name=sc.next();
		System.out.println("Enter Person Name:");
		age=sc.nextInt();
		System.out.println("Enter Person Age:");
		gender=sc.next();
		System.out.println("Enter Person gender:");
		income=sc.nextInt();
		System.out.println("Enter Person Income:");
		
		obj.setName(name);
		obj.setIncome(income);
		obj.setGender(gender);
		obj.setAge(age);
		
		TaxCalculation tax=new TaxCalculation();
		
		tax.calculateTax(obj);
		
		System.out.println(obj);
		
	}

}
