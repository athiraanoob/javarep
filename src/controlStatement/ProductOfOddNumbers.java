package controlStatement;

public class ProductOfOddNumbers {
	public static void main(String[] args) {
		int product = 1, oddnum = 1;
		while(oddnum <= 15) {
			product *= oddnum;
			oddnum += 2;
		}
		System.out.println("Product of Odd numbers from 1 to 15 = " + product);
	}
}
