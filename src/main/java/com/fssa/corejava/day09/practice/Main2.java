package com.fssa.corejava.day09.practice;

import java.time.LocalDate;
import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		List<PriorityTask> taskList = new ArrayList<>();

		taskList.add(new PriorityTask(1, "Workout", LocalDate.of(2023, 12, 7), 2));
		taskList.add(new PriorityTask(2, "Read", LocalDate.of(2023, 7, 25), 1));
		taskList.add(new PriorityTask(3, "Cook", LocalDate.of(2023, 9, 30), 1));
		taskList.add(new PriorityTask(4, "Jump Rope", LocalDate.of(2023, 12, 7), 0));

		Collections.sort(taskList,
				Comparator.comparing(PriorityTask::getDeadline).thenComparing(PriorityTask::getPriority));

		for (PriorityTask tasks : taskList) {
			System.out.println(tasks);
		}
	}
}
