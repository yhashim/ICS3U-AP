package com.bayviewglen.daytwo;

public class ExampleFive {

	public static void main(String[] args) {
		String[] words = {"Apple", "Pear", "Pear", "Almond"};
		
		int maxIndex = getMaxWordIndexFirstOccurence(words);
		
		System.out.println("The word with the largest value is: " + words[maxIndex] + " at index " + maxIndex);
		
		maxIndex = getMaxWordIndexLastOccurence(words);
		
		System.out.println("The word with the largest value is: " + words[maxIndex] + " at index " + maxIndex);
	}

	public static int getMaxWordIndexFirstOccurence(String[] words) {
		int maxIndex = 0;
		
		for (int i = 1; i < words.length; i++){
			if (words[i].compareTo(words[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
	
	public static int getMaxWordIndexLastOccurence(String[] words) {
		int maxIndex = 0;
		
		for (int i = 1; i < words.length; i++){
			if (words[i].compareTo(words[maxIndex]) >= 0){
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
}
