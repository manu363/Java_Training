package com.Assesment.Assesment2;

public class WordSearchProcessor {
	
	public String searchWord(String sentence, String word) {
        if (sentence.contains(word)) {
            return word + " is present in the sentence";
        } else {
            return word + " is not present in the sentence";
        }

	}
}

