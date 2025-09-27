package iteration;

public class Pattern {

	public static void main(String[] args) {
		int i=0,j,k;
		while(i<4)
		{	
			j=0; k=0;
			while(j<8)
			{
				System.out.print("* ");
				System.out.print(" ");
				   j++;
			}
			System.out.println( );
			System.out.print("  ");

			while(k<8)
			{
				System.out.print("* ");
				System.out.print(" ");
				   k++;
			}
			System.out.println("");
			i++;
		}
		
	}

}
