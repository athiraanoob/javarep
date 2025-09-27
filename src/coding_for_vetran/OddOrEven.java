package coding_for_vetran;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scn.nextInt();
		System.out.println("Enter the second number");
		int num2=scn.nextInt();
		if(num1>num2)
		{
			if((num1%num2)==0)
			{
				System.out.print(num1+" is the multiple of "+num2);
			}
			else
			{
				System.out.println(num1+" is not the multiple of "+num2);
			}
		}
		else
		{
			System.out.println("First number is smaller than second");
		}
		
 }

}
