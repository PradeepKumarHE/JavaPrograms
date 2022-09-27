package com.pradeep.programs.java8programs;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,5,6,8,23,35,36,77,78,99);
		
		//list.stream().limit(7).forEach(n -> System.out.println(n));
		list.stream().skip(6).forEach(n -> System.out.println(n));

	}

}
