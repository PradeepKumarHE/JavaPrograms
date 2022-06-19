package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ConvertListToMap {
	public static void main(String[] args) {
		
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1, "p1", 10.0));
		itemList.add(new Item(2, "p2", 5.0));
		itemList.add(new Item(3, "p3", 	10.0));
		itemList.add(new Item(4, "p1", 4.0));
		itemList.add(new Item(5, "p4", 140.0));
		itemList.add(new Item(6, "p2", 130.0));
		
		Map<Integer, String> map = itemList.stream().collect(Collectors.toMap(i -> i.getItemId(), i -> i.getItemName()));
		System.out.println(map);

	}
	
}
