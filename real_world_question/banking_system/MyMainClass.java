package bankingSystem;

public class MyMainClass {

	public static void main(String[] args) {
		
//		CurrentAccount obj1 = new CurrentAccount();
//		obj1.deposite(200);
//		obj1.checkBalance();
//		obj1.withdraw(100);
//		obj1.checkBalance();
		
		SavingAccount ob = new SavingAccount();
		ob.idname(101, "Raja");
		ob.deposite(10000);
		ob.checkBalance();
		ob.withdraw(5000);
		ob.checkBalance();
		
		CurrentAccount obj = new CurrentAccount();
		obj.idname(105, "Naru");
		obj.deposite(1000);
		obj.checkBalance();
		obj.withdraw(700);
		obj.checkBalance();


	}
}
