package com.learning.core.Day3Session2.maps9;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String department;
	private String designation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(int id, String name, String department, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name, department, designation);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		return id == emp.id && Objects.equals(name, emp.name) && Objects.equals(department, emp.department)
				&& Objects.equals(designation, emp.designation);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}

}
