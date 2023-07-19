package com.fssa.corejava.day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(2); // Duplicate entry
		numbersList.add(4);
		numbersList.add(1); // Duplicate entry

		HashSet<Integer> uniqueNumbers = new HashSet<>(numbersList);

		System.out.println("Unique values:");
		for (Integer number : uniqueNumbers) {
			System.out.println(number);
		}
	}
}
