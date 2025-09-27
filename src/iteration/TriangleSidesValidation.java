package iteration;

import java.util.Scanner;

public class TriangleSidesValidation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the three sides of triangles : ");
		System.out.print("Side1 : ");
		int sizeOne = scn.nextInt();
		System.out.print("Side2 : ");
		int sizeTwo = scn.nextInt();
		System.out.print("Side3 : ");
		int sizeThree = scn.nextInt();

		int sumOne_Two = sizeOne + sizeTwo;
		int sumOne_Three = sizeOne + sizeThree;
		int sumTwo_Three = sizeTwo + sizeThree;
		
		if(sizeOne < sumTwo_Three && sizeTwo < sumOne_Three && sizeThree < sumOne_Two) {
			System.out.println("Eligible sides of a Triangle");
		} else {
			System.out.println("Not Eligible sides of a Triangle");
		}
	}

}
