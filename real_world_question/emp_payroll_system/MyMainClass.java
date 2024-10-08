package employ_Payroll_System;

public class MyMainClass {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "raghav");
		emp1.calculatePay();
		
		Employee emp2 = new Employee(105, "raghav",500);
        emp2.calculatePay();
        
        Employee emp3 = new Employee(107, "naina",1000);
        emp3.calculatePay();
	}

}
