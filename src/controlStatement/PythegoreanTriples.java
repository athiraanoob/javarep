package controlStatement;

public class PythegoreanTriples {

	public static void main(String[] args) {
		System.out.println("****Pythagorean Triples**** ");
		System.out.println("\nSide1\tSide2\tHypotenuse");
		for (int side1 = 1; side1 <= 500; ++side1) {
			int side1Sqr = side1 * side1;
			for (int side2 = 1; side2 <= 500; ++side2) {
				boolean triangeFoundForSide2AndHypotenuse = false;
				int side2Sqr = side2 * side2;
				for (int hypotenuse = 1; hypotenuse <= 500; ++hypotenuse) {
					int hypotenuseSqr = hypotenuse * hypotenuse;
					if (hypotenuseSqr == side1Sqr + side2Sqr) {
						System.out.println(side1 + "\t" + side2 + "\t" + hypotenuse);
						triangeFoundForSide2AndHypotenuse = true;
						break;
					}
				}
				if (triangeFoundForSide2AndHypotenuse) {
					break;
				}
			}
		}
	}
}
