
public class Savings extends BankAccount {
	
	private double intRate;
	
	public Savings(double balance, double intRate) {
		super(balance);
		this.intRate = intRate;
		
	}
	
	
	public void addInterest () {
		
		setBalance((getBalance() * intRate) + getBalance());
		
		}
	
	public void display() {
		System.out.println("Savings account balance = " + getBalance());
	}
	
}



//practice code
//balance = (balance * intRate) + balance;