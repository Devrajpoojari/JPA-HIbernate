package com.collection.mapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId; // primary key

	private String employeeName;

	private float salary;

	@ElementCollection // @Embeded 
	private List<Address> addList;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public List<Address> getAddList() {
		return addList;
	}

	public void setAddList(List<Address> addList) {
		this.addList = addList;
	}

	public Employee(int employeeId, String employeeName, float salary, List<Address> addList) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.addList = addList;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", addList=" + addList + "]";
	}

}
