package school_Management_System;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void displayinfo() {

		System.out.println("Name of person : " + name);
		System.out.println("age of person : " + age);

	}

}
