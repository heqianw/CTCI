package chapterOne;

import java.util.Arrays;

public class ChapterOne {
	//Question 1.1: isUnique
	public static boolean isUnique(String check){
		boolean[] characters = new boolean[256];
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
		int[]numChar1 = new int[256];
		int[]numChar2 = new int[256];
		Arrays.fill(numChar1, 0);
		Arrays.fill(numChar2, 0);
		for(int i = 0; i < first.length(); i++) {
			numChar1[(int)first.charAt(i)]++;
			numChar2[(int)second.charAt(i)]++;
		}
		return Arrays.equals(numChar1, numChar2);
	}
	//Question 1.3: URLify
	public static String doURLify(char[] modify, int trueLength) {
		int spaces = 0;
		for(int i = 0; i < trueLength; i++) {
			if(modify[i] == ' ')
				spaces++;
		}
		int index = trueLength + spaces*2;
		for (int i = trueLength - 1; i >= 0; i--) {
			if(modify[i] == ' ') {
				modify[index - 1] = '0';
				modify[index - 2] = '2';
				modify[index - 3] = '%';
				index = index - 3;
			}
			else {
				modify[index - 1] = modify[i];
				index--;
			}
		}
		String result = new String(modify);
		return result;
	}
}
