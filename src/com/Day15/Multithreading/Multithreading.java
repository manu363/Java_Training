package com.Day15.Multithreading;
// thread by extending class
///We cannot inherit multiple times coz Multiple Inheritance is not supported by java.
public class Multithreading extends Thread{
	
	public void run() {
		try {
			System.out.println("thread"+ Thread.currentThread()+"is running");
		}
		catch(Exception e) {
			System.err.println("Exception caught"+e.getMessage());
		}
	}

}

//Multithreading in Java is a process of executing multiple threads simultaneously.
//
//A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
//
//Java Multithreading is mostly used in games, animation, etc.
//
//Advantages of Java Multithreading: 
//1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
//
//2) You can perform many operations together, so it saves time.
//
//3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

//1) Process-based Multitasking (Multiprocessing)
//Each process has an address in memory. In other words, each process allocates a separate memory area.
//A process is heavyweight.
//Cost of communication between the process is high.
//Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
//
//2) Thread-based Multitasking (Multithreading)
//Threads share the same address space.
//A thread is lightweight.
//Cost of communication between the thread is low.


