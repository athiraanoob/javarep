package controlStatement;

public class Break {

	public static void main(String[] args) {
		        System.out.println("Number\tFactorial");
				for (int number = 1; number <= 20; ++number) {
					System.out.println(number + "\t" + getfactorial(number));
					//By checking the condition and altering value, it works like break statement for exiting from loop
					if(number==15)
					{
						number=21;
					}
				}
			}

			/**
			 * Due to teh limitiation of value that can hold in long variable, 100! can't be
			 * stored. That will be out of range for long
			 */ 
			public static long getfactorial(int num) {
				long factorial = 1;
				for (; num > 1; --num) {
					factorial *= num;
				}
				return (factorial);
			}
		


	}


