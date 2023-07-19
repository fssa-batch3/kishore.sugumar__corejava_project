package com.fssa.corejava.day07.practice;

import java.time.LocalDate;
import java.util.Objects;

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

	private int id;
	private String name;
	private LocalDate deadline;
	
	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	

    // Getters and setters (not required for this example)

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deadline);
    }
	
}