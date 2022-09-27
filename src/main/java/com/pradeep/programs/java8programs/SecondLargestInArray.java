package com.pradeep.programs.java8programs;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestInArray {

	public static void main(String[] args) {

		Integer [] arr= {12,16,45,11,18,22,19,20,45};
		
		//Stream<Integer> distinctNumberStream=Arrays.stream(arr).distinct();
		//distinctNumberStream.forEach(n -> System.out.println(n));
		
		//Stream<Integer> distinctNumberReverseSortStream=Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder());
		//distinctNumberReverseSortStream.forEach(System.out::println);
		
		//Stream<Integer> distinctNumberReverseSortStreamSkip1=Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1);
		//distinctNumberReverseSortStreamSkip1.forEach(System.out::println);
		
		Integer result=Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(result);
		
	}

}
