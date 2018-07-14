package chapter1;

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
	
	//Question 1.4: Palindrome Permutation
	public static boolean isPalindromePerm(String toCheck) {
		boolean[] listChar = new boolean[256];
		int counter = 0;
		Arrays.fill(listChar, false);
		for(int i = 0; i < toCheck.length(); i++) {
			if(toCheck.charAt(i) == ' ') {
				continue;
			}
			else if(listChar[(int)toCheck.charAt(i)] == true) {
				listChar[(int)toCheck.charAt(i)] = false;
				counter--;
			}
			else {
				listChar[(int)toCheck.charAt(i)] = true;
				counter++;
			}
		}
		if(counter > 1)
			return false;
		return true;
	}
	
	//Question 1.5: One Away
	public static boolean oneAway(String one, String two) {
		if(one.length()-two.length() > 1 || one.length()-two.length() < -1)
			return false;
		int index = 0; 
		boolean oneOff = false; 
		if(one.length() > two.length()) {
			for(int i = 0; i < two.length(); i++) {
				if(one.charAt(index) != two.charAt(i)) {
					if(!oneOff && one.charAt(index + 1) == two.charAt(i)) {
						oneOff = true;
						index++;
					}
					else {
						return false;
					}
				}
				index++;
			}
		}
		else if(one.length() == two.length()) {
			for(int i = 0; i < one.length(); i++) {
				if(one.charAt(i) != two.charAt(i)) {
					if(!oneOff) {
						oneOff = true;
					}
					else {
						return false;
					}
				}
			}
		}
		else {
			for(int i = 0; i < one.length(); i++) {
				if(one.charAt(i) != two.charAt(index)) {
					if(!oneOff && one.charAt(i) == two.charAt(index + 1)) {
						oneOff = true;
						index++;
					}
					else {
						return false;
					}
				}
				index++;
			}
		}
		return true;
	}
	
	//Question 1.6: String Compression
	public static String stringCompression(String toCompress) {
		int counter = 1;
		String compressed = "";
		for(int i = 0; i < toCompress.length(); i++) {
			if(i == toCompress.length() - 1)
				if(counter == 1)
					return compressed + toCompress.charAt(i);
				else
					return compressed + toCompress.charAt(i) + counter;
			if(toCompress.charAt(i) == toCompress.charAt(i+1)) {
				counter++;
			}
			else {
				if(counter == 1) {
					compressed = compressed + toCompress.charAt(i);
				}
				else {
					compressed = compressed + toCompress.charAt(i) + counter;
					counter = 1;
				}
			}
		}
		return compressed;
	}
	
	//Question 1.7: Matrix Rotation
	public static int[][] rotateMatrix(int[][] toRotate) {
		int[][] rotated = new int[toRotate[0].length][toRotate.length];
		for(int i = 0; i < toRotate.length; i++) {
			for (int j = 0; j < toRotate[0].length; j++) {
				rotated[j][rotated[0].length - 1 - i] = toRotate[i][j];
			}
		}
		return rotated;
	}
	
	//Quesiton 1.8: brute force method
	public static int[][] zeroMatrix(int[][] fresh){
		boolean[] rows = new boolean[fresh.length];
		boolean[] columns = new boolean[fresh[0].length];
		
		for(int i = 0; i < fresh.length; i++) {
			for(int j = 0; j < fresh[0].length; j++) {
				if(fresh[i][j] == 0) {
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
		for(int i = 0; i < fresh.length; i++) {
			for(int j = 0; j < fresh[0].length; j++) {
				if (rows[i] || columns[j]){
					fresh[i][j] = 0;
				}
			}
		}
		return fresh;
	}
	
	//Question 1.9: 
	//will do when i write isSubstring
	
	
	
	
	
}
