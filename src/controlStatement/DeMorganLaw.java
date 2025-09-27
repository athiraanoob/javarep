package controlStatement;
import java.util.Scanner;

public class DeMorganLaw {
	public static int getvalue()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value");	
		int x = scn.nextInt();
		return(x);
	}
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int x = getvalue();
		int y=getvalue();
		System.out.println("!(x < 5) && !(y >= 7) is "+(!(x < 5) && !(y >= 7)));
		System.out.println("!((x < 5) || (y >= 7) is "+(!((x < 5) || (y >= 7))));
		System.out.println("The next expression");
		int a=getvalue();
		int b=getvalue();
		int g=getvalue();
		System.out.println("!(a == b) || !(g != 5) is "+(!(a == b) || !(g != 5)));
		System.out.println("!((a == b) && (g != 5)) is"+!((a == b) && (g != 5)));
		System.out.println("The next expression");
		System.out.println("!((x <= 8) && (y > 4)) is"+!((x <= 8) && (y > 4)));
		System.out.println("!(x <= 8) || !(y > 4) is"+(!(x <= 8) || !(y > 4)));
		int i=getvalue();
		int j=getvalue();
        System.out.println("!((i > 4) || (j <= 6)) is"+!((i > 4) || (j <= 6)));
        System.out.println("!(i > 4) && !(j <= 6) is"+(!(i > 4) && !(j <= 6)));
		
	}

}
