package com.fssa.corejava.day06.practice;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();

		// Adding tasks to the ArrayList
		taskList.add(new Task("Task 1", 1));
		taskList.add(new Task("Task 2", 3));
		taskList.add(new Task("Task 3", 2));

		// Printing the task details
		for (Task task : taskList) {
			System.out.println(task);
		}

		FindTaskByName find = new FindTaskByName();
		boolean result = find.findTaskByName("Task 4", taskList);
		System.out.print(result);
		
	}
}
