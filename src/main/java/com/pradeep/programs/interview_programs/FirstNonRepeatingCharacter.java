package com.pradeep.programs.interview_programs;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String inputStr = "teeter";
		for (char c : inputStr.toCharArray()) {
			if (inputStr.indexOf(c) == inputStr.lastIndexOf(c)) {
				System.out.println("First non-repeating character is: " + c);
				break;
			}
		}
	}
}
