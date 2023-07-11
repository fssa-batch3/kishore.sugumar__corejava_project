package com.fssa.corejava.day02.solved;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Person
		Person person = new Person();
		person.setName("John"); // Setting the name using the setter method
		String name = person.getName(); // Accessing the name using the getter method
		System.out.println(name); // Output: John

		// this.Person
		ThisPerson thisPerson = new ThisPerson();
		thisPerson.setName("John");      // Setting the name using the setter method
		String thisName = thisPerson.getName();  // Accessing the name using the getter method
		System.out.println(thisName);    // Output: John
		
		// Calculator
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));           // Output: 5
		System.out.println(calc.add(2.5, 3.7));       // Output: 6.2
		System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld
	}

}
