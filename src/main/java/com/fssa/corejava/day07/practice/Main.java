package com.fssa.corejava.day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task(001, "Task 1", LocalDate.parse("2023-07-19")));
        tasksList.add(new Task(002, "Task 2", LocalDate.parse("2023-07-20")));
        tasksList.add(new Task(003, "Task 1", LocalDate.parse("2023-07-19"))); // Duplicate task
        tasksList.add(new Task(004, "Task 3", LocalDate.parse("2023-07-21")));
        tasksList.add(new Task(005, "Task 2", LocalDate.parse("2023-07-20"))); // Duplicate task
        
        HashSet<Task> uniqueTasks = new HashSet<>(tasksList);

        System.out.println("Unique tasks:");
        for (Task task : uniqueTasks) {
            System.out.println(task.getId() + "-" + task.getName() + " - " + task.getDeadline());
        }
    }
}

