package com.Day2;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		
		//For integer array
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		char ch[]= {'a','e','i','o','u'};
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		System.out.println(" ");
		String s1[]= {"Java","Programming","Learning"};
		
		//for string array
		
		for(String s:s1)
		{
			System.out.println(s+ " ");
		}
	}

}
