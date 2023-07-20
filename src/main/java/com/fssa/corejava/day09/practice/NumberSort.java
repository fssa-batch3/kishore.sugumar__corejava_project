package com.fssa.corejava.day09.practice;

import java.util.Arrays;

public class NumberSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 9, 45, 12, 1,};
		
		Arrays.sort(arr);
		
		Arrays.stream(arr).forEach(System.out::println);
	}

}
