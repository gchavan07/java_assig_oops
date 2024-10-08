package school_Management_System;

public class Student extends Person {

	int id;
	char grade;

	public Student(String name, int id, int age, char grade) {

		super(name, age);
		this.id = id;
		this.grade = grade;
	}

	@Override
	public void displayinfo() {

		super.displayinfo();
		System.out.println("id: " + id);
		System.out.println("Grade: " + grade);

	}

}
