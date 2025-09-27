package iteration;
import java.util.Scanner;

public class SalesCommissionCalculator {
	public float items()
	{
		Scanner scn=new Scanner(System.in);
		int s=0;
		int i=1;
		float sum=0;
		while(s!=-1)
		{
			System.out.println("Enter the value of "+ i +"th Item");
			float f=scn.nextFloat();
			   sum=sum+f;  
			   i++;
			   System.out.println("enter the value for s");
			   s=scn.nextInt();
			   System.out.println(s);
		}
		return sum;
	}

	public static void main(String[] args) {
		SalesCommissionCalculator cr=new SalesCommissionCalculator();
		float sum=cr.items();
		float salary=200+(sum*9/100);
		System.out.println("The salary of last week is "+ salary);
		}

}
