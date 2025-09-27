package iteration;

import java.util.Scanner;

public class RightTriangleSidesValidation {
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

			int sqrSide1 = sizeOne * sizeOne;
			int sqrSide2 = sizeTwo * sizeTwo;
			int sqrSide3 = sizeThree * sizeThree;
			if((sqrSide1 == sqrSide2+sqrSide3) || (sqrSide2 == sqrSide1+sqrSide3) || (sqrSide3 == sqrSide1+sqrSide2)) {
				System.out.println("These are sides of a Right angled triangle");
			} else {
				System.out.println("These sides are eligible for a triangle, but not a Right angled one");
			}
		
		} else {
			System.out.println("Not Eligible sides of a Triangle");
		}
	}

}
