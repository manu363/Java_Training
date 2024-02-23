package com.Day2;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char x='d';
		switch(x)
		{
		case 'L':
		case 'l':
			System.out.println(x+ " Is a Letter");
			break;
		
		case 'd':
		case 'D':
			System.out.println(x+ " Is a digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x+ " Is a White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x+ " Is a Special Symbol");
			break;
		default:
			System.out.println(x+ " Is other than letter, digit,whiyte space,special symbol");
			break;
			
		}		
	}

}
