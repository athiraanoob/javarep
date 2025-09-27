package controlStatement;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number of values to read");
		int num=scn.nextInt();
		int smallest = 0;
		System.out.println("Enter "+num+" numbers : ");
		int value;
		for(int i=0; i<num ;++i) {
			value = scn.nextInt();
			if(i==0) {
				smallest = value;
			}
			if(smallest > value) {
				smallest = value;
			}
		}
		System.out.println("Smallest Number : "+smallest);
	}
}
