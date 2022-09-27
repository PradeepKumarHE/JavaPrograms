package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
class Employee {
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String department;
	private Integer yearOfJoining;
	private Double salary;
}

public class EmployeeAppJava8 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(111, "Smitha", 32, "FEMALE", "HR", 2011, 25000.0));
		empList.add(new Employee(122, "Nandees", 25, "MALE", "SALES", 2015, 13500.0));
		empList.add(new Employee(133, "Pramod", 29, "MALE", "INFRA", 2012, 18000.0));
		empList.add(new Employee(144, "SUNI", 28, "MALE", "PD", 2014, 32500.0));
		empList.add(new Employee(155, "Aishu", 27, "FEMALE", "HR", 2013, 22700.0));
		empList.add(new Employee(166, "DT", 43, "MALE", "ST", 2016, 10500.0));
		empList.add(new Employee(177, "REVANNA", 35, "MALE", "ACCOUNTS", 2010, 27000.0));
		empList.add(new Employee(188, "PAVI", 31, "MALE", "PD", 2015, 34500.0));
		empList.add(new Employee(199, "Ranjitha", 24, "FEMALE", "SALES", 2016, 11500.0));
		empList.add(new Employee(200, "Sharan", 38, "MALE", "ST", 2015, 11000.0));
		empList.add(new Employee(211, "Nandini", 27, "FEMALE", "INFRA", 2014, 15700.0));
		empList.add(new Employee(222, "Rajesh", 25, "MALE", "PD", 2016, 28200.0));
		empList.add(new Employee(233, "Shruthi", 27, "FEMALE", "ACCOUNTS", 2013, 21300.0));
		empList.add(new Employee(244, "Arun", 24, "MALE", "SALES", 2017, 10700.0));
		empList.add(new Employee(255, "Nagendra", 23, "MALE", "INFRA", 2018, 12700.0));
		empList.add(new Employee(266, "Chinnu", 26, "FEMALE", "PD", 2015, 28900.0));
		empList.add(new Employee(277, "Madappa", 31, "MALE", "PD", 2012, 35700.0));

		// displayGenderwiseCount(empList);
		// displayDepartmentNames(empList);
		// displayAverageAgeMaleAndFemaleEmployees(empList);
		// displayHigestPaidEmployee(empList);
		// displayAfter2015Joinees(empList);
		// displayEmloyeeCountByDepartment(empList);
		// displayAvgSalByDepartment(empList);
		// displayYoungEmpInProductDevelopmentDept(empList);
		// displayMaleAndFemaleEmployeeFromSalesDept(empList);
		// displayAvgSalByGender(empList);
		// displayEmployeesByDept(empList);
		//displaySumAndAvgSal(empList);
		//displayEmployeesByAge25(empList);
		displayOldestEmployeeDetails(empList);

	}

	private static void displayOldestEmployeeDetails(List<Employee> empList) {
		Optional<Employee> optionalEmployee =empList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println("Emp details :: ");
		Employee employee=optionalEmployee.get();
		System.out.println("Name :: "+employee.getName());
		System.out.println("Age :: "+employee.getAge());
		System.out.println("Department :: "+employee.getDepartment());
	}

	private static void displayEmployeesByAge25(List<Employee> empList) {
		Map<Boolean, List<Employee>> employeesByAge25=empList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
		employeesByAge25.entrySet().forEach(entry -> {
			System.out.println("-----------------------------");
			if(entry.getKey()) {
				System.out.println("Employees whose age older than 25");
			}else {
				System.out.println("Employees whose age  younger or age is equal to 25");
			}
			System.out.println("-----------------------------");
			entry.getValue().stream().map(Employee::getName).forEach(System.out::println);
		});
		
		
	}

	private static void displaySumAndAvgSal(List<Employee> empList) {
		DoubleSummaryStatistics salaryStatics = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Total Sal :: "+salaryStatics.getSum());
		System.out.println("Avg Sal :: "+salaryStatics.getAverage());
	}

	private static void displayEmployeesByDept(List<Employee> empList) {
		Map<String, List<Employee>> employeesByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		employeesByDept.entrySet().forEach(entry -> {
			System.out.println("-----------------------------------------------");
			System.out.println("Department :: " + entry.getKey());
			entry.getValue().stream().map(Employee::getName).forEach(System.out::println);

		});
	}

	private static void displayAvgSalByGender(List<Employee> empList) {
		Map<String, Double> avgsal = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		avgsal.entrySet().forEach(entry -> {
			System.out.println("Gender :: " + entry.getKey() + "             Sal :: " + entry.getValue());
		});
	}

	private static void displayMaleAndFemaleEmployeeFromSalesDept(List<Employee> empList) {
		Map<String, Long> empCountBasedOnDept = empList.stream().filter(e -> e.getDepartment().equals("SALES")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		empCountBasedOnDept.entrySet().forEach(entry -> {
			System.out.println("Department :: " + entry.getKey() + "             Count :: " + entry.getValue());
		});

	}

	private static void displayMostSeniorEmployee(List<Employee> empList) {
		Optional<Employee> optionalEmployee = empList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println(optionalEmployee.get().getName());
	}

	private static void displayYoungEmpInProductDevelopmentDept(List<Employee> empList) {

		Optional<Employee> optionalEmployee = empList.stream()
				.filter(e -> e.getDepartment().equals("PD") && e.getGender().equals("MALE"))
				.min(Comparator.comparing(Employee::getAge));
		System.out.println(optionalEmployee.get().getName());
	}

	private static void displayAvgSalByDepartment(List<Employee> empList) {
		Map<String, Double> avgsal = empList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		avgsal.entrySet().forEach(entry -> {
			System.out.println("Department :: " + entry.getKey() + "             AvgSal :: " + entry.getValue());
		});

	}

	private static void displayEmloyeeCountByDepartment(List<Employee> empList) {
		Map<String, Long> empCountBasedOnDept = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		empCountBasedOnDept.entrySet().forEach(entry -> {
			System.out.println("Department :: " + entry.getKey() + "             Count :: " + entry.getValue());
		});
	}

	private static void displayAfter2015Joinees(List<Employee> empList) {
		empList.stream().filter(o -> o.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

	}

	private static void displayHigestPaidEmployee(List<Employee> empList) {
		// Optional<Employee>
		// optionalEmployee=empList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> optionalEmployee = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(optionalEmployee.get());

	}

	private static void displayAverageAgeMaleAndFemaleEmployees(List<Employee> empList) {
		Map<String, Double> avgAge = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);

	}

	private static void displayDepartmentNames(List<Employee> empList) {
		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

	}

	private static void displayGenderwiseCount(List<Employee> empList) {
		Map<String, Long> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
	}

}
