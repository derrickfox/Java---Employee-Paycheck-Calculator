import java.util.Scanner;

public class in_Class_Assignment_4 {
	public static void main(String[] args) {
		
		System.out.println("How many employees do you have?");
		Scanner input = new Scanner(System.in);
		int numEmps = input.nextInt();
		
		double totalPay = 0;
		int totalHours = 0;
		double wage=0;
		double empPay = 0;
		int empNumber = 0;
		
		for (int i=1; i <= numEmps; i++) {
			System.out.println("How much does employee #"+i+" make per hour?");
			wage = input.nextDouble();
			empNumber = i;
			
			for (int j = 1; j <= 5; j++) {
				System.out.println("How many hours did they work on day "+j+"?");
				int hoursDay = input.nextInt();
				totalHours = totalHours + hoursDay;
				empPay = wage * totalHours;
			}
			totalPay = totalPay + empPay;
			System.out.println("Employee #"+empNumber+" total pay based on $"+wage+" wage rate and total number of "+totalHours+" hours worked is : $"+empPay);	
		}
		System.out.println("Total pay for "+numEmps+" employee(s) is: $"+totalPay);
	}
}
