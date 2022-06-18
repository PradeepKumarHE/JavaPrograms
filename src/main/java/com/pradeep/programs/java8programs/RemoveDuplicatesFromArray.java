package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int [] arr 	= {2,4,6,1,9,8,3,6};
		ArrayList<Integer> numbersList = new ArrayList<>();
		for (int i : arr) {
			numbersList.add(i);
		}
		List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
		System.out.println(listWithoutDuplicates);
	}
}
