package com.Assesment.Assesment2;
import java.util.Scanner;
public class AlphabeticalOrderDemo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the sentence");
	        String sentence = scanner.nextLine();

	        SentenceProcessor sentenceProcessor = new SentenceProcessor();
	        String result = sentenceProcessor.arrangeAlphabetically(sentence);

	        System.out.println(result);
	}

}
