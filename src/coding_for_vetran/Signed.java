package coding_for_vetran;
import java.util.Scanner;
public class Signed {

	public static void main(String[] args) {
		System.out.println("enter 5 numers");
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int n3=scn.nextInt();
		int n4=scn.nextInt();
		int n5=scn.nextInt();
		int cntPositive=0;
		int cntNegative=0;
		int cntZero=0;
		//(n1>0)?cntPositive++:((n1<0)?cntNegative++:cntZero++));
		//(n1>0)?cntPositive++:((n1<0)?cntNegative++:cntZero++);
		if (n1>0)
		{
			cntPositive++;
		}
		else if(n1<0)
		{
			cntNegative++;
		}
		else {
			cntZero++;
		}
		if (n2>0)
		{
			cntPositive++;
		}
		else if(n2<0)
		{
			cntNegative++;
		}
		else {
			cntZero++;
		}
		if (n3>0)
		{
			cntPositive++;
		}
		else if(n3<0)
		{
			cntNegative++;
		}
		else {
			cntZero++;
		}
		if (n4>0)
		{
			cntPositive++;
		}
		else if(n4<0)
		{
			cntNegative++;
		}
		else {
			cntZero++;
		}
		if (n5>0)
		{
			cntPositive++;
		}
		else if(n5<0)
		{
			cntNegative++;
		}
		else {
			cntZero++;
		}
		
		System.out.println("Count of zeros entered is" + cntZero );
		System.out.println("Count of positive numbers entered is" + cntPositive );
		System.out.println("Count of negetive numbers entered is" + cntNegative );


	}

}
