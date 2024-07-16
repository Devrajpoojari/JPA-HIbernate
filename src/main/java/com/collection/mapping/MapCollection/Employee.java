package com.collection.mapping.MapCollection;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
	private Map<Integer, Address> addMap;  // has a relatioship or Composition 

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

	public Map<Integer, Address> getAddMap() {
		return addMap;
	}

	public void setAddMap(Map<Integer, Address> addMap) {
		this.addMap = addMap;
	}

	public Employee(int employeeId, String employeeName, float salary, Map<Integer, Address> addMap) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.addMap = addMap;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", addMap=" + addMap + "]";
	}

}
