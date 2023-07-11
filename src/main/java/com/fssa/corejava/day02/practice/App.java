package com.fssa.corejava.day02.practice;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName("Kishore");
		user.setId(1);
		user.setEmail("kishore@gmail.com");
		user.setPassword("K1i6s0h7");
		
		Logger.debug("Message:debug");
		Logger.info("Message:info");
		Logger.error("Message:error");
		Logger.debug(106);
		Logger.info(100);
		Logger.error(404);
	}

}
