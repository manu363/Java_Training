package com.Day9.abstraction;

public abstract class shape {
	protected float area;
	abstract void calArea();
	void show() {
		System.out.println("area is :"+area);
	}


}
