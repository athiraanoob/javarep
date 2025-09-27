package controlStatement;

public class PiValueCalculator {

	public static void main(String[] args) {

		double piValue = 0;
		double divident = 1;
		boolean isFound314159 = false;
		for (int term = 1; term <= 200000; ++term) {
			if (term % 2 == 1) {
				piValue += 4 / divident;
			} else {
				piValue -= 4 / divident;
			}
			divident += 2;
			if (String.valueOf(piValue).indexOf("3.14159") ==0 && !isFound314159) {
				System.out.println("Got value starting in 3.14159 on Term : "+term);
				isFound314159 = true;
			}
		}
		System.out.println("Value of Pi after 200000 terms = "+piValue);
	}

}
