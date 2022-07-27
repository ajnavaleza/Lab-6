
public class CheckingAccount extends BankAccount {

	// Represents the cost of clearing one check
	public static final double FEE = 0.15;

	/**
	 * Default constructor
	 * 
	 * @param name
	 * @param amount
	 */
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(getAccountNumber() + "-10");
	}

	/**
	 * Overrides withdraw amount and adds FEE to it
	 * 
	 * @param amount
	 */
	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount + FEE);
	}
}
