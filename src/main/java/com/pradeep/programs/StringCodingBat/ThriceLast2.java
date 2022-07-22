package com.pradeep.programs.StringCodingBat;

public class ThriceLast2 {
	public static void main(String[] args) {
		/*
		 * extraEnd("Hello") → "lololo"
			extraEnd("ab") → "ababab"
			extraEnd("Hi") → "HiHiHi"
		  */
		 String word="ab";
		String result=extraEnd(word);
		System.out.println(result);
	}
	public static String extraEnd(String word) {
		String result=word.substring(word.length()-2);
		return result+result+result;
	}
}
