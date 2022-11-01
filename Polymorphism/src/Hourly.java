
public class Hourly extends Employee {
	

	protected double hourlyPay;
	protected double hoursWorked;
	
	
	public Hourly() {
		
	}
	
	
	public void load() {
		super.load();
		
		System.out.print("Enter hourly pay: ");
		this.hourlyPay = scan.nextDouble();
		System.out.print("Enter total hours worked: ");
		this.hoursWorked = scan.nextInt();
	}

	
	
	public double getEarnings() {
		paycheck = hourlyPay * hoursWorked;
		while(hoursWorked > 40) {
			hourlyPay = hourlyPay + (hourlyPay / 2);
		}
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


