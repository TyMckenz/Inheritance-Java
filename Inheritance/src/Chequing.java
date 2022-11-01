
public class Chequing extends BankAccount {
	

	
	public Chequing (double balance) {
		super(balance);
		
		
	}
	

	
	public void writeCheque(int chq) {
		
		setBalance((getBalance() - chq) - 1);
	}
	
	public void display () {
		System.out.println("Chequing account balance = " + getBalance());
	}

}


//practice code
//balance = (balance - chq) - 1;
