package com.pradeep.programs.interview_programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccuranceInString {
	static void characterCount(String inputString) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "Pradeep";
        characterCount(str);
	}
}