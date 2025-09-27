package Account;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Date d=new Date(3,7,1987);
		System.out.println("Enter the month");
		int m=scn.nextInt();
		d.setmonth(m);
		System.out.println("Enter the Day");
		int d1=scn.nextInt();
		d.setday(d1);
		System.out.println("Enter the year");
		int yr=scn.nextInt();
		d.setyear(yr);
		d.displayYear(m, d1, yr);
		

	}

}
