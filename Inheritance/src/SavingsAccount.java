/************************
 * SavingsAccount.java
 * used to look at a years savings
 * for 2 separate users
 ***********************/
public class SavingsAccount {

	private final int ACCOUNT_NUMBER;
	private double annualIntRate;
	private double balance;
	
	

	 
	public SavingsAccount (int ACCOUNT_NUMBER, double balance) {
		this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
		this.balance = balance;
		
	}
	
	public int ACCOUNT_NUMBER () {
		return this.ACCOUNT_NUMBER;
	}
	
	public double balance () {
		return this.balance;
	}
	
	public void setIntRate (double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	
	
	public void addMonthlyInt () {
		balance = balance + (balance * annualIntRate / 12);
	}
	

	
	
	
}
