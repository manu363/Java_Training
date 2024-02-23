package com.Day9.abstraction;

public class square extends shape {
	private float side;

	public square() {
		side = 69.6f;
	}

	public square(float side) {
		this.side = side;
	}
	void calArea()
	{
		area = side * side;
	}
	

}
