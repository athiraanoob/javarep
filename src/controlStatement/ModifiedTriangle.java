package controlStatement;

public class ModifiedTriangle {

	public static void main(String[] args) {
		for(int row=1;row<=10;row++)
		{	
			int t1, t2, t3, t4;
			for(t1=1;t1<=row;t1++)
			{
				System.out.print("*");
			}
			for(int k=t1;k<=10;++k) {
				System.out.print(" ");
			}
			System.out.print("  ");
			for(t2=10;t2>=row;--t2) {
				System.out.print("*");
			}
			for(int k=t2;k>=1;--k) {
				System.out.print(" ");
			}
			System.out.print("  ");

			for(t3=1;t3<row;++t3) {
				System.out.print(" ");
			}
			for(int k=t3;k<=10;++k) {
				System.out.print("*");
			}
			System.out.print("  ");
			for(t4=1;t4<=(10-row);t4++)
			{
				System.out.print(" ");
			}
			for(int k=t4;k<=10;++k) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		  

	}

}
