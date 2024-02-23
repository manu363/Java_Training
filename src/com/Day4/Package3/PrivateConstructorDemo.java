package com.Day4.Package3;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		
		MyClass my= MyClass.getObject();
		my.setId(10);
		
		MyClass my1=MyClass.getObject();
		
		System.out.println(my);
		System.out.println(my1);
		
	}

}
