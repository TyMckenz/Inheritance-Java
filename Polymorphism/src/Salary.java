
public class Salary extends Employee {

	protected double weeklySalary;
	
	
	public Salary() {
		
		
	}
	
	
	public void load() {
		super.load();
		System.out.print("Enter weekly salary: ");
		weeklySalary = scan.nextDouble();
	}
	
	//Changed from salary to paycheck to keep it the same across methods
	public double getEarnings() {
		paycheck = weeklySalary;
		getBonus();
		maxPay();
		return paycheck;
	}


	@Override
	public String toString() {
		return "\r\nEmployee:" + name + "\r\n" + "SIN: " + socInNum + "\r\n" +
				"Paycheck: " + getEarnings();
		
	}
	

}







