//Program to demonstrate packages and Access modifiers
package com.Day4.Package1;

public class base {
	
	//Declaring Default,public,private ,protected variables
	
	int varDefault =10;
	public int varPublic =20;
	private int varPrivate =30;
	protected int varProtected =40;
	
	// Declaring Default,public,private ,protected methods
	
	void methodDefault()
	{
		System.out.println("Default variable" +varDefault);
		System.out.println("Default method");
		
	}




	public void methodPublic()
	{
		System.out.println("public variable" +varPublic);
		System.out.println("public method");
		
	}


	private void methodPrivate()
	{
		System.out.println("private variable" +varPrivate);
		System.out.println("private method");
		
	}
	protected void methodProtected()
	{
		System.out.println("protected variable" +varProtected);
		System.out.println("protected method");
		
	}

}
