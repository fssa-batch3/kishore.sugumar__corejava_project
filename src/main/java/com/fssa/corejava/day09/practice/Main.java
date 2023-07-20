package com.fssa.corejava.day09.practice;

import java.time.LocalDate;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1 = new Task(3, "Task 3", LocalDate.parse("2022-10-22"));
		Task task2 = new Task(1, "Task 1", LocalDate.parse("2022-10-01"));
		Task task3 = new Task(2, "Task 2", LocalDate.parse("2022-10-07"));
		Task task4 = new Task(4, "Task 4", LocalDate.parse("2022-10-22"));

		List<Task> list = new ArrayList<Task>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		
		Collections.sort(list, Comparator.comparing(Task::getDeadline));
		
		for(Task task : list) {
		    System.out.println("Deadline based task [id=" + task.getId() + ", name=" + task.getName() + ", deadline=" + task.getDeadline() + "]");
		}
		
	}

}
