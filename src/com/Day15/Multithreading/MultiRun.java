//Program to demonstrate Creating thread  using Runnable Interface
//We can inherit multiple times.
package com.Day15.Multithreading;

public class MultiRun implements Runnable {
	public void run() {
	try {
		System.out.println("thread"+ Thread.currentThread().getId()+"is running");

	}
	catch(Exception e) {
		System.err.println("Exception is caught");
	}

}
}