import java.util.*;
public abstract class Employee {
	Scanner scan = new Scanner(System.in);
	
	private final double MAX_PAY = 1000;
	protected String name;
	protected String socInNum;
	protected int birthMonth;
	protected int birthWeek;
	protected double paycheck;
	
	
	
	
	public Employee() {

		
	}
	
	//initializer used in all other constructors
	public void load() {
		
		
		System.out.print("Enter employee name: ");
		name = scan.nextLine();
		System.out.print("Enter SIN: ");
		socInNum = scan.nextLine();
		System.out.print("Enter birth month (1-12): ");
		birthMonth = scan.nextInt();
		System.out.print("Enter birth week (1-4): ");
		birthWeek = scan.nextInt();
		
		

		
	}

	public abstract String toString(); 
	
	// used to keep max pay at or under 1000
	public void maxPay() {
		if (paycheck > MAX_PAY) {
			paycheck = MAX_PAY;
		}
	}

	
	
	
	public void getBonus() {
		
		if ((Calendar.getInstance().get(Calendar.MONTH) + 1) == birthMonth && 
				(Calendar.getInstance().get(Calendar.WEEK_OF_MONTH)) == birthWeek) {
			 paycheck = paycheck + 100;
		}
		
	}
	
}

