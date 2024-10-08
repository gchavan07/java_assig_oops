package bankingSystem;

public class SavingAccount extends BankAccount {

		
	@Override
	public int withdraw(int amount) {
        
		if (amount >=1000 ) {
			System.out.println(amount+" Deducted from your saving account..");
		}
		else {
			System.out.println("Insuficient Balance..! "+" Keep Minimum 1000..!");
		}
		return super.withdraw(amount);
	}
	
}
