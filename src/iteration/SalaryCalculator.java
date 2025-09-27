package iteration;

import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the number of employees : ");
			int n = scn.nextInt();
			int i = 0;
			while (i < n) {
				System.out.println("Name : ");
				String name = scn.next();
				System.out.println("Hourly Rate : ");
				Float rate = scn.nextFloat();
				System.out.println("Number of Hours : ");
				Float hours = scn.nextFloat();

				Employee emp = new Employee(name, rate, hours);
				emp.calculateGrossPay();
				emp.printEmployeeGrossPay();
				++i;
			}
		}
	}
}

