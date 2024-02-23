package com.Day4.Package2;

import com.Day4.Package1.*;

public class Executor {

	public static void main(String[] args) {
		
		Person obj=new Person();
		
		obj.setAge(23);
		obj.setCity("Bengaluru");
		obj.setName("ABC");
		
		
		base obj2=new base();
		
		obj2.varPublic=100;
		obj2.methodPublic();
		
		
	}

}
