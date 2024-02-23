//Program to demonstrate constructor overloading

package com.Day7.Overloading;

public class ConstructorOverloading {
	
	private float x;
	private float y;
	
	
	
	public ConstructorOverloading() {
		x=0.0f;
		y=0.0f;
		
	}

	public ConstructorOverloading(float x) {
		this.x = x;
		
	}
	
	
	public ConstructorOverloading(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	
}
