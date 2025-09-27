package iteration;

import java.util.Scanner;

public class MathematicalConstant1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number for terms");
		int num=scn.nextInt();
		float constantValue = 0;
		
		for(int i=0;i<num;++i) {
			constantValue += (1.0/Factorial.getfactorial(i));
		}
		
		System.out.println("Constant value for "+num+" terms : "+constantValue);
	}
}
