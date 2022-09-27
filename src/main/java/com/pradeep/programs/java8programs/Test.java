package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
class Customer {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
}

public class Test {
	public static void main(String args[]) {
		List<Customer> employees = new ArrayList<Customer>();
		employees.add(new Customer(6, "Yash", "Chopra", 25));
		employees.add(new Customer(2, "Aman", "Sharma", 28));
		employees.add(new Customer(3, "Aakash", "Yaadav", 52));
		employees.add(new Customer(5, "David", "Kameron", 19));
		employees.add(new Customer(4, "James", "Hedge", 72));
		employees.add(new Customer(8, "Balaji", "Subbu", 88));
		employees.add(new Customer(7, "Karan", "Johar", 59));
		employees.add(new Customer(1, "Lokesh", "Gupta", 32));
		employees.add(new Customer(9, "Vishu", "Bissi", 33));
		employees.add(new Customer(10, "Lokesh", "Ramachandran", 60));
		// employees.sort(Comparator.comparing(e -> e.getFirstName()));
		Comparator<Customer> comparator = Comparator.comparing(e -> e.getFirstName());
		employees.sort(comparator);
		System.out.println(employees);
	}
}
