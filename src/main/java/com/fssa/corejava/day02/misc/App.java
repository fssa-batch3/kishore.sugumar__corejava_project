package com.fssa.corejava.day02.misc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academy aca = new Academy();
		aca.setName("FreshWOrks Academy");
		aca.setId(1);
		aca.setCode("fssa@1");
		
		Student std1 = new Student();
		std1.setName("Kishore");
		std1.setId(1);
		std1.setEmail("aishore@gmail.com");
		
		System.out.println(Student.count);
		
		Student std2 = new Student();
		std2.setName("Arul");
		std2.setId(2);
		std2.setEmail("arul@gmail.com");
		
		System.out.println(Student.count);
	}

}
