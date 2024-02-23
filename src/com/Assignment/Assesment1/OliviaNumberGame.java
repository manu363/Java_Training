package com.Assesment.Assesment1;
import java.util.Scanner;

public class OliviaNumberGame {
	   private int num1;
	    private int num2;
	    private int num3;

	    public void setNumbers(int num1, int num2, int num3) {
	        this.num1 = num1;
	        this.num2 = num2;
	        this.num3 = num3;
	    }

	    public int findSmallest() {
	        return (num1 <= num2) ? ((num1 <= num3) ? num1 : num3) : ((num2 <= num3) ? num2 : num3);
	    }

	    public boolean areAllEqual() {
	        return num1 == num2 && num2 == num3;
	    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        OliviaNumberGame numberGame = new OliviaNumberGame();

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int num3 = scanner.nextInt();

        numberGame.setNumbers(num1, num2, num3);

        if (numberGame.areAllEqual()) {
            System.out.println("All numbers are equal");
        } else {
            int smallestNumber = numberGame.findSmallest();
            System.out.println("The smallest number is: " + smallestNumber);}

		

	}

}
