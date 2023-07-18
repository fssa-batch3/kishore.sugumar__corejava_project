package com.fssa.corejava.day05.practice;

public class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName, int depId) {
		this.deptName = deptName;
		this.deptId = depId;
	}

	public void printDepartmentDetails() {
		System.out.println("Department name: " + this.deptName+" Department ID: "+this.deptId);
	}
}
