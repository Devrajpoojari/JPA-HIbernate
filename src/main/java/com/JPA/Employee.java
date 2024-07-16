package com.JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import antlr.collections.List;


public class Employee {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int employeeId; // primary key

	private String employeeName;

	private float salary;

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

	public Employee(int employeeId, String employeeName, float salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

}
