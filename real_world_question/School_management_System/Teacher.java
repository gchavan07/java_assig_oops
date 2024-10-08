package school_Management_System;

public class Teacher extends Person {

	int empid;
	String subject;

	public Teacher(String name, int age, int empid, String subject) {

		super(name, age);
		this.empid = empid;
		this.subject = subject;
	}

	@Override
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Employee ID: " + empid);
		System.out.println("Subject: " + subject);
	}

}
