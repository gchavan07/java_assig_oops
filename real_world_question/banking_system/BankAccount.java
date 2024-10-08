package bankingSystem;

public class BankAccount {

	int accountNumber ;
	String accountholder;
	double balance;
	
	public void idname(int i, String n) {
		int accountNumber = i;
		String accountholder = n;
		System.out.println("accountNumber : "+i);
		System.out.println("accountholder : "+n);
	}
	public void deposite(int amount ) {

		 balance += amount;
		 System.out.println("Money will deposited in account :"+amount);
	}
	
	public int withdraw(int amount) {
		
		balance -= amount;
		
		return 0;
		
	}
	public void checkBalance() {

		System.out.println("current balance : "+balance);
	}

	

	

	
}
