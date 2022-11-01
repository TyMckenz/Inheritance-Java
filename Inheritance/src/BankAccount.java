
public class BankAccount {
	private double balance = 0;
	
	public BankAccount(double balance) {
		this.balance = balance;
		
		
	}
	
	
	
	public double getBalance () {
		balance = Math.max(balance, 0);
		return balance;
		
	}
	
	public void setBalance(double b) {
		this.balance = b;
		
		
	}
	
	
	public void deposit (double d) {
		
		setBalance(getBalance() + d);
	}
	
	public void withdraw (double w) {
		
		setBalance(getBalance() - w);
	}
	
	 void display () {
	}



}





//practice code
//balance = balance + d;
//balance = balance - w;
