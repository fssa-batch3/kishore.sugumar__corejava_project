package com.fssa.corejava.day02.solved;

public class ThisPerson {
	private String thisName; // Private data member

	public String getName() { // Public getter method
		return thisName;
	}

	public void setName(String name) { // Public setter method
		// name = name; Wrong way to use refer the attribute of class
		this.thisName = name; // this Keyword used for referring current instance
	}
}
