package Account;
import java.util.Scanner;

public class HeartRate {
	String First_name;
	String Last_name;
	int mm,dd,yr;
	public  HeartRate(String First_name,String Last_name,int mm,int dd,int yr)
	{
		this.First_name=First_name;
		this.Last_name=Last_name;
		this.mm=mm;
		this.dd=dd;
		this.yr=yr;
	}
	public void setFirstnm(String fn)
	{
	 this.First_name=fn;	
	}
	public void setLastnm(String ln) {
		this.Last_name=ln;
	}
	public void setmonth(int m)
	{
		this.mm=m;
	}
	public void setday(int d)
	{
		this.dd=d;
	}
	public void setyr(int year)
	{
		this.yr=year;
	}
	
	public String getFirstnm()
	{
	 return this.First_name;	
	}
	public String getLastnm() {
		return this.Last_name;
	}
	public int getmonth()
	{
		return this.mm;
	}
	public int getday()
	{
		return this.dd;
	}
	public int getyr()
	{
		return this.yr;
	}
	public int ag_in_yrs(int yr)
	{
	  int age=2022-yr;
	  return age;
	}
	public int maximum_heart_rate(int ag)
	{
		int max=220-ag;
		return max;
	}
	public double target_heart_rate(int m)
	{
		double d=50-(.8*m);
		return d;
	}
	public static void main(String[] args) {
		HeartRate hr=new HeartRate("Athira","Mohandas",11,8,1987);
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the first name");
		String f_name=sr.next();
		hr.setFirstnm(f_name);
		System.out.println("Enter the Last Name");
       	String L_name=sr.next();
       	hr.setLastnm(L_name);
       	System.out.println("Enter the month of date of Birth");
        int month=sr.nextInt();
        hr.setmonth(month);
        System.out.println("Enter the day of the month");
        int day=sr.nextInt();
        hr.setday(day);
        System.out.println("enter the year");
        int year=sr.nextInt();
        hr.setyr(year);
        System.out.println("Details of the person is:");
        System.out.println("name:"+hr.getFirstnm()+" "+hr.getLastnm());
        System.out.println("The date of Birth is:");
        System.out.println(hr.getmonth()+"-"+hr.getday()+"-"+hr.getyr());
        int ag=hr.ag_in_yrs(year);
        int max_hr=hr.maximum_heart_rate(ag);
        double thr=hr.target_heart_rate(max_hr);
        System.out.println("Maximum heart rate for age "+ag+"is "+max_hr+" "+"\n");
        System.out.println("Maximum heart rate for age "+ag+"is "+thr+" "+"\n");
	}

}
