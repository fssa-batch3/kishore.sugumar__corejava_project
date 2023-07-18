package com.fssa.corejava.day05.practice;

public class Student {
	String name;
	int id;
	Department department;
	
	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public void printStudentDetails() {
		System.out.println("Student name: " + this.name+ " Student id: " + this.id);
		this.department.printDepartmentDetails();
	}
}
