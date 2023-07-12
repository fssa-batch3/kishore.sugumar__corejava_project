package com.fssa.corejava.day03.misc;

import java.time.LocalDateTime;

public class Logger {

	// TODO Auto-generated method stub
	public static void info(String msg) {
		System.out.println(msg);
	}

	public static void debug(String msg) {
		LocalDateTime time = LocalDateTime.now();
		time.toString();
		System.out.println("Timestamp: " + time + " " + msg);
	}
}
