package com.fssa.corejava.day06.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionFrequncy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> list = new ArrayList<>();
		list.add("cse");
		list.add("cse");
		list.add("eee");
		int cnt = Collections.frequency(list, "cse");
		System.out.println(cnt);
	}

}
