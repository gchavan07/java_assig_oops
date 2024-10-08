package bankingSystem;

public class CurrentAccount extends BankAccount{

	@Override
	public int withdraw(int amount) {
		
		if (amount > 0) {
			System.out.println("Money withdraw from CurrentAccount : "+amount);
		} else {
            System.out.println("zero balance..!");
		}
		return super.withdraw(amount);
	}
	
}
