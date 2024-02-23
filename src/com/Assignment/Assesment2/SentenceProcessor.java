package com.Assesment.Assesment2;

public class SentenceProcessor {
	
	 public String arrangeAlphabetically(String sentence) {
	        if (isValidInput(sentence)) {
	            String[] words = sentence.split("\\s+");

	            StringBuilder result = new StringBuilder();
	            for (String word : words) {
	                char[] letters = word.toCharArray();
	                java.util.Arrays.sort(letters);
	                result.append(new String(letters)).append(" ");
	            }

	            return result.toString().trim();
	        } else {
	            return sentence + " is an invalid input";
	        }
	    }

	    private boolean isValidInput(String sentence) {
	        return sentence.matches("^[a-z\\s]+$");
	    }

}
