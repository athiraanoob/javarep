package controlStatement;
import java.util.Scanner;

public class CalculatingSales {
	public static double getsum(int a,int b)
	{
		double product=0;
		switch(a)
		{
		case 1:
		{
			product=2.98*b;
			break;
		}
		case 2:
		{
			product=4.50*b;
			break;
		}
		case 3:
		{
			product=9.98*b;
			break;
		}
		case 4:
		{
			product=4.49*b;
			break;
		}
		case 5:
		{
			product=6.87*b;
			break;
		}
		default:
		{
			break;
		}
		}
		return product;
	}

	public static void main(String[] args) {
		int i=0;
		double sum=0;
		Scanner scn=new Scanner(System.in);
		while(i!=-1)
		{
		System.out.println("Ener the product  number(1,2,3,4,or 5)");
		int num=scn.nextInt();
		System.out.println("enter the Quantity");
		int qty=scn.nextInt();
		sum+=getsum(num,qty);
		System.out.println("Enter the value for i");
		i=scn.nextInt();
		}
		System.out.println("Total Amound is"+sum);
           scn.close();
	}

}
