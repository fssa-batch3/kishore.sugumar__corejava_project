package com.fssa.corejava.day09.practice;

import java.time.LocalDate;

class Task {
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
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	public Task(int id, String name, LocalDate deadline) {
		super();
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	private int id;
	private String name;
	private LocalDate deadline;
}
