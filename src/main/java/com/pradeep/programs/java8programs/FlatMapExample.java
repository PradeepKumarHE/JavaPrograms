package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class Developer {
	private Integer id;
	private String name;
	private Set<String> book;

	public void addBook(String book) {
		if (this.book == null) {
			this.book = new HashSet<>();
		}
		this.book.add(book);
	}
}

public class FlatMapExample {
	public static void main(String[] args) {
		Developer o1 = new Developer();
		o1.setName("mkyong");
		o1.addBook("Java 8 in Action");
		o1.addBook("Spring Boot in Action");
		o1.addBook("Effective Java (3nd Edition)");

		Developer o2 = new Developer();
		o2.setName("zilap");
		o2.addBook("Learning Python, 5th Edition");
		o2.addBook("Effective Java (3nd Edition)");

		List<Developer> list = new ArrayList<>();
		list.add(o1);
		list.add(o2);

		Set<String> collect = list.stream().map(x -> x.getBook()) 
				.flatMap(x -> x.stream()) 
				.filter(x -> !x.toLowerCase().contains("python")) 
				.collect(Collectors.toSet()); 

		collect.forEach(System.out::println);

	}

}
