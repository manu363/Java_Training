package com.Assesment.Assesment2;
import java.util.Scanner;
public class WordSearchDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word");
        String word = scanner.nextLine();

        WordSearchProcessor wordSearchProcessor = new WordSearchProcessor();
        String result = wordSearchProcessor.searchWord(sentence, word);

        System.out.println(result);

	}

}
