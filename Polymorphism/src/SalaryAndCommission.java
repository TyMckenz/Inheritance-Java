
public class SalaryAndCommission extends Employee {
	
	/*
	 * added another weeklySalary variable because extending from Salary class 
	 * was giving me errors when running the code.
	 */
	protected double weeklySalary;
	protected double weeklySales;
	protected double commissionRate;

	public SalaryAndCommission() {
		

	}
	
	public void load() {
		super.load();
		System.out.print("Enter weekly salary: ");
		weeklySalary = scan.nextDouble();
		System.out.print("Enter weekly sales: ");
		weeklySales = scan.nextDouble();
		System.out.print("Enter commission rate (fraction of sales paid to employee): ");
		commissionRate = scan.nextDouble();
	}
	
	
	//Changed from salary to paycheck to keep it the same across methods
	public double getEarnings() {
		weeklySalary = weeklySalary + (weeklySales * commissionRate);
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

