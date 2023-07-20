package com.fssa.corejava.day09.practice;

import java.time.LocalDate;

public class PriorityTask {
	private int id;
	private String name;
	private LocalDate deadline;
	private int priority; 
	
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
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public PriorityTask(int id, String name, LocalDate deadline, int priority) {
		super();
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}
}
