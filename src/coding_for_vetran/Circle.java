package coding_for_vetran; 
import java.util.Scanner;
import java.lang.*;

public class Circle {

	public static void main(String[] args) {
		System.out.println("ENTER THE RADIUS OF THE CIRCLE");
		Scanner scn=new Scanner(System.in);
		float radius=scn.nextInt();
		System.out.printf("diameter=%f%ncircumference=%f%narea=%f%n",2*radius,2*Math.PI*radius,Math.PI*radius*radius);
		

	}

}
