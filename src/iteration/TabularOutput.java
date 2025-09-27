package iteration;

import java.util.Scanner;

public class TabularOutput {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of Lines to be printed : ");
		int n = scn.nextInt();
		System.out.println("\n\nN\t10*N\t100*N\t1000*N");
		for (int i = 1; i <= n; i++) {
			System.out.println(i+"\t"+(10*i)+"\t"+(100*i)+"\t"+(1000*i));
			
		}
	}

}
