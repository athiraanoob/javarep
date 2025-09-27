package iteration;

import java.util.Scanner;

public class Factorial {
	public static int getfactorial(int num) {
		int factorial = 1;
		for (; num > 1; --num) {
			factorial *= num;
		}
		return (factorial);
	}

	public static void main(String[] args) {
		int num = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number for factorial");
		num = scn.nextInt();
		int n = getfactorial(num);
		System.out.println("Factorial of the number " + num + " is " + n);

	}

}
