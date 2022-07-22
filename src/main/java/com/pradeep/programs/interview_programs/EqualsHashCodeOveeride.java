package com.pradeep.programs.interview_programs;

class Employee {
	int employeeId;
	String employeeName;
	Employee(int employeeId,String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Employee employee = (Employee) obj;
		return (employee.employeeName.equals(this.employeeName) && employee.employeeId == this.employeeId);
	}
	@Override
	public int hashCode() {
		return this.employeeId;
	}

}

public class EqualsHashCodeOveeride {
	public static void main(String[] args) {

	}

}
