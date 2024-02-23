package com.Day10.Interfaces.ExtendInterface;

public class ExtendingInterfaceDemo implements ChildInterface {
	
	// Override ChildInterface method
		public void print() { 
			System.out.println("print method");
		}

		// Override InterfaceOne method
		public void show() {
			System.out.println("show Method");
		}

}
