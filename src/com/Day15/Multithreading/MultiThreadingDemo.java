package com.Day15.Multithreading;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6; // number of threads
		for(int i=0;i<n;i++)
		{
			Multithreading obj=new Multithreading();
			obj.start();
		}
		

	}

}
