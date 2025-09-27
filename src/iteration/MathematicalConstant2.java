package iteration;
import java.util.Scanner;

public class MathematicalConstant2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int num=scn.nextInt();
		System.out.println("Enter the value of X");
		int x=scn.nextInt();
		scn.close();
		float constantval=0;
		for(int i=1;i<=num;++i)
		{
			constantval+=Math.pow(x,i)/Factorial.getfactorial(i);
		}
		System.out.println("Constant value for X="+x+" for "+num+" terms is : "+constantval);
	}

}
