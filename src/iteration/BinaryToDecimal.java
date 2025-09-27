package iteration;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		int binaryNumber = scn.nextInt();
		int decimalNumber = 0;
		int digit,position = 0;
		while (binaryNumber > 0) {
			digit =  (binaryNumber % 10);
			if (digit > 1) {
				System.out.println("Error - binary number can be of 1 and 0 digits only");
				return;
			}
			binaryNumber /= 10;
			decimalNumber += digit * Math.pow(2, position);
			position++;

		}
		System.out.println("Decimal equivalent : "+decimalNumber);
	}

}
