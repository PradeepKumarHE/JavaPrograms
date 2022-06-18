package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Item {
	private Integer itemId;
	private String itemName;
	private Double itemPrice;
}

public class SumOfProductPrice {
	public static void main(String[] args) {

		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1, "p1", 10.0));
		itemList.add(new Item(2, "p2", 5.0));
		itemList.add(new Item(3, "p3", 10.0));
		itemList.add(new Item(4, "p1", 4.0));
		itemList.add(new Item(5, "p4", 140.0));
		itemList.add(new Item(6, "p2", 130.0));

		// Sorting by ItemName
		//itemList.sort(Comparator.comparing(Item::getItemName));
		//System.out.println(itemList);
		System.out.println(sum(itemList));
	}

	public static Double sum(List<Item> itemList) {
		return itemList.stream().filter(o -> o.getItemName().equals("p1")).mapToDouble(o->o.getItemPrice()).sum();
	}
}