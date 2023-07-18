package com.fssa.corejava.day06.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class RemoveDuplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
	     // Create a HashSet to store unique city names
        HashSet<String> uniqueCitiesSet = new HashSet<>(cityList);

        // Create a new ArrayList to store the unique city names
        ArrayList<String> uniqueCityList = new ArrayList<>(uniqueCitiesSet);

        // Print the unique city names
        System.out.println("Unique Cities: " + uniqueCityList);
	}

}
