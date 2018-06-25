package chapterOne;

import java.util.Arrays;

public class ChapterOne {
	//Question 1.1: isUnique
	public static boolean isUnique(String check){
		boolean[] characters = new boolean[255];
		Arrays.fill(characters, Boolean.FALSE);
		for(int i = 0; i < check.length(); i++) {
			if(characters[(int)check.charAt(i)])
				return false;
			else {
				characters[(int)check.charAt(i)] = true;
			}
		}
		return true;
	}
	//Question 1.2: check permutations
	public static boolean checkPermuatation(String first, String second) {
		if(first.length() != second.length())
			return false;
		int[]numChar1 = new int[255];
		int[]numChar2 = new int[255];
		Arrays.fill(numChar1, 0);
		Arrays.fill(numChar2, 0);
		for(int i = 0; i < first.length(); i++) {
			numChar1[(int)first.charAt(i)]++;
			numChar2[(int)second.charAt(i)]++;
		}
		return Arrays.equals(numChar1, numChar2);
	}
}
