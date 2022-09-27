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
class Author {
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
		Author a1 = new Author();
		a1.setName("Pradeep");
		a1.addBook("Java");
		a1.addBook("Java 8");
		a1.addBook("Spring boot");

		Author a2 = new Author();
		a2.setName("Namratha");
		a2.addBook("Learning Python, 5th Edition");
		a2.addBook("VueJs");

		List<Author> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);

		Set<String> collect = list.stream().map(x -> x.getBook()).flatMap(x -> x.stream()).filter(x -> !x.toLowerCase().contains("python")) 
				.collect(Collectors.toSet()); 

		collect.forEach(System.out::println);

	}

}
