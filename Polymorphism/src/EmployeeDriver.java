import java.util.*;
public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalEmps = 3;
		int choice;
		final int HOURLY = 1;
		final int SALARY = 2;
		final int SALARYANDCOMMISSION = 3;
		
		
		System.out.println("Total employees: " + totalEmps);
		
		Employee[] group = new Employee[totalEmps];
		

			System.out.println("Employee #1: ");
			System.out.println("Enter 1 for hourly, 2 for salary, 3 for salary + commission");
			choice = scan.nextInt();
			Employee temp;
			
			
		
			if (choice == HOURLY) {
				temp = new Hourly();
				temp.load();
				group[0] = temp;
			} else if (choice == SALARY) {
				temp = new Salary();
				temp.load();
				group[0] = temp;
			} else if(choice == SALARYANDCOMMISSION) {
				temp = new SalaryAndCommission();
				temp.load();
				group[0] = temp;
			}
			
			System.out.println("Employee #2: ");
			System.out.println("Enter 1 for hourly, 2 for salary, 3 for salary + commission");
			choice = scan.nextInt();
			
			if (choice == HOURLY) {
				temp = new Hourly();
				temp.load();
				group[1] = temp;
				
			} else if (choice == SALARY) {
				temp = new Salary();
				temp.load();
				group[1] = temp;
				
			} else if(choice == SALARYANDCOMMISSION) {
				temp = new SalaryAndCommission();
				temp.load();
				group[1] = temp;
			}
			
			
			
			System.out.println("Employee #3: ");
			System.out.println("Enter 1 for hourly, 2 for salary, 3 for salary + commission");
			choice = scan.nextInt();
			
			if (choice == HOURLY) {
				temp = new Hourly();
				temp.load();
				group[2] = temp;
				
			} else if (choice == SALARY) {
				temp = new Salary();
				temp.load();
				group[2] = temp;
				
			} else if(choice == SALARYANDCOMMISSION) {
				temp = new SalaryAndCommission();
				temp.load();
				group[2] = temp;
			}
			
			

		System.out.println();
	
		
		

		System.out.print(group[0].toString());
		System.out.println();
		System.out.print(group[1].toString());
		System.out.println();
		System.out.print(group[2].toString());

		
			scan.close();
	}
	
}





//		System.out.println((Calendar.getInstance().get(Calendar.MONTH) + 1));

