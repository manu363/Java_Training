package com.Day2;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		
		
		// Implicit Tyoe Casting or Widening
		
		float f=25.5f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int a=ch;
		System.out.println(a);
		
		// Explicit Type Casting or Narrowing
		
		double f1=15.5f;
		float f2=(float)f1;
		System.out.println(f2);
		
		
		char r='b';
		byte e=(byte)r;
		System.out.println(e);

	}

}
