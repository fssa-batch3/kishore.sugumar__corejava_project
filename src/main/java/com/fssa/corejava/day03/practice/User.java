package com.fssa.corejava.day03.practice;

public class User {
	String name;
	int id;
	String password;
	String email;
	
	public User() {
		this.id=1;
		this.email="kishore@gmail.com";
		this.password="K1i6s0h7";
		this.name="Kishore";
	}
	public User(String newEmail, String newPassword, String newName) {
		this.email=newEmail;
		this.password=newPassword;
		this.name=newName;
	}
}
