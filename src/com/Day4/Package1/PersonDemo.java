package com.Day4.Package1;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,city;
		int age;
		
		System.out.println("Enter person details:");
		name=sc.nextLine();
		city=sc.next();
		age=sc.nextInt();
		
		
		Person obj=new Person();
		
		obj.setName(name);
		obj.setCity(city);
		obj.setAge(age);
		
		System.out.println(obj);
		

	}

}
