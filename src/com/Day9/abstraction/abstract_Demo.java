package com.Day9.abstraction;

public class abstract_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1;
		s1 = new rectangle();
		s1.calArea();
		s1.show();
		
		s1 = new square();
		s1.calArea();
		s1.show();
			
	}

}
