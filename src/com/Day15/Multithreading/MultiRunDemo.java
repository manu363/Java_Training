package com.Day15.Multithreading;

public class MultiRunDemo {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++)
		{
			//MultiRun obj=new MultiRun();
			Thread obj=new Thread(new MultiRun());
			obj.start();
		}
	}

}
