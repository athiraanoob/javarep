package iteration;
import java.util.Scanner;

public class Milage {
	public float m_per_g(int m,int g)
	{
		float f= m/g;
		return f;
	}

	public static void main(String[] args) {
		int i=1,j;
		float s=0;
		System.out.println("Enter the "+i+"st Trip details");
		System.out.println("Enter the value of j");
		Scanner scn=new Scanner(System.in);
	    j=scn.nextInt();
       while(j!=-1)
		{
				System.out.println("Enter the miles drived by the driver");
		//Scanner scn=new Scanner(System.in);
		int miles=scn.nextInt();
		System.out.println("enter the gallon used");
		int gallon=scn.nextInt();
		Milage trip=new Milage();
		float mils_per_gallon=trip.m_per_g(miles,gallon);
		System.out.println("Miles per gallon is: "+mils_per_gallon);
		s=s+mils_per_gallon;
		System.out.println("Combined miles per gallon upto this point "+s);
		float avg=s/i;
		System.out.println("Averaging calculation:"+ avg);
		System.out.println("Enter the value of j");
		j=scn.nextInt();
		i++;
		}
		
		
		
		

	}

}
