/*******************************
 * Driver for SavingsAccount
 ******************************/
public class SavingsAccountDriver {

	public static void main(String[] args) {
		
		
		
		SavingsAccount saver1 = new SavingsAccount(10002, 2000.00);
		SavingsAccount saver2 = new SavingsAccount(10003, 3000.00);
		
		saver1.setIntRate(0.05);
		saver2.setIntRate(0.05);
		
		System.out.println(" Monthly Balances For 0.05 Annual Interest ");
		System.out.println(" Month " + "Account # " + "  Balance  " + 
				"  Account #  " + " Balance   ");
		
		int month = 0;
		
		for (int i = 0; i <= 12; i++) {
			
			System.out.println(" " + month  + "      " +  saver1.ACCOUNT_NUMBER()  + "      " + 
		String.format("%.2f", saver1.balance()) + "     " + saver2.ACCOUNT_NUMBER() + "     " + 
					String.format("%.2f", saver2.balance()));
			
			saver1.addMonthlyInt();
			saver2.addMonthlyInt();
			month++;
			
			
		}
		System.out.println();
		System.out.println("    Final Combined Balance: " + 
		String.format("%.2f", (saver1.balance() + saver2.balance())));

		

	}
	


}
