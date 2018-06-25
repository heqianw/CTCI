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
}
