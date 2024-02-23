package com.Day9.abstraction;

public class rectangle extends shape{
	private float width,height;

	public rectangle() {
	width = 77.5f;
	height = 89.5f;
	}

	public rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}
	void calArea()
	{
		area = width * height;
	}
	
	
	

}
