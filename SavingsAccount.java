
public class SavingsAccount extends BankAccount {

	// variables
	private double rate = 2.5;
	private static int savingsNumber = 0;
	private String accountNumber;

	/**
	 * Default constructor
	 * 
	 * @param name
	 * @param balance
	 */
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}

	/**
	 * Copy constructor of old account
	 * 
	 * @param oldAccount
	 * @param balance
	 */
	public SavingsAccount(SavingsAccount oldAccount, double balance) {
		super(oldAccount, balance);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}

	/**
	 * Calculates interest for one month and deposits it into the account
	 */
	public void postInterest() {
		super.deposit(super.getBalance() * (rate / (100 * 12)));
	}

	/**
	 * Overrides superclasses' getAccountNumber() method
	 */
	@Override
	public String getAccountNumber() {
		return super.getAccountNumber();
	}

}
