package com.pradeep.programs.StringCodingBat;

public class MakeOutWord {
	public static void main(String[] args) {
		/*
		 	makeOutWord("<<>>", "Yay") → "<<Yay>>"
			makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
			makeOutWord("[[]]", "word") → "[[word]]"
		 */
		String out="[[]]"; String word="Yay";
		String result=makeOutWord(out,word);
		System.out.println(result);
	}
	
	public static String makeOutWord(String out, String word) {
		String s1=out.substring(0,2);
		String s2=out.substring(2);
		return s1+word+s2;
	}
}
