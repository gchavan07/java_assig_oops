package employ_Payroll_System;

public class Employee {

	int empId;
	String name;
	double salary;

	public Employee(int empId, String name) {

		this.empId = empId;
		this.name = name;
		this.salary = 300;
		System.out.println("EmpId : " + empId + "  Name : " + name);
	}

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("EmpId : " + empId + "  Name : " + name + "  salary per day : " + salary);

	}

	public void calculatePay() {

		this.salary = this.salary * 30;
		System.out.println("slary of mounth is : " + salary);

	}

}
