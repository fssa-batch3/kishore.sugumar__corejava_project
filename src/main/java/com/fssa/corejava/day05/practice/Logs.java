package com.fssa.corejava.day05.practice;

public class Logs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep1 = new Department("Mechanical", 001);

		// Creating a maruti car
		Student std1 = new Student("A",1, dep1);

		std1.printStudentDetails();

		// We need make the engine before making a car
		Department dep2 = new Department("Civil", 002);

		// Creating a benz car
		Student std2 = new Student("B",2, dep2);

		std2.printStudentDetails();
	}

}
