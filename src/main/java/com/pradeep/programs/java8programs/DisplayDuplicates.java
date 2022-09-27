package com.pradeep.programs.java8programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisplayDuplicates {

	public static void main(String[] args) {
		
		Integer [] arr 	= {2,4,6,1,9,8,3,6,2};
		List<Integer> list=Arrays.asList(arr);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(x->!set.add(x)).forEach(n -> System.out.println(n));

	}

}
