package com.pradeep.programs.java8programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class EmployeeWitDepartment {
	private Integer empId;
	private String empName;
	private Integer departmentId;
	private Boolean active;
	private Double salary;
}
public class Java8OperationsOnEmployeeObject {

	public static void main(String[] args) {
		
		List<EmployeeWitDepartment> empList = new ArrayList<EmployeeWitDepartment>();
		empList.add(new EmployeeWitDepartment(101, "Pradeep", 101,true,2000.0));
		empList.add(new EmployeeWitDepartment(102, "Nandi", 101,true,5000.0));
		empList.add(new EmployeeWitDepartment(103, "Pramod", 102,false,6000.0));
		empList.add(new EmployeeWitDepartment(104, "Rajesh", 102,false,4000.0));
		empList.add(new EmployeeWitDepartment(105, "Saleem", 103,true,3500.0));
		empList.add(new EmployeeWitDepartment(106, "Nandini", 103,false,3500.0));
		empList.add(new EmployeeWitDepartment(107, "Aishu", 104,true,3500.0));
		
		
		/*Map<Integer, List<EmployeeWitDepartment>> empBasedOnDepartment=empList.stream().collect(Collectors.groupingBy(EmployeeWitDepartment::getDepartmentId,Collectors.toList()));
		empBasedOnDepartment.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" ------ "+entry.getValue());
		});*/
		
		/*Map<Integer, Long> empCountBasedOnDept=empList.stream().collect(Collectors.groupingBy(EmployeeWitDepartment::getDepartmentId,Collectors.counting()));
		empCountBasedOnDept.entrySet().forEach(entry->{
			System.out.println("Department Id :: "+entry.getKey() +" Count :: "+entry.getValue());
		});*/
		
		//Long activeEmployeesCount=empList.stream().filter(o->o.getActive()).count();
		
		//Optional<EmployeeWitDepartment> optionalEmployee=empList.stream().max(Comparator.comparing(EmployeeWitDepartment::getSalary));
		// Optional<EmployeeWitDepartment> optionalEmployee2=empList.stream().min(Comparator.comparing(EmployeeWitDepartment::getSalary));
		
		Map<Integer, Optional<EmployeeWitDepartment>> topSalaryDeptWise=empList.stream().collect(Collectors.groupingBy(EmployeeWitDepartment::getDepartmentId,
			Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(EmployeeWitDepartment::getSalary)))
		));
		
		topSalaryDeptWise.entrySet().forEach(entry->{
			System.out.println("Department Id :: "+entry.getKey() +" Count :: "+entry.getValue());
		});

	}

}
